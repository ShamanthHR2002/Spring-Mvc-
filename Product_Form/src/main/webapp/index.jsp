<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f9f9f9;
            margin: 0;
            font-family: Arial, sans-serif;
        }

        /* Navbar Styling */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
            border: none;
            background-color: #2c3e50;
        }

        .navbar-inverse .navbar-brand {
            color: #ecf0f1;
            font-size: 1.5rem;
            font-weight: bold;
        }

        .navbar-inverse .navbar-brand:hover {
            color: #f39c12;
        }

        .navbar-header {
            text-align: center;
            width: 100%;
        }

        .navbar-brand {
            display: inline-block;
            float: none;
        }

        /* Hover effect for brand */
        .navbar-brand:hover {
            text-shadow: 0 0 5px #f1c40f;
        }

        /* Background Styling */
        .content {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 90vh;
        }

        .content h1 {
            font-size: 3rem;
            color: #34495e;
            text-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            margin: 0;
        }

        /* Footer Styling */
        footer {
            background-color: #2c3e50;
            color: #ecf0f1;
            text-align: center;
            padding: 1rem 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="Product.jsp">Product Form</a>
            </div>
        </div>
    </nav>

    <!-- Content -->
    <div class="content">
        <h1>Welcome to the Product Form</h1>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>
