
function bankAccountDeposit()
{
var currentBalance=1000;

let deposit =function(depositAmount)
{
  currentBalance=currentBalance+depositAmount;  
  return `Account Balance: ${currentBalance}`;
}
return deposit;
}
var deposit= bankAccountDeposit();
console.log(deposit(200));
console.log(deposit(300));


