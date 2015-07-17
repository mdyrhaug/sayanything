<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/summernote.css">    
    <link rel="stylesheet" href="css/sayanything.css">
    <link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">    
</head>
<body>
<div class="row">
   <div class="col-xs-12">
       <tiles:insertAttribute name="header" />
   </div>
</div>
<div class="row">
   <div class="col-md-4">
       <tiles:insertAttribute name="menu" />
   </div>
   <div class="col-md-8" id="body">
      <tiles:insertAttribute name="body" />
   </div>
</div>
<div class="row">
   <div class="col-xs-12" id="footer">
      <tiles:insertAttribute name="footer" />
   </div>
</div>
    <script src="js/jquery-1.11.3.min.js"></script> 
    <script src="js/bootstrap.js"></script>  
    <script src="js/summernote.min.js"></script>    
    <script src="js/sayanything.js"></script>
    <script>
         $(document).ready(function() {
	         $('.summernote').summernote();
	     });
</script>
</body>
</html>