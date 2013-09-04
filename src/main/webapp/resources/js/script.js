function TeamCtrl($scope, $http, $templateCache) {

  var url = 'http://localhost:8080/angularjs/team/';
  var url2 = 'http://localhost:8080/angularjs/team/all';
 
  $scope.getTeam = function() {
    $scope.code = null;
    $scope.response = null;
 
    $http({method:'GET', url: url +  $scope.name , cache: $templateCache}).
      success(function(data, status) {
        $scope.status = status;
        $scope.team = data;
      }).
      error(function(data, status) {
        $scope.data = data || "Request failed";
        $scope.status = status;
    });
  };
  
  $scope.getAllTeam = function() {
	    $scope.code = null;
	    $scope.response = null;
	 
	    $http({method:'GET', url: url2 , cache: $templateCache}).
	      success(function(data, status) {
	        $scope.status = status;
	        $scope.teams = data;
	      }).
	      error(function(data, status) {
	        $scope.data = data || "Request failed";
	        $scope.status = status;
	    });
	  };
 

}