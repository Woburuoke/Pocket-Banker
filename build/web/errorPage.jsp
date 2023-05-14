
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0" />
        <link rel="stylesheet" href="bootstrap-5.0.0/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="Stylesheets/errorpage.css">
        <title>Error</title>
    </head>
    <body>
        <section class="page_404">
            <div class="container-fluid ">
                <div class="row p-0 pt-5 m-0">
                    <div class="col-sm-12 col-lg-8 offset-lg-2 text-center ">
                        <div class="four_zero_four_bg" style="background-image: url('${errorGif.background_photo}')" >
                            <p class="text-center h1">Oops!!!</p>
                        </div>
                        <div class="content_box_404">
                            <p class="h3">Looks Like You're Lost</p>
                            <p>The page you are looking for is not available</p>
                            <a href="index">Go to Home</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="bootstrap-5.0.0/js/bootstrap.min.js">
        </script>
    </body>
</html>
