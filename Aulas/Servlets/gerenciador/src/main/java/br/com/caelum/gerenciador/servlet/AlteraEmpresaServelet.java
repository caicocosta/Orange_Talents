package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraEmpresaServelet
 */
@WebServlet("/alteraempresa")
public class AlteraEmpresaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
						
		Banco banco = new Banco();
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);	
		
		Empresa empresa = banco.buscaEmpresaPorID(id);		
		empresa.setNome(request.getParameter("nome"));
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			empresa.setDataAbertura(sdf.parse(request.getParameter("dataAbertura")));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		//banco.atualizaEmpresa(empresa);
		
		response.sendRedirect("listaempresas");
	}

}
