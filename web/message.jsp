<%-- 
    Document   : message
    Created on : 26 Feb, 2020, 5:26:25 PM
    Author     : nicar
--%>

<%@page contentType="text/html" import="java.sql.*,java.util.*" pageEncoding="UTF-8"%>
<%
    Cookie c[]=request.getCookies();
    String email=null;
    for(int i=0;i<c.length;i++){
        if(c[i].getName().equals("user")){
            email=c[i].getValue();
            break;
        }
    }
    if(email!=null && session.getAttribute(email)!=null){
        try{
            String msg=request.getParameter("message");
            String tcode=request.getParameter("code");
            String femail=email;
            String temail="";
            String fcode="";
            String date=new java.util.Date()+"";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection cn=DriverManager.getConnection("jdbc:odbc:db2");
            Statement st1=cn.createStatement();
            Statement st2=cn.createStatement();
            Statement st3=cn.createStatement();
            ResultSet rs1=st1.executeQuery("select * from student where code='"+tcode+"'"); 
             if(rs1.next()){
                   temail=rs1.getString(4);
             }
            ResultSet rs2=st2.executeQuery("select * from student where email='"+femail+"'"); 
             if(rs2.next()){
                   fcode=rs2.getString(10);
             }
             int sn=0;
             String code="";
             LinkedList l=new LinkedList();
             for(char x='A';x<='Z';x++){
                    l.add(""+x);
             }
             for(char x='a';x<='z';x++){
                    l.add(""+x);
             }
             for(int i=0;i<=9;i++){
                    l.add(""+i);
             }
             Collections.shuffle(l);
             for(int i=0;i<=6;i++){
                    code=code+l.get(i);
             }
            ResultSet rs3=st3.executeQuery("select MAX(sn) from inbox"); 
             if(rs3.next()){
                   sn=rs3.getInt(1);
             }
             sn=sn+1;
             code=code+"_"+sn;
             st3.execute("insert into inbox values("+sn+",'"+code+"','"+temail+"','"+tcode+"','"+femail+"','"+fcode+"','"+msg+"','"+date+"')");
             cn.close();
        }
       catch(Exception er){
                out.print(er.getMessage());
                }
    }
         
            else{
                response.sendRedirect("index.jsp");
                }
%>