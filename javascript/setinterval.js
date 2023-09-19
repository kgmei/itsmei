function callBack()
{
    console.log("Hello");
}
let myInterval = setInterval(callBack,2000);

function stopInterval()
{
 clearInterval(myInterval);
}

setTimeout(stopInterval,20 * 1000);