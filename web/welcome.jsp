<%-- 
    Document   : welcome.jsp
    Created on : Jul 5, 2021, 10:42:11 AM
    Author     : WOBOH. E N  PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <%@include file="header.jsp" %>
        <main class="container-fluid">
            <div class="alert alert-success alert-dismissible mt-2" role="alert" >
                <p class="m-0 p-0">View the latest details on our <a href="#">COVID-19 resources</a> and the <a href="#">Paycheck Protection Program</a></p>
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-close="close"></button>


            </div>


            <div class=" row g-0 border border-1 border-muted my-3 " >
                <div class="col-12 col-md-4 col-lg-3 px-2 py-3 d-flex flex-column justify-content-center"  style="background-color: #0082FA">

                    <div class=" heroHeader mb-3 mb-lg-4"><p class="text-light">${adverts.header_text}</p> </div>
                    <div class="heroMain mb-2 mb-lg-4"><p class="text-light">${adverts.main_text}</p></div>
                    <div class="heroDescription "> <p class="text-light">${adverts.description}</p></div>

                </div>
                <div class=" col-12 col-md-8 col-lg-9 heroImage" style="background-image: url('${adverts.photo}')"></div>

            </div>

            <div class=" row g-4 my-4">
                <div class="col-12 col-md-4  d-inline"  >

                    <span class="d-block  pb-2"><p class="fs-6 font-weight-bold">${advert4.header_text}</p></span>
                    <div mb-2>
                        <img src="${advert4.background_photo}" alt="${advert4.header_text}" class="img-fluid"  />
                    </div>
                    <span class="d-block fs-6 py-3">${advert4.description}</span>

                </div>
                <div class="col-12 col-md-4 d-inline"   >
                    <span class="d-block fs-6 pb-2 "><p class="font-weight-bold">${advert5.header_text}</p></span>
                    <div mb-2>
                        <img src="${advert5.background_photo}" alt="${advert5.header_text}" class="img-fluid"  />
                    </div>
                    <span class="d-block fs-6 py-3">${advert5.description}</span>

                </div>
                <div class="col-12 col-md-4 d-inline">
                    <span class="d-block fs-6 pb-2"><p class="font-weight-bold">${advert6.header_text}</p></span>
                    <div mb-2>
                        <img src="${advert6.background_photo}" alt="${advert6.header_text}" class="img-fluid"  />
                    </div>
                    <span class="d-block fs-6 py-3">${advert6.description}</span>


                </div>

            </div>


            <div class=" row g-3 pb-5 px-lg-3 my-5" >
                <div class="col-12 col-md-6 px-lg-4  d-flex justify-content-center" >

                    <img src="${advert3.photo}" alt="${advert3.header_text}" class="img-fluid image3"  />


                </div>
                <div class="col-12 col-md-6 d-flex flex-column justify-content-around"   >
                    <span class="d-block Header pb-3 pt-1">${advert3.header_text}</span>

                    <span class="d-block main4 fw-bolder">${advert3.main_text}</span>


                    <span class="d-block Description fs-6 pb-2 pt-3">${advert3.description}</span>

                </div>
            </div>

            <div class=" row g-3 pt-3 px-lg-3 my-5" >

                <div class="col-12 col-md-6 d-flex flex-column justify-content-around"   >
                    <span class="d-block Header pb-3 pt-1">${advert7.header_text}</span>

                    <span class="d-block main3  fw-bolder">${advert7.main_text}</span>


                    <span class="d-block Description pb-2 pt-3">${advert7.description}</span>

                </div>
                <div class="col-12 col-md-6 px-lg-4 d-flex justify-content-center" >

                    <img src="${advert7.photo}" alt="${advert7.header_text}" class="img-fluid image3"  />


                </div>


            </div>







        </main>

        <footer id="footer" class="footer-1 bg-primary ">
            <div class="main-footer widgets-dark typo-light">
                <div class="container ">
                    <div class="row">

                        <div class="col-xs-12 col-sm-6 col-md-3">
                            <div class="widget subscribe no-box pt-3">
                                <p class="fs-5 ">Pocket Banker<p>
                            </div>
                        </div>





                        <div class="col-xs-12 col-sm-6 col-md-3">

                            <div class="widget no-box pt-3">
                                <p class="fs-5">Contact Us</p>
                                <address>
                                    No.1 Kaduna Street,
                                    Dline, Port Harcourt,
                                    Rivers State - Nigeria.
                                    Tel: +2347031615040.
                                    Pocketbanker@gmail.com
                                </address>


                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="footer-copyright my-3">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <p>Copyright Pocket Banker © 2021. All rights reserved.</p>
                        </div>
                    </div>
                </div>
            </div>
        </footer>




        <script src="bootstrap-5.0.0/js/bootstrap.min.js">
        </script>
    </body>
</html>
