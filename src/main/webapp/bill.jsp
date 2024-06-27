<%@page import="com.carRent.Bean.BiillBean"%>
<% 
    Object bill = request.getAttribute("bill");
    BiillBean bib = (BiillBean) bill;
    double total = (double) request.getAttribute("total");
    HttpSession hs=request.getSession();
    hs.setAttribute("profile", bib);
 
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
            background-color: #f4f4f4;
           
            background-image: url("CarRentBack.jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
         
            animation: fadeIn 1s ease-out;
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
        .container {
            max-width: 800px;
            margin: 50px auto;
            background-color: rgba(255, 255, 255, 0.9);
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            border-radius: 8px;
           
            transition: box-shadow 0.3s ease;
        }
        h1 {
            text-align: center;
            color: #333;
            margin-top: 0;
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
           
            transition: background-color 0.3s ease;
        }
        .form-container input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <form action="pay" method="POST">
        <div class="container">
         <img src="logo.jpg" alt="Car Rental Logo" style="width: 100px; height: auto; margin-bottom: 20px;">
            <h1>Bill Details</h1>
            <div class="bill-details">
                <p><strong>Bill No:</strong><%=1001 %></p>
                <p><strong>FullName</strong><%=bib.getName() %></p>
                <p><strong>Aadhar No:</strong> <%=bib.getAadharNo() %></p>
                <p><strong>License No:</strong> <%=bib.getLicenseNo() %></p>
                <p><strong>Car ID:</strong><%=bib.getCarId() %> </p>
                <p><strong>Car Name:</strong><%=bib.getCarName() %> </p>
                <p><strong>Number of Days:</strong><%=bib.getTotalDays() %> </p>
                <p><strong>Extra Number of Days:</strong><% int days=bib.getExtraDays();
                if(days<0)days=0; out.print(days);%> </p>
                <p><strong>Per Day Charge:</strong><%=bib.getPerDayCharge() %> </p>
                <p class="total"><strong>Total Amount:</strong> <%= total %></p>
            </div>
            <div class="form-container">
                    <input type="submit" value="Payment">
            </div>
        </div>
       </form>
</body>
</html>
