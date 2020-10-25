<%-- 
    Document   : change_password
    Created on : 21 Feb, 2020, 5:35:19 PM
    Author     : nicar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="services">
        <div class="col-sm-6 change_password_left">
        <form method=post action="change_pass.jsp">
            <label for="current_password"><span>Current Password*</span></label>  
            <input id="current_password" type="text" name="cp">
            <label for="new_password"><span>New Password*</span></label>  
            <input id="new_password" type="text" name="np">
             <label for="retype_password"><span>Retype Password*</span></label>  
             <input id="retype_password" type="text" name="rp"><br><br>
            <input type="submit" value="update">
        </form>
        </div> 
        </div>    
    </body>
</html>

