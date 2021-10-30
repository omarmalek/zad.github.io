<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view Sections</title>


</head>
<body>

	<div class="container" style="direction: rtl;">
			<!-- navbar -->
		<nav class="navbar navbar-expand-sm navbar-dark bg-primary" >
			<a class="navbar-brand" href="#">ZAD</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		  		<span class="navbar-toggler-icon"></span>
			</button>
	  
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
		  		<ul class="navbar-nav ml-auto">
					<li class="nav-item active">
			 			 <a class="nav-link" href="#">الصفحة الرئيسية <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item">
			  			<a class="nav-link" href="#">الملف الشخصي</a>
					</li>
					<li class="nav-item dropdown">
			  			<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						الاعدادات
			 			 </a>
			  			<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Action</a>
							<a class="dropdown-item" href="#">Another action</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="#">Something else here</a>
			  			</div>
					</li>
					<li class="nav-item">
			  			<a class="nav-link " href="#">تسجيل الخروج</a>
					</li>
		  		</ul>
		  
			</div>
	  	</nav>
	
	<!-- header  -->
	<div class="row  mt-2 mx-0">
		<div class="logo col-sm" >
			<h1>منصة زاد التعليمية</h1> 
			 <h3>تطبيق محاكي للمنهاج التعليمي في فلسطين</h3>
		</div>
		<div class="hero col-sm  shadow"></div>
		
	</div>

<!-- second navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-primary mt-3 " >
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Content1" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	  <span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse " id="Content1">
	  <ul class="navbar-nav  ml-auto">
		<li class="nav-item  dropdown ">
		  <a class="nav-link dropdown-toggle text-right" style="background-color: #eb550f;" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			المواد الدراسية
		  </a>
		  <div class="dropdown-menu dropdown-menu-right text-right" aria-labelledby="navbarDropdown">
			<a class="dropdown-item" href="#">Action</a>
			<a class="dropdown-item" href="#">Another action</a>
			
		  </div>
		</li>
		<li class="nav-item bg-warning dropdown">
			<a class="nav-link  dropdown-toggle text-right" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			  الوحدات
			</a>
			<div class="dropdown-menu dropdown-menu-right  text-right" aria-labelledby="navbarDropdown">
			  <a class="dropdown-item" href="#">Action</a>
			  <a class="dropdown-item" href="#">Another action</a>
			</div>
		  </li>
		  <li class="nav-item bg-danger dropdown">
			<a class="nav-link  dropdown-toggle text-right" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			   الدروس
			</a>
			<div class="dropdown-menu dropdown-menu-right  text-right" aria-labelledby="navbarDropdown">
			  <a class="dropdown-item" href="#">Action</a>
			  <a class="dropdown-item" href="#">Another action</a>
			  
			</div>
		  </li>
		  <li class="nav-item bg-success dropdown">
			<a class="nav-link  dropdown-toggle text-right" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			  مفاصل الدرس
			</a>
			<div class="dropdown-menu dropdown-menu-right  text-right" aria-labelledby="navbarDropdown">
			  <a class="dropdown-item" href="#">Action</a>
			  <a class="dropdown-item" href="#">Another action</a>
		
			</div>
		  </li>

	
	  </ul>
	  
	</div>
  </nav>
<!-- end  second navbar -->
	  
		<div class="row ">
			<!-- side  -->
			<div class="side mt-3 col-sm-3">	
					<div class="card w-100" >
						<img class="card-img-top" src="/zadfinal17/images/avatar_boy2.png"  alt="Card image">
						<div class="card-body text-right">
						<h4 class="card-title ">سعيد عوض الله</h4>
						<p class="card-text">الرابع - أ</p>
						<p class="card-text"> مدرسة ذكور دير البلح الابتدائية</p>
						<a href="#" class="btn btn-primary">عرض الملف الشخصي </a>
						</div>	
					</div>	
				<div class=" navegation shadow">
					<h2>التنقل</h2>
				<ul class="sidenav">
					<li><a href="<c:url value="viewsubjects"/>">المستوى الرابع</a></li>
					<li><a href="<c:url value="viewunits"/>">المادة ${subjectTitle}</a></li>
					<li><a href="<c:url value="viewlessons"/>">${unitName} ${unitTitle}</a></li>
					<li><a href="<c:url value="viewsections"/>">${lessonName} ${lessonTitle}</a></li>
					<li><a href="${sectionTitle}">المفصل</a></li>	
				</ul>
			</div>
			<div class="side-image shadow">
			<img src="/zadfinal17/images/adv.jpg">
			</div>
		</div>
			<!-- main   -->
			<div class="main col-sm-9 mt-3" >
				<div class="breadcrumb shadow">
					<ul class="breadcrumb ">
						<li class="breadcrumb-item"> الصف الرابع</li>
						<li class="breadcrumb-item">اللغة العربية</li>
						<li class="breadcrumb-item">الوحدة</li>
						<li class="breadcrumb-item">الدرس</li>
						<li class="breadcrumb-item">الفصل الحالي</li>
					</ul>	
				</div>
				<h2 class="display-5 text-center">محتويات المفصل</h2>
				<c:forEach items="${objectList}" var="obj">
					<c:if test="${obj.type =='picture'}">
						<div>
							${obj.title} <br> <br>
							<div id="image_holder">
								<img
									src="<c:url value="/downloadimage"> 
						<c:param name="id" value="${obj.id}"/>
						<c:param name="name" value="${obj.contentType}"/>
					</c:url>"
									alt="cant show image!" width="300px" />
							</div>
							<br>
							<H6>Picture ID: ${obj.id}</H6>
							<h6>Picture Name: ${obj.name}</h6>
							<h6>Picture Desc: ${obj.desc}</h6>

							<br>


						</div>
						<br>
						</c:if>
						<c:if test="${obj.type =='readingtext'}">
							<div class="readingtext shadow">
								<div class="section-header">
									<h3>${obj.title}</h3>
								</div>
								<div class="readingtext-text">${obj.text}</div>
								<H6>${obj.id}</H6>
							</div>
							<br>
						</c:if>
						<c:if test="${obj.type =='vedio'}">
							<div class="vedio shadow">
								<div class="section-header">
									<h3>${obj.title}</h3>
								</div>
								<iframe width="100%" height="315"
									src="https://www.youtube.com/embed/tgbNymZ7vqY"> </iframe>
								${obj.source} <br> ${obj.id} <br>
							</div>
							<br>
						</c:if>
				</c:forEach>
				<br>
			</div> <!--main end-->
		
		</div>
	
		<footer class="bg-light text-center text-white">
			<!-- Grid container -->
			<div class="container p-4 pb-0">
			  <!-- Section: Social media -->
			  <section class="mb-4">
				<!-- Facebook -->
				<a
				  class="btn btn-primary btn-floating m-1"
				  style="background-color: #3b5998;"
				  href="#!"
				  role="button"
				  ><i class="fab fa-facebook-f"></i
				></a>
		  
				<!-- Twitter -->
				<a
				  class="btn btn-primary btn-floating m-1"
				  style="background-color: #55acee;"
				  href="#!"
				  role="button"
				  ><i class="fab fa-twitter"></i
				></a>
		  
				<!-- Google -->
				<a
				  class="btn btn-primary btn-floating m-1"
				  style="background-color: #dd4b39;"
				  href="#!"
				  role="button"
				  ><i class="fab fa-google"></i
				></a>
		  
				<!-- Instagram -->
				<a
				  class="btn btn-primary btn-floating m-1"
				  style="background-color: #ac2bac;"
				  href="#!"
				  role="button"
				  ><i class="fab fa-instagram"></i
				></a>
		  
				<!-- Linkedin -->
				<a
				  class="btn btn-primary btn-floating m-1"
				  style="background-color: #0082ca;"
				  href="#!"
				  role="button"
				  ><i class="fab fa-linkedin-in"></i
				></a>
				<!-- Github -->
				<a
				  class="btn btn-primary btn-floating m-1"
				  style="background-color: #333333;"
				  href="#!"
				  role="button"
				  ><i class="fab fa-github"></i
				></a>
			  </section>
			  <!-- Section: Social media -->
			</div>
			<!-- Grid container -->
		  
			<!-- Copyright -->
			<div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
			  © 2021 Copyright:
			  <a class="text-white" href="https://zad.edu/">ZAD.com</a>
			</div>
			<!-- Copyright -->
		  </footer>

</div> <!-- container-->

<!-- jQuery library ------online bootstrap script---------->
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->
<!-- Popper JS -----------online bootstrap script------------>
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script> -->
<!-- Latest compiled JavaScript ---------------online bootstrap script----------->
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->

	<!-- local bootstrap script-->
	<script src="/zadtesting/scripts/jquery-3.6.0.min.js"></script>
	<script src="/zadtesting/scripts/popper.min.js"></script>
	<script src="/zadtesting/scripts/bootstrap.js"></script>
</body>
</html>