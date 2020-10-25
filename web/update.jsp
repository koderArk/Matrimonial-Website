<%-- 
    Document   : update
    Created on : 20 Feb, 2020, 3:31:34 PM
    Author     : nicar
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
    Cookie c[]=request.getCookies();
        String email=null;
        for(int i=0;i<c.length;i++){
            if(c[i].getName().equals("user")){
                email=c[i].getValue();
                break;
            }
        }
%>        
<!DOCTYPE html>
 <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%   
            String username=request.getParameter("user");
            String dob=request.getParameter("date");
            String Email=request.getParameter("emailid");
            String gender=request.getParameter("gender");
            String subject=request.getParameter("subject");
            String religion=request.getParameter("religion");
            String caste=request.getParameter("caste");
            
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection cn=DriverManager.getConnection("jdbc:odbc:db2");
            Statement st=cn.createStatement();
            st.execute("update student set Username='"+username+"',DOB='"+dob+"',Gender='"+gender+"',Subject='"+subject+"',Religion='"+religion+"',Caste='"+caste+"' where Email='"+email+"'");
            response.sendRedirect("profile.jsp");    
            cn.close();
        }
        catch(Exception er){
            out.print(er.getMessage());
        }
        %>
    </body>
</html>
