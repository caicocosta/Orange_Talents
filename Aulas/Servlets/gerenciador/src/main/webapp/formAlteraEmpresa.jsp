<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="alteraempresa" var="linkServeletAlteraEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Empresa</title>
</head>
<body>
	<form action="${linkServeletAlteraEmpresa}" method="post">
	  <input type="hidden" name="id" value="${empresa.id}" />
	  Nome: <input type="text" name="nome" value="${empresa.nome}" />
	  Data Abertura: <input type="text" name="dataAbertura" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>"/>	
	  <input type="submit" name="Enviar"/>
	</form>  
</body>
</html>