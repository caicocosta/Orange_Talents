<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="novaempresa" var="linkServeletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServeletNovaEmpresa}" method="post">
	  Nome: <input type="text" name="nome" />
	  Data Abertura: <input type="text" name="dataAbertura" />
	  <input type="submit" name="Enviar"/>
	</form>  

</body>
</html>