//accessing properties from object in js
let customer = {customerName:"Scott",
email:"scott@test.com",
1:"hello"};

console.log(customer.customerName);//dot
console.log(customer["customerName"]);//brackets notation

customer.email="scott@example.com";//dot
console.log(customer.email);//brackets notation
console.log(customer[1]);
console.log(customer);