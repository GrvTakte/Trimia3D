<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<meta charset="ISO-8859-1">
<title>Trimia3D</title>

<script type="text/javascript">
$('#password, #confirm_password').on('keyup', function () {
	  if ($('#password').val() == $('#confirm_password').val()) {
	    $('#message').html('Matching').css('color', 'green');
	  } else 
	    $('#message').html('Not Matching').css('color', 'red');
	});
</script>

</head>
<body>

<form action="register1">
<pre>
	Name: <input type="text" name="providerMasterName" required>
	Contact: <input type="number" name="providerMasterContact" required>
	Email: <input type="email" name="providerMasterEmail" required>
	<label>password :
  <input name="password" id="password" type="password" />
</label>
<br>
<label>confirm password:
  <input type="password" name="confirm_password" id="confirm_password" />
  <span id='message'></span>
</label>
	
	<input type="submit" value="register">
</pre>
</form>
</body>
</html>