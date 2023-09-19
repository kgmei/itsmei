//constructors
class person
{
    personName="No name";
    age;
    email;
    constructor(pName,ag,em)
    {
        console.log(" constructor executes")
      this.personName=pName;
      this.age=ag;
      this.email=em;
    }
}
var person1 =new person("scott",20,"scott@gmail.com")
var person2 =new person("mei",21,"mei@gmail.com")
console.log(person1.personName,person1.age,person1.email);
console.log(person2.personName,person2.age,person2.email);