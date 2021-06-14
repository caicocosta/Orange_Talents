<%@page import="br.com.caelum.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	List<Empresa> empresasCadastradas = (List<Empresa>)request.getAttribute("empresa"); 
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas Cadastradas</title>
</head>
<body>
	<ul>		
		<% 
			for (Empresa empresa : empresasCadastradas) {
		%>		
		<li>
		Nova empresa
		<%= empresa.getNome() %>
		</li>   
		<% } 
		%>	
	</ul>
</body>
</html>