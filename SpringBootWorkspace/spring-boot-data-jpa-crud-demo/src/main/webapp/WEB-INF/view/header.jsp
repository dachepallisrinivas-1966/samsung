<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${appTitle }</title>
</head>
<body>
	<nav>
		<c:forEach var="link" items="${links}">
			<a href="${link.key }">${link.value }</a> |
		</c:forEach>
	</nav>
	<hr />
</body>
</html>