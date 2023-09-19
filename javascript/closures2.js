//closure begins
var bankAccount=function()
{
 var accountBalance=1000;
 var deposit=function(depositAmount)
 {
accountBalance=accountBalance+depositAmount;
return `Account balance after deposit: ${accountBalance}`;
 };
var withdraw=function(withdrawAmount){
   accountBalance=accountBalance-withdrawAmount;
   return`Account Balance after Withdraw:${accountBalance}`;

};
var getCurrentBalance=function()
{
    return accountBalance;
}

return{ deposit,withdraw,getCurrentBalance};//return public methods
}
//closure ends

var firstAccount= bankAccount();
console.log(firstAccount.getCurrentBalance());
console.log(firstAccount.deposit(200));
console.log(firstAccount.withdraw(50));


