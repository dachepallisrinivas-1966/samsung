<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="/header" />
<section>
	<form:form method="post" modelAttribute="emp">
		<form:hidden path="empId" />
		
		<div>
			<form:label path="fullName">Full Name:</form:label>
			<form:input path="fullName" />
			<form:errors path="fullName" />
		</div>		
		
		<div>
			<form:label path="basicSalary">Basic:</form:label>
			<form:input path="basicSalary" />
			<form:errors path="basicSalary" />
		</div>
		<div>
			<form:label path="joinDate">Join Date:</form:label>
			<form:input path="joinDate" type="date"/>
			<form:errors path="joinDate" />
		</div>
		<div>
			<form:label path="mobile">Mobile Number:</form:label>
			<form:input path="mobile" />
			<form:errors path="mobile" />
		</div>
		<div>
			<form:label path="email">Email:</form:label>
			<form:input path="email" />
			<form:errors path="email" />
		</div>
		<div>
			<form:label path="deptName">Department:</form:label>
			<form:select path="deptName">
				<form:options items="${depts}" />
			</form:select>
		</div>
		
		<div>
			<button type="submit">Save</button>
		</div>
	</form:form>
</section>
<jsp:include page="/footer" />


