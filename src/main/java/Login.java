import java.io.IOException;

import jakarta.servlet.http.HttpSession;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve username and password from request
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        
        LoginDao  dao = new LoginDao();
        
        
        // Check credentials
        if(dao.check(uname, pass)) {
        	
        	HttpSession session =request.getSession();
        	session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }else {
        	response.sendRedirect("login.jsp");
        }
    }
}
