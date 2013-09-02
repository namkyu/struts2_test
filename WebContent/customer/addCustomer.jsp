<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>

<h2>Add Customer</h2>
<s:form  action="customerAction" >
  <s:textfield name="name" label="Name" />
  <s:textfield name="age" label="Age" value=""/>
  <s:submit />
</s:form>

</body>
</html>