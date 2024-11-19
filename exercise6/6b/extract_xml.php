<?php
// Load the XML file
$xml = simplexml_load_file('data.xml') or die("Error: Cannot create object");

// Loop through each destination and display its details
foreach ($xml->destination as $destination) {
    echo "<h2>" . $destination->name . "</h2>";
    echo "<p>" . $destination->description . "</p>";
}
?>
