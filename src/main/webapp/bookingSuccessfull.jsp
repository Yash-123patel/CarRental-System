<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Booking Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
         
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
           
            background-image: url("CarRentBack.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            text-align: center;
            animation: fadeIn 0.5s ease-out;
        }
        @keyframes fadeIn {
            0% {
                opacity: 0;
                transform: translateY(-20px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }
        h1 {
            color: #4CAF50;
            margin-bottom: 10px;
            animation: slideInDown 0.5s ease-out;
        }
        @keyframes slideInDown {
            0% {
                opacity: 0;
                transform: translateY(-20px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }
        .details {
            margin: 20px 0;
            animation: slideInUp 0.5s ease-out;
        }
        @keyframes slideInUp {
            0% {
                opacity: 0;
                transform: translateY(20px);
            }
            100% {
                opacity: 1;
                transform: translateY(0);
            }
        }
        .details p {
            margin: 5px 0;
        }
        .button {
            display: inline-block;
            padding: 10px 20px;
            color: #fff;
            background-color: #4CAF50;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <img src="logo.jpg" alt="Car Rental Logo" style="width: 100px; height: auto; margin-bottom: 20px;">
        <h1>Booking Successful!</h1>
        <h1>Collect Your Rented Car at Your City Bus Stand</h1>
        <div class="details">
            <% Object obj=request.getAttribute("username"); %>
            <p>Thank you, <%= (String)obj %> </p>
            <p>Enjoy Your Day</p>
        </div>
        <a href="homePage.html" class="button">Go to Home</a>
    </div>
</body>
</html>
