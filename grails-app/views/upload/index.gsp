<%--
  Created by IntelliJ IDEA.
  User: g
  Date: 5/2/11
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
 <html>
  <head><title>Contact Uploader</title></head>
  <body>
   Upload Form: <br />
		<g:form action="upload" method="post" enctype="multipart/form-data">
			<input type="file" name="myFile" />
			<input type="submit" />
		</g:form>
 </body>
</html>