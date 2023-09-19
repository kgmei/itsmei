

let a=10;//global variable
var b=20;//global variable
console.log(a);
console.log(b);
function myFunction()
{
    console.log(a);
console.log(b);
console.log(c);

    var c =30;//local variable
    let d=40;//local variable

    if (c==d)
    {
        var e=50;//local variable
        let f=60;//block level variable
    }

}
myFunction();