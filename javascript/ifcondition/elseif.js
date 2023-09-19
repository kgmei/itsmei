var securedMarks=70,grade;
if(securedMarks >=80)
{
    grade="A";
}
else if (securedMarks >=60 && securedMarks <80)
{
 grade="B";
}
else if(securedMarks >=35 && securedMarks <60)
grade="c";
else
{
    grade="fail"
}
console.log(grade);
