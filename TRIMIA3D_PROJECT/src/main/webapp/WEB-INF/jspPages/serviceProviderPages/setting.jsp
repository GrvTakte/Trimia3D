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

    <title>3D TRIMIA </title>

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
  	<script type="text/javascript">
  	function editProfile() 
  	{
		alert("editProfile called");
		document.getElementById('serviceProviderName').readOnly = false;
	}
  	</script>
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
            <div class="page-title">
              <div class="title_left">
                <h3>Profile Info</h3>
              </div>
            </div>
            
            
            
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Service Provider Information</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                     
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  
                  <div class="x_content">
                    <div class="col-md-3 col-sm-3 col-xs-12 profile_left">
                      <div class="profile_img">
                        <div id="crop-avatar">
                          <!-- Current avatar -->
                          <img class="img-responsive avatar-view" src="images/picture.jpg" alt="Avatar" title="Change the avatar">
                        </div>
                      </div>
                      <h3>Samuel Doe</h3>

                      <ul class="list-unstyled user_data">
                        <li><i class="fa fa-map-marker user-profile-icon"></i> San Francisco, California, USA
                        </li>

                        <li>
                          <i class="fa fa-briefcase user-profile-icon"></i> Software Engineer
                        </li>

                        <li class="m-top-xs">
                          <i class="fa fa-external-link user-profile-icon"></i>
                          <a href="http://www.kimlabs.com/profile/" target="_blank">www.kimlabs.com</a>
                        </li>
                      </ul>

                      <a class="btn btn-success" onclick="editProfile()">
                      <i class="fa fa-edit m-right-xs" ></i>Edit Profile</a>
                      <br />

                   

                    </div>
                    <div class="col-md-9 col-sm-9 col-xs-12">

                      <div class="profile_title">
                        <div class="col-md-6">
                          <h2>Personel Details</h2>
                        </div>
                      </div>
                      
                      <!-- start of user-activity-graph -->
                      <hr>
                     <div id="personel_details">
                      <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                      <div id="graph_bar" style="width:100%; height:280px;">
                     		  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="serviceProviderName">Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="serviceProviderName" required="required" class="form-control col-md-7 col-xs-12" value="${pm.getServiceProviderName()}"  readonly="readonly">
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="serviceProviderEmail">Email <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="email" id="serviceProviderEmail" name="serviceProviderEmail" required="required" class="form-control col-md-7 col-xs-12" value="${pm.getServiceProviderEmail()}">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="serviceProviderContact" class="control-label col-md-3 col-sm-3 col-xs-12">Contact</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="serviceProviderContact" class="form-control col-md-7 col-xs-12" type="number" name="serviceProviderContact" value="${pm.getServiceProviderContact()}">
                        </div>
                  </div>
            
                  <div class="form-group">
                        <label for="serviceProviderPanCard" class="control-label col-md-3 col-sm-3 col-xs-12">Pan Card</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="serviceProviderPanCard" class="form-control col-md-7 col-xs-12" type="text" name="serviceProviderPanCard" value="${pm.getServiceProviderPanCard()}">
                        </div>
                      </div>
					        <div class="form-group">
                        <label for="serviceProviderAadhaar" class="control-label col-md-3 col-sm-3 col-xs-12">Adhar Card</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="serviceProviderAadhaar" class="form-control col-md-7 col-xs-12" type="number" name="serviceProviderAadhaar" value="${pm.getServiceProviderAadhaar()}">
                        </div>
                      </div>
					        
                      </form>
                      </div>
                      </div>
                      <!-- end of user-activity-graph -->

                      <div class="" role="tabpanel" data-example-id="togglable-tabs">
                       <!--  <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                           <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Recent Activity</a>
                          </li>
                          <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">Projects Worked on</a>
                          </li>
                          <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab" aria-expanded="false">Profile</a>
                          </li> 
                        </ul> -->
                        <div id="myTabContent" class="tab-content">
                          <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">

                           
                          </div>
                          <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">

                        

                          </div>
                         
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>



            
            
            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                  <div class="x_panel">
                    
                    <div class="x_title">
                      <h2>Company Details<small>different form elements</small></h2>
                      <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li class="dropdown">
                          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                          <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Settings 1</a>
                            </li>
                            <li><a href="#">Settings 2</a>
                            </li>
                          </ul>
                        </li>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                      </ul>
                      <div class="clearfix">
  
                      </div>
                    </div>
                   
                    <div class="x_content">
                      <br />
                      <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
  
                        <div class="form-group">
                          <label class="control-label col-md-3 col-sm-3 col-xs-12" for="companyName">Company Name<span class="required">*</span>
                          </label>
                          <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="text" id="companyName" required="required" class="form-control col-md-7 col-xs-12">
                          </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="companyAddress">Company Address <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input type="text" id="companyAddress" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          <div class="form-group">
                              <label class="control-label col-md-3 col-sm-3 col-xs-12" for="companyPanCard">Company Pan Card <span class="required">*</span>
                              </label>
                              <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="text" id="companyPanCard" required="required" class="form-control col-md-7 col-xs-12">
                              </div>
                            </div>

                            <div class="form-group">
                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="companyGstNumber">Company GST Number <span class="required">*</span>
                                </label>
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                  <input type="text" id="companyGstNumber" required="required" class="form-control col-md-7 col-xs-12">
                                </div>
                              </div>

                        <div class="form-group">
                          <label class="control-label col-md-3 col-sm-3 col-xs-12" for="companyEmail">Company Email <span class="required">*</span>
                          </label>
                          <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="email" id="companyEmail" name="companyEmail" required="required" class="form-control col-md-7 col-xs-12">
                          </div>
                        </div>
                        
                        <div class="form-group">
                          <label for="contactDetail" class="control-label col-md-3 col-sm-3 col-xs-12">Contact</label>
                          <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="contactDetail" class="form-control col-md-7 col-xs-12" type="number" name="contactDetail">
                          </div>
                    </div>
              
                    <div class="form-group">
                          <label for="logo" class="control-label col-md-3 col-sm-3 col-xs-12">logo</label>
                          <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="logo" class="form-control col-md-7 col-xs-12" type="image" name="logo">
                          </div>
                        </div>
                    
                        <div class="form-group">
                          <label for="shopActLicenceNumber" class="control-label col-md-3 col-sm-3 col-xs-12">Shop Act Licence Number</label>
                          <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="shopActLicenceNumber" class="form-control col-md-7 col-xs-12" type="number" name="shopActLicenceNumber">
                          </div>
                        </div>
                    
                        <div class="form-group">
                          <label for="companyWebSite" class="control-label col-md-3 col-sm-3 col-xs-12">Company Web Site</label>
                          <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="companyWebSite" class="form-control col-md-7 col-xs-12" type="text" name="companyWebSite">
                          </div>
                        </div>

                        <div class="form-group">
                            <label for="openingTime" class="control-label col-md-3 col-sm-3 col-xs-12">OpeningTime</label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input id="openingTime" class="form-control col-md-7 col-xs-12" type="text" name="openingTime">
                            </div>
                          </div>

                          <div class="form-group">
                              <label for="closingTime" class="control-label col-md-3 col-sm-3 col-xs-12">Closing Time</label>
                              <div class="col-md-6 col-sm-6 col-xs-12">
                                <input id="closingTime" class="form-control col-md-7 col-xs-12" type="text" name="closingTime">
                              </div>
                            </div>

                            <div class="form-group">
                                <label for="workingDays" class="control-label col-md-3 col-sm-3 col-xs-12">workingDays</label>
                                <div class="col-md-6 col-sm-6 col-xs-12">
                                  <input id="workingDays" class="form-control col-md-7 col-xs-12" type="text" name="workingDays">
                                </div>
                              </div>
                       
                       
  
                      </form>
                    </div>
                  </div>
                </div>
              </div>
  

            <div class="row">
                <div class="col-md-12 col-sm-12 col-xs-12">
                  <div class="x_panel">
                    
                    <div class="x_title">
                      <h2>Address<small>different form elements</small></h2>
                      <ul class="nav navbar-right panel_toolbox">
                        <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                        </li>
                        <li class="dropdown">
                          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                          <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Settings 1</a>
                            </li>
                            <li><a href="#">Settings 2</a>
                            </li>
                          </ul>
                        </li>
                        <li><a class="close-link"><i class="fa fa-close"></i></a>
                        </li>
                      </ul>
                      <div class="clearfix">
  
                      </div>
                    </div>
                   
                    <div class="x_content">
                        <br />
                          <div class="row">
                          
                            <form class="form-horizontal form-label-center input_mask">
                            <div class="form-group">
                            <label for="landmark" class="control-label col-md-2 col-sm-2 col-xs-12">HouseNumber:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="houseNumber" class="form-control col-md-7 col-xs-12" type="text" name="houseNumber">
                            </div>
    
                        
              
                 
                 <div class="form-group">
                            <label for="landmark" class="control-label col-md-2 col-sm-2 col-xs-12">Landmark:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="landmark" class="form-control col-md-7 col-xs-12" type="text" name="landmark">
                            </div>
              </div>
              
              <div class="row">
                <div class="form-group">
                            <label for="area" class="control-label col-md-2 col-sm-2 col-xs-12">Area:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="area" class="form-control col-md-7 col-xs-12" type="text" name="area">
                            </div>
                 <div class="form-group">
                            <label for="city" class="control-label col-md-2 col-sm-2 col-xs-12">City:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="city" class="form-control col-md-7 col-xs-12" type="text" name="city">
                            </div>
              </div>
              
              <div class="row">
                <div class="form-group">
                            <label for="taluka" class="control-label col-md-2 col-sm-2 col-xs-12">Taluka:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="taluka" class="form-control col-md-7 col-xs-12" type="text" name="taluka">
                            </div>
                 <div class="form-group">
                            <label for="district" class="control-label col-md-2 col-sm-2 col-xs-12">District:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="district" class="form-control col-md-7 col-xs-12" type="text" name="district">
                            </div>
              </div>
              
              <div class="row">
              <div class="form-group">
                            <label for="state" class="control-label col-md-2 col-sm-2 col-xs-12">State:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="state" class="form-control col-md-7 col-xs-12" type="text" name="state">
                            </div>
                 <div class="form-group">
                            <label for="country" class="control-label col-md-2 col-sm-2 col-xs-12">Country:</label>
                            <div class="col-md-4 col-sm-4 col-xs-12">
                              <input id="country" class="form-control col-md-7 col-xs-12" type="text" name="country">
                            </div>
              </div>
                
               </form>
                      </div>
                    </div>
                  </div>
                </div>
            </div>
          
           
            	 <div class="ln_solid"></div>
                          <div class="form-group">
                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                                <button type="submit" class="btn btn-success">SAVE</button>
                              <button class="btn btn-primary" type="reset">Clear</button>
                            </div>
                          
             
                   </form>
                      </div>
                    </div>
                  </div>
              </div>
             

             
              
             
      
                 
                        
            </div>
          </div>   
                
                 


            
           
       <!-- /page content -->
       
       <!-- footer content -->
       <footer class="col-md-12">
         
          
         <div class="ln_solid"></div>
         <div class="form-group col-md-8" >
         <div class="row">
         				 <div class="col-md-6 col-sm-6 col-xs-4 col-md-offset-3">
                                <button type="submit" class="btn btn-success">Membership</button>
                              <button class="btn btn-primary" type="reset">Delete Account</button>
                            </div>
         				
           	</div>
         </div>
                    
        <div class="clearfix"></div>
      </div>
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
