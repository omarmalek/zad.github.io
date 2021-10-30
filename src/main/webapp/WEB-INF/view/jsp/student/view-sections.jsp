<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="border: 1px solid">
		<tr>
			<td>المستوى</td>
			<td><a href="<c:url value="viewsubjects"/>">الرابع</a></td>
		</tr>
		<tr>
			<td>المادة</td>
			<td><a href="<c:url value="viewunits"/>">${subjectTitle}</a></td>
		</tr>
		<tr>
			<td>${unitName}</td>
			<td><a href="<c:url value="viewlessons"/>">${unitTitle}</a></td>
		</tr>
		<tr>
			<td>${lessonName}</td>
			<td>${lessonTitle}</td>
		</tr>

	</table>
	<title>Sections</title>

	<h1>المفاصل (Sections)</h1>
	<br>-------------------------------------

	<table>
		<tr>
			<th>مسلسل</th>
			<th>عنوان المفصل</th>
			<th>description</th>
		</tr>
		<c:forEach items="${sectionsList}" var="section">
			<tr>
				<td>م</td>
				<td><a
					href="
							<c:url value="viewsectioncontents">
								<c:param name="sectionid" value="${section.id}"/>
							</c:url>
							">
						${section.title}</a></td>

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