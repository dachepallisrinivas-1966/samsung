<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
	<head>
		<title>Greet</title>
		<link rel="stylesheet" href="/css/style.css"/>
	</head>
	<body>
		<jsp:include page="/commons/header" />
		
		<section>
			<h3>Greet</h3>
			
			<c:if test="${msg != null }">
				<p><strong>${msg }</strong></p>
			</c:if>
			
			<form method="POST">
				<label>User Name:
					<input type="text" name="unm" required />
				</label>
				<button>Submit</button>
			</form>
		</section>
	</body>
</html>