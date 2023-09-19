//inheritance using __proto__real world scenario

//parent object
var user={
    userName:"",
     passWord:"",
     isLoggedIn:"false",
     login:function(){
        if(this.userName =="system" && this.passWord =="manager")
        {
            this.isLoggedIn=true;
            return true;//valid login
        }
        else{
            return false;//invalid login
        }

     }};

     //child object(every manager is a user)
     var manager={};
     manager.__proto__=user;

     manager.userName="system";
     manager.passWord="manger";
     console.log(manager.login());
      
