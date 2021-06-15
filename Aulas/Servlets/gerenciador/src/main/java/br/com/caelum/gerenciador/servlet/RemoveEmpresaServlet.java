package br.com.caelum.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveEmpresaServlet
 */
@WebServlet("/removeempresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);	
		
		Banco banco = new Banco();
				
		banco.Remove(id);
		
		response.sendRedirect("listaempresas");
		
		
	}

}
