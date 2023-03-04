<%-- 
    Document   : transfer
    Created on : Jul 11, 2021, 6:44:24 PM
    Author     : WOBOH. E N  PC
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pocket Banker</title>
        <meta name="viewport" content="width=device-width,initial-scale=1.0" />
        <link rel="stylesheet" href="bootstrap-5.0.0/css/bootstrap.min.css"/> 
        <link rel="stylesheet" type="text/css" href="Stylesheets/app.css"/>
    </head>
    <body>
        <%@include file="header2.jsp" %>
        <main class="container-fluid">
            <h1 class=" my-3">Transfer Confirmation</h1>
            
     
            
            
            
                <div class=" row g-0 border border-1 border-muted mt-5" >
                    <div class="col-12 col-md-5 px-5 bg-info py-3">
                    
                    <span class="d-block fs-3 pb-3 pt-2  display-3">You Are Transferring</span>
		    <span class="d-block fs-3 fw-bolder pb-3 ">${amount}</span>
                    <span class="d-block fs-6 pb-2  "><p class="font-italic" style="padding: 0 0 0 100px; font-style: italic; font-family: apple">To</p></span>
		    <span class="d-block fs-3 fw-bolder pb-4">${account2.firstName} ${account2.lastName}</span>
                    <span class=" fs-6 btn btn-outline-primary"><a href="transferFinal" style="text-decoration: none">Confirm</a></span>
                    
                    </div>
                    <div class="col-12 col-md-7 heroImage" style="background-image: url('${adverts.photo}')">
                        <div >
                            
<!--                            <img src="${adverts.photo}" alt="${adverts.header_text}" class="w-100"  />-->
                            
                        </div>
                        
                    
                    </div>

            </div>
            
            
            
            
            
            
             
            
        </main>
        <script src="bootstrap-5.0.0/js/bootstrap.min.js">
        </script>
    </body>
</html>
