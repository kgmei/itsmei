 let doSomeWork = function()
    {
     return function(){
        console.log("hello");
    }
    };
    let result = doSomeWork();
        result();

