<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" href="images/favicon.ico" type="image/ico" />

    <title>Gentelella Alela! | </title>

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
  
  function loadSubCategory(id){
	  alert(id);
	  var req = new XMLHttpRequest();
	  req.open("GET", "subCategory?id="+id, true);
	  req.send();
	  
	  req.onreadystatechange=function(){
		  if(req.readyState==4 && req.status==200){
			  alert(req.responseText)
		  }
	  }
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
                
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
               <!--    <div class="input-group">
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
                    <h1>Add Offer</h1>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="Category">Category <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <select  id="category" onchange="loadSubCategory(this.value)"  class="form-control col-md-7 col-xs-12">
						  <option>Select Category</option>
                          <c:forEach items="${category}" var="element">
                          <option value="${element.getSpecializationCategoryId()}">${element.getSpecializationCategoryName()}</option>
                          </c:forEach> 
                          
						  </select>
                        </div>
                      </div>
                     <!--  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="ProductName">ProductName <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="productName" name="productname" placeholder="Product Name"  class="form-control col-md-7 col-xs-12">
                        </div>
                      </div> -->
                     <br><br>
					 <div class="form-group" >
                        <label class="control-label col-md-3 col-sm-3 col-xs-4" for="TableData"> <span class="required"></span>
                        </label>
                       
                        <div class="col-md-6 col-sm-6 col-xs-12">
                         <table class="table table-responsive" align="center" border="1">
						  <thead>
							<tr>
							  <th scope="col">Select</th>
							  <th scope="col">ProductName</th>
							  <th scope="col">Code</th>
							  
							</tr>
						  </thead>
						  <tbody>
							<tr>
							  <th scope="row"><input type="checkbox" value="productId"></th>
							  <td>Gaurav Takte</td>
							  <td>Team Leader</td>
							</tr>
							<tr>
							  <th scope="row"><input type="checkbox" value="productId"></th>
							  <td>Gaurav Wadekar</td>
							  <td>Sub Team Leader</td>
							  </tr>
							<tr>
							  <th scope="row"><input type="checkbox" value="productId"></th>
							  <td>Sultan Mulani</td>
							  <td>Team Member</td>
							  </tr>
						  </tbody>
						</table>
                        </div>
                      </div>
                      
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="Offer">Offer <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-6">
                          <input type="text" id="offer" name="offer" placeholder="Offer In Discount"  class="form-control col-md-7 col-xs-10">
                        </div>
                      </div>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="StartingDate">Starting Date <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-4">
                          <input type="date" id="StartingDate" name="StartingDate"   class="form-control col-md-5 col-xs-7">
                        </div>
                      </div>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="EndingDate">Ending Date <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-4">
                          <input type="date" id="EndingDate" name="EndingDate"   class="form-control col-md-5 col-xs-7">
                        </div>
                      </div>
					  
					  
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="Product Description">Product Description <span class="required">*</span>
                        </label>

                      </div>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="Title">Title <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-6">
                          <input type="text" id="Title" name="Title" placeholder="Product Title"  class="form-control col-md-7 col-xs-10">
                        </div>
                      </div>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="Offer">Offer Name <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-6">
                          <input type="text" id="offerName" name="offerName" placeholder="Offer Name"  class="form-control col-md-7 col-xs-10">
                        </div>
                      </div>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="OfferDescription">Offer Description <span class="required">*</span>
                        </label>
                        <div class="col-md-4 col-sm-4 col-xs-6">
                          <input type="textarea" id="OfferDescription" name="OfferDescription" placeholder="OfferDescription "  class="form-control col-md-7 col-xs-10">
                        </div>
                      </div>
					  
					  
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
						  <button class="btn btn-primary" type="reset">Reset</button>
                          <button type="submit" class="btn btn-success">Add Offer</button>
                        </div>
                      </div>

                    </form>
                  </div>
                </div>
              </div>
            </div>

        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Guarav Takte The Team Leader!... <a href="https://colorlib.com">Colorlib</a>
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
