<%@page import="DatAccess.ReserveDAO"%>
<jsp:useBean id="b" class="Model.Reserve"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
int i=ReserveDAO.save(b);
if(i>0){
response.sendRedirect("home.jsp");
}else{

}
%>