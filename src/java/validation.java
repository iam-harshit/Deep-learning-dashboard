import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Harshit Saxena
 */
public class validation implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
        Filter.super.init(fc); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
       
    HttpServletRequest rq =(HttpServletRequest) sr;
    HttpServletResponse rs = (HttpServletResponse) sr1;
    
    PrintWriter out=rs.getWriter();
    
    String fullName=rq.getParameter("fullName");
    String email=rq.getParameter("email");
    String password=rq.getParameter("password");
     
    if(fullName == null || "".equals(fullName)){
        
    rq.getRequestDispatcher("signup.jsp").include(rq, rs);           
    out.print("<script language='JavaScript'>alert('Please enter your full name');</script>");
           
    }
    else if(email == null || "".equals(email)){ 
        
    rq.getRequestDispatcher("signup.jsp").include(rq, rs);           
    out.print("<script language='JavaScript'>alert('Please enter your email');</script>");
           
    }
    else if(password == null || "".equals(password)){  
        
    rq.getRequestDispatcher("signup.jsp").include(rq, rs);           
    out.print("<script language='JavaScript'>alert('Please enter your password');</script>");
           
    }
    else{
    fc.doFilter(rq, rs);
    }
             
    }

    @Override
    public void destroy() {
        Filter.super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
