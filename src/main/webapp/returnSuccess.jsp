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
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
             background: url("CarRentBack.jpg");
              background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh;
        }
        .container {
          
            border-radius: 8px;
            background-color: rgba(255, 255, 255, 0.9); 
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 30px;
            text-align: center;
            width: 80%;
            max-width: 600px;
        }
        h1 {
            color: #007bff;
            font-size: 2em;
            margin-bottom: 20px;
        }
        p {
            color: #555;
            line-height: 1.6;
        }
        .message {
            color: #28a745;
            font-style: italic;
            margin-top: 20px;
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
        .footer {
            margin-top: 30px;
            color: #888;
        }
        .footer a {
            color: #007bff;
            text-decoration: none;
            font-weight: bold;
        }
        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Car Return Successful!</h1>
        
        <p>Thank you for returning the car.</p>
        
        <p class="message">Consider renting again for your future travels.</p>
        
        <p>If you have any questions, please contact our <a href="mailto:support@example.com">support team</a>.</p>
        
        <a href="homePage.html" class="btn">Go to Home</a>
        
        <div class="footer">
            <p>Need more help? <a href="homePage.html">Contact us</a></p>
        </div>
    </div>
</body>
</html>
