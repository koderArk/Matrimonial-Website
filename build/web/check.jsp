<%-- 
    Document   : check
    Created on : 14 Feb, 2020, 3:46:34 PM
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
    if(email==null){
        if(request.getParameter("email")==null){
            response.sendRedirect("login.jsp");
        }
        else{
            email=request.getParameter("email");
        }
    }
    if(request.getParameter("pass")==null){
        response.sendRedirect("login.jsp");
    }
    else{
        String pass=request.getParameter("pass");
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection cn=DriverManager.getConnection("jdbc:odbc:db2");
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery("select * from student where email='"+email+"'");
            if(rs.next()){
                if(rs.getString("password").equals(pass)){
                    Cookie ct=new Cookie("user",email);
                    ct.setMaxAge(10);
                    response.addCookie(ct);
                    session.setAttribute(email,pass);
                    session.setMaxInactiveInterval(60);
                    response.sendRedirect("profile.jsp");
                }
                else{
                    response.sendRedirect("login.jsp?invalid=1");
                }
            }
            else{
                response.sendRedirect("login.jsp?attempt=1");
            }
            cn.close();
        }
        catch(Exception er){
            out.print(er.getMessage());
        }
    }
%>