<%@ include file="/WEB-INF/view/jsp/base.jspf"%>
<title>Subjects</title>
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

		

<!--------------------------------- Content Table --------------------------------------->
	<div class="container">
		<div class="jumbotron">
			<h1>المواد التعليمية</h1>
		</div>

		<br>


		<div class="d-flex justify-content-between flex-wrap">
			<div class="card m-2 shadow-sm" style="width: 20%;">
				<img src="/zadtesting/resources/images/math.jpg"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text ">This is a longer card with is a little
						bit longer.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
					<a href="#" class="btn btn-primary stretched-link">عرض</a>
				</div>
			</div>
			<div class="card m-2" style="width: 20%;">
				<img src="/zadtesting/resources/images/en.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">This card has supportnt.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
					<a href="#" class=" stretched-link ">عرض المادة</a>
				</div>
			</div>
			<div class="card m-2" style="width: 20%;">
				<img src="/zadtesting/resources/images/ss.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">This ia natural lead-in to addithat equal
						height action.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
				</div>

			</div>
			<div class="card m-2" style="width: 20%;">
				<img src="/zadtesting/resources/images/ar-4-2.jpg"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">اللغة العربية</h5>
					<p class="card-text">This is a wider lead-in tght action.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
					<a href="/zadtesting/viewunits?subjectid=63" class=" stretched-link ">عرض المادة</a>
				
				</div>
			</div>
			<div class="card m-2" style="width: 20%;">
				<img src="/zadtesting/resources/images/math.jpg"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">T as a natural lead-in to addiontent is a
						little bit longer.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
				</div>
			</div>
			<div class="card" style="width: 20%;">
				<img src="/zadtesting/resources/images/en.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">Thil content.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
				</div>
			</div>
			<div class="card" style="width: 20%;">
				<img src="/zadtesting/resources/images/ss.jpg" class="card-img-top"
					alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">This is a widerntent.ow that equal height
						action.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
				</div>
			</div>
			<div class="card" style="width: 20%;">
				<img src="/zadtesting/resources/images/ar-4-2.jpg"
					class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title">Card title</h5>
					<p class="card-text">Td has even longer content than the first
						to show that equal height action.</p>
					<p class="card-text">
						<small class="text-muted">Last updated 3 mins ago</small>
					</p>
				</div>
			</div>
		</div>
		<table class="table table-striped table-bordered table-hover mt-3 ">
			<thead class="thead-light">
				<tr>
					<th scope="col">مسلسل</th>
					<th scope="col">المادة</th>
					<th>المستوي</th>
					<th>تعديل</th>
					<th>حذف</th>
					<th>description</th>
				</tr>
			</thead>
			<c:forEach items="${subjectsList}" var="subject">
				<tr>
					<td>متسلسل</td>
					<td><a
						href="
							<c:url value="viewunits">
								<c:param name="subjectid" value="${subject.id}"/>
							</c:url>
							">
							${subject.title}</a></td>
					<td>${subject.level}</td>
					<td><a
						href="
							<c:url value="updatesubject">
								<c:param name="subjectid" value="${subject.id}"/>
							<%-- <c:param name="levelcode" value="${subject.level}"/>  --%>	
							</c:url>
							">
							Update</a></td>
					<td><a
						href="
							<c:url value="deletesubject">
								<c:param name="subjectid" value="${subject.id}"/>
						   <%-- <c:param name="levelcode" value="${subject.level}"/> --%>
							</c:url>
							">
							Delete</a></td>
					<td></td>
				</tr>

			</c:forEach>
		</table>


		<br> <a class="btn btn-primary"
			href="
			<c:url value="addsubject">
		<%-- 		<c:param name="levelcode" value="${levelcode}"/> --%>
			</c:url>
			role="button">اضف
			مادة جديدة</a>
	</div>
	<!-- local bootstrap script-->
	<script src="/zadtesting/resources/js/jquery-3.6.0.min.js"></script>
	<script src="/zadtesting/resources/js/popper.min.js"></script>
	<script src="/zadtesting/resources/js/bootstrap.js"></script>
</body>
</html>