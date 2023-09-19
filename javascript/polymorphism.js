var person ={
    personName:"john",
    age:20,
    getDetails:function(){
        return `personName:${this.personName}.his age is:${this.age}`;

    }
}

var teacher={
    mainSubject:"maths",
    getDetails:function()
   {
       return `${this.__proto__.getDetails()}.Teacher's main subject:${this.mainSubject}`;
    }
};
teacher.__proto__=person;//inheritance
console.log(teacher.getDetails());//calls child method