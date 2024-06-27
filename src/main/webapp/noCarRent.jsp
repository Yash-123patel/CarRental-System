<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Return Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
           background: url("CarRentBack.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            margin: 0;
            padding: 20px;
        }
        .container {
           
            border-radius: 8px;
            background-color: rgba(255, 255, 255, 0.9); 
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 30px;
            width: 80%;
            max-width: 600px;
            margin: 20px auto;
        }
        h1 {
            color: #007bff;
            margin-bottom: 20px;
        }
        p {
            color: #555;
            line-height: 1.6;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>You don't have Any Rented Car On This ID!</h1>
       
      
        <p>First Rent the Car </p>
        
        <p class="message">Consider renting  for your future travels.</p>
        
        <a href="loginOption.html" class="btn">Rent A Car</a>
    </div>
</body>
</html>
