const inputName =document.getElementById("input-name");
const inputComment = document.getElementById("input-comment");
const commentBtn = document.getElementById("comment-btn");
const comment = document.querySelector(".comment");

commentBtn.addEventListener("click", () => {
  if(inputName.value.trim().length === 0){
    alert("작성자 명을 입력 해주세요");
    input.focus();
    return;
  }

  if(inputComment.value.trim().length === 0){
    alert("댓글 내용을 입력 해주세요");
    inputComment.focus();
    return;
  }

  p.innerText()



});

/* 현재 시간 만들기 */
function getCurrentDate(){
  const now = new Date();

  const year = now.getFullYear();
  const month = now.getMonth() < 10 ? "0"+now.getMonth() : now.getMonth();
  const date = now.getDate() < 10 ? "0"+now.getDate() : now.getDate();
  const hour = now.getHours() < 10 ? "0"+now.getHours() : now.getHours();
  const minute = now.getMinutes() < 10 ? "0"+now.getMinutes() : now.getMinutes();
  const second = now.getSeconds() < 10 ? "0"+now.getSeconds() : now.getSeconds();

  return `${year}-${month}-${date} ${hour}:${minute}:${second}`;
}