<!DOCTYPE html>

<html>
<style>
#head
{
   color:red;
   position:absolute;
   top:20px;
   left:500px;
}
</style>
<body>
<jsp:include page="userLogin.html"/>
<h3 id="head"><%="Invalid username (or) password"%></h3>
</body>
</html>