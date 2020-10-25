<%-- 
    Document   : change_pass
    Created on : 21 Feb, 2020, 5:34:56 PM
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
     if(email==null||session.getAttribute(email)==null){
         response.sendRedirect("login.jsp");
     }
    else{ 
            if(request.getParameter("cp")==null||request.getParameter("np")==null||request.getParameter("rp")==null){
                response.sendRedirect("change_password?err=1");
                        
            }
            else{
                String cp=request.getParameter("cp");
                String np=request.getParameter("np");
                String rp=request.getParameter("rp");
                try{
                      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                      Connection cn=DriverManager.getConnection("jdbc:odbc:db2");
                      Statement st=cn.createStatement();
                      ResultSet rs=st.executeQuery("select * from student where email='"+email+"'");  
                 if(rs.next()){
                    if(rs.getString("password").equals(cp)){
                        if(np.equals(rp)){
                            st.execute("update student set password='"+np+"' where email='"+email+"'");
                            response.sendRedirect("change_password?succ=1");
                        }
                       else{
                            response.sendRedirect("change_password?mismatch=1");
                       }
                    }
                    else{
                        response.sendRedirect("change_password?invalid=1");
                    }
                }
                else{
                          out.println("invalid emailid");
                }      
                      cn.close();
            }
                catch(Exception er){
                   out.println(er.getMessage());
                }
    } 
    }                   
%>

