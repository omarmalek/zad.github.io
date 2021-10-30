<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is view subject for student</h1>
<body>
	<h1>المواد التعليمية</h1>

<table>
	<tr><th>مسلسل</th><th>المادة</th><th>description</th></tr>
		<c:forEach items="${subjectsList}" var="subject">
			<tr>
				<td>متسلسل</td>
				<td><a href="
							<c:url value="viewunits">
								<c:param name="subjectid" value="${subject.id}"/>
							</c:url>
							">
								${subject.title}</a></td>
								
				
			</tr>
		</c:forEach>
		</table>
		
		<br>
	
<!-- local bootstrap script-->
<script src="/zadtesting/scripts/jquery-3.6.0.min.js"></script>
<script src="/zadtesting/scripts/popper.min.js"></script>
<script src="/zadtesting/scripts/bootstrap.js"></script>
</body>
</html>