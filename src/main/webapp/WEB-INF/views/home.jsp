<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<!doctype html>
<html ng-app>
  <head>
	<script src="http://code.angularjs.org/1.1.4/angular.min.js"></script>
    <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.1.4/angular-resource.js"></script>
    <script src="/angularjs/resources/js/script.js"></script>
    <title>Home</title>
  </head>
  <body>
  <P>  The time on the server is ${serverTime}. </P>
    <div ng-controller="TeamCtrl">
      <select ng-model="name">
        <option>PE</option>
        <option>URU</option>
        <option>All</option>
      </select>
      
      
      <button ng-click="getTeam()">obtener datos equipo</button><br>
      <pre>
      	Estadisticas del Equipo  : {{team.name}} , {{team.pj}}      	
      
      </pre>
      <button ng-click="getAllTeam()">obtener datos todos equipo</button><br>
      <pre>
      	<ul class="unstyled">
	        <li ng-repeat="team in teams">          
	          <span >{{team.name}} , {{team.pj}} </span>
	        </li>
      	</ul>  	
      
      </pre>
      
      <pre>http status code: {{status}}</pre>
    </div>
  </body>
</html>