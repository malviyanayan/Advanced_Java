import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendmail.do")
public class SendEmailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String to = req.getParameter("to");
        String cc = req.getParameter("ccemails");
        String bcc = req.getParameter("bccemails");
        String head = req.getParameter("head");
        String subhead = req.getParameter("subhead");
        String content = req.getParameter("content");
        String[] ccs = cc.split(",");
        String[] bccs = bcc.split(",");

        String nextPage = "true";

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("bytestream0101@gmail.com", "drjhbouxyvddxrho");
            }
        });

        MimeMessage message = new MimeMessage(session);

        // for single Email
        try {

            Address[] ccarr = new Address[ccs.length];
            for (int i = 0; i < ccarr.length; i++)
                ccarr[i] = new InternetAddress(ccs[i]);

            Address[] bccarr = new Address[bccs.length];
            for (int i = 0; i < bccarr.length; i++)
                bccarr[i] = new InternetAddress(bccs[i]);

            message.setFrom("bytestream0101@gmail.com");
            message.setRecipients(Message.RecipientType.TO, to);
            message.setRecipients(Message.RecipientType.CC, ccarr);
            message.setRecipients(Message.RecipientType.BCC, bccarr);

            message.setSubject(head);

            String str = "<h1>" + head + "</h1>" + "<h2>" + subhead + "</h2>" + "<p>" + content + "</p>"  ;
            message.setContent(str, "text/html");

            Transport.send(message);


        } catch (MessagingException e) {
            nextPage = "false";
            e.printStackTrace();
        }

        resp.getWriter().write(nextPage);
    }
}