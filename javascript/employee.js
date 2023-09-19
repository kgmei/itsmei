var employee={
firstName:"smith" ,
lastName:"john",
designation:"clerk",
salary:3000,
workExperienceYears:4,
getFullName:function(){
    return `${this.firstName}${this.lastName}`;
},
promote:function(){
    var isEligibleForPromotion;
    if(this.designation=="clerk")
    {
        if(this.workExperienceYears>=3)
        {
            isEligibleForPromotion=true;
            this.designation="asst.manager";
            this.salary+=this.salary*10/100;
        }
        else
        {
            isEligibleForPromotion=false;
        }
    }

    else if(this.designation=="asst.manager")
    {
        if(this.workExperienceYears>=5) 
        {
        isEligibleForPromotion=true;
        this.designation="Manager";
        this.salary+=this.salary*20/100;
        }
     else
      {
        this.isEligibleForPromotion=false;
      }
    }
    return isEligibleForPromotion;
}
};
console.log(employee);
console.log(employee.firstName);
console.log(employee.lastName);
console.log(employee.designation);
console.log(employee.salary);
console.log(employee.workExperienceYears);
console.log(employee.getFullName());
if(employee.promote()==true)
{
    console.log("congrats");
    console.log("updated salary:"+employee.salary);
    console.log("updated Designation:"+employee.designation);
}
else
{
    console.log("Employee is not eligible");
}

