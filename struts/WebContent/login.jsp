    <%@ taglib uri="/struts-tags" prefix="s"%>  
      
    <s:form action="processLogin">  
    <s:textfield name="name" label="Username"></s:textfield>  
    <s:password name="password" label="Password"></s:password>  
    <s:submit value="login"></s:submit>  
    </s:form>  