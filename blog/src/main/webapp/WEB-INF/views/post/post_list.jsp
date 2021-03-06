<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="btn_write">
	<button class="btn btn-dark" onclick="location.href='/post/post_write'">글쓰기</button>
</div>

<div class="post_list container">
	<c:forEach var="board" items="${myPostList.content}">
	
		<div class="post" onclick="location.href='/post/post_read/${board.id}'">
			<div class="img">
				<img src="${board.user.picture}" alt="" />
			</div>

			<div class="txt">
				<div class="top">
					<div class="writer">${board.user.nickname}</div>
					<div class="post_title">${board.title}</div>
				</div>
				<div class="comment">${board.content}</div>
				<div class="view">
					<span><i class="heart_icon far fa-heart"></i>  ${board.wishList.size()}</span>
					<span>조회수${board.viewcnt}</span>
					<span>댓글${board.replyList.size()}</span>
					<input type="hidden" class="board_no" value="${board.id}">
					<input type="hidden" class="isWatchPost" value="${board.isWishBoard(user)}">
				</div>
			</div>
		</div>
	</c:forEach>
</div>


<link rel="stylesheet" href="/css/post/post_list.css" />
<script src="/js/post/post_ilst_wish.js"></script>