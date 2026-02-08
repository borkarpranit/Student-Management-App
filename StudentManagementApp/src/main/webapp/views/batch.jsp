<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>
<body>
	<div class="d-flex justify-content-center align-center">

		<div class="w-50 align-middle border border-info  border-3 mt-2"
			style="height: 500px">
			<h6 class="p-3 text-primary ">
				<u>Instalment Details :-</u>
			</h6>

			<div class="border border-secondary m-3 p-2">

				<table class="table table-hover border border-secondary ">
					<tbody>
						<tr class="table-primary fs-6">
							<th>Student Id</th>
							<td>${st.studentId}</td>
						</tr>
						<tr class="table-primary fs-6">
							<th>Student Name</th>
							<td>${st.studentFullName}</td>
						<tr class="table-primary fs-6">
							<th>Course Name</th>
							<td>${st.studentCourse}</td>
						</tr>

						<tr class="table-primary fs-6">
							<th>Batch Number</th>
							<td>${st.batchNumber}</td>
						</tr>
						</tr>
						<tr class="table-danger fs-6">
							<th>Fees Paid</th>
							<td>${st.feesPaid}</td>
						</tr>

					</tbody>
				</table>

				<form action="shiftbatch">
					<input type="text" name="studentid" value="${st.studentId}"
						hidden="true">
					<div class="bg-dark p-2  d-flex justify-content-between">
						<label for="amount" class="text-info">
						<b>Batch Number</b></label> 
						<select class="select form-control-sm border border-primary"
						name="batchNumber">
						<option value="#" selected>Select Batch Number</option>
						<option value="FDJ-195">FDJ-195</option>
						<option value="REG-195">REG-195</option>
						<option value="FDJ-196">FDJ-196</option>
						<option value="REG-196">REG-196</option>
						<option value="FDJ-197">FDJ-197</option>
						<option value="REG-197">REG-197</option>
						<option value="FDJ-198">FDJ-198</option>
						<option value="REG-198">REG-198</option>
						<option value="FDJ-199">FDJ-199</option>
						<option value="REG-199">REG-199</option>
						<option value="FDJ-200">FDJ-200</option>
						<option value="REG-200">REG-200</option>

					</select>
						
					</div>
					<div class="d-flex justify-content-center pt-5">
						<button class="btn btn-success btn-sm ">Shift Batch</button>
					</div>
				</form>

			</div>
		</div>



	</div>
</body>
</html>