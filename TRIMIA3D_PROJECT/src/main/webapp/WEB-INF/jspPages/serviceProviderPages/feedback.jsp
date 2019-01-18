<%@page import="com.app.trimia.model.Feedback"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
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
    <!-- iCheck -->
   <link href="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/skins/flat/green.css" rel="stylesheet">

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
                <h3>Feedback from User</h3>
              </div>

            </div>

            <div class="clearfix"></div>

            <div class="row">
            <!--   <div class="clearfix"></div> -->

              


              
                 

             

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  

                  <div class="x_content">

                   
                   <!--  <div class="table-responsive"> -->
                      <table class="table table-striped jambo_table bulk_action">
                        <thead>
                          <tr class="headings">
                        
                            <th class="column-title">Product Order Id</th>
                            
                            <th class="column-title">Product Specialization </th>
                            <th class="column-title">Company Name </th>
                            <th class="column-title">Date & Time</th>                        
                            <th class="column-title">Review </th>
                            <th class="column-title">Rating </th>
                            
                          </tr>
                        </thead>

                        <tbody>
                       <%List<Feedback> flist=(List<Feedback>)request.getAttribute("feedback");
                       		for(Feedback f:flist)
                       		{%>
                         <tr class="even pointer">
                            <td><%=f.getProductOrdered().getProductOrderedId() %></td>
                           
                            <td><%=f.getProductOrdered().getMaterialSpecializationSubCategory().getSpecializationSubCategoryName()%></td>
                            <td><%=f.getProductOrdered().getMaterialSpecializationSubCategory().getMaterialSpecializationCategory().getProviderCompanyMaster().getProviderCompanyMasterName() %></td>
                            <td><%=f.getDateAndTime() %></td>                      
                            <td><%=f.getUserReview() %></td>              
                           
                            <td>
                            	 	 <%
                            	  	int rating = Integer.parseInt(f.getUserRating());
                            	 	
                            		 for(int i=1;i<=rating;i++)
                            		
                            		{%>
                            			 <span class="fa fa-star checked"></span>
                            		<%} %>
                            		
                            		<% 
                            		 for(int j=1;j<=5-rating;j++)
                            		 {
                            		%>
                            			 <span class="fa fa-star"></span>
                            		<%} %>
                            	  
                            </td>
                          </tr> 
                     	<%} %>
                          
                         

                          
                         
                        </tbody>
                      </table>
               
                  </div>
                </div>
              </div>
          
        </div>
        <!-- /page content -->

       <!--  <!-- footer content -->
        <div class="footer1">
        <p style="right:0;">Trimia3D</p>
        </div>
        /footer content -->
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