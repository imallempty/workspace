import React, { Component } from 'react';



// ch 
// 1. Component 상속 받기
// 2. render() 함수 작성하기(필수)
// 3. 만든 class를 export default 지정하기
class ComponentEx extends Component {

  // 생성자 함수 : 컴포넌트 생성 시 실행
  constructor(props){
    super(props);
    
    // 만들어지는 컴포넌트에 count:0이라는 상태 추가
    // (java로 따지면 count 필드 만들고 0으로 초기화)
    this.state = {count:0};    
  }

  // 이벤트 : 행동, 동작(click, ketup, mouseover...)
  // 이벤트 리스너 : 이벤트 감지(onclick, onkeyup)
  // 이벤트 핸들러 : 이벤트 감지 시 수행할 함수(기능)

  /* 이벤트 핸들러 작성 */
  clickHandler = () => {
    this.setState({count : this.state.count+ 1 });
  }


  // render() 함수 :
  // return 되는 html형식의 코드(jsx, js + xml)를 화면에 출력하는 함수
  // 화면이 변경되어야 할 시점에 자동으로 호출됨.
  // ** Component를 상속 받은 하위 클래스에 반드시 있어야 하는 함수**
  render() { 
    return(
      <>
        <h2>클래스형 컴포넌트 입니다.</h2>
        
        <h1>count : {this.state.count}</h1>
        <button onClick={this.clickHandler}>증가</button>
      </>
    );
  }
}

export default ComponentEx;