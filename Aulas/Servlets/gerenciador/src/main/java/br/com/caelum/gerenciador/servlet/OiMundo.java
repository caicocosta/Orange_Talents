package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/oi")
public class OiMundo extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws IOException {
		
	   PrintWriter out = resp.getWriter();
	   out.println("<html>");
	   out.println("<body>");
	   out.println("Oi Mundo, parabens vc escreveu o primeiro servlets.");
	   out.println("</body>");
	   out.println("</html>");
	   
	   System.out.println("O servlet foi chamado.");
		
	}

}
