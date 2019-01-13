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
                <h3>Ordered Product</h3>
              </div>

              
            </div>

            <div class="clearfix"></div>

            <div class="row">
           
              
              <div class="clearfix"></div>

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                  </div>
                  <div class="x_content">
                    <table class="table table-hover product">
                      <thead>
                        <tr>
                          <th>Order Id</th>
                          <th>Product</th>
                          <th>Product Name</th>
                          <th>Order Date</th>
                          <th>Order Status</th>
                          <th>View Product</th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <th scope="row">1</th>
                          <td>Mark</td>
                          <td>Otto</td>
                          <td>@mdo</td>
                          <td>
                             <div class="btn-group">
                                 <select class="btn btn-default" id="inputGroupSelect01" style="padding-top: 3px; padding-bottom: 3px; border-top-width: 3px;border-bottom-width: 2px;">
									<option selected>Choose Status</option>
									<option value="1">Research</option>
									<option value="2">Design</option>
									<option value="1">Research and development of the final design</option>
									<option value="2">Prototype Testing</option>
									<option value="1">Manufacturing</option>
									<option value="2">Assembly</option>
    								<option value="2">Feedback and Testing</option>
    								<option value="2">Final Product Completed</option>
								</select>
								</li>
                              </div>
                          </td>
							<td><button type="button" class="btn btn-round btn-info btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg" id="view">View Product</button></td>                        </tr>
                        <tr>
                          <th scope="row">2</th>
                          <td>Jacob</td>
                          <td>Thornton</td>
                          <td>@fat</td>
                          <td>
                              <div class="btn-group">
                                 <select class="btn btn-default" id="inputGroupSelect01" style="padding-top: 3px; padding-bottom: 3px; border-top-width: 3px;border-bottom-width: 2px;">
									<option selected>Choose Status</option>
									<option value="1">Research</option>
									<option value="2">Design</option>
									<option value="1">Research and development of the final design</option>
									<option value="2">Prototype Testing</option>
									<option value="1">Manufacturing</option>
									<option value="2">Assembly</option>
    								<option value="2">Feedback and Testing</option>
    								<option value="2">Final Product Completed</option>
								</select>
								</li>
                              </div>
                            
                          </td>
                          <td> 
                          <button type="button" class="btn btn-round btn-info btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg" id="view">View Product</button>
						   </td>
						   </div>
                    </div>
                  </div>

						  </td>
                        </tr>
                        <tr>
                          <th scope="row">3</th>
                          <td>Larry</td>
                          <td>the Bird</td>
                          <td>@twitter</td>
                          <td>
                               <div class="btn-group">
                                 <select class="btn btn-default" id="inputGroupSelect01" style="padding-top: 3px; padding-bottom: 3px; border-top-width: 3px;border-bottom-width: 2px;">
									<option selected>Choose Status</option>
									<option value="1">Research</option>
									<option value="2">Design</option>
									<option value="1">Research and development of the final design</option>
									<option value="2">Prototype Testing</option>
									<option value="1">Manufacturing</option>
									<option value="2">Assembly</option>
    								<option value="2">Feedback and Testing</option>
    								<option value="2">Final Product Completed</option>
								</select>
								</li>
                              </div>
                          </td>
							<td><button type="button" class="btn btn-round btn-info btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg" id="view">View Product</button></td>                        </tr>
                        </tr>
                      </tbody>
                    </table>

                  </div>
                </div>
              </div>

				<div id="modal">
                  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog modal-lg">
                      <div class="modal-content" style="width: 850px;margin-left:200px">

                        <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
                          </button>
                          <h4 class="modal-title" id="myModalLabel">Product Order Details</h4>
                        </div>
                        <div class="modal-body" style="width: 850px;">
							<div class="col-md-6 col-sm-12 col-xs-12">
								<div class="x_panel" style="width: 800px;">
									
                  <div class="x_content">
                    <br />
                    <form class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Product Id:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" class="form-control" data-inputmask="'mask': '99/99/9999'" readonly="readonly">
                        <!-- <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Product Name:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Order Date:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="date" class="form-control">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
					  
					  <hr>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Order Date:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="datetime-local" class="form-control">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Status Update Date:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="date" class="form-control">   
                        </div>
                      </div>
					
					  <hr>
                     
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Tracking Description</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <textarea class="form-control" rows="3" cols=""></textarea>
                        </div>
                      </div>
                     
                     <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Expected Date:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="date" class="form-control" readonly="readonly">   
                        </div>
                      </div>
                     
                     <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Status</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
							<select class="btn btn-default col-md-9" id="inputGroupSelect01" style="padding-top: 3px; padding-bottom: 3px;" border-top-width: 3px;border-bottom-width: 2px;>
									<option selected>Choose Status</option>
									<option value="1">Research</option>
									<option value="2">Design</option>
									<option value="1">Research and development of the final design</option>
									<option value="2">Prototype Testing</option>
									<option value="1">Manufacturing</option>
									<option value="2">Assembly</option>
    								<option value="2">Feedback and Testing</option>
    								<option value="2">Final Product Completed</option>
								</select>
                        </div>
                      </div>
                     
                      <div class="ln_solid"></div>

                      <div class="form-group">
                        <div class="col-md-9 col-md-offset-3">
                          <button type="submit" class="btn btn-success">Submit</button>
                          <button type="submit" class="btn btn-primary">Cancle</button>
                        </div>
                      </div>

                    </form>
                  </div>
                </div>
              </div>         

              <div class="clearfix"></div>

             	
						
                  </div>
                </div>
              </div>
            </div>
         </div>
         
         
         
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
       
        <!-- /footer content -->
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
    <!-- iCheck -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/icheck.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${pageContext.request.contextPath}/resources/portal/build/js/custom.min.js"></script>
  </body>
</html>