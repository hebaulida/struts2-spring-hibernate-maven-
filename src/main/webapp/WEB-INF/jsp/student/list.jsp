<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<link href="css/sys.css" type="text/css" rel="stylesheet" />

</head>

<body >
 <table border="0" cellspacing="0" cellpadding="0" width="100%">
  <tr>
    <td class="topg"></td>
  </tr>
</table>

<table border="0" cellspacing="0" cellpadding="0"  class="wukuang"width="100%">
  <tr>
    <td width="1%"><img src="images/tleft.gif"/></td>
    <td width="39%" align="left">[学生管理]</td>
   
    <td width="57%"align="right">
       <a href="studentAction_addUI.action"><img src="images/button/tianjia.gif" /></a>
      
    </td>
    <td width="3%" align="right"><img src="images/tright.gif"/></td>
  </tr>
</table>
<table border="0" cellspacing="0" cellpadding="0" style="margin-top:5px;">
  <tr>
    <td ><img src="images/result.gif"/></td>
  </tr>
</table>
<table width="100%" border="1" >
  
  <tr class="henglan" style="font-weight:bold;">
    <td width="6%" align="center">学生姓名</td>
	<td width="6%" align="center">年龄</td>
    <td width="7%" align="center">介绍</td>
    <td width="7%" align="center">操作</td>
  </tr>
    <s:iterator value="#students">
	  <tr class="tabtd2">
	    <td align="center"><s:property value="name"/></td>
	    <td align="center"><s:property value="age"/></td>
	    <td align="center"><s:property value="description"/></td>
	  	<td width="7%" align="center">
	  		<a href="studentAction_updateStudentUI.action?sid=${sid }"><img src="images/button/modify.gif" class="img"></a>
	  		<a href="studentAction_delStudent.action?sid=${sid }"><img src="images/button/delete.gif" class="img"></a>
	  	</td>
	  </tr>
  </s:iterator>
</table>
<%-- 
 	--Map<String, Student>--
<s:iterator value="#map">
	<s:property value="key"/><br />
	<s:property value="value.name"/><br />
	<s:property value="value.age"/><br />
</s:iterator>

--List<Map<String, Student>>--
<s:iterator value="#list">
	<s:iterator>
		<s:property value="key"/>
		<s:property value="value.name"/> 
		<s:property value="value.age"/><br />
	</s:iterator>
</s:iterator> 
--Map<String, List<Student>>--
<s:iterator value="#map">
	<s:property value="key"/>
	<s:iterator value="value">
		<s:property value="name"/>
		<s:property value="age"/>
	</s:iterator>
</s:iterator>--%>
<!-- List<Map<String, List<Student>>> -->
<s:iterator value="#list">
	<s:iterator>
		<s:property value="key"/>
		<s:iterator value="value">
			<s:property value="name"/>
			<s:property value="age"/>
		</s:iterator>
	</s:iterator>
</s:iterator>
</body>
</html>