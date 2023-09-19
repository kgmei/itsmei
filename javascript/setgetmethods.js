//set and get methods
/*
class person
-personName
-age

-setPersonName()
-getPersonName()

-setAge()
-getAge()
*/
class person{
    personName;
    age;
    //personName-set and get
    setPersonName(value)
    {
       //requirement 1:personName can't be null or unbdefined
       if(value==null || value==undefined)
       {
        console.error("null of undefined is not allowed for personName");
       }
       else{
        if(value.length>=30)
        {
            console.error("personName length can't be more than 30 characters.")

        }
        else{
            this.personName=value;
        }
       }
    }

    getPersonName()
    {
        return this.personName;
    }
    setAge(value)
    {
        if(value>=0&& value<=100)
        {
            this.age=value;
        }
        else{
            console.error("age must 1to 100")
        }
    }
    getAge()
    {
        return this.age;
    }
}
var person1=new person();
person1.setPersonName("kumar");
person1.setAge(40);
console.log(person1.getPersonName());
console.log(person1.getAge());