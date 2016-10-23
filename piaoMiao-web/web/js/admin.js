var router = angular.module("piaoMiao-app",["ui.router"]);
router.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise("/main");
    $stateProvider
        .state("main",{
            url:"/main",
            templateUrl:"views/defaultMain.html"
        }).state("carparkMonitor",{
            templateUrl:"views/carparkMonitor.html"
        }).state("chargeRecord",{
            templateUrl:"views/chargeRecord.html"
        }).state("inOutRecord",{
            templateUrl:"views/inOutRecord.html"
        }).state("deviceSignRecord",{
            templateUrl:"views/deviceSignRecord.html"
        });
})


