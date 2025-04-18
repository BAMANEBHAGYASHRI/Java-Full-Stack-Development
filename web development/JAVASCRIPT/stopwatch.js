let startbtn=document.getElementById('start');
let stopbtn=document.getElementById('stop');
let resetbtn=document.getElementById('reset');

let hour=0;
let minute=0;
let second=0;
let count=0;
let timer=true;

startbtn.addEventListener('click' , function(){
    timer=true;
    stopwatch();
});

