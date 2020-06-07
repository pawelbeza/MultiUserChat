# MultiUserChat
MultiUserChat is desktop chat application written in java using [multithreading](https://en.wikipedia.org/wiki/Multithreading_(computer_architecture)) 
and [socket](https://en.wikipedia.org/wiki/Network_socket) programming using [TCP/IP](https://en.wikipedia.org/wiki/Internet_protocol_suite).

Application was written for Event-Driven Programming Course which covered topics related to writing interactive, multi threaded appliactions in Java.

----
# [System design](https://en.wikipedia.org/wiki/Systems_design)
System design of application can be represented by following diagram

![design](https://user-images.githubusercontent.com/43823276/83977161-a3b61480-a8fe-11ea-9ee5-938677cf5424.png)

In the above design we have one centralized **server** which handles multiple users. When **user** connects successfully to the **server**
for the first time it gets its own **thread** which will handle its future queries.

Moreover **server** is connected to [MySQL](https://en.wikipedia.org/wiki/MySQL) **database** which keeps user data such as: login, password and username.

----
# Showcase
![Showcase](https://user-images.githubusercontent.com/43823276/83978092-5e491580-a905-11ea-8dd1-cca3304a02ff.gif)

