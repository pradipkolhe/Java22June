<% int i=10; 
System.out.println(i*10);
%>
<%= i*10 %>

<%!
	public void display()
	{
		System.out.println("Display Method");
	}

%>

<%
	display();
%>

<!-- <h1>Hello</h1> -->