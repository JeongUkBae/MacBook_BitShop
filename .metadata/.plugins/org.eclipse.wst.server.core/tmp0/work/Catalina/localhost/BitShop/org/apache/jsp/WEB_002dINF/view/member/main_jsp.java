/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-01-10 14:56:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.MemberBean;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/view/member/../home/navi-bar.jsp", Long.valueOf(1546663429000L));
    _jspx_dependants.put("/WEB-INF/view/member/join-form.jsp", Long.valueOf(1547130512000L));
    _jspx_dependants.put("/WEB-INF/view/member/../home/header.jsp", Long.valueOf(1546663401000L));
    _jspx_dependants.put("/WEB-INF/view/member/side-menu.jsp", Long.valueOf(1546946546000L));
    _jspx_dependants.put("/WEB-INF/view/member/side-join.jsp", Long.valueOf(1546946518000L));
    _jspx_dependants.put("/WEB-INF/view/member/mypage.jsp", Long.valueOf(1546946491000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("domain.MemberBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.print(application.getContextPath());
      out.write("/resources/css/style.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

		System.out.println(" => 맴버 메인 입장");
	
      out.write("\n");
      out.write("\t<table id=\"wrapper\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"2\">");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<h1>비트 쇼핑몰</h1>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"2\">");
      out.write("\n");
      out.write("<div id=\"navi-bar\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"home.do\">홈</a></li>\n");
      out.write("\t\t<li><a href=\"member.do\">회원관리</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"member.do\">회원가입</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">회원정보수정</a></li>\n");
      out.write("\t\t\t</ul></li>\n");
      out.write("\t\t<li><a href=\"account.do\">계좌관리</a></li>\n");
      out.write("\n");
      out.write("\t\t<li><a href=\"article.do\">게시판</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"article.do\">글쓰기</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">게시판 목록</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">게시판 수정</a></li>\n");
      out.write("\t\t\t</ul></li>\n");
      out.write("\t\t<li><a href=\"admin.do\">관리자</a>\n");
      out.write("\t</ul>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr style=\"height: 300px\">\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t");
 
			String dest = String.valueOf(request.getAttribute("dest"));
			if(dest.equals("join-form")){
				
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div id=\"side-join\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td style=\"background-color: Gray;\"><b>회원가입시 주의사항</b></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>바뀌었다!!</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\n");
      out.write("\t</table>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t\t");
 
			} else{ 
				
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("<div id=\"side-menu\">\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td style=\"background-color: Gray;\"><b>회원 관리 목록</b></td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>회원목록</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>회원찾기</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>회원삭제</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t\t");

			}
			
      out.write("\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t");

			dest = request.getAttribute("dest").toString();
			switch(dest){
			case "NONE" : case "mypage":
				
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<div id=\"mypage\">\n");
      out.write("\t<h1>마이페이지</h1>\n");
      out.write("\t");

		MemberBean member = (MemberBean) request.getAttribute("member");
	
      out.write("\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>\\</th>\n");
      out.write("\t\t\t<th>내용</tr>\n");
      out.write("\t\t\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>ID</td>\n");
      out.write("\t\t<td>");
      out.print(member.getId());
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>NAME</td>\n");
      out.write("\t\t<td>");
      out.print(member.getName());
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>PASS</td>\n");
      out.write("\t\t<td>");
      out.print(member.getPass());
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>SSN</td>\n");
      out.write("\t\t<td>");
      out.print(member.getSsn());
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</div>");
 
				break;
			case "join-form" : 
				
      out.write("\n");
      out.write("<div id=\"join-form\">\n");
      out.write("\t<h1>회원관리</h1>\n");
      out.write("\t<p>회원가입</p>\n");
      out.write("\t<form action=\"member.do\">\n");
      out.write("\t\tID <input type=\"text\" name=\"id\" /><br />\n");
      out.write("\t\t이름 <input type=\"text\" name=\"name\" /><br />\n");
      out.write("\t\t비밀번호 <input type=\"text\" name=\"pass\" /><br />\n");
      out.write("\t\t주민번호 <input type=\"text\" name=\"ssn\" /><br />\n");
      out.write("\t<!-- \t키 <input type=\"text\" name=\"height\" /><br />\n");
      out.write("\t\t몸무게 <input type=\"text\" name=\"weight\" /><br /> -->\n");
      out.write("\t\t<input type=\"hidden\" name=\"cmd\" value=\"join\" />\n");
      out.write("\t\t<input type=\"hidden\" name=\"dest\" value=\"welcome\" />\n");
      out.write("\t\t<input type=\"submit\" id=btn value=\"JOIN\"/>\n");
      out.write("\t</form>\n");
      out.write("</div>");

				break;
			}
			
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
