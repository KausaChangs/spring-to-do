<%@ page import = "jared.simpledatabase.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<form action="saveTodo" action="post">
<pre>
<h2 >create a todo </h2>
<input name="task" type="text" placeholder="enter to-do"/>
<input type="submit" value="save"/>
</pre>
</form>
<a href="/todo">show all Todos</a>
