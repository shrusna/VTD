<%@page import="DatAccess.ReserveDAO"%>
<jsp:useBean id="b" class="Model.Reserve"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
int i=ReserveDAO.delete(b);
if(i>0)
{
response.sendRedirect("membereserv.jsp");
}else{
response.sendRedirect("membereserv.jsp");
}
%>