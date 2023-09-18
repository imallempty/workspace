// 입력 요소
const num1 = document.getElementById("input1"); // 아이디 속성 값
const num2 = document.querySelector("#input2"); // css선택자

// 결과 요소
const result = document.getElementById("result");

// 더하기 버튼 
function plus(){
  // 입력요소.value : 입력 요소에 작성된 값 반환(string)
  console.log(input1.value);
  console.log(input2.value);
  
  // Number("123") == 123  (숫자로 변환)
  console.log(Number(input1.value) + Number(input2.value));

  // 요소.innerText : <시작>내용</종료>  , 내용에 글자 대입
  result.innerText = Number(input1.value) + Number(input2.value);

}

// 빼기 버튼 
function minus(){
  result.innerText = Number(input1.value) - Number(input2.value);
}

function multi(){
  result.innerText = Number(input1.value) * Number(input2.value);
}

function div(){
  result.innerText = Number(input1.value) / Number(input2.value);
}

function mod(){
  result.innerText = Number(input1.value) % Number(input2.value);
}