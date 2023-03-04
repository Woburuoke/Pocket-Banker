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
            <h1 class=" my-3">Send Money</h1>
            
            <c:if test="${not empty feedback}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                ${feedback}
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-close="close"></button>
                
                
                </div>
            <c:remove var ="feedback" />
            </c:if>
            
            <form action="transfer" method="post">
                
            <div class="mb-3">
                <label class="form-label" for="destinationBank">Bank Name</label>
                <select name="destinationBank" id="destinationBank" class="form-control">
                    <option value="">enter destination dank</option>
                    <option value="Access Bank">Access Bank</option>
                    <option value="Wema Bank">Wema Bank</option>
                    <option value="Fidelity Bank">Fidelity Bank</option>
                    <option value="Polaris Bank">Polaris Bank</option>
                    
                </select>
                
            </div>
                
            <div class="mb-3">
                <label class="form-label" for="accountnumber">Account Number</label>
                <input type="text" id="accountnumber" name="accountNumber" class="form-control" placeholder="enter destination account" />
            </div
            
            <div class="mb-3">
                <label class="form-label" for="amount">Amount</label>
                <input type="text" id="amount" name="amount" class="form-control" placeholder="enter amount" />
            </div>
            
            <div class="mb-3">
                <label class="form-label" for="narration">Narration</label>
                <input type="text" id="narration" name="narration" class="form-control" placeholder="" />
            </div>
            
            <div class="mb-3">
                <label class="form-label" for="password">Password</label>
                <input type="password" id="password" name="password" class="form-control" />
            </div>
            
                <input type="submit" value="Continue" class=" btn btn-primary" />
             
            
            </form>
            
        </main>
        <script src="bootstrap-5.0.0/js/bootstrap.min.js">
        </script>
    </body>
</html>
