<%@ include file="/WEB-INF/view/jsp/base.jspf" %>
<title>Update Picture</title>
</head>
<body>
	<!--------------------------------- navbar --------------------------------------->
<nav class="navbar navbar-expand-sm navbar-dark bg-cu-unrwa fixed-top">
	<div class="container ">
		<a class="navbar-brand" href="#">ZAD</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse " id="navbarNav">
			<ul class="navbar-nav w-100 font-cu-cairo"  >
					<li class="nav-item active" >
						<a class="nav-link" href="/zadtesting">الصفحة الرئيسية <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item  text-info"><a class="nav-link" href="#">الملف	الشخصي</a></li>
					<li class="nav-item"><a class="nav-link" href="#">ابرز المساهمات</a></li>
					<li class="nav-item"><a class="nav-link" href="#honour"> لوحة الشرف</a></li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> الاعدادات </a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Action</a> <a
								class="dropdown-item" href="#">Another action</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Something else here</a>
						</div></li>
					<li class="nav-item ml-auto"><a class="nav-link " href="#"
						tabindex="-1" aria-disabled="true">اشتراك</a></li>
					<li class="nav-item "><a class="nav-link " href="#"
						tabindex="-1" aria-disabled="true">تسجيل الدخول</a></li>
				</ul>
			</div>
			</div>
		</nav>

		
				<!---------------------------------------------------- second navbar ---------------------------------->
				 <div class="container">
				<nav class="navbar navbar-expand-lg navbar-light bg-light">

					<div class="collapse navbar-collapse" id="navbarNavDropdown">
						<ul class="navbar-nav">

							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#"
								id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> المواد الدراسية
							</a>
								<div class="dropdown-menu dropdown-menu-left"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item" href="#">Action</a> <a
										class="dropdown-item" href="#">Another action</a> <a
										class="dropdown-item" href="#">Something else here</a>
								</div></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#"
								id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> الوحدات </a>
								<div class="dropdown-menu dropdown-menu-left"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item" href="#">Action</a> <a
										class="dropdown-item" href="#">Another action</a> <a
										class="dropdown-item" href="#">Something else here</a>
								</div></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#"
								id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> الدروس </a>
								<div class="dropdown-menu dropdown-menu-left"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item" href="#">Action</a> <a
										class="dropdown-item" href="#">Another action</a> <a
										class="dropdown-item" href="#">Something else here</a>
								</div></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#"
								id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> أقسام الدرس </a>
								<div class="dropdown-menu dropdown-menu-left"
									aria-labelledby="navbarDropdownMenuLink">
									<a class="dropdown-item" href="#">Action</a> <a
										class="dropdown-item" href="#">Another action</a> <a
										class="dropdown-item" href="#">Something else here</a>
								</div></li>
						</ul>
					</div>
				</nav>
				 </div>
		
				<!------------------------------------------------------------- breadcrumb   -------------------------------------->
				<div class="container">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">

						<li class="breadcrumb-item">${subjectTitle}</li>
						<li class="breadcrumb-item">${unitName}: ${unitTitle}</li>
						<li class="breadcrumb-item">${lessonName} : ${lessonTitle}</li>
						<li class="breadcrumb-item">${sectionTitle}</li>

					</ol>
				</nav>
				</div>
				<div class="container">
					<h1>Update Picture</h1>
					
					<form:form action="process-updatepicture" method="POST" modelAttribute="picturedto">
						<br>
						العنوان
						<br>
						<form:input type="text" path="title"/>
						<br>
						الرابط
						<br>
						<form:input type="text" path ="source"/>
						<br>
						الوصف
						<br>
						<form:input type="text" path ="description"/>
						<br>
						<br>
						<form:input type="hidden" path="id"/>
						<input type="submit" value="Update"/>
						<input type="hidden" path="id" />
					</form:form>
</div>
<!-- local bootstrap script-->
	<script src="/zadtesting/resources/js/jquery-3.6.0.min.js"></script>
	<script src="/zadtesting/resources/js/popper.min.js"></script>
	<script src="/zadtesting/resources/js/bootstrap.js"></script>
</body>
</html>