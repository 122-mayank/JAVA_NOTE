<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Hello JSP</title></head>
<body>
<h1>Tomcat JSP Setup Successful 🎉</h1>
<%
   out.println("This JSP is running from: " + application.getRealPath("/"));
%>
</body>
</html>
