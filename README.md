<h1 align="center">💬 Java Chat App</h1>

<p align="center">
A real-time chat system built using <b>Java Sockets</b> and <b>Multithreading</b>, inspired by modern messaging platforms like Discord.
</p>



<h2>📌 Overview</h2>

<p>
This project implements a <b>multithreaded client-server chat system</b> that enables multiple clients to communicate with each other in real-time through a central server.
</p>

<ul>
<li>⚡ Real-time messaging</li>
<li>🧵 Multithreaded server for handling multiple clients</li>
<li>🔌 TCP socket communication</li>
<li>💻 Command-line based client interface</li>
</ul>

<hr>

<p>

> Each client connects to the server using <b>TCP sockets</b>.  
The server creates a <b>separate thread</b> for every connected client, enabling simultaneous communication.
</p>

---

<h2>📂 Structure</h2>

<pre>
chatapp
│
├── client
│   ├── ChatClient.java
│   └── MessageListener.java
│
├── server
│   ├── ChatServer.java
│   └── ClientHandler.java
│
└── common
    └── Constants.java
</pre>

<hr>

<h2>⚙️ Technologies Used</h2>

<table>
<tr>
<th>Technology</th>
<th>Purpose</th>
</tr>

<tr>
<td>☕ Java</td>
<td>Core programming language</td>
</tr>

<tr>
<td>🌐 TCP Sockets</td>
<td>Network communication</td>
</tr>

<tr>
<td>🧵 Multithreading</td>
<td>Handling multiple clients simultaneously</td>
</tr>

<tr>
<td>💻 CLI</td>
<td>User interaction</td>
</tr>

</table>

---

<h2>🚀 How to Run</h2>

<h3>1️⃣ Compile the project</h3>

<pre>
javac common/*.java server/*.java client/*.java
</pre>

<h3>2️⃣ Start the server</h3>

<pre>
java server.ChatServer
</pre>

<h3>3️⃣ Start the client</h3>

<pre>
java client.ChatClient
</pre>

<p>
<b>Note:</b> Open multiple terminals and run the client program to simulate multiple users chatting simultaneously.
</p>

<hr>

<h2>📈 Future Improvements</h2>

<ul>
<li>👤 User authentication system</li>
<li>💬 Private messaging</li>
<li>🏠 Chat rooms / channels</li>
<li>📂 File sharing support</li>
<li>🎨 GUI using JavaFX or Swing</li>
<li>🗄️ Message history with database</li>
<li>🔐 End-to-end encryption</li>
</ul>

<hr>

<h2>📷 Output Example</h2>

<pre>
Client 1: Hello everyone!
Client 2: Hi! How are you?
Client 3: Welcome to the chat system.
</pre>

<hr><br>

> Create with 💙!