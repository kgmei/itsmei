var student={
    studentName:"scott",
    email: "scott@gmail.com",
    branch: "cs",
    physics:60,
    chemistry:56,
    maths:80

};

//bracket[]]accessor:for..inloop
for(let prop in student){
    
    console.log(prop,student[prop]);
    if(prop=="physics" || prop=="chemistry" ||prop=="maths")
    {
        student[prop]=  student[prop]+5;
    }

}
console.log(student);

