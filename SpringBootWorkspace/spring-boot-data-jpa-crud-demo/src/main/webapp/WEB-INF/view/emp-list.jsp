<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
<section>
	<h3>Employee List</h3>
	<c:choose>
		<c:when test="${emps eq null}">
			<p>No Employees Found</p>
		</c:when>
		<c:when test="${emps.size()==0}">
			<p>No Employees Found</p>
		</c:when>
		<c:otherwise>
			<table>
				<thead>
					<tr>
						<th>Employee#</th>
						<th>Full Name</th>
						<th>Mobile</th>
						<th>Email</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" items="${emps }">
						<tr>
							<td>${e.empId }</td>
							<td>${e.fullName } </td>
							<td>${e.mobile }</td>
							<td>${e.email }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</section>
<jsp:include page="/footer" />



