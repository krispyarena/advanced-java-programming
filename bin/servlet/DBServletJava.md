Program to access database using Servlet:

    import java.io.IOException;
    import java.io.PrintWriter;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;

    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;

    @WebServlet("/dbservlet")
    public class DatabaseServlet extends HttpServlet{

        private static final long serialVersionUID = 1L;
        
        public DatabaseServlet() {
            super();
        }
        
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
            
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            
            String url = "jdbc:mysql://localhost/webdb1";
            
            try {
                
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root", "");
                Statement stm = con.createStatement();
                
                String sql = "select * from user1 where username = '"+username+"' and password = '"+password+"' ";
                
                ResultSet rs = stm.executeQuery(sql);
                
                if(!rs.next()){
                    out.println("<html><head><title>Login error</title></head><body>");
                    out.println("<br><hr>Unknown User<br><br>Access Denied</body></html>");
                }

                else {
                    out.println("<html><head><title>Login success</title></head><body>");
                    out.println("<br><br> Welcome " + username);
                    out.println("<br><hr><br><br>Authentication Success</body></html>");
                }

                rs.close();
                stm.close();
                con.close();
            }
            
            catch(SQLException e) {
                e.printStackTrace();
            }
            
            catch(ClassNotFoundException e) {
                e.printStackTrace();
            }
            
        }

    }
    `