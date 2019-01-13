<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" href="images/favicon.ico" type="image/ico" />

    <title>Trimia3D</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
	
    <!-- bootstrap-progressbar -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet">
    <!-- JQVMap -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/jqvmap/dist/jqvmap.min.css" rel="stylesheet"/>
    <!-- bootstrap-daterangepicker -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/resources/portal/build/css/custom.min.css" rel="stylesheet">
    </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
     	
     	<jsp:include page="sidebar.jsp"></jsp:include>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>Materials And Offers</h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <!-- <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div> -->
                </div>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Materials</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

   <!-- ----------------------------------------------------------------------------------------- -->
  




                      <div class="container">
                          <div class="row">
                              <div class="col-lg-12">
                                  <h2>Materials Image Gallery</h2>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Nut and Bolts</b></p></center>
                                  		<center><p> <b>&#8377;</b> 8000 <small>* including GST</small></p> 
                                  		<button class="btn btn-warning">Buy Now</button></center>                                		
                                  </a>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Circular Wheels</b></p></center>
                                  		<center><p> <b>&#8377;</b> 40000 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                                  		
                                  </a>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Half Wheels</b></p></center>
                                  		<center><p> <b>&#8377;</b> 3000 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                               		
                                  </a>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Semi Wheels</b></p></center>
                                  		<center><p> <b>&#8377;</b> 9500 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                                 		
                                  </a>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Coupling</b></p></center>
                                  		<center><p> <b>&#8377;</b> 3200 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                                		
                                  </a>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Big Coupling</b></p></center>
                                  		<center><p> <b>&#8377;</b> 1450 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                                 		
                                  </a>
                              </div>
                              <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Crank Shaft</b></p></center>
                                  		<center><p> <b>&#8377;</b> 8500 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                              		
                                  </a>
                              </div>
                             <div class="col-lg-3 col-md-4 col-sm-6">
                                  <a class="thumbnail" style="line-height: 0.5; height: 250px;">
                                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" />
                                      <br><br>
                                      <center><p><b>Belan</b></p></center>
                                  		<center><p> <b>&#8377;</b> 1200 <small>* including GST</small></p>
                                  		<button class="btn btn-warning">Buy Now</button></center>                                		
                                  </a>
                              </div>
                          </div>
                      </div>



                    <div>
                          <h3 >Offers on material</h3>
                    </div>
                    

<div class="container">
  <div class="row">
      <div class="col-md-8 col-md-offset-2">
          <div id="imageCarousel" class="carousel slide" data-interval="2000"
               data-ride="carousel" data-pause="hover" data-wrap="true">

              <ol class="carousel-indicators">
                  <li data-target="#imageCarousel" data-slide-to="0" class="active"></li>
                  <li data-target="#imageCarousel" data-slide-to="1"></li>
                  <li data-target="#imageCarousel" data-slide-to="2"></li>
                  <li data-target="#imageCarousel" data-slide-to="3"></li>
              </ol>

              <div class="carousel-inner">

                  <div class="item active">
                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" class="img-responsive">
                      <div class="carousel-caption">
                          <h3>Nut and Bolts</h3>
                          <p>Nut and Bolts Image Description</p>
                      </div>
                  </div>

                  <div class="item">
                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" class="img-responsive">
                      <div class="carousel-caption">
                          <h3>Circular Wheel</h3>
                          <p>Circular Wheel Image Description</p>
                      </div>
                  </div>

                  <div class="item">
                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" class="img-responsive">
                      <div class="carousel-caption">
                          <h3>Half Wheel</h3>
                          <p>Half Wheel Image Description</p>
                      </div>
                  </div>

                  <div class="item">
                      <img src="${pageContext.request.contextPath}/resources/portal/images/imagenotfound.jpg" class="img-responsive">
                      <div class="carousel-caption">
                          <h3>Semi Wheel</h3>
                          <p>Semi Wheel Image Description</p>
                      </div>
                  </div>

              </div>

              <a href="#imageCarousel" class="carousel-control left" data-slide="prev">
                  <span class="glyphicon glyphicon-chevron-left"></span>
              </a>
              <a href="#imageCarousel" class="carousel-control right" data-slide="next">
                  <span class="glyphicon glyphicon-chevron-right"></span>
              </a>
          </div>

      </div>
  </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js">
</script>
<script src="bootstrap/js/bootstrap.min.js"></script>

        

 <!----------- ----------------------------------------------------------------------------------- -->
				
                      

                    </form>
                  </div>
                </div>
              </div>
            </div>

            

  
    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/nprogress/nprogress.js"></script>
    <!-- Chart.js -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/Chart.js/dist/Chart.min.js"></script>
    <!-- gauge.js -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/gauge.js/dist/gauge.min.js"></script>
    <!-- bootstrap-progressbar -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/icheck.min.js"></script>
    <!-- Skycons -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/skycons/skycons.js"></script>
    <!-- Flot -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/Flot/jquery.flot.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/Flot/jquery.flot.pie.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/Flot/jquery.flot.time.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/Flot/jquery.flot.stack.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/Flot/jquery.flot.resize.js"></script>
    <!-- Flot plugins -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/flot.curvedlines/curvedLines.js"></script>
    <!-- DateJS -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/DateJS/build/date.js"></script>
    <!-- JQVMap -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jqvmap/dist/jquery.vmap.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/moment/min/moment.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${pageContext.request.contextPath}/resources/portal/build/js/custom.min.js"></script>
 
  </body>
</html>
