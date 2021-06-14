package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresaServlet
 */
@WebServlet("/listaempresas")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = new Banco();
		
		List<Empresa> empresasCadastradas = banco.getEmpresas();		
				
		request.setAttribute("empresa", empresasCadastradas);
		RequestDispatcher rd = request.getRequestDispatcher("empresascadastradas.jsp");
		rd.forward(request, response);
	}

}
