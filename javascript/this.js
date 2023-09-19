var person={
    personName:"scott",//property
birthDay://method
function(){
    //console.log(this);
    return"Happy Birthday" + this.personName;
}};
//console.log(person);
//console.log(person.personName);//call the property
console.log(person.birthDay());//call the method