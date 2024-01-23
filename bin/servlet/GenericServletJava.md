GenericServlet Class

    - It implements Servlet, ServletConfig and Serializable interfaces.
    - It provides the implementation of these interfaces except the service method.
    - It can handle any type of request so it is protocol-independent.
    - we can create a generic sevlet by inheriting the GenericServlet class and providing the implementation of the service method.

Program illustrating generic servlet

    import java.io.IOException;
    import java.io.PrintWriter;

    import javax.servlet.GenericServlet;
    import javax.servlet.ServletException;
    import javax.servlet.ServletRequest;
    import javax.servlet.ServletResponse;
    import javax.servlet.annotation.WebServlet;

    @WebServlet("/gservlet")
    public class GServlet extends GenericServlet{
        
        private static final long serialVersionUID = 1L;

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.print("<html><head><title>generic servlet</title></head><body>");
            out.print("<h3>Hello Generic Servlet</h3>");
            out.print("</body></html>");
        }
    }
