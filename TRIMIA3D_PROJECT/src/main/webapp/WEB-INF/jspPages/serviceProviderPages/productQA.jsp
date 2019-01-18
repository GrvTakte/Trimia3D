<%@page import="com.app.trimia.model.ProductQuotation"%>
<%@page import="com.app.trimia.model.Feedback"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page errorPage="error.jsp" %>
      
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Quatation Page</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
   <link href="../vendors${pageContext.request.contextPath}/resources/portal/vendors/iCheck/skins/flat/green.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/resources/portal/build/css/custom.min.css" rel="stylesheet">

    <!-- Font Awesome Icon Library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.checked {
  color: orange;
}

.footer1{
	position: fixed;
    left: 0;
    bottom: 0;
    height: 35px;
    width: 100%;
    background-color: #2A3F54; 
    color: white;
    text-align: center;
}
</style>

  </head>
  <script type="text/javascript">
  /* function addQuatation()
  {
	document.myform.action="addQuatation";
	
	} */
  </script>

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
                <h3>Qautation Form</h3>
              </div>

            </div>

            <div class="clearfix"></div>

            <div class="row">
             

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  

                  <div class="x_content">

                   
                   <!--  <div class="table-responsive"> -->
                      <table class="table table-striped jambo_table bulk_action">
                        <thead>
                          <tr class="headings">
                        
                            <th class="column-title">File Url</th>
                            
                            <th class="column-title">Order Date </th>
                            <th class="column-title">order Time </th>
                            <th class="column-title">Address</th>                        
                            <th class="column-title">Select Material </th>
                            <th class="column-title">Action </th>
                            
                          </tr>
                        </thead>
                         <tbody>
                       <%List<ProductQuotation> qlist=(List<ProductQuotation>)request.getAttribute("quatation");
                       		for(ProductQuotation f:qlist)
                       		{%>
                         <tr class="even pointer">
                            <td><%=f.getFileUrl() %></td>
                           
                            <td><%=f.getOrderDate()%></td>
                            <td><%=f.getOrderTime()  %></td>
                            <td><%=f.getAddress() %></td>                      
                            <td><%=f.getSelectMaterial() %></td> 
                            <td><button type="button" class="btn btn-round btn-info btn-xs" data-toggle="modal" data-target=".bs-example-modal-lg" id="add">Add Quatation</button></td> 
                            </tr>
                            <%} %>
                            </tbody>
                            </table>
                            
                            <div id="modal">
                  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog modal-lg">
                      <!-- <div class="modal-content" style="width: 850px;margin-left:200px"> -->

                        
                        <div class="modal-body" style="width: 850px; margin-left:200px;">
                        
							<div class="col-md-6 col-sm-12 col-xs-12">
						
						
								<div class="x_panel" style="width: 800px;">
						<div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
                          </button>
                          <h4 class="modal-title" id="myModalLabel">Add Quatation Details</h4>
                        </div>			
                  <div class="x_content">
                    <br />
                    <form class="form-horizontal form-label-left" name="myform" action="addQuatation">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Quatation Date:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="date" class="form-control" data-inputmask="'mask': '99/99/9999'" name="quatationDate">
                      </div><br><br>
                      
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Working Hours:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" name="workingHours"  >
                        </div>
                      </div>
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Status:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" class="form-control" name="status">
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Remark:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" class="form-control" name="remark">
                        </div>
                      </div>
					  
					  <hr>
					  
					  <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Final Cost:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" class="form-control" name="finalCost">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Expected Date:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="date" class="form-control" name="expectedDate">   
                        </div>
                      </div>
					
					    <div class="ln_solid"></div>

                      <div class="form-group">
                        <div class="col-md-9 col-md-offset-3">
                          <button type="submit" class="btn btn-success" >Add Quatation</button>
                          <button type="reset" class="btn btn-primary">Reset</button>
                        </div>
                      </div>
                           </div> </form></div></div>

        <!-- /page content -->

       <!--  
        <div class="footer1">
        <p style="right:0;">Trimia3D</p>
        </div>
        /footer content -->
      </div>
    </div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
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
    <!-- iCheck -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/icheck.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${pageContext.request.contextPath}/resources/portal/build/js/custom.min.js"></script>
  </body>
</html>