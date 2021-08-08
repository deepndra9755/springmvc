<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="frmm" %>
    <frmm:form action="regis" method="POST" modelAttribute="sbn">
    <pre>
           <h3> id<frmm:input type="text" path="id"/>
   
              name<frmm:input type="text" path="name" />
    
           address<frmm:input type="text" path="address"/>
    
              city<frmm:input type="text" path="city"/>
    
               job<frmm:input type="text" path="job"/>
    
        department<frmm:input type="text" path="DEPARTMENT"/><br>
        
        dept<frmm:select path="dept">
        <frmm:options items="${dep}"/>
        
        </frmm:select>
    <frmm:input type="submit" value="Register" path="job"/>
    </h3>
    </pre>
    </frmm:form>
    
<!-- private int id; -->
<!-- private String name,address,city,job,DEPARTMENT; -->
<!-- private float sallary; -->