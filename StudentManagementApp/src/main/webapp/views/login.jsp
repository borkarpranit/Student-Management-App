<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384
sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">

<style>
body {
	background: linear-gradient(135deg, #667eea, #764ba2);
}
</style>
</head>
<body class="bg-light">

	<div class="card bg-dark">
		<marquee class="text-danger mb-3  fs-1 "> ${login_fail} </marquee>
	</div>

	<div class="container">
		<div class="d-flex justify-content-center align-items-center vh-100">
			<div class="card shadow rounded-4 bg-dark" style="width: 22rem;">
				<div class="card-body">
					<h3 class="card-title text-center mb-3 text-white">Login</h3>
					<form action="login">
						<!-- Username -->
						<div class="mb-3">
							<label for="username" class="form-label textwhite">Username</label>
							<input type="text" class="form-control" name="username"
								placeholder="Enter username" required>
						</div>
						<!-- Password -->
						<div class="mb-3">
							<label for="password" class="form-label textwhite">Password</label>
							<input type="password" class="form-control" name="password"
								placeholder="Enter password" required>
						</div>
						<!-- Button -->
						<div class="d-grid">
							<button type="submit" class="btn btn-primary">Login</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>