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
stopbtn.addEventListener('click' ,function(){
    timer=false;
} );
resetbtn.addEventListener('click',function(){
    timer=false;
    hour=0;
    minute=0;
    second=0;
    count=0;

    document.getElementById('hr').innerHTML="00";
    document.getElementById('min').innerHTML="00";
    document.getElementById('sec').innerHTML="00";
    document.getElementById('count').innerHTML="00";
});

function stopwatch(){
    if(timer){
        count++;
    
        if(count==100){
            second++;
            count=0;
        }
        if(second==60){
            minute++;
            second=0;
        }
        if(minute==60){
            hour++;
            minute=0;
            second=0;               
        }

        let hrtime=hour;
        let mintime=minute;
        let sectime=second;
        let counttime=count;

        if(hour <10){
            hrtime='0'+hrtime;
        }
        if(minute<10){
            mintime='0'+mintime;
        }
        if(second<10){
            sectime='0'+sectime;
        }
        if(count<10){
            counttime='0'+counttime;
        }

        document.getElementById('hr').innerHTML=hrtime;
        document.getElementById('min').innerHTML=mintime;
        document.getElementById('sec').innerHTML=sectime;
        document.getElementById('count').innerHTML=counttime;

    }
    setTimeout(stopwatch,10);
    
}

