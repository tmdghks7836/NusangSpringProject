<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="manager_header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${res == 1 }">
			<script>
				alert("등록성공!! 리스트를 출력합니다.");
				location.href = "/manager/noticeList";
			</script>	
		</c:when>
		<c:otherwise>
			<script>
				alert("등록실패!!!");
				history.back();
			</script>
		</c:otherwise>
	
	</c:choose>
	
	
</body>
</html>