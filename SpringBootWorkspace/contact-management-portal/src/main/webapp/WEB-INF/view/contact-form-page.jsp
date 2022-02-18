<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<jsp:include page="/header" />
<div class="container-fluid p-4">
	<div class="col-sm-5 mx-auto">
		<h5>${isEditing?"Edit":"New" } Contact</h5>
		
		<form:form method="POST" modelAttribute="contact">
			<div class="mb-2">
				<form:label path="cid">Contact Id:</form:label>
				<form:input path="cid" type="number" class="form-control" readonly="${isEditing }"/>
				<form:errors path="cid" class="form-text" />
			</div>
			<div class="mb-2">
				<form:label path="fullName">Full Name:</form:label>
				<form:input path="fullName" class="form-control"/>
				<form:errors path="fullName" class="form-text" />
			</div>
			<div class="mb-2">
				<form:label path="email">Email Id:</form:label>
				<form:input path="email" type="email" class="form-control"/>
				<form:errors path="email" class="form-text" />
			</div>
			<div class="mb-2">
				<form:label path="mobile">Mobile Number:</form:label>
				<form:input path="mobile" class="form-control"/>
				<form:errors path="mobile" class="form-text" />
			</div>
			<div class="mb-2">
				<form:label path="dateOfBirth">BirthDate:</form:label>
				<form:input path="dateOfBirth" type="date" class="form-control"/>
				<form:errors path="dateOfBirth" class="form-text" />
			</div>
			<div class="d-grid">
				<button class="btn btn-primary">SAVE</button>
			</div>
		</form:form>
	</div>	
</div>
<jsp:include page="/footer" />