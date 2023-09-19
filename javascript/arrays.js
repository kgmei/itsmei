var prices=[50,80,300];
prices[0]=450;
console.log(prices);
console.log(prices.length);

console.log("elements using loop:")
for(let i=0;i<prices.length;i++)
{
    console.log(prices[i]);
}
//array of objects
var students=
[
    {studentName:"kumar",age:17},
    {studentName:"naresh",age:17},
    {studentName:"mei",age:17},
    {studentName:"gowtham",age:17}
];
console.log(students.length);
console.log("elements using loop:")
for(let i=0;i<students.length;i++)
{
    console.log(`studentName:${students[i].studentName`);
}
    
