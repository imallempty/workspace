<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>온라인 문구 판매</title>
</head>

<body>
    <h1>KH 온라인 문방구</h1>
    <form action="/orderProduct.do" method="POST">
        <table border="2">
            <tr >
                <th colspan="3">주문자명</th>
            </tr>

            <tr >
                <th colspan="3"><input type="text" name="name" value="0"></th>
            </tr>
            
            <tr>
                <th>품목</th>
                <th>가격</th>
                <th>수량</th>
            </tr>

            <tr>
                <td>검정 펜</td>
                <td>500원</td>
                <td><input type="number" min="0" max="100" value="0" name="blackPen"></td>
            </tr>

            <tr>
                <td>빨간 펜</td>
                <td>700원</td>
                <td><input type="number" min="0" max="100" value="0" name="redPen"></td>
            </tr>

            <tr>
                <td>파란 펜</td>
                <td>500원</td>
                <td><input type="number" min="0" max="100" value="0" name="bluePen"></td>
            </tr>

            <tr>
                <td>화이트</td>
                <td>1000원</td>
                <td><input type="number" min="0" max="100" value="0" name="white"></td>
            </tr>

            <tr>
                <th colspan="3">
                    <button type="submit">구매</button>
                    <button type="reset">초기화</button>
                </th>
            </tr>
        </table>
    </form>
</body>

</html>