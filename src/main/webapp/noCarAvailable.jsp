<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>No Cars Available</title>
    <style>
        body {
            font-family: Arial, sans-serif;
             background: url("CarRentBack.jpg");
              background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
           
            padding: 20px;
            border-radius: 10px;
              background-color: rgba(255, 255, 255, 0.9); 
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h1 {
            color: #d9534f;
        }
        .details {
            margin: 20px 0;
        }
        .button {
            display: inline-block;
            padding: 10px 20px;
            color: #fff;
            background-color: #0275d8;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #025aa5;
        }
    </style>
</head>
<body>
    <div class="container">
     <img src="logo.jpg" alt="Car Rental Logo" style="width: 100px; height: auto; margin-bottom: 20px;">
        <h1>No Cars Available</h1>
        <div class="details">
            <p>We are sorry, but there are no cars available for the selected CarID.</p>
            <p>Please try adjusting your search criteria or come back later.</p>
        </div>
        <a href="availableCars.html" class="button">Go Back to Search</a>
    </div>
</body>
</html>
