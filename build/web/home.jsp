<%-- 
    Document   : home
    Created on : Jul 10, 2021, 10:26:49 PM
    Author     : WOBOH. E N  PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <meta name="viewport" content="width=device-width,initial-scale=1.0" />
        <link rel="stylesheet" href="bootstrap-5.0.0/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="Stylesheets/app.css"/>
    </head>
    <body>
        <%@include file="header2.jsp" %>
        <main class="container-fluid">
            <h1 class="my-5 px-3">Welcome Back, ${account.firstName}</h1>

            <div class="row  mx-4 my-4" >

                <div class="col-12 col-sm-8 col-md-8 col-lg-4   bg-info mb-5 me-md-4" style="border-radius: 30px; max-width: 25rem" >
                    <div class="py-3 pt-lg-3 d-md-flex flex-column justify-content-lg-center">
                        <div class="px-md-4 ">
                            <p class="fs-5">Account Name: ${account.firstName} ${account.lastName} </p>
                        </div>
                        <div class="pb-3  pt-1 px-md-4  " >
                            <p class="fs-5">Savings Account Individual</p>
                            <span class="d-block  fs-5 mb-2">Acct No: ${account.accountNumber}</span>
                            <span class=" d-block  fs-3">Balance:  
                                <fmt:formatNumber currencySymbol="&#8358;" type="currency" value="${account.accountbalance}"  /></span>
                        </div>
                    </div>    
                </div>            


                <div class="col-12 col-sm-8 col-md-8 col-lg-4 bg-info mb-5" style="border-radius: 30px; max-width: 25rem">
                    <div  class="py-3 py-lg-3" >
                        <span class="d-block fs-6 pb-3  pt-1 px-md-4">${advert3.header_text}</span>

                        <span class="d-block fs-3 pb-3 pt-3 px-md-4">${advert3.main_text}</span>

                        <span class="d-block fs-6 pb-2 pt-3 px-md-4">${advert3.description}</span>
                    </div>
                </div>    

            </div>    

        </main>
        <script src="bootstrap-5.0.0/js/bootstrap.min.js">
        </script>
    </body>
</html>
