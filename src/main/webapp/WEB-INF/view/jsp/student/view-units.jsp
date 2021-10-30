<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<table style="border:1px solid">
<tr><td>المستوى</td><td><a href="<c:url value="viewsubjects"/>">الرابع</a></td></tr>
<tr><td>المادة</td><td>${subjectTitle}</td></tr>
	
	</table>
${message}
<br>

	<h1>الوحدات</h1>
	<br>-------------------------------------
	
<table>
	<tr><th>مسلسل</th><th>الوحدة</th><th>عنوان الوحدة</th><th>description</th></tr>
		<c:forEach items="${unitsList}" var="unit">
			<tr>
				<td>متسلسل</td>
				<td><a href="
							<c:url value="viewlessons">
								<c:param name="unitid" value="${unit.id}"/>
							</c:url>
							">
								${unit.name}</a></td>
								<td><a href="
							<c:url value="viewlessons">
								<c:param name="unitid" value="${unit.id}"/>
							</c:url>
							">
								${unit.title}</a></td>
				
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