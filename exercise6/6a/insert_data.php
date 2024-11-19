<?php
include 'db_connect.php';  // Make sure this path is correct

// Insert data into the table
$sql = "INSERT INTO destinations (name, description) 
        VALUES ('Victorian Era', 'A time period characterized by innovation and change in England.')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
