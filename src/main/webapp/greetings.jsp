<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>See You Soon!</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: url("CarRentBack.jpg");
             background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            text-align: center;
            max-width: 400px;
            padding: 30px;
            border-radius: 8px;
             background-color: rgba(255, 255, 255, 0.9); 
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
            line-height: 1.6;
            color: #666;
            margin-bottom: 30px;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        .btn:hover {
            background-color: #0056b3;
        }
        footer {
            margin-top: 20px;
            font-size: 14px;
            color: #888;
        }
    </style>
</head>
<body>
    <div class="container">
     <img src="logo.jpg" alt="Car Rental Logo" style="width: 100px; height: auto; margin-bottom: 20px;">
        <h1>Thank You for Driving with Us!</h1>
        <p>We appreciate you choosing our car rental service.</p>
        <p>Your journey with us was a pleasure. Safe travels!</p>
        <p>Come back anytime to explore more cars and offers.</p>
        <a href="homePage.html" class="btn">Back to Home</a>
        
    </div>
</body>
</html>
