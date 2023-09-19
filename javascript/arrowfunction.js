
var student ={
    studentName:"naresh",
    getStudentName: function()
    {
        console.log("getStudentName function",this);

        setTimeout(function(){
            console.log("regular function",this);
        },1000);

        setTimeout(()=>{
            console.log("arrow function",this);
        },3000);
    }
};
student.getStudentName(); 

