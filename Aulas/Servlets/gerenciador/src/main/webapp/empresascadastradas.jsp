<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="br.com.caelum.gerenciador.servlet.Empresa"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas Cadastradas</title>
</head>
<body>

	Lista de empresas: <br />
	<ul>	
	    <c:forEach items="${empresas}" var="empresa">	       
	    	<li>${empresa.nome} <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
	    	    ${empresa.email}
			<a href="/gerenciador/mostraempresa?id=${empresa.id}">Editar</a>
	    	<a href="/gerenciador/removeempresa?id=${empresa.id}">Remover</a>
	    	</li>
	    	
	    </c:forEach>
	</ul>	
</body>
</html>