<%@ page import = "jared.simpledatabase.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
  <link rel="stylesheet" href="styles.css"></link>
</head>
<body>
<form action="saveTodo" action="post">
<pre>
<h2 >create a todo </h2>

<input
name="task"
type="text"
placeholder="enter to-do"
style=" position: absolute;
                                                                  width: 560px;
                                                                  height: 300px;
                                                                  border: solid black 1px;
                                                                  margin-top: 80px;"/>

<input type="submit" value="save"/>
</pre>
</form>
<a href="/todo">show all Todos</a>
</body>