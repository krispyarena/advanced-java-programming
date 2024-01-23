Servlet Interface
    
    Java servlets are server side programs that runs inside a web server that handle client requests and return dynamic response for each request.

    Servlet interface needs to be implemented for creating any servlet either directly or indirectly.

Methods :
    
    1. Life Cycle Methods
        - init()
        - service()
        - destroy()

    2. Non-life Cycle Methods
        - getServletConfig()
        - getServletInfo()

Program illustrating Servlet

    import java.io.IOException;
    import java.io.PrintWriter;

    import javax.servlet.Servlet;
    import javax.servlet.ServletConfig;
    import javax.servlet.ServletException;
    import javax.servlet.ServletRequest;
    import javax.servlet.ServletResponse;
    import javax.servlet.annotation.WebServlet;

    @WebServlet("/SimpleServlet")
    public class SimpleServlet implements Servlet{
        
        ServletConfig config = null;

        @Override
        public void init(ServletConfig config) throws ServletException {
            
            this.config = config;
            System.out.println("Servlet is Initialised");
        }

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.print("<html><body>");
            out.print("<b>Hello Simple Servlet</b>");
            out.print("</body></html>");
            
        }
        
        @Override
        public void destroy() {
            System.out.println("Servlet is Destroyed");		
        }
        
        @Override
        public ServletConfig getServletConfig() {
            
            return config;
        }

        @Override
        public String getServletInfo() {
            
            return "Servlet Interface is implemented";
        }


    }
