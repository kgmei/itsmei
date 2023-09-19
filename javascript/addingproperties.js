//adding properties and methods to an existing object
var student={};
console.log(student);

student.marks=30;//adding property
student.getResult=function(){//adding method
    if(this.marks>=35)
    return"pass";
    else
    return"fail";
};
console.log(student);
console.log(student.marks);//call property
console.log(student.getResult());//call method