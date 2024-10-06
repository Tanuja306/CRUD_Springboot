<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


<table border="1px" class="table">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Number</th>
<th>Password</th>
<th>Gender</th>
<th>state</th>
<th>filename</th>
<th>skill</th>
<th>Action</th>
</tr>

<c:forEach items="${temp}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.email}</td>
<td>${e.pass}</td>
<td>${e.number}</td>
<td>${e.gender}</td>
<td>${e.state}</td>
<td>${e.skill}</td>
<td><img src="/images/${e.filename}" height="100px" width="50px"></td>

<td>
<a href="deldata/${e.id}" class="btn btn-danger">Delete</a>
<a href="editdata/${e.id}" class="btn btn-primary">Edit</a>
</td>

</tr>
</c:forEach>
</table>