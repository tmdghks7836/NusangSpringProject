<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
<title>Spring Boot WebSocket Chat Application</title>
<link rel="stylesheet" href="/css/chat_list_view.css" />
</head>

<%@ include file="../layout/header.jsp"%>

<div class="container display-4 mt-5 mb-5">

	<input type="hidden" id="user-nickname" value="${user.nickname }" />
	<h2>채팅 리스트</h2>
	<ul class="list-group">
		
	</ul>
</div>
<%@ include file="../layout/footer.jsp"%>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.4.0/sockjs.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.min.js"></script>
<script src="/js/chat/chat_list_view.js"></script>
</html>

