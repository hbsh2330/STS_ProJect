/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-08 07:41:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class rest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Downloads/WORKSPACE/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ex07_RestController/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1704344146704L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<title>Home</title>\r\n");
      out.write("	\r\n");
      out.write("	<style>\r\n");
      out.write("	.wrapper{\r\n");
      out.write("		display:flex;\r\n");
      out.write("		justify-content : left;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapper>div{\r\n");
      out.write("			width : 200px; height : 500px;\r\n");
      out.write("			border : 1px solid;\r\n");
      out.write("			margin : 15px;\r\n");
      out.write("			text-align:center;\r\n");
      out.write("			\r\n");
      out.write("			overflow : auto;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapper>div.result{\r\n");
      out.write("		width : 300px;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapper>div>h1{\r\n");
      out.write("		border : 1px solid;\r\n");
      out.write("		margin-bottom : 15px;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapper>div>div{\r\n");
      out.write("		border : 1px solid;\r\n");
      out.write("		margin : 5px;\r\n");
      out.write("		padding : 0px;\r\n");
      out.write("		opacity:.8;\r\n");
      out.write("	}\r\n");
      out.write("	.wrapper>div>div:hover{\r\n");
      out.write("		background-color:lightgray;\r\n");
      out.write("		opacity:1;\r\n");
      out.write("	}\r\n");
      out.write("	input {\r\n");
      out.write("		width : 55px;\r\n");
      out.write("	}\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>REST TEST PAGE</h1>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("		\r\n");
      out.write("		<!--  -->\r\n");
      out.write("		<div class=\"xhr-block\">\r\n");
      out.write("			<h1>XHR</h1>\r\n");
      out.write("						<div class=\"get\">\r\n");
      out.write("				<h6>[ADD]동기 GET 요청</h6>\r\n");
      out.write("				<form method=\"get\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/add_get\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button>전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>			\r\n");
      out.write("			<div class=\"get\">\r\n");
      out.write("				<h6>[ADD]비동기 GET 요청</h6>\r\n");
      out.write("				<form name=\"xhrAsyncGetForm\" method=\"\" action=\"\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"xhrAsyncGetBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"post\">\r\n");
      out.write("				<h6>[ADD]비동기 POST 요청</h6>\r\n");
      out.write("				<form name=\"xhrAsyncPostForm\" method=\"\" action=\"\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"xhrAsyncPostBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"put\">\r\n");
      out.write("				<h6>[UPDATE]비동기 PUT 요청</h6>\r\n");
      out.write("				<form name=\"xhrAsyncPutForm\" method=\"\" action=\"\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"xhrAsyncPutBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>	\r\n");
      out.write("			<div class=\"petch\">\r\n");
      out.write("				<h6>[UPDATE]비동기 PETCH 요청</h6>\r\n");
      out.write("				<form method=\"\" action=\"\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button>전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>				\r\n");
      out.write("			<div class=\"delete\">\r\n");
      out.write("				<h6>[DELETE]비동기 DELETE 요청</h6>\r\n");
      out.write("				<form name=\"xhrAsyncDeleteForm\"  method=\"\" action=\"\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"xhrAsyncDeleteBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<!--  -->\r\n");
      out.write("		<div class=\"ajax-block\">\r\n");
      out.write("			<h1>AJAX</h1>\r\n");
      out.write("			<div></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<!--  -->\r\n");
      out.write("		<div class=\"fetch-block\">\r\n");
      out.write("			<h1>FETCH</h1>\r\n");
      out.write("			<div></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<!--  -->\r\n");
      out.write("		<div class=\"axios-block\">\r\n");
      out.write("			<h1>AXIOS</h1>\r\n");
      out.write("			<div class=\"get\">\r\n");
      out.write("				<h6>[ADD]동기 GET 요청</h6>\r\n");
      out.write("				<form method=\"get\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/add_get\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button>전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>			\r\n");
      out.write("			<div class=\"get\">\r\n");
      out.write("				<h6>[ADD]비동기 GET 요청</h6>\r\n");
      out.write("				<form name=\"axiosAsyncGetForm\"onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"axiosAsyncGetBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"post\">\r\n");
      out.write("				<h6>[ADD]비동기 POST 요청</h6>\r\n");
      out.write("				<form name=\"axiosAsyncPostForm\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"axiosAsyncPostBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"put\">\r\n");
      out.write("				<h6>[UPDATE]비동기 PUT 요청</h6>\r\n");
      out.write("				<form name=\"axiosAsyncPutForm\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"axiosAsyncPutBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>	\r\n");
      out.write("			<div class=\"petch\">\r\n");
      out.write("				<h6>[UPDATE]비동기 PETCH 요청</h6>\r\n");
      out.write("				<form name=\"axiosAsyncPatchForm\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"axiosAsyncPatchBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>				\r\n");
      out.write("			<div class=\"delete\">\r\n");
      out.write("				<h6>[DELETE]비동기 DELETE 요청</h6>\r\n");
      out.write("				<form name=\"axiosAsyncDeleteForm\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"axiosAsyncDeleteBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"select\">\r\n");
      out.write("				<h6>[SELETE]비동기 SELETE 요청</h6>\r\n");
      out.write("				<form name=\"axiosAsyncSelectForm\" onsubmit=\"return false\">\r\n");
      out.write("					<input name=\"id\"  placeholder=\"id\" />\r\n");
      out.write("					<input name=\"text\" placeholder=\"text\"  />\r\n");
      out.write("					<button class=\"axiosAsyncSelectBtn\">전송</button>  \r\n");
      out.write("				</form>\r\n");
      out.write("			</div>		\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<!-- SELECT BLOCK -->\r\n");
      out.write("		<div class=\"result\">\r\n");
      out.write("			<h1>RESULT</h1>\r\n");
      out.write("			<div class=\"body\">\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!--  \r\n");
      out.write("		XHR\r\n");
      out.write("	-->\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- \r\n");
      out.write("		AJAX\r\n");
      out.write("	 -->\r\n");
      out.write("	 \r\n");
      out.write("	 \r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- AXIOS -->\r\n");
      out.write("	 <script src=\"https://cdnjs.cloudflare.com/ajax/libs/axios/1.6.8/axios.min.js\" integrity=\"sha512-PJa3oQSLWRB7wHZ7GQ/g+qyv6r4mbuhmiDb8BjSFZ8NZ2a42oTtAq5n0ucWAwcQDlikAtkub+tPVCw4np27WCg==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("	const projectPath='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("	//비동기 GET MEMO ADD\r\n");
      out.write("	const axiosAsyncGetBtn = document.querySelector('.axiosAsyncGetBtn');\r\n");
      out.write("	axiosAsyncGetBtn.addEventListener('click', function(){\r\n");
      out.write("		\r\n");
      out.write("		const axiosAsyncGetForm = document.axiosAsyncGetForm; //폼을 찾아서\r\n");
      out.write("		const id = axiosAsyncGetForm.id.value; // 폼의 id의 값을 추출\r\n");
      out.write("		const text = axiosAsyncGetForm.text.value; //폼의 text값을 추출\r\n");
      out.write("		console.log(id, text);\r\n");
      out.write("		\r\n");
      out.write("		//axios.get 요청\r\n");
      out.write("		axios\r\n");
      out.write("			.get(projectPath+\"/memo/add_get?id=\"+id+\"&text\"+text)\r\n");
      out.write("			.then(resp=>{\r\n");
      out.write("				console.log(resp);\r\n");
      out.write("				const isAdded = resp.data;\r\n");
      out.write("				if(isAdded === true)\r\n");
      out.write("					alert(\"비동기 GET MEMO ADD 성공\")\r\n");
      out.write("				else\r\n");
      out.write("					alert(\"비동기 GET MEMO ADD 실패!\")\r\n");
      out.write("			}) //요청 성공시 처리될 로직\r\n");
      out.write("			.catch(err=>{console.log(err);}) // 요청 실패시 처리될 로직\r\n");
      out.write("			\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	//비동기 POST MEMO ADD\r\n");
      out.write("	\r\n");
      out.write("	const axiosAsyncPostBtn = document.querySelector(\".axiosAsyncPostBtn\");\r\n");
      out.write("	axiosAsyncPostBtn.addEventListener('click', function(){\r\n");
      out.write("		\r\n");
      out.write("		const axiosAsyncPostForm = document.axiosAsyncPostForm;\r\n");
      out.write("		const id = axiosAsyncPostForm.id.value;\r\n");
      out.write("		const text = axiosAsyncPostForm.text.value;\r\n");
      out.write("		console.log(id, text);\r\n");
      out.write("		\r\n");
      out.write("		const header={\"Content-Type\":\"application/json\"} //headr 값 전달\r\n");
      out.write("		const params={\"id\":id ,\"text\":text} //param값 전달 //전달하는 파라미터값이 Json오브젝트기 때문에 컨트롤러에서 @RequestBody로 자바객체로 변경해서 사용해야함.\r\n");
      out.write("		axios\r\n");
      out.write("			.post(projectPath+\"/memo/add_post\",params, header)\r\n");
      out.write("			.then(resp=>{console.log(resp);})\r\n");
      out.write("			.catch(err=>{console.log(err);})\r\n");
      out.write("	})\r\n");
      out.write("	//비동기 PUT\r\n");
      out.write("	\r\n");
      out.write("	const axiosAsyncPutBtn = document.querySelector(\".axiosAsyncPutBtn\");\r\n");
      out.write("	axiosAsyncPutBtn.addEventListener('click', function(){\r\n");
      out.write("		\r\n");
      out.write("		const axiosAsyncPutForm = document.axiosAsyncPutForm;\r\n");
      out.write("		const id = axiosAsyncPutForm.id.value;\r\n");
      out.write("		const text = axiosAsyncPutForm.text.value;\r\n");
      out.write("		console.log(id, text);\r\n");
      out.write("		\r\n");
      out.write("		const header={\"Content-Type\":\"application/json\"} //headr 값 전달\r\n");
      out.write("		const params={\"id\":id ,\"text\":text} //param값 전달 //전달하는 파라미터값이 Json오브젝트기 때문에 컨트롤러에서 @RequestBody로 자바객체로 변경해서 사용해야함.\r\n");
      out.write("		\r\n");
      out.write("		axios\r\n");
      out.write("			.put(projectPath+\"/memo/add_put\",params,header)\r\n");
      out.write("			.then(resp=>{console.log(resp);})\r\n");
      out.write("			.catch(err=>{console.log(err);})\r\n");
      out.write("	})\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		//비동기 PATCH\r\n");
      out.write("		\r\n");
      out.write("		const axiosAsyncPatchBtn = document.querySelector(\".axiosAsyncPatchBtn\");\r\n");
      out.write("		axiosAsyncPatchBtn.addEventListener('click', function(){\r\n");
      out.write("			\r\n");
      out.write("			const axiosAsyncPatchForm = document.axiosAsyncPatchForm;\r\n");
      out.write("			const id = axiosAsyncPatchForm.id.value;\r\n");
      out.write("			const text = axiosAsyncPatchForm.text.value;\r\n");
      out.write("			console.log(id, text);\r\n");
      out.write("			\r\n");
      out.write("			const header={\"Content-Type\":\"application/json\"} //headr 값 전달\r\n");
      out.write("			const params={\"id\":id ,\"text\":text} //param값 전달 //전달하는 파라미터값이 Json오브젝트기 때문에 컨트롤러에서 @RequestBody로 자바객체로 변경해서 사용해야함.\r\n");
      out.write("			\r\n");
      out.write("			axios\r\n");
      out.write("				.patch(projectPath+\"/memo/add_patch\",params,header)\r\n");
      out.write("				.then(resp=>{console.log(resp);})\r\n");
      out.write("				.catch(err=>{console.log(err);})\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("		//비동기 DELETE\r\n");
      out.write("		const axiosAsyncDeleteBtn = document.querySelector(\".axiosAsyncDeleteBtn\");\r\n");
      out.write("		axiosAsyncDeleteBtn.addEventListener('click', function(){\r\n");
      out.write("			\r\n");
      out.write("			const axiosAsyncDeleteForm = document.axiosAsyncDeleteForm;\r\n");
      out.write("			const id = axiosAsyncDeleteForm.id.value;\r\n");
      out.write("			const text = axiosAsyncDeleteForm.text.value;\r\n");
      out.write("			console.log(id, text);\r\n");
      out.write("		\r\n");
      out.write("			axios\r\n");
      out.write("				.delete(projectPath+\"/memo/add_delete?id=\"+id)\r\n");
      out.write("				.then(resp=>{console.log(resp);})\r\n");
      out.write("				.catch(err=>{console.log(err);})\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("		//비동기 SELECT\r\n");
      out.write("		const axiosAsyncSelectBtn = document.querySelector(\".axiosAsyncSelectBtn\");\r\n");
      out.write("		axiosAsyncSelectBtn.addEventListener('click', function(){\r\n");
      out.write("			\r\n");
      out.write("			const axiosAsyncSelectForm = document.axiosAsyncSelectForm;\r\n");
      out.write("			const id = axiosAsyncSelectForm.id.value;\r\n");
      out.write("			const text = axiosAsyncSelectForm.text.value;\r\n");
      out.write("			console.log(id, text);\r\n");
      out.write("		\r\n");
      out.write("			axios\r\n");
      out.write("				.get(projectPath+\"/memo/all?id=\"+id+\"&text=\"+text)\r\n");
      out.write("				.then(resp=>{console.log(resp);})\r\n");
      out.write("				.catch(err=>{console.log(err);})\r\n");
      out.write("		})\r\n");
      out.write("	</script>	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		//xhr 를 이용 비동기 요청\r\n");
      out.write("		\r\n");
      out.write("		//ajax를 이용 비동기 요청\r\n");
      out.write("		\r\n");
      out.write("		//fetch 를 이용 비동기 요청\r\n");
      out.write("		\r\n");
      out.write("		//axios 를 이용 비동기 요청\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
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
