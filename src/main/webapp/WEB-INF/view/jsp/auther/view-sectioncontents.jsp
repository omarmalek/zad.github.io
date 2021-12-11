<%@ include file="/WEB-INF/view/jsp/base.jspf"%>
<title>view Sections</title>


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
				<!-------------------------------------------------------------المحتويات   ----------------------------------------->
				<h2 class="display-5 text-center font-weight-bold">المحتويات</h2>
				<!------------------------------------------------------ picture   ---------------------------------------->
				<div class="container ">
				<c:forEach items="${objectList}" var="obj">
					<c:if test="${obj.type =='picture'}">
						<div class="picture shadow-sm ">
							<div class="section-header">
								<h3>${obj.title}</h3>
							</div>
							<br>
							<div class=" border border-danger1" id="image_holder">
								<img class=" mx-auto d-block img-thumbnail"
									src="<c:url value="/downloadimage"> 
											<c:param name="id" value="${obj.id}"/>
											<c:param name="name" value="${obj.contentType}"/>
										 </c:url>"
									alt="cant show image!" />
							</div>
							<br>
							<!-- 
							<H6>Picture ID: ${obj.id}</H6>
							<h6>Picture Name: ${obj.name}</h6>
							 -->
							<h3>${obj.desc}</h3>

							<br> <a
								href="<c:url value="/updatepicture"> 
								<c:param name="id" value="${obj.id}"/>
							</c:url>				
							">UPDATE</a>
							<br> <a
								href="<c:url value="/deletepicture"> 
								<c:param name="id" value="${obj.id}"/>
							</c:url>				
							">DELETE</a>


						</div>
						<br>
					</c:if>
					<!------------------------------------------------------ readingtext   ---------------------------------------->
					<c:if test="${obj.type =='readingtext'}">
						<div class="readingtext shadow-sm">
							<div class="section-header">
								<h3>${obj.title}</h3>
							</div>
							<div class="readingtext-text text-justify">${obj.text}</div>
							<H6>${obj.id}</H6>

							<br> <a
								href="<c:url value="/updatereadingtext"> 
						<c:param name="id" value="${obj.id}"/>
					</c:url>				
					">UPDATE</a>
							<br> <a
								href="<c:url value="/deletereadingtext"> 
						<c:param name="id" value="${obj.id}"/>
					</c:url>				
					">DELETE</a>

						</div>
						<br>
					</c:if>
					<!------------------------------------------------------ vedio   ---------------------------------------->
					<c:if test="${obj.type =='vedio'}">
						<div class="vedio shadow-sm">
							<div class="section-header">
								<h3>${obj.title}</h3>
							</div>

							<div class="embed-responsive embed-responsive-16by9">
								<iframe class="embed-responsive-item" src="${obj.source}"
									allowfullscreen></iframe>
							</div>


							${obj.source} <br> ${obj.id} <br> <br> <a
								href="<c:url value="/updatevedio"> 
						<c:param name="id" value="${obj.id}"/>
					</c:url>				
					">UPDATE</a>
							<br> <a
								href="<c:url value="/deletevedio"> 
						<c:param name="id" value="${obj.id}"/>
					</c:url>				
					">DELETE</a>


						</div>
						<br>
					</c:if>

				</c:forEach>
				</div>
				<div class="container"> 
				<a href="addnewitem?sectionid=${sectionId}&type=picture"><i class="far fa-plus-square"></i> <i class="far fa-image"></i>   اضف صورة</a> 
				<br> 
				<a href="addnewitem?sectionid=${sectionId}&type=readingtext"><i class="far fa-plus-square"></i> <i class="fa fa-align-right"></i> اضف نصاً</a> 
				<br> 
				<a href="addnewitem?sectionid=${sectionId}&type=vedio"><i class="far fa-plus-square"></i> <i class="fa fa-video"></i> اضف فيديو</a>
				</div>
			
<!---------------------------------------------------------------footer ------------------------------------>
		<footer class="bg-light text-center text-white">
			
			<div class="container p-4 pb-0">
				<!---------------------------------------- Section: Social media ----------------------------------->
				<section class="mb-4">
					<!-- Facebook -->
					<a class="btn btn-primary btn-floating m-1 border-none"
						style="background-color: #3b5998;" href="#!" role="button"><i
						class="fab fa-facebook-f"></i></a>

					<!-- Twitter -->
					<a class="btn btn-primary btn-floating m-1"
						style="background-color: #55acee;" href="#!" role="button"><i
						class="fab fa-twitter"></i></a>

					<!-- Google -->
					<a class="btn btn-primary btn-floating m-1"
						style="background-color: #dd4b39;" href="#!" role="button"><i
						class="fab fa-google"></i></a>

					<!-- Instagram -->
					<a class="btn btn-primary btn-floating m-1"
						style="background-color: #ac2bac;" href="#!" role="button"><i
						class="fab fa-instagram"></i></a>

					<!-- Linkedin -->
					<a class="btn btn-primary btn-floating m-1"
						style="background-color: #0082ca;" href="#!" role="button"><i
						class="fab fa-linkedin-in"></i></a>
					<!-- Github -->
					<a class="btn btn-primary btn-floating m-1"
						style="background-color: #333333;" href="#!" role="button"><i
						class="fab fa-github"></i></a>
				</section>
				
			</div>
			

			<!----------------------------------------------------- Copyright --------------------------------------->
			<div class="text-center p-3"
				style="background-color: rgba(0, 0, 0, 0.2);">
				© 2021 Copyright: <a class="text-white" href="https://zad.edu/">ZAD.com</a>
			</div>
			
		</footer>

	


	<!-- jQuery library ------online bootstrap script---------->
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->
	<!-- Popper JS -----------online bootstrap script------------>
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script> -->
	<!-- Latest compiled JavaScript ---------------online bootstrap script----------->
	<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->

	<!-- local bootstrap script-->
	<script src="/zadtesting/resources/js/jquery-3.6.0.min.js"></script>
	<script src="/zadtesting/resources/js/popper.min.js"></script>
	<script src="/zadtesting/resources/js/bootstrap.js"></script>
</body>


