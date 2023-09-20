// 적용하기 버튼이 클릭 되었을때
const applyBtn = document.querySelector("#apply-btn");

applyBtn.addEventListener("click", function () {

  // 위에 작성된 input 요소 모두 읽어오기
  const boxWidth = document.querySelector("#box-width");
  const boxHeight = document.querySelector("#box-height");
  const fs = document.querySelector("#size");
  const fw = document.querySelector("[name='fw']:checked");
  const fontColor = document.querySelector("#box-text-color");
  const bgColor = document.querySelector("#box-backgroundcolor");
  const row = document.querySelector("[name='align-row']:checked");
  const col = document.querySelector("[name='align-col']:checked");

  const box = document.querySelector("#box");
  const content = document.querySelector("#content");

  //input에 작성된 값에 따라 #box에 JS로 CSS추가

  // 너비를 입력하는 input에 값이 작성되어 있다면
  if (boxWidth.value.trim().length > 0) {
    box.style.width = boxWidth.value + "px";
  }

  // 높이를 입력하는 input에 값이 작성되어 있다면
  if (boxHeight.value.trim().length > 0) {
    box.style.height = boxHeight.value + "px";
  }

  // 글자 크기를 입력하는 input에 값이 작성되어 있다면
  if (fs.value.trim().length > 0) {
    box.style.fontSize = fs.value + "px";
  }

  // fw -> 체크된게 없으면 null 반환
  //    -> 체크된게 있으면 null 아님
  if (fw != null) { // 글자 굵기가 체크 되었을 때
    box.style.fontWeight = fw.value;
  }

  // 글자 색을 입력하는 input에 값이 작성되어 있다면
  if (fontColor.value.trim().length > 0) {
    box.style.color = fontColor.value;
  }

  // 배경색을 입력하는 input에 값이 작성되어 있다면
  if (bgColor.value.trim().length > 0) {
    box.style.backgroundColor = bgColor.value;
  }

  if (row != null) { // 가로정렬이 체크 되었을 때
    box.style.justifyContent = row.value;
  }

  if (col != null) { // 세로정렬이 체크 되었을 때
    box.style.alignItems = col.value;
  }

  // content에 작성된 값이 있을 때
  if (content.value.trim().length > 0) {
    box.style.innerText = content.value;
  }

})