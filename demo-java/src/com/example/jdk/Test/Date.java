package com.example.jdk.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
	public static void main(String[] args) throws ParseException {
		System.out.println("时间 ： " + new Date());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("格式化 ： " +sf.parse("2015-06-11 hh:mm:ss"));
	}
}
