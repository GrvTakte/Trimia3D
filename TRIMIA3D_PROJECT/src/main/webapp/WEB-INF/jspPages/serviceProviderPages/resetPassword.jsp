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
  	function getAddressDiv() 
	{
		//alert("regdiv called");
		var act = document.getElementById("addressdiv");
		//alert(act);
		if (act.style.display === "none")
		{
			act.style.display = "block";
		}
		else
		{
			act.style.display = "none";
		}

	}
  	function checkOldPass() 
  	{
		alert("checkOldPass called");
		var old=document.getElementById("oldPassword").value;
		alert(old);
		var id="SP001";
		var req=new XMLHttpRequest;
		req.open("POST","checkOldPass?id=" + id + "&old=" + old,true);
		req.send();
		
		//document.getElementById('newPassword').required = true;
		//document.getElementById('confirmNewPassword').required = true;
		
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
         
            
            
            
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Reset Password</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                     
                     
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  
                  <div class="x_content">
                 
                      <h3>${pm.getProviderMasterName()}</h3>

                     
				
                   
                      
                      
                      
                      
                      
                      
                      
                      <br />

                   

                    </div>
                  <!--    <div class="col-md-6 col-sm-6 col-xs-12">

                    <div class="profile_title">
                      
                        <div class="col-md-6">
                        
                          <h2>Personel Details</h2>
                           
                          
                        </div>
                      </div> -->
                      
                      <!-- start of user-activity-graph -->
                      <hr>
                     	
                      <form action="updateSettings" id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">
                     
                      <div id="graph_bar" style="width:100%; height:280px;">
                      	
                      	<div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="oldPassword">Old Password :<span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input type="password" id="oldPassword" required="required" class="form-control col-md-7 col-xs-12" onblur="checkOldPass()">
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="newPassword">New Password :<span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input type="password" id="newPassword" name="newPassword"  class="form-control col-md-7 col-xs-12" readonly="readonly">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="confirmNewPassword" class="control-label col-md-3 col-sm-3 col-xs-12">Confirm New Password :<span class="required">*</span></label>
                        <div class="col-md-4 col-sm-4 col-xs-12">
                          <input id="confirmNewPassword" class="form-control col-md-7 col-xs-12"  type="password" name="confirmNewPassword" readonly="readonly">
                        </div>
                  </div>
                  
                  
            		   
                          <div class="form-group">
                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-4">
                                <button type="submit" class="btn btn-success">SAVE</button>
                              <button class="btn btn-primary" type="reset">Reset</button>
                            </div>
                        	</div>
           				
                      
                         </div>           		
                      
                   </form>  
					 
                  
                      </div>
                      </div>
                      </div>
                      <!-- end of user-activity-graph -->
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
                        
           				
                      </div>
                      
                    
                  
              
             

             
      
             
      
                 
                        
            
             
                
                 


            
           
       <!-- /page content -->
       
      
        
        
       
           
           

           


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
