//call
var person={
    age:20,
};

let birthDay=function(years){
       this.age +=years;
    }

console.log(person.age);
birthDay.call(person,2);
console.log(person.age);