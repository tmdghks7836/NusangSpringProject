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
 <div class = "container">
	<caption><h3>공지사항</h3></caption>
	<div style = "float: right;"><button class = "btn btn-secondary" onclick = "location.href='/manager/noticeWrite'">글쓰기</button></div>
	<br>
<table class="table" border = "1">
  <thead class="thead-dark" align = "center">
    <tr>
      <th scope="col">내용</th>
      <th scope="col">등록일</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>개인정보 처리방침 개정안내</td>
      <td align = "center">2020-11-03</td>
    </tr>
    <tr>
      <td>개인정보 처리방침 개정안내</td>
      <td align = "center">2020-11-03</td>
    </tr>
    <tr>
      <td>개인정보 처리방침 개정안내</td>
      <td align = "center">2020-11-03</td>
    </tr>
  </tbody>
</table>
</div>

</body>
</html>