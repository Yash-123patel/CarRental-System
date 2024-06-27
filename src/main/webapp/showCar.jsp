<%@page import="com.carRent.Bean.ShowCarBean"%>
<%@page import="com.carRent.Bean.BiillBean"%>
<% 
    Object car = request.getAttribute("yourCar");
    ShowCarBean shb=(ShowCarBean)car;
 
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            background: url("CarRentBack.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            background-color: rgba(255, 255, 255, 0.9); 
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .bill-details {
            margin: 20px 0;
        }
        .bill-details p {
            font-size: 18px;
            margin: 10px 0;
        }
        .total {
            font-weight: bold;
            font-size: 20px;
            text-align: right;
            margin-top: 20px;
        }
        .form-container {
            display: flex;
            justify-content: center;
            margin-top: 30px;
        }
        .form-container input[type="submit"] {
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border: none;
            background-color: #333;
            color: #fff;
            border-radius: 5px;
        }
        .button {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            font-size: 16px;
            color: #fff;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
   <form action="pay" method="POST">
    <div class="container">
     <img src="logo.jpg" alt="Car Rental Logo" style="width: 100px; height: auto; margin-bottom: 20px;">
        <h1>Car Details</h1>
        <div class="bill-details">
            <p><strong>Car ID: </strong><%=shb.getCarid() %></p>
            <p><strong>PersonName: </strong><%=shb.getPersonName()%></p>
            <p><strong>Aadhar No: </strong> <%=shb.getAadharNo()%></p>
             <p><strong>Booking Date: </strong><%=shb.getBookingDate()%></p>
            <p><strong>Droping Date: </strong> <%=shb.getDropingDate()%></p>
    
  
        </div>
        <div class="form-container">
               <a href="loginOption.html" class="button">GoBack</a>

        </div>
    </div>
   </form>
</body>
</html>
