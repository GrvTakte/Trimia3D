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

    <title>Trimia3D</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/nprogress/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/resources/portal/build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">

       	<jsp:include page="${pageContext.request.contextPath}/WEB-INF/jspPages/serviceProviderPages/common/sidebar.jsp"></jsp:include>

        <!-- top navigation -->
        <div class="top_nav">
        	<jsp:include page="${pageContext.request.contextPath}/WEB-INF/jspPages/serviceProviderPages/common/header.jsp"></jsp:include>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="clearfix"></div>

            <div class="row">

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Payment Status</h2>
           
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">


                    <!-- Smart Wizard -->
                    <div id="wizard" class="form_wizard wizard_horizontal">
                      <ul class="wizard_steps">
                        <li>
                          <a href="#step-1">
                            <span class="step_no">1</span>
                            <span class="step_descr">Product Payment</span>
                          </a>
                        </li>
                        <li>
                          <a href="#step-2">
                            <span class="step_no">2</span>
                            <span class="step_descr">Material Payment</span>
                          </a>
                        </li>
                        <li>
                          <a href="#step-3">
                            <span class="step_no">3</span>
                            <span class="step_descr">Membership Payment</span>
                          </a>
                        </li>
                      </ul>
                      
                      <div id="step-1">
						<table class="table table-hover product" style="margin-top:50px; margin-left:20px; margin-right:20px;">
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
                      
                      
                      <div id="step-2">
                        <h2 class="StepTitle">Step 2 Content</h2>
                        <p>
                          do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu
                          fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        <p>
                          Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor
                          in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                      </div>
                      
                      
                      <div id="step-3">
                        <h2 class="StepTitle">Step 3 Content</h2>
                        <p>
                          sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore
                          eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                        <p>
                          Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor
                          in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                        </p>
                      </div>
                
                

                    </div>
                    <!-- End SmartWizard Content -->
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
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
    <!-- jQuery Smart Wizard -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jQuery-Smart-Wizard/js/jquery.smartWizard.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="${pageContext.request.contextPath}/resources/portal/build/js/custom.min.js"></script>

	
  </body>
</html>