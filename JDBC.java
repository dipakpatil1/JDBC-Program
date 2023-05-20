import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@WebServlet("/dis")
public class DisServlet implements Servlet {
	public void init(ServletConfig sc) throws ServletException {
		// NoCode
	}

	public void service(ServletRequest req,

	ServletResponse res) throws ServletException,java.io.IOException
	{
	PrintWriter pw = res.getWriter();
	res.setContentType("text/html");
	String code = req.getParameter("code");
	String name = req.getParameter("name");
	int price=Integer.parseInt(req.getParameter("price"));
	int qty =Integer.parseInt(req.getParameter("qty"));
	pw.print("----------------");
	pw.print(code);
	pw.print(name);
	pw.print(price);
	pw.print(qty);
	
	}

	public void destroy() {
		// NoCode
	}

	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}

	public String getServletInfo() {
	return "FirstServlet-program";
	}
}
