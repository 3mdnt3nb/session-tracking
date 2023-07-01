<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <%--  <% 
		Cookie[]arr=request.getCookies();
		int count=0;
		for(Cookie c:arr){
			if(c.getName().equals("key") && c.getValue().equals("abc")){
				count++;
		%>
	<marquee behavoir="scroll" direction="right" scrollamount="10"><h1>WELCOME TO FRIENDS PAGE</h1></marquee>	
	   <% 
			}
		}
		if(count==0){
			response.sendRedirect("login.jsp");
		}	
		%>  --%> 
		
		 <% String s=(String)session.getAttribute("hai");
		if(s!=null){
		%>
			<marquee behavoir="scroll" direction="right" scrollamount="10"> <h1>WELCOME TO FRIENDS PAGE</h1></marquee>	
		<h2 ><a href="logout">LOGOUT HERE</a></h2>
		<% } 
		else {
			response.sendRedirect("login2.jsp");
		
		}
		%>  
			
</body>
</html>