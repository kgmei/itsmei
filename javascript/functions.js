let getSimpleInterest=function(principle,rateOfInterest,noOfYears)
{
    let si=(principle*rateOfInterest*noOfYears )/100;
    return si;
};
let si1 =getSimpleInterest(1000,6.7,3);
let si2 =getSimpleInterest(7000,4.7,10);
console.log(si1);
console.log(si2);