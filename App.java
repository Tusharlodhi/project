package com.mailproject;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "sending mail" );
        String message = "Hello Dear,this is a message for security check.Your OTP is 2552";
        String from = "lodhitushar7@gmail.com";
        String to = "chiku82355@gmail.com";
        String subject = "confirmation check";
        
        sendEmail(message,subject,from,to);
    }
    
    private static void sendEmail(String message,String subject,String from,String to) {
    	//variable for gmail
    	String host = "smtp.gmail.com";
    	
    	//get the system properties
    	Properties properties = System.getProperties(); 
    	System.out.println("PROPERTIES"+ properties);
    	
    	//	host set
    	properties.put("mail.smtp.host", host);
    	properties.put("mail.smtp.port", "465");
    	properties.put("mail.smtp.ssl.enable","true");
    	properties.put("mail.smtp.auth","true");
    	
    	Session session = Session.getInstance(properties,new Authenticator(){
    		@Override
    		protected PasswordAuthentication getPasswordAuthentication() {
    			return new PasswordAuthentication("lodhitushar7@gmail.com","weth vgaq rvhd supv"); //weth vgaq rvhd supv
    		}
    	});
    	
    	session.setDebug(true);
    	//compose the mssg
    	
    	MimeMessage msg = new MimeMessage(session);  // mimemessage is a subclass which extends message class 
    	
    	try {
    		
    		msg.setFrom(from);
    		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    		msg.setSubject(subject);
    		
    		//adding text to messgae
    		msg.setText(message);
    		//send
    		Transport.send(msg);
    		
    		System.out.println("...............Send successfully............");
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    		
    }
}
