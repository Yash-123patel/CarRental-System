<%@page import="com.carRent.Bean.ConfirmBookingBean"%>
<%@page import="com.carRent.Bean.BiillBean"%>
<%
    Object obj=request.getAttribute("bookingDetails");
    ConfirmBookingBean cbb=(ConfirmBookingBean)obj;
%>
<html>
<head>
    <title>Car Booking Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
           
            background-image: url("CarRentBack.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.9);
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            color: #333;
           
            animation: slideInDown 1s ease-out;
        }
        @keyframes slideInDown {
            0% {
                transform: translateY(-50px);
                opacity: 0;
            }
            100% {
                transform: translateY(0);
                opacity: 1;
            }
        }
        .booking-details {
            margin: 20px 0;
        }
        .booking-details div {
            margin: 10px 0;
        }
        .booking-details div span {
            font-weight: bold;
        }
        .confirm-button {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            margin-top: 20px;
            border: none;
            cursor: pointer;
           
            transition: background-color 0.3s ease;
        }
        .confirm-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <form action="confirmBooking" method="POST">
        <div class="container">
            <img src="logo.jpg" alt="Car Rental Logo" style="width: 100px; height: auto; margin-bottom: 20px;">
            <h1>Confirm Your Car Booking</h1>
            <div class="booking-details">
                <div>
                    <span>Car ID:</span> <%=cbb.getCarid() %>
                </div>
                <div>
                    <span>Car Model:</span> <%=cbb.getCarName() %>
                </div>
                <div>
                    <span>Person Name:</span> <%=cbb.getPersonName() %>
                </div>
                <div>
                    <span>Aadhar No:</span> <%=cbb.getAadharNo() %>
                </div>
                <div>
                    <span>Pick-Up Date:</span> <%=cbb.getBookingDate() %>
                </div>
                <div>
                    <span>Drop-Off Date:</span> <%=cbb.getDropDate() %>
                </div>
                <div>
                    <span>Pick-Up Location:</span> <%=cbb.getLocation() %>
                </div>
                <div>
                    <span>License No:</span> <%=cbb.getLicenseNo() %>
                </div>
                <div>
                    <span>Per Day Charges:</span> <%=cbb.getPerDayCharge() %>
                </div>
            </div>
            <input type="submit" class="confirm-button" value="Confirm Booking">
        </div>
    </form>
</body>
</html>
