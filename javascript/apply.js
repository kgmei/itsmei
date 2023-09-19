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
 calculateTotalMarks.apply(student1,[60,70,80]);
 calculateTotalMarks.call(student2,60,70,80);