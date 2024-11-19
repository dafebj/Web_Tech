<?php
include 'db_connect.php';  // Include the database connection file

// Fetch data from the database
$sql = "SELECT id, name, description FROM destinations";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // Output data for each row
    while($row = $result->fetch_assoc()) {
        echo "ID: " . $row["id"]. " - Name: " . $row["name"]. " - Description: " . $row["description"]. "<br>";
    }
} else {
    echo "0 results";
}

$conn->close();
?>
