var products=[
    {id:1,productName:'tv',price:5000},
    {id:2,productName:'monitor',price:1200},
    {id:3,productName:'ipad',price:2000},
    {id:4,productName:'phone',price:1800},
];

products.splice(1,1);//(startIndex,noofElementsToRemove)
console.log(products);

//splice-for inserting element
products.splice(2,0,{id:300,productName:"iphone",price:1700});
//(startIndex,noOfelementsToRemove,ElementToInsert)
console.log(products);

//splice-for replacing element
products.splice(3,1,{id:400,productName:"Samsung Phone",price:670});
console.log(products);