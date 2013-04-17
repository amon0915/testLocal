<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'add_emp.jsp' starting page</title>

  </head>
  
  <body>
    <form action="" method="post">
    	id:<input type="text" name="empNp"><br/>
    	name:<input type="text" name="name"><br/>
    	phone:<input type="text" name="phone"><br/>
    	date:<input name="hireDate"><br/>
    	dept:<select>
    			<c:forEach items="${deptList}" var="dept">
    				<option value="${dept }">${dept }</option>
    			</c:forEach>
    		 </select>
    	<input type="submit">
    </form>
  </body>
</html>
