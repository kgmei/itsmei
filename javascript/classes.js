class Employee
{
 employeeId;
 empName;
 salary;   

 getEmployeeName()
 {
    return this.empName;
 }
 hikeSalary(amount)
 {
   this.salary=this.salary+amount;
 }
}
let employee1=new Employee();//create first object based on employee class (it stores same properties& methods in this object)
employee1.employeeId=1;
employee1.empName="mei";
employee1.salary=3000;
console.log(employee1.getEmployeeName());
employee1.hikeSalary(800);
console.log(employee1);

let employee2=new Employee();//create second object based on employee class (it stores same properties& methods in this object)

employee2.employeeId=2;
employee2.empName="naresh kumar";
employee2.salary=2000;
console.log(employee2.getEmployeeName());
employee2.hikeSalary(800);
console.log(employee2);