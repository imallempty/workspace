const createBtn = document.getElementById("create-btn");
const result = document.getElementById("result")


createBtn.addEventListener("click", e => {

  const fruitCheck = document.querySelectorAll(".fruit:checked");


  for (let check of fruitCheck) {
    const fruit = check.nextElementSibling.innerText;
    const price = check.parentElement.nextElementSibling.getAttribute("value");
    const amount = check.parentElement.nextElementSibling.nextElementSibling.children[0].value;
  }

  

})


