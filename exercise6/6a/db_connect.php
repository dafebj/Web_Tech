<?php
$servername = "localhost";  // Database server
$username = "root";         // Database username (default for XAMPP and many local setups)
$password = "xxxxx";             // Database password (default is empty for XAMPP)
$dbname = "time_travel";    // The database you created

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>
