<%@ page import="web.etudiant.Etudiant" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        ArrayList<Etudiant> list = (ArrayList<Etudiant>) request.getAttribute("data");
        for (Etudiant it : list) {%>
<form action="supprimerServlet?cin=<%=it.cin%>" method="get">
   <%=it.cin%>
       
       <%=it.name%>
       
       <%=it.lastName%>
       
       
         <input type=submit id="supprimer" name="cin" value="supprimer"></input>
         </form>
        
    <%}%>

</body>
</html>
