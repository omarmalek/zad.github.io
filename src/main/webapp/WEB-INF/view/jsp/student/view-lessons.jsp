<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table style="border:1px solid">
<tr><td>المستوى</td><td><a href="<c:url value="viewsubjects"/>">الرابع</a></td></tr>
<tr><td>المادة</td><td><a href="<c:url value="viewunits"/>">${subjectTitle}</a></td></tr>
	<tr><td>${unitName} </td><td>${unitTitle}</td></tr>

	</table>
<h1>الدروس</h1>
	<br>-------------------------------------
	
<table>
	<tr><th>مسلسل</th><th>الدرس</th><th>عنوان الدرس</th><th>description</th></tr>
		<c:forEach items="${lessonList}" var="lesson">
			<tr>
				<td>متسلسل</td>
				<td><a href="
							<c:url value="viewsections">
								<c:param name="lessonid" value="${lesson.id}"/>
							</c:url>
							">
								${lesson.name}</a></td>
								<td><a href="
							<c:url value="viewsections">
								<c:param name="lessonid" value="${lesson.id}"/>
							</c:url>
							">
								${lesson.title}</a></td>
				
			</tr>
		</c:forEach>
		</table>
		-------------------------------------
	
<br>
<!-- local bootstrap script-->
<script src="/zadtesting/scripts/jquery-3.6.0.min.js"></script>
<script src="/zadtesting/scripts/popper.min.js"></script>
<script src="/zadtesting/scripts/bootstrap.js"></script>
	
</body>
</html>