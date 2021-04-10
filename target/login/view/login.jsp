<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>

<div class="login-page">
  <div class="form">
    <form class="login-form" action="LoginAction.action">
      <input type="text" placeholder="username" required="" name="userName" />
      <input type="password" placeholder="password" required="" name="password"/>
      <input id="button" type="submit" value="Log in" />
    </form>
  </div>
</div>

</body>
</html>