let getCardBill=function()
{
    let sum =0;
    for(let i=0;i<arguments.length;i++)
    {
        sum=sum+arguments[i];
    }
    return sum;

}
console.log(getCardBill(13));
console.log(getCardBill(13,90,25,86,55,698,987,));