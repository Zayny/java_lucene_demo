/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-05-25 11:01:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>注册用户</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<!-- 引入 Bootstrap -->\n");
      out.write("<link\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resource/bootstrap/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link rel=\"shortcut icon\"\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resource/img/1.ico\" />\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resource/jquery/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resource/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".header {\n");
      out.write("\theight: 40px;\n");
      out.write("\tborder: solid 1px;\n");
      out.write("\tborder-color: gray;\n");
      out.write("\tmargin-left: auto;\n");
      out.write("\tmargin-right: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inner_header_before {\n");
      out.write("\theight: 20px;\n");
      out.write("\tmargin-left: 15%;\n");
      out.write("\tmargin-top: 14px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inner_header_after {\n");
      out.write("\theight: 20px;\n");
      out.write("\tmargin-left: 64%;\n");
      out.write("\tmargin-top: 14px;\n");
      out.write("}\n");
      out.write(".regist_form {\n");
      out.write("\tmargin-top: 20px;\n");
      out.write("\tmargin-left: -124px;\n");
      out.write("}\n");
      out.write(".regist_bt {\n");
      out.write("\twidth: 320px;\n");
      out.write("\tmargin-left: 247px;\n");
      out.write("\theight: 31px;\n");
      out.write("\tbackground-color: #3f89ec;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<span class=\"inner_header_before\">注册用户</span><span\n");
      out.write("\t\t\tclass=\"inner_header_after\"><a style=\"cursor: pointer;\">已经注册</a></span>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"regist_form\" id=\"regist_form\">\n");
      out.write("\t\t<form class=\"form-horizontal\">\n");
      out.write("\t\t<div class=\"form-group form-group-sm\">\n");
      out.write("\t\t\t<label class=\"col-sm-2 control-label\" for=\"formGroupInputSmall\">邮箱</label>\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"mail\"\n");
      out.write("\t\t\t\t\tplaceholder=\"email\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group form-group-sm\">\n");
      out.write("\t\t\t<label class=\"col-sm-2 control-label\" for=\"formGroupInputSmall\">密码</label>\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"password\" id=\"password\"\n");
      out.write("\t\t\t\t\tplaceholder=\"密码\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-group form-group-sm\">\n");
      out.write("\t\t\t<label class=\"col-sm-2 control-label\" for=\"formGroupInputSmall\"></label>\n");
      out.write("\t\t\t<div class=\"regist_bt\" align=\"center\" id=\"regist_bt\"><span style=\"margin-top: 20px\">注册</span></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->\n");
      out.write("\t<script src=\"resource/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\"#regist_bt\").on(\"click\",function(obj){\n");
      out.write("\t\t\t\tvar data = {}\n");
      out.write("\t\t\t\tvar email = $(\"#mail\").val()\n");
      out.write("\t\t\t\tvar password = $(\"#password\").val()\n");
      out.write("\t\t\t\tdata.email = email\n");
      out.write("\t\t\t\tdata.password = password\n");
      out.write("\t\t\t\tvar url = 'mail.'+email.split('.')[0].split('@')[1]+'.com'\n");
      out.write("\t\t\t\t$.post(\"");
      out.print(request.getContextPath());
      out.write("/accounts/regist\", data, function(rdata) {\n");
      out.write("\t\t\t\t\tif(rdata.status=='200'){\n");
      out.write("\t\t\t\t\t\tconsole.log(url)\n");
      out.write("\t\t\t\t\t\t$(\"#regist_form\").css(\"display\",\"none\")\n");
      out.write("\t\t\t\t\t\tvar ht = '<a href=http://'+url+'>'+url+'</a>'\n");
      out.write("\t\t\t\t\t\tconsole.log(ht)\n");
      out.write("\t\t\t\t\t\t$(\"#regist_form\").after(\"注册成功,立即激活： \"+ht)\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t})\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- 包括所有已编译的插件 -->\n");
      out.write("\t<script src=\"resource/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}