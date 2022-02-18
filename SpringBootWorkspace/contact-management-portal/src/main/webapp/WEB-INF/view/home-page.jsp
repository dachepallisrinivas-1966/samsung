<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<jsp:include page="/header" />
<div class="container-fluid p-4">
	<h5>Contacts</h5>
	
	<c:choose>
		<c:when test="${contactList==null || contactList.isEmpty() }">
			<div class="alet alert-info p-2">
				<p><strong>No contacts found.</strong></p>
			</div>
		</c:when>
		<c:otherwise>
			<table class="table table-border table-striped">
				<thead>
					<tr>
						<th>Contact#</th>
						<th>Full Name</th>
						<th>Mobile</th>
						<th>Email</th>
						<th>BirthDate</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="c" items="${contactList }">
						<tr>
							<td>${c.cid}</td>
							<td>${c.fullName}</td>
							<td>${c.mobile}</td>
							<td>${c.email}</td>
							<td>${c.dateOfBirth}</td>
							<td>
								<a href="/editContact?cid=${c.cid}" class="btn btn-sm btn-secondary">EDIT</a>
								<a href="/delContact?cid=${c.cid}" class="btn btn-sm btn-danger">DELETE</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</div>
<jsp:include page="/footer" />