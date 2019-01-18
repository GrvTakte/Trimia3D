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
  <script>
  function addClient()
  {
	  alert("add client");
	  	
		var clientId=document.getElementById("clientid").value;
		var clientName=document.getElementById("clientname").value;
		clientId.innerHTML="";
		clientName.innerHTML="";
		alert(clientId+" "+clientName);
		var req=new XMLHttpRequest();
		
		var url="addClient?clientId="+clientId+"&clientName="+clientName;
		req.open("GET",url,true);
		req.send();
		
		req.onreadystatechange=function(){
			if(req.readyState==4 && req.status==200)
				{
				alert("client added");
				}
		}
		 	/* var clientId=document.getElementById("clientid").value="";
			var clientName=document.getElementById("clientname").value=""; */
			document.getElementById("demo-form2").reset();
			viewClient();
}
  
  function viewClient() 
  {
	  alert("view client");
	  var table=document.getElementById("table_client");
	  table.innerHTML="";
	  
	     var row=table.insertRow();
		 var cell1=row.insertCell(0); 
		 var cell2=row.insertCell(1); 
		 var cell3=row.insertCell(2); 
		 var cell4=row.insertCell(3); 
		 var cell5=row.insertCell(4); 
		 
		 cell1.innerHTML="Client Id";
		 cell2.innerHTML="Client Name";
		 cell3.innerHTML="Client Logo";
		 cell4.innerHTML=" Edit";
		 cell5.innerHTML=" Delete";
		 
      var req= new XMLHttpRequest();
      req.open("GET","viewClient",true);
     alert("send")
      req.send();
     //alert("send")
     
     req.onreadystatechange=function()
     {
    	 if(req.readyState==4 && req.status==200)
    		 {
    		 alert("in if")
    		 var clist=JSON.parse(req.responseText);
    		 alert(clist)
    		 //var table=document.getElementById("");
    		 for(var i=0;i<clist.length;i++)
    			 {
    			 var row=table.insertRow();
    			 var cell1=row.insertCell(0); 
    			 var cell2=row.insertCell(1); 
    			 var cell3=row.insertCell(2); 
    			 var cell4=row.insertCell(3); 
    			 var cell5=row.insertCell(4); 
    			 
    			 cell1.innerHTML=clist[i].clientId;
    			 cell2.innerHTML=clist[i].clientName;
    			 cell3.innerHTML=clist[i].clientLogo;
    			 /* cell4.innerHTML='<input type="button" onClick="editClient('+clist[i].clientId+')" value="Edit">';
    			 cell5.innerHTML='<input type="button" onClick="deleteClient('+clist[i].clientId+')" value="Delete">'; */
    			 
    			 var edit = document.createElement("input");
 				edit.setAttribute("type", "button");
 				edit.setAttribute("class", "btn btn-success");
 				edit.setAttribute("data-toggle", "modal");
 				edit.setAttribute("data-target", "#myModal");
 				//edit.setAttribute("onclick", "editClient('"+ JSON.stringify(clist[i]) + "')");
 				edit.setAttribute("onclick", "editClient('" + clist[i].clientId+ "')");
 				edit.setAttribute("value", "Edit");

 				var del = document.createElement("input");
 				del.setAttribute("type", "button");
 				del.setAttribute("class", "btn btn-success");
 				del.setAttribute("onclick", "deleteClient('" + clist[i].clientId+ "')");
 				del.setAttribute("value", "Delete");

 				cell4.appendChild(edit);
 				cell5.appendChild(del);
    		
    			 }
    		 }
     }
 }
  
  
 function deleteClient(clientId)
 {
		alert(clientId);		 
		var req = new XMLHttpRequest();
		req.open("GET", "deleteClient?clientId="+clientId, true);
		req.send();
		
		req.onreadystatechange = function()
		{
			if (req.readyState == 4 && req.status == 200)
			{
				alert("res del");
				viewClient();
				
			}
		} 
 }
 
 function editClient(clientId)
 {
	 alert("edit called")
	 alert(clientId);
	var req=new XMLHttpRequest();
	 req.open("GET","editClient?clientId="+clientId,true);
	 req.send();
	 
	 req.onreadystatechange = function()
	 {
		 if(req.readyState==4 && req.status==200)
			 {
			 alert("res edit get")
			 alert(req.responseText)
			 var client = JSON.parse(req.responseText);
			 document.getElementById("clientid").value=client.clientId;
			 document.getElementById("clientname").value=client.clientName;
			 }
	 } 
 }
 
 function updateClient()
 {
	 alert("update called");
	 addClient();
	 viewClient();
 }
 

 function myFunction() {
   document.getElementById("table_client");
 }
  </script>
  </head>

  <body class="nav-md" onload="viewClient()">
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
                <h3>Form Elements</h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                  </div>
                </div>
              </div>
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Form Design <small>different form elements</small></h2>
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
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="clientId">Client Id <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="clientid" required="required" name="clientId" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="client-name">Client Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="clientname" required="required" name="clientName" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>

                      <!-- <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="client-logo">Client Logo <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type = "file" name = "file" size = "50" />
                          <br />
                          <input type = "submit" value = "Upload File" />
                        </div>
                      </div> -->
                     
                      
                      
                      
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button class="btn btn-primary" type="button" onclick="updateClient()">Update</button>
						  <button class="btn btn-primary" type="reset" >Reset</button>
                          <button type="button" class="btn btn-success" onclick="addClient()" >Submit</button>
                        </div>
                      </div>

                    </form>
                      <br><br><br>
                     
                      <a class="btn btn-app" onclick="myFunction()">
                        <span class="badge bg-purple">891</span>
                        <i class="fa fa-users"></i> Clients
                      </a>
                      
                      
                       
                    <div>
                      <table class="table table-bordered" id="table_client">
                        <thead class="thead-light">
                          <tr>
                            <th scope="col">#</th>
                            <th scope="col">Client Name</th>
                            <th scope="col">Client Logo</th>
                           <th scope="col">Edit</th>
                           <th scope="col">Delete</th>                    
                          </tr>
                        </thead>
                        
                        <!-- <tbody>
                          <tr>
                            <th scope="row">1</th>
                            <td>Tata</td>
                            <td>Otto</td>
                          </tr>
                          
                          <tr>
                            <th scope="row">1</th>
                            <td>Capgimini</td>
                            <td>Otto</td>
                          </tr>
                        </tbody> -->
                      </table>
                    </div>
                    
                    
                  </div>
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
    <!-- bootstrap-progressbar -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
    <!-- iCheck -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/icheck.min.js"></script>
    <!-- bootstrap-daterangepicker -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/moment/min/moment.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>
    <!-- bootstrap-wysiwyg -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-wysiwyg/js/bootstrap-wysiwyg.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jquery.hotkeys/jquery.hotkeys.js"></script>
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/google-code-prettify/src/prettify.js"></script>
    <!-- jQuery Tags Input -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/jquery.tagsinput/src/jquery.tagsinput.js"></script>
    <!-- Switchery -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/switchery/dist/switchery.min.js"></script>
    <!-- Select2 -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/select2/dist/js/select2.full.min.js"></script>
    <!-- Parsley -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/parsleyjs/dist/parsley.min.js"></script>
    <!-- Autosize -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/autosize/dist/autosize.min.js"></script>
    <!-- jQuery autocomplete -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/devbridge-autocomplete/dist/jquery.autocomplete.min.js"></script>
    <!-- starrr -->
    <script src="${pageContext.request.contextPath}/resources/portal/vendors/starrr/dist/starrr.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="${pageContext.request.contextPath}/resources/portal/build/js/custom.min.js"></script>
	
  </body>
</html>
  