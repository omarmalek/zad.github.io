<%@ include file="/WEB-INF/view/jsp/base.jspf"%>
<title>view units</title>
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
						</ul>
					</div>
				</nav>
				 </div>
		
				<!------------------------------------------------------------- breadcrumb   -------------------------------------->
				<div class="container">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">

						<li class="breadcrumb-item">${subjectTitle}</li>
						

					</ol>
				</nav>
				</div>
<!------------------------------- table ------------------------------------ -->

	<table style="border: 1px solid">
		<tr>
			<td>المستوى</td>
			<td><a href="<c:url value="viewsubjects"/>">الرابع</a></td>
		</tr>
		<tr>
			<td>المادة</td>
			<td>${subjectTitle}</td>
		</tr>

	</table>
	${message}
	<br>
	<!------------------------------- Content Table ------------------------------------ -->
	<div class="container">
		<h1>الوحدات</h1>
		<br>

		<table class="table table-striped table-bordered table-hover ">
			<thead class="thead-light">
				<tr>
					<th>مسلسل</th>
					<th>الوحدة</th>
					<th>عنوان الوحدة</th>
					<th>تعديل</th>
					<th>حذف</th>
					<th>description</th>
				</tr>
			</thead>
			<c:forEach items="${unitsList}" var="unit">
				<tr>
					<td>متسلسل</td>
					<td><a
						href="
							<c:url value="viewlessons">
								<c:param name="unitid" value="${unit.id}"/>
							</c:url>
							">
							${unit.name}</a></td>
					<td><a
						href="
							<c:url value="viewlessons">
								<c:param name="unitid" value="${unit.id}"/>
							</c:url>
							">
							${unit.title}</a></td>
					<td><a
						href="
							<c:url value="updateunit">
								<c:param name="unitid" value="${unit.id}"/>
							</c:url>
							">
							Update</a></td>
					<td><a
						href="
							<c:url value="deleteunit">
								<c:param name="unitid" value="${unit.id}"/>
							</c:url>
							">
							Delete</a></td>
					<td></td>
				</tr>
			</c:forEach>
		</table>

		<br> <a class="btn btn-primary"
			href="
		<c:url value="addunit">
			<c:param name="subjectid" value="${subjectid}"/>
		</c:url>
	">اضافة
			وحدة جديدة</a>

	</div>
	<!-- local bootstrap script-->
	<script src="/zadtesting/resources/js/jquery-3.6.0.min.js"></script>
	<script src="/zadtesting/resources/js/popper.min.js"></script>
	<script src="/zadtesting/resources/js/bootstrap.js"></script>
</body>
</html>