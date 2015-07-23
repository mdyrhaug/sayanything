<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="menu">
	<form:form action="newEntry.mb" method="post" modelAttribute="newSay" onsubmit="postForm(); return;" id="sayForm" class="well">
		<div class="form-group">
    		<label for="name">Your Name</label>
    		<form:input path="name" placeholder="Your Name" class="form-control" name="name" required="required"/>
  		</div>
		<div class="form-group">
    		<label for="location">Your Location</label>
    		<form:input path="location" placeholder="Your Location" class="form-control" name="location" required="required"/>
    	</div>
    	<textarea class="summernote" id="sayEditor" name="say" rows="4" placeholder="enter your text"></textarea>
		 <!--  <div class="summernote" id="sayEditor"></div>  -->
		<button class="btn btn-success" type="submit" id="submitButton">Say It!</button>
	</form:form>
</div>

<script>
 function postForm() {
	 var say=$("#sayEditor").code();
	 $("#sayEditor").val(say);
 }
</script>