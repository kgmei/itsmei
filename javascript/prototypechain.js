//protochain
var person ={personName:"john",age:20};
var student={rollNo:12,marks:70}
var medicalStudent={mainSubject:"biology"};
student.__proto__=person;
medicalStudent__proto__=student;

console.log(medicalStudent,medicalStudent.__proto__);
console.log(student,student.__proto__);
console.log(student,student.__proto__);
console.log(person,person.__proto__);