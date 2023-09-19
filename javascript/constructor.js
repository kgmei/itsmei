var createEmployee= function(a,b,c) {
    var employee ={};//create new object

    //initialize properties& methods into that object
    employee.employeeName=a;
    employee.employeeid=b;
    employee.salary=c;

    employee.getEmployeeName=function(){
        return this.employeeName;
    };
    //return new object
    return employee;
}
var employee1 =createEmployee("scott",1,1000);
var employee2 =createEmployee("alen",2,2000);
 console.log(employee1);
 console.log(employee2);