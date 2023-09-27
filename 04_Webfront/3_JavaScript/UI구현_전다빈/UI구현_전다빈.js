const signupForm = document.signupForm;
const inputId = document.getElementById("input-id");
const inputPw = document.getElementById("input-pw");
const inputPwCheck = document.getElementById("input-pw-check");
const inputEmailId = document.getElementById("input-email-id");
const inputAddress = document.getElementById("input-address");

const inputList = document.querySelectorAll(".signup-input");

inputPw.addEventListener("input", e => {

  const val = inputPw.value.trim();
  inputPw.value = val;

  const span = e.target.nextElementSibling.nextElementSibling;
  if (val.length === 0) {
    span.innerText = "영문자 대/소문자 특수문자, 숫자 포함 8 ~ 32자";
    span.classList.remove("check");
    span.classList.remove("error");
    checkPwFn();
    return;
  }

  const regEx = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,32}$/;

  if (regEx.test(val)) { // 유효한 경우
    span.innerText = "유효한 비밀번호 형식 입니다.";
    span.classList.add("check");
    span.classList.remove("error");

  } else {
    span.innerText = "유효하지 않은 비밀번호 형식입니다.";
    span.classList.add("error");
    span.classList.remove("check");
  }
});

inputPwCheck.addEventListener("click", e => {
  const pwSpan = inputPw.nextElementSibling.nextElementSibling;
  const span = inputPwCheck.nextElementSibling.nextElementSibling;

  const val = e.target.value.trim();
  e.target.value = val;

  if (val.length === 0) {
    span.innerText = "비밀번호를 먼저 입력해주세요";
    span.classList.remove("check");
    span.classList.remove("error");
    return;
  }

  const pwVal = inputPw.value;

  if (val === pwVal) {
    span.innerText = "비밀번호 일치";
    span.classList.add("check");
    span.classList.remove("error");

  } else {
    span.innerText = "비밀번호 불일치";
    span.classList.add("error");
    span.classList.remove("check");
  }
});

function checkPwFn() {
  const span = inputPwCheck.nextElementSibling.nextElementSibling;
  const pwVal = inputPw.value.trim();
  const checkVal = inputPwCheck.value.trim();

  if (pwVal.length == 0 || checkVal.length == 0) {
    span.innerText = "비밀번호를 먼저 입력 해주세요";
    span.classList.remove("check");
    span.classList.remove("error");
    return;
  }

  if (pwVal === checkVal) {
    span.innerText = "비밀번호 일치";
    span.classList.add("check");
    span.classList.remove("error");

  } else {
    span.innerText = "비밀번호 불일치";
    span.classList.add("error");
    span.classList.remove("check");

  }
}

signupForm.addEventListener('submit', e => {

  if(inputId.value == ""){
    e.preventDefault(); 
    inputId.nextElementSibling.nextElementSibling.innerText = "필수 입력 항목 입니다.";
    inputId.nextElementSibling.nextElementSibling.classList.add("error");
    inputId.focus();
    return;
  }
  if(inputPw.value == ""){
    e.preventDefault(); 
    inputPw.focus();
    inputPw.nextElementSibling.nextElementSibling.innerText = "필수 입력 항목 입니다.";
    inputPw.nextElementSibling.nextElementSibling.classList.add("error");

    return;
  }

  if(inputPwCheck.value == ""){
    e.preventDefault(); 
    inputPwCheck.focus();
    inputPwCheck.nextElementSibling.nextElementSibling.innerText = "필수 입력 항목 입니다.";
    inputPwCheck.innerText = "필수 입력 항목 입니다.";
    inputPwCheck.nextElementSibling.nextElementSibling.classList.add("error");
    return;
  }
});




