<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
    //scriptlet
	String nomeEmpresa = (String)request.getAttribute("empresa");	
%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa Cadastrada</title>
</head>
<body>
	Empresa <%= nomeEmpresa %> cadastrada com sucesso! 
</html>