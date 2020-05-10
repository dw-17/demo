<%--
  Created by IntelliJ IDEA.
  User: dw
  Date: 2020/1/28
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>index</title>
		<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="js/base64.js"></script>
	</head>
	<body>
		<form action="formAction" id="formId" method="post">
			ENAME: <input type="text" class="" name="user_name" id="id_name" value="" /></br>
			EMPNO: <input type="text" class="" name="user_num" id="id_num" value="" /></br>
			Commit: <input type="button" class="" id="" value="commit" onclick="checkUser();" /></br>
		</form>
	</body>
	<script language="javascript" type="text/javascript">
	  function checkUser() {
		debugger;
		var name = document.getElementById("id_name").value;
		if (name === "") {
		  alert("用户名不能为空");
		  return false;
		}
		document.getElementById("formId").submit();
	  }
	</script>
</html>
