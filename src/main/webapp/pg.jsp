<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="pg.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Random Password Generator</title>
</head>
<body>
	

	<div class="center">
	
	<h1> <span class="typee" style="--n:53">Random Password Generator</span></h1>
	
		
		
		
		
		
		<form action="passgenerator">
			<div class="inputbox">
				<input type="text" required="required" name="n1"> <span>Enter Password Length</span>
			</div>

			<div class="inputbox">
				<input  type="submit" value="Genrate">
			</div>
			<div class="inputbox">

				<div>
					<%
		Object o = session.getAttribute("pass");
		String s=(String)o;
		%>
					<div class="bla">
					Your Password is:
					</div>
					<div class="inputbox">
						<strong>
						<%=s%>
						</strong>
						
					</div>
					
				</div>
			</div>
		</form>
	</div>


</body>

</html>