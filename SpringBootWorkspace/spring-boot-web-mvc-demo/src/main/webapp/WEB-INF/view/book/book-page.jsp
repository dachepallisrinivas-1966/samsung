<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
	<head>
		<title>Book</title>
		<link rel="stylesheet" href="/css/style.css"/>
	</head>
	<body>
		<jsp:include page="/commons/header" />
		
		<section>
			<h3>Book</h3>
			
			<c:if test="${book != null }">
				<table>
					<tr><td>BCode</td><td><strong>${book.bcode }</strong></td></tr>
					<tr><td>Title</td><td><strong>${book.title }</strong></td></tr>
					<tr><td>Price</td><td><strong>${book.price }</strong></td></tr>
					<tr><td>Date of Publish</td><td><strong>${book.publishDate }</strong></td></tr>
				</table>
			</c:if>			
		</section>
	</body>
</html>