<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="post_read container">
	<div class="user_info">
		<div class="img">
			<img src=/image/panda.jpg>
		</div>
		
		<div class="txt">
			<div class="user_id">아이디를뭐라할까</div>
			
			<div class="title"> 글 제목</div>
			
			<div class="update_delete">
				<button class="btn btn-primary">수정</button>
				<button id="btn_delete" class="btn btn-primary">삭제</button>
			</div>
		</div>
		<input type="hidden" id="id" value="${board.id}">
	</div>
	
	<div class="content">
		${board.content}
	</div>
</div>
 
<script src="/js/post/write.js"></script>

<%@ include file="../layout/footer.jsp"%>
</body>
</html>