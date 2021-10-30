<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="testupload" method="post" enctype="multipart/form-data" >
	Picture Tilte: 		<input type="text" name="name"/> <br><br>
	Picture Location:   <input type="file" name="file"/> <br><br>
	discription : 		<input type="text" name="discription"/><br><br>
	
 						<input type="submit" value="Add Picture">
	</form>
		<div class=" mt-5" id="links">
			<div class="alert alert-success" role="alert">
				<h4 class="alert-heading">حسناً!</h4>
				تمت عملية التسجيل بنجاح !
				<hr>
				<p class="mb-0">يمكنك الآن متابعة تقدمك في المنصة.</p>
			</div>
			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<strong>Holy guacamole!</strong> You should check in on some of
				those fields below.
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>

			<a
				href="<c:url value="viewsubjects">
		 	<c:param name="levelcode" value="4"/>   
		</c:url>
		">Auther-
				view subjects for this spacefic level 4</a> <br> <br> <a
				href="<c:url value="student/viewsubjects">
			<c:param name="levelcode" value="4"/>  
		</c:url>
		">Student-
				view subjects for this spacefic level 4</a>
		</div>

		<div class="card bg-dark  " style="max-width: 540px;">
			<img
				src="/zadtesting/resources/images/20121205-palestine-0137_800x5339_72dpi.jpg"
				class="card-img " alt="...">
			<div class="card-img-overlay  ">
				<h5 class="card-title display-4 text-success mt-auto ">Card
					title</h5>
				<p class="card-text text-white">This is a wider card with
					supporting text below as a natural lead-in to additional content.
					This content is a little bit longer.</p>
				<p class="card-text text-white">Last updated 3 mins ago</p>
			</div>
		</div>
</body>
</html>