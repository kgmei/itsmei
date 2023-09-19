let Callback1=function(name,age)
{
    console.log(`Callback1:Name is ${name},age is ${age}`);
}

let Callback2=function(name,age)
{
    console.log(`Callback2:Age is ${age},Name is ${name}`);
}

function DoWork(name,age,myFunctionRef)
{
    name="Mr" +name;
    age++;
   myFunctionRef(name,age);
}
DoWork("scott",20,Callback1);
DoWork("scott",20,Callback2);