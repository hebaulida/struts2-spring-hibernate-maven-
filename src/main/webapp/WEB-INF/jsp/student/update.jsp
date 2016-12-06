<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改学生信息</title>

<link href="css/sys.css" type="text/css" rel="stylesheet" />

</head>

<body>
	<table border="0" cellspacing="0" cellpadding="0" width="100%">
		<tr>
			<td class="topg"></td>
		</tr>
	</table>
<s:form action="studentAction_updateStudent.action">
	<s:hidden name="sid"></s:hidden>
	<table border="0" cellspacing="0" cellpadding="0" class="wukuang"
		width="100%">
		<tr>
			<td width="1%"><img src="images/tleft.gif" /></td>
			<td width="39%" align="left">[修改学生信息]</td>
			<td width="57%" align="right">
				<input type="image" src="images/button/modif.gif"/></td>
			<td width="57%" align="right">
				<a href="#"><img src="images/button/back.gif" /></a></td>
			<td width="3%" align="right"><img src="images/tright.gif" /></td>
		</tr>
	</table>
	
		<table width="88%" border="1" class="emp_table">
			<tr>
				<s:textfield name="name" label="学生姓名"></s:textfield>
			</tr>
			<tr>
				<s:textfield name="age" label="年龄"></s:textfield>
			</tr>
			<tr>
				<s:textfield name="description" label="介绍"></s:textfield>
			</tr>
		</table>
	</s:form>

</body>
</html>