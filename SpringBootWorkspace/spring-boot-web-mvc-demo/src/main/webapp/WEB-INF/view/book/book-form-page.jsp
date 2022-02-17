<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>Book</title>
		<link rel="stylesheet" href="/css/style.css"/>
	</head>
	<body>
		<jsp:include page="/commons/header" />
		
		<section>
			<h3>Book Form</h3>
			
			<form:form method="POST" modelAttribute="book">
				<form:label path="bcode">Book Code:</form:label>
				<form:input type="number" path="bcode" required="required" />
				<form:label path="title">Title:</form:label>
				<form:input type="text" path="title" required="required" />
				<form:label path="price">Price:</form:label>
				<form:input type="decimal" path="price" required="required" />
				<form:label path="publishDate">Publish Date:</form:label>
				<form:input type="date" path="publishDate" required="required" />
				<button>SEND</button>
			</form:form>
		</section>
	</body>
</html>