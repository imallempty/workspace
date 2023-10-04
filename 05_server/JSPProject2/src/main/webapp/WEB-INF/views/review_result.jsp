<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>복수 결과 응답</title>
</head>
<body>
  
  <h3>EL(Expresstion language) : 표현 언어</h3>

  <pre>
    JSP에서 HTML  형식으로 출력하하는 JAVA값을
    쉽고 효율족으로 작성하기 위한 언어

    <%--
      기준 : <%= =%>
      EL : 4{ }
    --%>
  </pre>

  
  <hr>

  <h3>\${parma.name 속성값: } 파라미터 출력</h3>

  <pre>
    - 해당 파라미터 얻어와 출력
    - 같은 name 속성이 여러개면 첫 번째만 출력
    - 같은 name 속성이 없으면 출력 xx
  </pre>
  
  <ul>
    <li>이름 : ${param.inputName}</li>
    <li>나이 : ${param.inputAge}</li>
    <li>성별 : ${param.gender}</li>
    <li>취미 : ${param.hobby}</li>
  </ul>

  <hr>
  <h3>\${paramValues.name속성값} : 파라미터 모두 얻어오기</h3>
  <pre>
    - name  속성 값이 일치하는 모든 파라미터 얻어와 배열로 반환
     -> index를 이용해서 요소 하나하나 접근이 가능
  </pre>

  <ul>
    <li>paramValues.hobby : ${paramValues.hobby}</li>
    <li>paramValues.hobby[0] : ${paramValues.hobby[0]}</li>
    <li>paramValues.hobby[1] : ${paramValues.hobby[1]}</li>
    <li>paramValues.hobby[2] : ${paramValues.hobby[2]}</li>
    <li>paramValues.hobby[3] : ${paramValues.hobby[3]}</li>
  </ul>

  <hr>

  <h3>\${속성Key} : 세팅된 속성(필드) 값 출력</h3>

<h4></h4>


</body>
</html>