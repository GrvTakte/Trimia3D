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
	  
    <title>Gentelella Alela! | </title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/iCheck/skins/flat/green.css" rel="stylesheet">
    <!-- bootstrap-wysiwyg -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/google-code-prettify/bin/prettify.min.css" rel="stylesheet">
    <!-- Select2 -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/select2/dist/css/select2.min.css" rel="stylesheet">
    <!-- Switchery -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/switchery/dist/switchery.min.css" rel="stylesheet">
    <!-- starrr -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/starrr/dist/starrr.css" rel="stylesheet">
    <!-- bootstrap-daterangepicker -->
    <link href="${pageContext.request.contextPath}/resources/portal/vendors/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath}/resources/portal/build/css/custom.min.css" rel="stylesheet">

<script type="text/javascript">
  function readURLLogoCompany(input) {
      if (input.files && input.files[0]) {
          var reader = new FileReader();

          reader.onload = function (e) {
              $('#blah')
                  .attr('src', e.target.result)
                  .width(50)
                  .height(75);
          };

          reader.readAsDataURL(input.files[0]);
      }
  }
  
 function viewCompanyList()
 {
	 alert("view company list function"); 
	 var req= new XMLHttpRequest();
     req.open("POST","viewCompanyList",true);
     req.send();
     
     alert("send");
     
	 var table1=document.getElementById("tablecompany");
	 req.onreadystatechange=function()
	 {
		 if(req.readyState==4 && req.status==200)
			 {
			 alert("hiii");
			 alert(req.responseText);
			 var companylist= JSON.parse(req.responseText);
			 alert("jdjshd")
			 alert(companylist);
			  for(var i=0;i<companylist.length;i++)
				 {
				 	alert("in for loop")
				  	var row=table1.insertRow();
				 	var cell1=row.insertCell(0);
				 	var cell2=row.insertCell(1);
				 	var cell3=row.insertCell(2);
				 	var cell4=row.insertCell(3);
				 	var cell5=row.insertCell(4);
				 	var cell6=row.insertCell(5);
				 	
				 	cell1.innerHTML=companylist[i].providerCompanyMasterId;
				 	cell2.innerHTML=companylist[i].providerCompanyMasterName;
				 	cell3.innerHTML=companylist[i].providerCompanyMasterAddress;
				 //	cell3.innerHTML=companylist[i].productSpecialization[i].specializationSubCategoryName;
				 	
				 	/*  var select=document.createElement("select");
				 	alert(companylist[i].productSpecialization[i].length);
				 	
				 	for(var j=0;j<companylist[i].productSpecialization[i].length;j++)
					 { 
				 		alert("jjj");
				 		alert(companylist[i].productSpecialization[j].specializationSubCategoryName);
				 		
				 	//cell3.innerHTML="<select><option>"+companylist[i].productSpecialization[j].specializationSubCategoryName+"</option></select>";
				 		
						
				 		 var option=document.createElement("option");
				 		option.text=companylist[i].productSpecialization[j].specializationSubCategoryName;
						select.appendChild(option);	
						
					 } 
				 	cell3.appendChild(select);  */
				 	
				 	var view = document.createElement("input");
				 	view.setAttribute("type", "button");
				 	view.setAttribute("class", "btn btn-success");
				 	view.setAttribute("data-toggle", "modal");
				 	view.setAttribute("data-target", ".bs-example-modal-lg");
				 	view.setAttribute("onclick", "viewCompany('" + companylist[i].providerCompanyMasterId+ "')");
				 	view.setAttribute("value", "View");
	 				
				 	var edit = document.createElement("input");
	 				edit.setAttribute("type", "button");
	 				edit.setAttribute("class", "btn btn-success");
	 				edit.setAttribute("data-toggle", "modal");
	 				edit.setAttribute("data-target", "#myModal");
	 				//edit.setAttribute("onclick", "editCompany('"+ JSON.stringify(clist[i]) + "')");
	 				edit.setAttribute("onclick", "editCompany('" + companylist[i].providerCompanyMasterId+ "')");
	 				edit.setAttribute("value", "Edit");

	 				var remove = document.createElement("input");
	 				remove.setAttribute("type", "button");
	 				remove.setAttribute("class", "btn btn-success");
	 				remove.setAttribute("onclick", "removeCompany('" + companylist[i].providerCompanyMasterId+ "')");
	 				remove.setAttribute("value", "Remove");

	 				cell4.appendChild(view);
	 				cell5.appendChild(edit);
	 				cell6.appendChild(remove); 
				 } 
			 }
	 } 
	 
 }
 
 
 function viewCompany(companyId)
 {
	 alert("view company");
	 alert(companyId);
	 var req=new XMLHttpRequest();
	 req.open("GET","viewCompanyById?companyId="+companyId,true);
	 req.send();
	 
	 req.onreadystatechange = function()
	 {
		 if(req.readyState==4 && req.status==200)
			 {
			 alert("res view company get")
			 alert(req.responseText)
			 var company = JSON.parse(req.responseText);
			 document.getElementById("company-id").value=company.providerCompanyMasterId;
			 document.getElementById("company-name").value=company.providerCompanyMasterName;
			 document.getElementById("company-address").value=company.providerCompanyMasterAddress;
			 document.getElementById("pancard").value=company.providerCompanyMasterPanCard;
			 document.getElementById("gst-no").value=company.providerCompanyMasterGstNumber;
			 document.getElementById("email").value=company.providerCompanyMasterEmail;
			 document.getElementById("contact").value=company.providerCompanyMasterContact;
			 document.getElementById("shoplicenenumber").value=company.providerCompanyMasterShopActLicenceNumber;
			 document.getElementById("website").value=company.providerCompanyMasterWebSite;
			 document.getElementById("openingTime").value=company.providerCompanyMasterOpeningTime;
			 document.getElementById("closingTime").value=company.providerCompanyMasterClosingTime;
			 document.getElementById("workingdays").value=company.providerCompanyMasterWorkingDays;
			 document.getElementById("keywords").value=company.keywords;
			 }
	 } 
 }
 
 function removeCompany(companyId)
 {
		alert(companyId);		 
		var req = new XMLHttpRequest();
		req.open("GET", "removeCompany?companyId="+companyId, true);
		req.send();
		
		req.onreadystatechange = function()
		{
			if (req.readyState == 4 && req.status == 200)
			{
				alert("res del");
				//viewClient();
				
			}
		} 
 }
</script>


 </head>

  <body class="nav-md" onload="viewCompanyList()">
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

             
            </div>
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  
                    <h2>Company List</h2>
                   
                    <div class="clearfix"></div>
                  
                  <div class="x_content">
                    <br />
                    <form id="viewCompany" data-parsley-validate class="form-horizontal form-label-left">

                      <div class="x_panel">
                  
                  <div class="x_content">

                    <table class="table table-striped" id="tablecompany">
                      <thead>
                        <tr>
                          <th>Company Id</th>
                          <th>Company Name</th>
                          <th>Company Specilization</th>
                          <th>View</th>
                          <th>Edit</th>
                          <th>Remove</th>
                        </tr>
                      </thead>
                     
                    </table>

<!-- modal -->

	<div id="modal">
                  <div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog modal-lg">
                      <div class="modal-content" style="width: 850px;margin-left:200px">

                        <div class="modal-header">
                          <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">�</span>
                          </button>
                          <h4 class="modal-title" id="myModalLabel">Company Details</h4>
                        </div>
                        <div class="modal-body" style="width: 850px;">
							<div class="col-md-6 col-sm-12 col-xs-12">
								<div class="x_panel" style="width: 800px;">
									
                  <div class="x_content">
                    <br />
                    <form class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Company Id:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="company-id" name="providerCompanyMasterId" class="form-control" data-inputmask="'mask': '99/99/9999'" readonly="readonly">
                        <!-- <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
					 <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Company Name:</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="company-name" name="providerCompanyMasterName" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Company Addresss</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="company-address" name="providerCompanyMasterAddress" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">PanCard No</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="pancard" name="providerCompanyMasterPanCard" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                     
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Gst Number</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="gst-no" name="providerCompanyMasterName" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                    
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Email address</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="email" name="providerCompanyMasterEmail" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Contact Number</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="contact" name="providerCompanyMasterContact" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                       <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Shop Act Licence Number</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="shoplicenenumber" name="providerCompanyMasterShopActLicenceNumber" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Website URL </label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="website" name="providerCompanyMasterWebSite" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Opening Time</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="openingTime" name="providerCompanyMasterOpeningTime" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Closing Time</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="closingTime" name="providerCompanyMasterClosingTime" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Working Days</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="workingdays" name="providerCompanyMasterWorkingDayStart" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
                        </div>
                      </div>
                      
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-3" style="text-align: start;">Keywords</label>
                        <div class="col-md-9 col-sm-9 col-xs-9">
                          <input type="text" id="keywords" name="keywords" class="form-control" data-inputmask="'mask' : '(999) 999-9999'" readonly="readonly">
                        <!--  <span class="fa fa-user form-control-feedback right" aria-hidden="true"></span>-->
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

<!-- modal -->




                  </div>
                </div>

                    </form> 
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
