<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crop Details</title>
<style>
body{
text-align:center;
background-image:url("https://images.unsplash.com/photo-1625246333195-78d9c38ad449?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8b3JnYW5pYyUyMGZhcm1pbmd8ZW58MHx8MHx8&w=1000&q=80");
background-repeat: no-repeat;
background-attachment:fixed;
background-size:100% 100%;
font-weight:bold;

}
a{
   color:#FF0400;
   
}

</style>
</head>
<body>
<h1 style="color:white;font-size:20pt">Crop Details</h1>
<a href="/cropdetails/croplist">List Of Crops</a><br/>
<a href="/cropdetails/addcrop">Add Crops</a><br/>
<a href="/cropdetails/updatecrop">Update Crops</a><br/>
<a href="/cropdetails/deletecrop">Delete Crops</a><br/>
<a href="/cropdetails/getcropbyid">GetcropById</a><br/>
<a href="/cropdetails/getcropidbyfertilizer">Get Crop Id By Fertilizer</a><br/>
<h1 style="color:white;font-size:20pt">Crop Disease</h1>
<a href="/disease/alldiseaselist">List Of Disease</a><br/>
<a href="/disease/addnewdisease">Add new Disease</a><br/>
<a href="/disease/updatedisease">Update Disease</a><br/>
<a href="/disease/deletedisease">Delete Disease</a><br/>
<a href="/disease/getdiseasefindbyid">Get Disease Find By Id</a><br/>
<a href="/disease/getcropdiseasebydiseaseid">Get Crop Disease By Disease Id</a><br/>
<h1 style="color:white;font-size:20pt">Crop Disease Details</h1>
<a href="/cropdisease/viewallcropdiseaselist">List Of Crop Disease</a><br/>
<a href="/cropdisease/addaffectionstage">Add Affection Stage</a><br/>
<a href="/cropdisease/updateaffectingstage">Update Affecting Stage</a><br/>
<a href="/cropdisease/deleteaffectingstage">Delete Affecting Stage</a><br/>
<a href="/cropdisease/getaffectingstagebyid">Get Affecting Stage By Id</a><br/>
<h1 style="color:white;font-size:20pt">Fertilizer</h1>
<a href="/fertilizer/allfertilizerlist">List Of Fertilizer</a><br/>
<a href="/fertilizer/addfertilizer">Add Fertilizer</a><br/>
<a href="/fertilizer/updatefertilizer">Update Fertilizer</a><br/>
<a href="/fertilizer/deletefertilizer">Delete Fertilizer</a><br/>
<a href="/fertilizer/getfertilizer">Get Fertilizer By Id</a><br/>
<a href="/fertilizer/getfertilizeridbyfertilizer">Get Fertilizer Id By Fertilizer</a><br/>
<h1 style="color:white;font-size:20pt">Crop Fertilizer Details</h1>
<a href="/cropfertilizer/allcropfertilizerlist">List Of Fertilizer Details</a><br/>
<a href="/cropfertilizer/addquantityandstage">Add Quantity And Stage</a><br/>
<a href="/cropfertilizer/updatequantityandstage">Update Quantity And Stage</a><br/>
<a href="/cropfertilizer/deletequantityandstage">Delete Quantity And Stage</a><br/>
<a href="/cropfertilizer/getquantityandstagebyid">Get Quantity And Stage By Id</a><br/>
</body>
</html>