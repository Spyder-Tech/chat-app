Real-Time Chat Room Application

This project is a real-time chat room application built with a modern Java backend and a responsive web frontend. It enables users to join chat rooms and communicate instantly using WebSocket technology. The application leverages Spring Boot for server-side logic, WebSocket with STOMP protocol for real-time messaging, and Thymeleaf for server-rendered views. The frontend uses JavaScript, Bootstrap, and related libraries to provide a seamless user experience.

Features

    Real-time messaging with WebSocket
    Multiple chat rooms
    User-friendly interface
    Server-rendered views with Thymeleaf
    Responsive design with Bootstrap
    Easy to deploy and extend

Technologies

Backend:

    Spring Boot: Simplifies Java backend development
    Spring WebSocket & Spring Messaging: Implements WebSocket communication with STOMP protocol
    Thymeleaf: Server-side template engine for rendering views
    Maven: Build and dependency management

Frontend:

    Thymeleaf: Server-rendered templates
    JavaScript (ES6): Client-side scripting
    SockJS & STOMP.js: WebSocket fallback and messaging protocol
    HTML & CSS: Structure and styling
    Bootstrap: Responsive UI components

Prerequisites

    Java Development Kit (JDK) 11 or higher
    Maven 3.6 or higher
    Node.js (optional, if customizing frontend scripts)
    Modern web browser

Setup & Installation
Clone the repository

          

git clone https://github.com/yourusername/realtime-chat-room.git
cd realtime-chat-room

      

Backend setup

Make sure Java and Maven are installed.
Build the project:

    mvn clean install

      

Run the application:

          

    mvn spring-boot:run

      

The server will start on http://localhost:8080.
Frontend setup

Since Thymeleaf templates are embedded within the backend, no separate frontend build is necessary. You can customize the templates and static assets in the src/main/resources/templates and src/main/resources/static directories.

Usage

    Launch the application.
    Open your browser and navigate to http://localhost:8080.
    Join or create chat rooms.
    Send messages in real-time to other participants.

Customization & Extensibility

    Modify chat room logic in backend controllers.
    Customize UI by editing Thymeleaf templates and static assets.
    Integrate authentication if needed.
    Extend messaging features (e.g., private messages, message history).

License

This project was developed based on a tutorial, and is intended for educational purposes. It is provided as-is with no warranties. Feel free to use and modify this code for personal learning or non-commercial projects.

Note: This repository does not have an official license. If you wish to use or distribute this code, please do so responsibly, acknowledging its origin.

Enjoy building and chatting with your real-time chat app!
