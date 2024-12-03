const btn = document.getElementById("btn");
const form = document.forms[0]

// console.log(form)

btn.addEventListener("click",(e)=>{
    e.preventDefault();
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const pass = document.getElementById("password").value;
    const confPass = document.getElementById("confirm-password").value;

    let flag = true;
    let nameRegex = /^[A-Za-z ]{3,15}$/;
    if(!nameRegex.test(name))flag = false;
    
    let emailRegex = /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+\.[a-zA-Z]{2,}$/;
    if(!emailRegex.test(email))flag = false;

    let passRegex = /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\W)(?!.* ).{8,16}$/;
    if(!passRegex.test(pass))flag = false;

    if(confPass!=pass)flag=false;

    if(flag)form.submit();  
})
