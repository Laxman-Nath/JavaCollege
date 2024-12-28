
package mailapi;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class MailApi {

    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.put("mail.smtp.host", "localhost");
        properties.put("mail.smtp.port", "25");
        Session session=Session.getInstance(properties);
        try{
            Message message=new MimeMessage(session);
            message.setFrom(new InternetAddress("nathlaxman242@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress("nathlucky242@gmail.com"));
            message.setSubject("Testing");
            message.setText("Hello im testing mail api");
            Transport.send(message);
            System.out.println("Email is send succesfully!");
        }
        catch(Exception e){}
        }
    }
    

