function sendData() {
    // Get a reference to the HTML element where you want to display the data
    var outputElement = document.getElementById("output");

    // Data you want to send
    var data = "Hello, this is data from JavaScript.";

    // Update the content of the HTML element with the data
    outputElement.textContent = data;
}