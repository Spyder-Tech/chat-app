/**
 It defines a Spring MVC Controller named ChatController.
 When a WebSocket client sends a message to the /sendMessage endpoint, the sendMessage() method receives it and broadcasts it to all subscribers of /topic/messages.
 When a user navigates to the /chat URL via a GET request, the chat() method returns the view named chat, which presumably is the chat interface page.
 */

package com.chat.chat_app.controller;

// Import necessary classes and annotations
import com.chat.chat_app.model.ChatMessage; // Model representing chat messages
import org.springframework.messaging.handler.annotation.MessageMapping; // Annotation for mapping messages
import org.springframework.messaging.handler.annotation.SendTo; // Annotation for broadcasting messages
import org.springframework.stereotype.Controller; // Indicates this class is a Spring MVC controller
import org.springframework.web.bind.annotation.GetMapping; // Annotation for mapping GET requests

@Controller // Marks this class as a Spring MVC Controller
public class ChatController
{

    /**
     * Handles incoming chat messages sent to the "/sendMessage" endpoint.
     * @param message The ChatMessage object received from the client.
     * @return The same ChatMessage object, which will be broadcasted to subscribers.
     */
    @MessageMapping("/sendMessage") // Maps messages sent to "/sendMessage"
    @SendTo("/topic/messages") // Broadcasts the return value to all subscribers of "/topic/messages"
    public ChatMessage sendMessage(ChatMessage message)
    {
        // Simply returns the received message to be sent to subscribed clients
        return message;
    }

    /**
     * Handles HTTP GET request to "/chat" URL.
     * @return The name of the view (e.g., chat.html) to render.
     */
    @GetMapping("chat") // Maps GET requests for "/chat"
    public String chat()
    {
        // Returns the name of the view/template to display for the chat page
        return "chat";
    }
}