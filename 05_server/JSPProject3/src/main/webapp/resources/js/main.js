// #btn1 요소 클릭 시
document.querySelector("#btn1").addEventListener("click", () => {
  
  // location.href; : 현재 주소
  // location.href = 주소 : 대입된 주소로 이동(GET방식)
  location.href = "/jstl/basic";
  
});

// #btn2 요소 클릭 시
document.querySelector("#btn2").addEventListener("click", () => {

  location.href = "/jstl/condition";

});

// #btn3 요소 클릭 시
document.querySelector("#btn3").addEventListener("click", () => {

  location.href = "/jstl/loop";

});