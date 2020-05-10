package com.example.servlet;

import com.example.bean.User;
import com.example.dao.BaseDao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FormServlet extends javax.servlet.http.HttpServlet {
	protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		// request form
		String name = request.getParameter("user_name");
		int num = Integer.parseInt(request.getParameter("user_num"));

		// query DB
		User user = new BaseDao().queryDB(name, num);

		if (user != null) {
			// responed form
			Map<String, String> map = new HashMap<>();
			map.put("user_name", user.getName());
			map.put("user_num", String.valueOf(user.getNum()));
			map.put("user_job", user.getJob());
			map.put("user_sal", user.getSal());
			request.getSession().setAttribute("session", map);

			// 重定向
//			response.sendRedirect("/jsp/redirect.jsp");
			// 转发
			request.getRequestDispatcher("/jsp/redirect.jsp").forward(request, response);
		} else {
			// 重定向
//			response.sendRedirect("/jsp/block.jsp");
			// 转发
			request.getRequestDispatcher("/jsp/block.jsp").forward(request, response);
		}
	}

	protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		doPost(request, response);
	}
}
