<%@page import="DatAccess.MemberDAO"%>  
<jsp:useBean id="u" class="Model.Member"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%
int i=MemberDAO.save(u);
if(i>0){
response.sendRedirect("login.jsp");
}else{
response.sendRedirect("login.jsp");
}
%>