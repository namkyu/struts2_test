<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<body>
	<h4>
		File Name :
		<s:property value="fileUploadFileName" />
	</h4>

	<h4>
		Content Type :
		<s:property value="fileUploadContentType" />
	</h4>

	<h4>
		File :
		<s:property value="fileUpload" />
	</h4>

</body>
</html>