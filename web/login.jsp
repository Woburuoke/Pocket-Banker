<%-- 
    Document   : login
    Created on : Jul 10, 2021, 11:41:27 AM
    Author     : WOBOH. E N  PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device=width,initial-scale=1.0"/>
        <title>Login</title>

        <link rel="stylesheet" href="bootstrap-5.0.0/css/bootstrap.min.css" />
    </head>
    <body>
        <%@include file="header3.jsp" %>
        <main class="p-4">
            <h1 class="fs-3 text-primary mb-3">Customer Login</h1>

            <c:if test="${not empty feedback}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                    ${feedback}
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-close="close"></button>


                </div>
                <c:remove var ="feedback" />
            </c:if>
            <form action="login" method="post">
                <div class="mb-3">
                    <label class="form-label" for="username">Username</label>
                    <input type="text" id="username" name="username" class="form-control" />
                </div>
                <div class="mb-3">
                    <label class="form-label" for="password">Password</label>
                    <input type="password" id="password" name="password" class="form-control" />
                </div>

                <input type="submit" value="Login" class=" btn btn-primary" />


            </form>
        </main>

        <script src="bootstrap-5.0.0/js/bootstrap.min.js"></script>

    </body>
</html>

