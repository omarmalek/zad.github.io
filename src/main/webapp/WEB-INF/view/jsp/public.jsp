<%@ include file="/WEB-INF/view/jsp/base.jspf"%>
<title>Public Page</title>

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
					<li class="nav-item active" ><a class="nav-link" href="#">الصفحة
							الرئيسية <span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item  text-info"><a class="nav-link" href="#">الملف
							الشخصي</a></li>
							<li class="nav-item"><a class="nav-link" href="#">ابرز المساهمات
							</a></li>
							<li class="nav-item"><a class="nav-link" href="#honour"> لوحة الشرف
							</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
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



<!------------------------------------------- Showcase  ------------------------------------------->
<section class="bg-cu-unrwa text-light text-center font-cu-cairo">
	<div class="container p-4">
		<div class="row  ">
			<div class="col-sm-6 ">
				<img class="img-fluid w-25" src="/zadtesting/resources/images/logo2.png" alt="logo"/>
				<h1>منصة<span class="text-warning" > زاد </span>  التعليمية</h1>
				<p class="lead" >تطبيق محاكي للمنهاج التعليمي في فلسطين</p>
				<button type="button" class="btn  btn-light text-primary  btn-lg" data-toggle="modal"
			data-target="#subscrib-modal">اشترك الآن</button>
			</div>
			<div class="col-sm-6 d-flex align-items-center">
				<img class="img-fluid my-auto shadow" src="/zadtesting/resources/images/edu-main-croped.jpg" alt=""/>
			</div>
		

		</div>
	</div>
	<img class="wave" src="/zadtesting/resources/images/wavy.png" style="height:100px; width:100%;" alt="..." />
</section>
<!------------------------------------------------ Boxes  ------------------------------------->
<section class="p-5 text-center">
	<div class="container">
		<div class="row"><!-- this row will be generated dynamicly -->
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G1.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G2.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G3.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G4.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G5.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G6.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G7.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G8.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G9.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G10.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G11.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
			<div class="col-sm-6 col-md-3">
	
				<div class="card m-2  " >
				<a href="<c:url value="viewsubjects">
		 			<c:param name="levelcode" value="4"/>   
						</c:url>" class=" shadow stretched-link">
							<img src="/zadtesting/resources/images/GRADE_Card_G12.jpg" class="img-fluid " alt="...">
						 </a>
					
				</div>
			</div>
				

		</div>
	</div>
</section>
<!--------------------------------- instrunction of the menistry -------------------------->
<section>
	<div class="container">
		
	</div>
</section>
<!-- instrunction of the school -->

<!-- News -->
<section class="bg-secondary text-light p-5">
	<div class="container ">
	<div >
		<h1 class="text-center mb-3 font-cu-cairo ">جديد المنصة</h1>
		<div class="d-flex "  >
		<div id="media">
			<ul id="honour" class=" list-unstyled ">
				<li class="media position-relative"><img
					src="/zadtesting/resources/images/math.jpg" width="64px;"
					class="mr-3" alt="...">
					<div class="media-body">
						<h5 class="mt-0 mb-1">List-based media object</h5>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin. 
						 <a href="#" class=" stretched-link">عرض</a>
					</div></li>
				<li class="media my-4"><img
					src="/zadtesting/resources/images/en.jpg" width="64px;" class="mr-3"
					alt="...">
					<div class="media-body">
						<h5 class="mt-0 mb-1">List-based media object</h5>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin. 
					</div></li>
				<li class="media"><img src="/zadtesting/resources/images/ss.jpg"
					class="mr-3" alt="..." width="64px;">
					<div class="media-body">
						<h5 class="mt-0 mb-1">List-based media object</h5>
						Cras sit amet nibh libero, in gravida nulla. Nulla vel metus
						scelerisque ante sollicitudin.
						</div>
			</ul>
		</div>
		<div class=" d-flex align-items-center " >
			<img class="img-fluid d-none d-lg-block" src="/zadtesting/resources/images/great.jpg" alt="great"/>
		</div>
		</div>
		</div>
	</div>
</section>
			

	

	



<!---------------------------------------------- Footer  ------------------------------>
<footer class="p-5 bg-cu-unrwa text-white text-center position-relative">
    <div class="container">
        <p class="lead">Copyright &copy; 2021 ZAD Estaplishment</p>
        <a href="#" class="position-absolute bottom-0 end-0 p-5">
            <i class="bi bi-arrow-up-circle h1"></i>
			<i class="accessible-icon"></i>
        </a>

    </div>
</footer>

<!---------------------------------------- Modal ---------------------------------------->
		<div class="modal fade" id="subscrib-modal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<form class="needs-validation" novalidate>
			<div class="form-row">
				<div class="col-md-4 mb-3">
					<label for="validationCustom01">First name</label> <input
						type="text" class="form-control" id="validationCustom01"
						placeholder="First name" value="Mark" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustom02">Last name</label> <input
						type="text" class="form-control" id="validationCustom02"
						placeholder="Last name" value="Otto" required>
					<div class="valid-feedback">Looks good!</div>
				</div>
				<div class="col-md-4 mb-3">
					<label for="validationCustomUsername">Username</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text" id="inputGroupPrepend">@</span>
						</div>
						<input type="text" class="form-control"
							id="validationCustomUsername" placeholder="Username"
							aria-describedby="inputGroupPrepend" required>
						<div class="invalid-feedback">Please choose a username.</div>
					</div>
				</div>
			</div>
			<div class="form-row">
				<div class="col-md-6 mb-3">
					<label for="validationCustom03">City</label> <input type="text"
						class="form-control" id="validationCustom03" placeholder="City"
						required>
					<div class="invalid-feedback">Please provide a valid city.</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom04">State</label> <input type="text"
						class="form-control" id="validationCustom04" placeholder="State"
						required>
					<div class="invalid-feedback">Please provide a valid state.</div>
				</div>
				<div class="col-md-3 mb-3">
					<label for="validationCustom05">Zip</label> <input type="text"
						class="form-control" id="validationCustom05" placeholder="Zip"
						required>
					<div class="invalid-feedback">Please provide a valid zip.</div>
				</div>
			</div>
			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" type="checkbox" value=""
						id="invalidCheck" required> <label
						class="form-check-label" for="invalidCheck"> Agree to
						terms and conditions </label>
					<div class="invalid-feedback">You must agree before
						submitting.</div>
				</div>
			</div>
			<button class="btn btn-primary" type="submit">Submit form</button>
		</form>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary">Save changes</button>
					</div>
				</div>
			</div>
	



	</div>
	


<!---------------------------------- local bootstrap script-------------------------------->
	<script src="/zadtesting/resources/js/jquery-3.6.0.min.js"></script>
	<script src="/zadtesting/resources/js/popper.min.js"></script>
	<script src="/zadtesting/resources/js/bootstrap.js"></script>
	
<!-------------------------------------- Local js ------------------------------------------->
	<script src="/zadtesting/resources/js/code.js_disabled_for_now"></script>
</body>
</html>