<%@page import="DatAccess.MemberDAO"%>  
<jsp:useBean id="u" class="Model.Feedback"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%
int i=FeedbackDAO.save(u);
if(i>0){
response.sendRedirect("login.jsp");
}else{
response.sendRedirect("process-error.jsp");
}
%>