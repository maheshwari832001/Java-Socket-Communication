•	Client-Server Socket Communication for Data Exchange 

Description

This project demonstrates client-server communication using Java sockets. It includes:
One-way communication: The client sends data to the server.
Two-way communication: The server processes and responds to the client's request.

Features

Establishes a connection between a client and server over a network.
Supports both one-way and two-way data exchange.
Implements basic input/output stream handling.
Demonstrates fundamental networking concepts in Java.


Code Overview

Server (ServerSoc.java)

Listens on a specific port (9999).
Accepts client connections.
Reads data from the client.
Sends a response back.

Client (Client.java)

Connects to the server on localhost.
Sends a message.
Receives and displays the server's response.

Technologies Used

Programming Language: Java
Networking: Java Sockets (TCP/IP)

Author
Maheshwari B
