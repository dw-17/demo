package com.demo.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleSendMailDemo {
	public static void main(String[] args) throws Exception {
		// 创建邮件的发送过程中用到的主机和端口号的属性文件
		Properties pro = new Properties();
		// 如果是其他的邮箱可以参照
		pro.put("mail.smtp.host", "smtp.qq.com");
		// 设置发送邮件端口号
		pro.put("mail.smtp.port", "25");
		// 设置邮件发送需要认证
		pro.put("mail.smtp.auth", "true");
		// 创建邮件验证信息，即发送邮件的用户名和密码
		Authenticator authenticator = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// 重写验证方法，填写用户名，密码
				return new PasswordAuthentication("123456@qq.com", "123456");
			}
		};
		// 根据邮件会话 构建一个邮件的session
		Session sendMailSession = Session.getDefaultInstance(pro, authenticator);
		// 设置session debug
		sendMailSession.setDebug(true);
		// 创建一个邮件消息
		Message message = new MimeMessage(sendMailSession);
		// 创建邮件发送者地址
		Address sourceAddress = new InternetAddress("123456@qq.com");
		// 将原地址设置到消息的信息中
		message.setFrom(sourceAddress);
		// 创建邮件的接收者地址
		Address destAddress = new InternetAddress("123456@qq.com");
		// 将接收者的地址设置到消息的信息中
		message.setRecipient(Message.RecipientType.TO, destAddress);
		// 设置邮件的主题
		message.setSubject("This is JavaMail send Test!");
		// 设置邮件的发送内容
		message.setText("Hello World!");
		// 可以设置邮件的发送时间(就是对方看邮件发送的时间)
		message.setSentDate(new Date());
		// 发送邮件
		Transport.send(message);
	}

}