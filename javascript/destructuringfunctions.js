var fun1 =function({studentName:sn,email:em,...others})
{
    console.log("fun1",sn,em);
    console.log(others);
};

var student={studentName:"scott",email:"scott@gmail.com",phone:"14523698",
city:"london"};

fun1(student);