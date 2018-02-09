angular.module('demo', [])
.controller('Hello', 
	function($scope, $http) {
    
    $scope.input1=0;
    $scope.input2=0;
    $scope.add=function(){
    	
    	 $http.get('http://127.0.0.1:9000/add/'+$scope.input1+'/'+$scope.input2).
         then(function(response) {
             $scope.value = response.data;
         }
         
         );
    }
    
    $scope.sub=function(){
    	
   	 $http.get('http://127.0.0.1:9006/sub/'+$scope.input1+'/'+$scope.input2).
        then(function(response) {
            $scope.value = response.data;
        }
        
        );
   }
    
    
    
    $scope.div=function(){
    	
   	 $http.get('http://127.0.0.1:9002/div/'+$scope.input1+'/'+$scope.input2).
        then(function(response) {
            $scope.value = response.data;
        }
        
        );
   }
    
    
    $scope.mul=function(){
    	
      	 $http.get('http://127.0.0.1:9004/mul/'+$scope.input1+'/'+$scope.input2).
           then(function(response) {
               $scope.value = response.data;
           }
           
           );
      }
    
    
    
});