/* 정규 표현식 객체 생성/패턴 일치 확인 */
const check1 = document.getElementById("check1");
check1.addEventListener("click", () => {

  // 정규 표현식 객체 생성

  // 1) new RegExp("정규표현식")
  let regEx = new RegExp("\d{3}"); // 연속적으로 작성된 숫자 3개

  // 2) /정규표현식/
  regEx = /\d{3}/;

  /* 패턴 일치 여부 확인 */
  const str1 = "정규표현식123";
  const str2 = "정규89표현식";

  // 정규식객체.test(문자열) -> 패턴이 일치하면 true
  console.log(regEx.test(str1)); // true
  console.log(regEx.test(str2)); // false

  // 정규식객체.exec(문자열) -> 일치하는 패턴의 문자열 반환, 없으면 null
  console.log(regEx.exec(str1));
  console.log(regEx.exec(str2));
});

/* 메타 문자 확인하기 */
const check2 = document.querySelector("#check2");
check2.addEventListener("click", () => {

  // a (일반문자열)
  let regEx = /java/;

  console.log(`javascript : ${regEx.test("javascript")}`);
  
  console.log(`jajajajajaj : ${regEx.test("jajajajajaj")}`);

  //[abcd] 
  regEx = /[a-z][0-9][A-Z]/;
  // 1번 : 영어 소문자 / 2번 : 숫자 / 3번 : 영어 대문자
  let str = "a3T";
  console.log(`${str} ${regEx.test(str)}`);

  str = "@@@@@@a3T@@@@";
  console.log(`${str} ${regEx.test(str)}`);

  str = "b5q";
  console.log(`${str} ${regEx.test(str)}`);

  // ^(캐럿)/ $(달러)
  regEx =/^Hello[0-9]/;
  str = "Hello7 world";
  console.log(`${str} ${regEx.test(str)}`); // true
  
  str = "Hello world"; /* Hello 뒤에 숫자 없음 */
  console.log(`${str} ${regEx.test(str)}`); // false
  
  str = "           Hello8 world"; /* 띄어쓰기도 문자다 */
  console.log(`${str} ${regEx.test(str)}`); // false
  
  // $(달러)
  // \d : 아무 숫자 == [0-9]
  regEx = /\d\d\d/; // 문자열이 끝에 숫자가 3칸 있는가
  str = "123456798";
  console.log(`${str} ${regEx.test(str)}`); // true
  
  str = "123123123123_99";
  console.log(`${str} ${regEx.test(str)}`); // false


  // 양어 소문자로 시작
  // 중간에 "test"
  // 끝은 1자리 숫자로 끝나는 문자열

  regEx = /^[a-z]TEST\d$/;
});

/* 이름 유효성 검사 */
const inputName = document.getElementById("input-name");
const nameResult = document.getElementById("name-result");

inputName.addEventListener("keyup", () => {
  // 1) 2 ~15글자 사이 -> {2,15}
  // 2) 처음부터 끝까지 한글 -> ^한글$
  // 3) 단모음, 단자음 제외 -> [가-힣]

  const regEx = /^[가-힣]{2,15}$/;

  // 입력받은 값
  const value = inputName.value.trim(); // 좌우 공백 제거 상태
  inputName.value = value; // 좌우 공백이 제거된 값을 대입

  if(value.length == 0){ // 입력 X
    nameResult.innerText = "한글 2~15자 사이 입력";
    nameResult.classList.remove("check"); // check 클래스 제거
    nameResult.classList.remove("error"); // error 클래스 제거
    return;
  }

  // 정규식 이용해서 검사
  if(regEx.test(value)){ // 유효한 경우
    nameResult.innerText = "유효한 이름입니다.";
    nameResult.classList.add("check"); // check 클래스 추가
    nameResult.classList.remove("error"); // error 클래스 제거
  } else{ // 유효하지 않은 경우
    nameResult.innerText = "유효하지 않은 이름입니다."
    nameResult.classList.add("error"); // error 클래스 추가
    nameResult.classList.remove("check"); // check 클래스 제거
  }
});

/* 전화번호 유효성 검사 */
const tel = document.getElementById("input-tel");
const result = document.getElementById("tel-result");

tel.addEventListener("keyup", () => {

  const regEx = /^01[0,1,6,7,9]-\d{3,4}-\d{4}$/;
  const value = tel.value.trim();
  tel.value = value; 

  if(tel.length == 0){
    result.innerText ="tel-result"
    result.classList.remove("check");
    result.classList.remove("error");
    remove;
  }

  if(regEx.test(value)){
    result.innerText = "유효한 형식입니다."
    result.classList.add("check");
    result.classList.remove("error");
  } else{
    result.innerText = "유효하지 않은 형식입니다."
    result.classList.add("error");
    result.classList.remove("check");
  }
});