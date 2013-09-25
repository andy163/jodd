package email.jodd.com;

import java.io.File;
import java.io.IOException;

import jodd.io.FileUtil;
import jodd.mail.Email;
import jodd.mail.EmailAttachment;
import jodd.mail.EmailMessage;
import jodd.mail.SendMailSession;
import jodd.mail.SimpleAuthenticator;
import jodd.mail.SmtpServer;
import jodd.mail.SmtpSslServer;
import jodd.mail.att.ByteArrayAttachment;
import jodd.mail.att.FileAttachment;
import jodd.util.MimeTypes;

public class Test {

	public static void main(String[] args) {
		System.out.println("test jodd");
		Email email = new Email();
		email.setFrom("ps_andy@163.com");
		email.setTo("andy@fonsview.com");
		email.setSubject("test mail from jodd");
		EmailMessage textMessage = new EmailMessage("Hello!", MimeTypes.MIME_TEXT_PLAIN);
		email.addMessage(textMessage);
		EmailMessage htmlMessage = new EmailMessage(
				"<html><META http-equiv=Content-Type content=\"text/html; charset=utf-8\">" +
				"<body><h1>Hey!</h1><img src='cid:c.png'><h2>Hay!</h2></body></html>",
		MimeTypes.MIME_TEXT_HTML);
		email.addMessage(htmlMessage);
		EmailAttachment embeddedAttachment;
		try {
			embeddedAttachment = new ByteArrayAttachment(
			FileUtil.readBytes("C:/Users/andy1/Desktop/7f8c1087gw1e8y03h868zg208w06oqv5.gif"), "image/gif", "c.gif", "c.gif");
			embeddedAttachment.setEmbeddedMessage(htmlMessage);
			email.attach(embeddedAttachment);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SmtpServer smtpServer = new SmtpSslServer("smtp.163.com", "ps_andy@163.com", "pass");
		SendMailSession session = smtpServer.createSession();
		session.open();
		session.sendMail(email);
		session.close();
	}
}
