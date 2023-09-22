const count = document.getElementById("count");
const createBtn = document.getElementById("create-btn");
const container = document.querySelector('.container');
const clacBtn =  document.getElementById("clac")
const result = document.getElementById("result")

createBtn.addEventListener("click", () => {
  for(let i =1; i<count.value; i++){
  const row = document.createElement("div");
  row.classList.add('row');
  const input = document.createElement('input');
  input.setAttribute('type', 'number');
  input.classList.add('input-number');
  
  row.append(input);
  container.append(row);
  }
});

clacBtn.addEventListener("click", e => {
  const number = document.querySelectorAll('.input-number');

  let sum = 0;
  for(let i =0; i<number.length; i++){
    sum += Number(number[i].value);
  }

  result.innerText = sum;

});

