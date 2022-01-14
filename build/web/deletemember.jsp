<%@page import="DatAccess.MemberDAO"%>
<jsp:useBean id="b" class="Model.Member"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
int i=MemberDAO.delete(b);
if(i>0)
{
response.sendRedirect("memberakun.jsp");
}else{
response.sendRedirect("memberakun.jsp");
}
%>