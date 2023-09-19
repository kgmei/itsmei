var http=require("http");
var server =http.createServer(receiveRequest);
server.listen(7070,startup);
function startup()
{
    console.log("server started at port7070");
}
//fs
var fs =require("fs")
function receiveRequest(req,res)
{
   if(req.url=="/")
    {
   fs.readFile("login.html","utf8",function(error,data){
    if(error)
    {
        console.log(error);
    }
    else
    {
        res.write(data);
    }
    res.end();
});
   res.write("hello world");
   }
   else
   {}
   }