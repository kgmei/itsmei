var student1={
    studentName:"naresh",
    section:"A"
 };
 var student2={
    studentName:"kumar",
    section:"A"
 };
 //function at outside the object
 function calculateTotalMarks(subject1,subject2,subject3){
    let totalMarks=subject1+subject2+subject3;
    let message=`hey ${this.studentName},your total mark is:${totalMarks}`;
    console.log(message)
 }
var student1Calculate =calculateTotalMarks.bind(student1);
student1Calculate(60,70,80)
var student2Calculate =calculateTotalMarks.bind(student2);
student2Calculate(50,60,80)