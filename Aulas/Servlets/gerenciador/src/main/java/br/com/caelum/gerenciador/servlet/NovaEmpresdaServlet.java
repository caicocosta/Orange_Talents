package br.com.caelum.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresdaServlet
 */
@WebServlet("/novaempresa")
public class NovaEmpresdaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NovaEmpresdaServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova Empresa");
				
		Empresa empresa = new Empresa();		
		
		empresa.setNome(request.getParameter("nome"));
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			empresa.setDataAbertura(sdf.parse(request.getParameter("dataAbertura")));
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		
		response.sendRedirect("listaempresas");
		
		//chamar o JPS 
		/*RequestDispatcher rd = request.getRequestDispatcher("/listaempresas");
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);*/
	}

}
