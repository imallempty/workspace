// id로 접근하기
function idTest() {

  // 아이디가 div1인 요소(객체)를 얻어와 div1 변수에 저장
  const div1 = document.getElementById("div1");

  //Java에서 배열 리터럴 표기법 : {}
  // JS에서 배열 리터럴 표기법 : []
  const colorArray = ['pink', 'skyblue', 'black', 'white', 'green'];

  // 배열명.length : 배열 길이
  // Math.random() : 0.0 < =x < 1.0 난수(실수형)
  // Math.floor(실수) : 소수점 내림 -> 정수 반환
  const ran = Math.floor(Math.random() * colorArray.length);
  // ran == 0 ~ 배열길이-1 사이의 난수

  div1.style.backgroundColor = colorArray[ran];
}

// class로 접근하기
function classTest() {

  // 클래스 속성 값이 div2인 요소(객체) 모두 얻어와 배열로 반환 받기
  const arr = document.getElementsByClassName("div2");

  arr[0].style.backgroundColor = 'pink';
  arr[0].innerTexr = "arr[0]입니다";

  arr[1].style.backgroundColor = 'skyblue';
  arr[1].innerTexr = "arr[1]입니다";

  arr[2].style.backgroundColor = 'lightgreen';
  arr[2].innerTexr = "arr[2]입니다";

}

// tag로 접근하기
function tagTest() {

  /* 태그명이 li 요소 모두 얻어오기 */
  const arr = document.getElementsByTagName("li");

  // 반복문
  for (let i = 0; i < arr.length; i++) {
    arr[i].style.backgroundColor = "rgb(200,150," + arr[i].innerText + ")"
  }
}

// name으로 접근하기
function nameTest(){

  // name 속성 값이 hobby인 요소 모두 얻어오기
  const hobbyArray = document.getElementsByName("hobby");

  let str = ""; // 비어있는 문자열
  let count = 0; // 체크 개수 카운트

  for (let i = 0; i < hobbyArray.length; i++) {

    /* ***** checkbox, radio 전용 속성(.check) ***** */
    // 요소.checked : 해당 요소가 체크되어 있으면 true, 아니면 flase

    // 요소.checked : true -> 해당 요소 체크
    // 요소.checked : flase -> 해당 요소 체크해제

    if (hobbyArray[i].checked) { // i번째 요소가 체크되어 있다면
      count++;
      str += hobbyArray[i].value + " "; // value 속성 값 누적
    }
  }

  // #name-div 요소에 결과 출력
  const div = document.getElementById("name-div");
  div.innerHTML = str + "<br><br>" + "선택된 input 개수 : " + count;
}

// CSS 선택자로 접근하기
function cssTest(){
  // quertSelector("선택자") : 1개만 얻어옴(여러 요소 있으면 첫번째)
  // querySelectorAll("선택자") : 모두 얻어옴

  // 1개만 존재하는 요소 #css-div
  document.querySelector("#css-div").style.border = "3px solid red";

  // 여러개 있는 요소 중 첫번째만 선택
  document.querySelector("#css-div > div").style.fontsize = "40px"

  // 모두 요소 선택
  document.querySelectorAll("#css-div > div");

  arr[0].style.backgroundColor ="tomato";
  arr[1].style.backgroundColor ="orange";

}