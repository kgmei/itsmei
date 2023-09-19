class Customer
{
customerId;
customerName;
#creditCardNum;

constructor(customerId,customerName,creditCardNum)
{
    this.customerId=customerId;
    this.customerName=customerName;
    this.#creditCardNum=creditCardNum;
    console.log(this.#getCreditCardNumber())
}
#getCreditCardNumber=function()
{
    return this.#creditCardNum;
}
}
var customer1=new Customer(101,"smith",1234)
console.log(customer1.customerId);
console.log(customer1.customerName);
//console.log(customer1.#getCreditCardNumber());