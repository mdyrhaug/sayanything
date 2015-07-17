<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="menu">
	<form:form action="newEntry.mb" method="post" modelAttribute="newSay">
		<div class="form-group">
    		<label for="name">Your Name</label>
    		<form:input path="name" placeholder="Your Name" class="form-control" name="name"/>
  		</div>
		<div class="form-group">
    		<label for="location">Your Location</label>
    		<form:input path="location" placeholder="Your Location" class="form-control" name="location"/>
    	</div>
		 <div class="summernote">summernote 1</div>
		<button class="btn btn-success" type="submit" id="submitButton">Button</button>
	</form:form>
</div>
