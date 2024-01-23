HttpServlet Class:

	- HttpServlet class extends the GenericServlet class and implements Serializable interface.
	- It provides http specific methods such as doGet(), doPost() etc which handle GET request and POST request respectively.

Program to Calculate SI using HttpServlet and JSP

	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet("/SIServlet")
	public class HtServlet extends HttpServlet{

		private static final long serialVersionUID = 1L;
		
		public SIServlet() {
			super();
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.getRequestDispatcher("siform.jsp").forward(request, response);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			
			Integer p = Integer.parseInt(request.getParameter("principal"));
			Integer t = Integer.parseInt(request.getParameter("time"));
			Integer r = Integer.parseInt(request.getParameter("rate"));
			
			float si = p*t*r/100;
			
			request.setAttribute("answer", si);
			
			request.getRequestDispatcher("result.jsp").forward(request, response);
		}

	}
