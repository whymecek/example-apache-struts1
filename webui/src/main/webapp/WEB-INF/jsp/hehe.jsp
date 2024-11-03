<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
    <head>
        <title>Hehee</title>
    </head>
    <body>
        <h1>Hello Hehehe <bean:write name="testForm" property="value"/> </h1>
    </body>
</html>