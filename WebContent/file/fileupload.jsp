<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:head />
</head>

<body>
	<s:form action="resultAction" namespace="/" method="POST" enctype="multipart/form-data">
		<s:file name="fileUpload" label="Select a File to upload" size="40" />
		<s:submit value="submit" name="submit" />
	</s:form>
</body>
</html>