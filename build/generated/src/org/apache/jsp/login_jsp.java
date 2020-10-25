package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    Cookie c[]=request.getCookies();
    String email=null;
    for(int i=0;i<c.length;i++){
        if(c[i].getName().equals("user")){
            email=c[i].getValue();
            break;
        }
    }
    if(email!=null && session.getAttribute(email)!=null){
        response.sendRedirect("profile.jsp");
    }
    else{
        
    
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Marital an Wedding Category Flat Bootstarp Resposive Website Template | Login :: w3layouts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Marital Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap-3.1.1.min.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Oswald:300,400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu:300,400,500,700' rel='stylesheet' type='text/css'>\n");
      out.write("<!----font-Awesome----->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!----font-Awesome----->\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".dropdown\").hover(            \n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideDown(\"fast\");\n");
      out.write("            $(this).toggleClass('open');        \n");
      out.write("        },\n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideUp(\"fast\");\n");
      out.write("            $(this).toggleClass('open');       \n");
      out.write("        }\n");
      out.write("    );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- ============================  Navigation Start =========================== -->\n");
      out.write(" <div class=\"navbar navbar-inverse-blue navbar\">\n");
      out.write("    <!--<div class=\"navbar navbar-inverse-blue navbar-fixed-top\">-->\n");
      out.write("      <div class=\"navbar-inner navbar-inner_1\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class=\"navigation\">\n");
      out.write("             <nav id=\"colorNav\">\n");
      out.write("\t\t\t   <ul>\n");
      out.write("\t\t\t\t<li class=\"green\">\n");
      out.write("\t\t\t\t  <a href=\"#\" class=\"icon-home\"></a>\n");
      out.write("\t\t\t\t  <ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t   </ul>\n");
      out.write("             </nav>\n");
      out.write("           </div>\n");
      out.write("           <a class=\"brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>\n");
      out.write("           <div class=\"pull-right\">\n");
      out.write("          \t<nav class=\"navbar nav_bottom\" role=\"navigation\">\n");
      out.write(" \n");
      out.write("\t\t <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t  <div class=\"navbar-header nav_2\">\n");
      out.write("\t\t      <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">Menu\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t      </button>\n");
      out.write("\t\t      <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("\t\t   </div> \n");
      out.write("\t\t   <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t    <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t        <ul class=\"nav navbar-nav nav_1\">\n");
      out.write("\t\t            <li><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t            <li><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t    \t\t<li class=\"dropdown\">\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Matches<span class=\"caret\"></span></a>\n");
      out.write("\t\t              <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                <li><a href=\"matches.html\">New Matches</a></li>\n");
      out.write("\t\t                <li><a href=\"viewed-profile.html\">Who Viewed my Profile</a></li>\n");
      out.write("\t\t                <li><a href=\"viewed-not_contacted.html\">Viewed & not Contacted</a></li>\n");
      out.write("\t\t                <li><a href=\"members.html\">Premium Members</a></li>\n");
      out.write("\t\t                <li><a href=\"shortlisted.html\">Shortlisted Profile</a></li>\n");
      out.write("\t\t              </ul>\n");
      out.write("\t\t            </li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Search<span class=\"caret\"></span></a>\n");
      out.write("\t\t              <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                <li><a href=\"search.html\">Regular Search</a></li>\n");
      out.write("\t\t                <li><a href=\"profile.jsp\">Recently Viewed Profiles</a></li>\n");
      out.write("\t\t                <li><a href=\"search-id.html\">Search By Profile ID</a></li>\n");
      out.write("\t\t                <li><a href=\"faq.html\">Faq</a></li>\n");
      out.write("\t\t                <li><a href=\"shortcodes.html\">Shortcodes</a></li>\n");
      out.write("\t\t              </ul>\n");
      out.write("\t\t            </li>\n");
      out.write("\t\t            <li class=\"dropdown\">\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Messages<span class=\"caret\"></span></a>\n");
      out.write("\t\t              <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t                <li><a href=\"inbox.html\">Inbox</a></li>\n");
      out.write("\t\t                <li><a href=\"inbox.html\">New</a></li>\n");
      out.write("\t\t                <li><a href=\"inbox.html\">Accepted</a></li>\n");
      out.write("\t\t                <li><a href=\"sent.html\">Sent</a></li>\n");
      out.write("\t\t                <li><a href=\"upgrade.html\">Upgrade</a></li>\n");
      out.write("\t\t              </ul>\n");
      out.write("\t\t            </li>\n");
      out.write("\t\t            <li class=\"last\"><a href=\"contact.html\">Contacts</a></li>\n");
      out.write("\t\t        </ul>\n");
      out.write("\t\t     </div><!-- /.navbar-collapse -->\n");
      out.write("\t\t    </nav>\n");
      out.write("\t\t   </div> <!-- end pull-right -->\n");
      out.write("          <div class=\"clearfix\"> </div>\n");
      out.write("        </div> <!-- end container -->\n");
      out.write("      </div> <!-- end navbar-inner -->\n");
      out.write("    </div> <!-- end navbar-inverse-blue -->\n");
      out.write("<!-- ============================  Navigation End ============================ -->\n");
      out.write("<div class=\"grid_3\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("   <div class=\"breadcrumb1\">\n");
      out.write("     <ul>\n");
      out.write("        <a href=\"index.html\"><i class=\"fa fa-home home_1\"></i></a>\n");
      out.write("        <span class=\"divider\">&nbsp;|&nbsp;</span>\n");
      out.write("        <li class=\"current-page\">Login</li>\n");
      out.write("     </ul>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"services\">\n");
      out.write("   \t  <div class=\"col-sm-6 login_left\">\n");
      out.write("\t   <form method=post action=\"check.jsp\">\n");
      out.write("  \t    <div  class=\"form-item form-type-textfield form-item-name\">\n");
      out.write("\t      <label for=\"edit-name\">Username <span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t      <input type=\"text\" id=\"edit-name\" name=\"email\" size=\"60\" maxlength=\"60\" class=\"form-text required\">\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"form-item form-type-password form-item-pass\">\n");
      out.write("\t      <label for=\"edit-pass\">Password <span class=\"form-required\" title=\"This field is required.\">*</span></label>\n");
      out.write("\t      <input type=\"password\" id=\"edit-pass\" name=\"pass\" size=\"60\" maxlength=\"128\" class=\"form-text required\">\n");
      out.write("\t    </div>\n");
      out.write("\t    <div class=\"form-actions\">\n");
      out.write("\t    \t<input type=\"submit\" id=\"edit-submit\" name=\"op\" value=\"Log in\" class=\"btn_1 submit\">\n");
      out.write("\t    </div>\n");
      out.write("\t   </form>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"col-sm-6\">\n");
      out.write("\t    <ul class=\"sharing\">\n");
      out.write("\t\t\t<li><a href=\"#\" class=\"facebook\" title=\"Facebook\"><i class=\"fa fa-boxed fa-fw fa-facebook\"></i> Share on Facebook</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"twitter\" title=\"Twitter\"><i class=\"fa fa-boxed fa-fw fa-twitter\"></i> Tweet</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"google\" title=\"Google\"><i class=\"fa fa-boxed fa-fw fa-google-plus\"></i> Share on Google+</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"linkedin\" title=\"Linkedin\"><i class=\"fa fa-boxed fa-fw fa-linkedin\"></i> Share on LinkedIn</a></li>\n");
      out.write("\t\t  \t<li><a href=\"#\" class=\"mail\" title=\"Email\"><i class=\"fa fa-boxed fa-fw fa-envelope-o\"></i> E-mail</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t  </div>\n");
      out.write("\t  <div class=\"clearfix\"> </div>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"map\">\n");
      out.write("\t<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978\"> </iframe>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("    \t<div class=\"container\">\n");
      out.write("    \t\t<div class=\"col-md-4 col_2\">\n");
      out.write("    \t\t\t<h4>About Us</h4>\n");
      out.write("    \t\t\t<p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris.\"</p>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"col-md-2 col_2\">\n");
      out.write("    \t\t\t<h4>Help & Support</h4>\n");
      out.write("    \t\t\t<ul class=\"footer_links\">\n");
      out.write("    \t\t\t\t<li><a href=\"#\">24x7 Live help</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"contact.html\">Contact us</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"#\">Feedback</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"faq.html\">FAQs</a></li>\n");
      out.write("    \t\t\t</ul>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"col-md-2 col_2\">\n");
      out.write("    \t\t\t<h4>Quick Links</h4>\n");
      out.write("    \t\t\t<ul class=\"footer_links\">\n");
      out.write("    \t\t\t\t<li><a href=\"privacy.html\">Privacy Policy</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"terms.html\">Terms and Conditions</a></li>\n");
      out.write("    \t\t\t\t<li><a href=\"services.html\">Services</a></li>\n");
      out.write("    \t\t\t</ul>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"col-md-2 col_2\">\n");
      out.write("    \t\t\t<h4>Social</h4>\n");
      out.write("    \t\t\t<ul class=\"footer_social\">\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-facebook fa1\"> </i></a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-twitter fa1\"> </i></a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-google-plus fa1\"> </i></a></li>\n");
      out.write("\t\t\t\t  <li><a href=\"#\"><i class=\"fa fa-youtube fa1\"> </i></a></li>\n");
      out.write("\t\t\t    </ul>\n");
      out.write("    \t\t</div>\n");
      out.write("    \t\t<div class=\"clearfix\"> </div>\n");
      out.write("    \t\t<div class=\"copy\">\n");
      out.write("\t\t       <p>Copyright © 2015 Marital . All Rights Reserved  | Design by <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t        </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");

    }
    
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
