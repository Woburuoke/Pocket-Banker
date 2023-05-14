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
    </head>
    <body>
        <%@include file="header2.jsp" %>
        <main class="container-fluid">
            <h1 class=" my-3">Airtime Recharge</h1>
            
            <c:if test="${not empty feedback}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                ${feedback}
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-close="close"></button>
                
                
                </div>
            <c:remove var ="feedback" />
            </c:if>
            
            <form action="airtime" method="post">
                
            <div class="mb-3">
                <label class="form-label" for="serviceProvider">Service Provider</label>
                <select name="serviceProvider" id="destinationBank" class="form-control">
                    <option value="">select service provider</option>
                    <option value="mtn">Mtn</option>
                    <option value="glo">Glo</option>
                    <option value="airtel">Airtel</option>
                    <option value="9mobile">9 mobile</option>    
                </select>
                
            </div>
                
            <div class="mb-3">
                <label class="form-label" for="phoneNumber">Phone Number</label>
                <input type="text" id="phoneNumber" name="phoneNumber" class="form-control" placeholder="enter destination phone" />
            </div
            
            <div class="mb-3">
                <label class="form-label" for="amount">Amount</label>
                <input type="text" id="amount" name="amount" class="form-control" placeholder="enter amount" />
            </div>
   
            <div class="mb-3">
                <label class="form-label" for="password">Password</label>
                <input type="password" id="password" name="password" class="form-control" />
            </div>
                <input type="submit" value="Confirm" class=" btn btn-primary" />            
            </form>
            
        </main>
        <script src="bootstrap-5.0.0/js/bootstrap.min.js">
        </script>
    </body>
</html>
