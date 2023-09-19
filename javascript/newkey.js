var Employee= function(employeeName,employeeId,salary) {
    var employee ={};//create new object

    //initialize properties& methods into that object
    this.employeeName=employeeName;
    this.employeeid=employeeId;
    this.salary=salary;

    this.getEmployeeName=function(){
        return this.employeeName;
    };
    
}
var employee1 =new Employee("scott",1,1000);
var employee2 =new Employee("alen",2,2000);
 console.log(employee1);
 console.log(employee2);