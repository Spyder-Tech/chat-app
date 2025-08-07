/**
    This configuration sets up WebSocket support with STOMP protocol in a Spring Boot application.
    Clients connect to the /chat endpoint, with SockJS fallback support.
    The server uses a simple in-memory broker to handle messages sent to destinations starting with /topic.
    Messages from clients intended for server processing should be sent to destinations starting with /app.
 */

package com.chat.chat_app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * Configuration class to set up WebSocket with STOMP protocol for the chat application.
 */
@Configuration
// Enable WebSocket message handling, backed by a message broker
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer
{
    /**
     * Register STOMP endpoints that clients will use to connect to the WebSocket server.
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry)
    {
        // Add an endpoint at "/chat" for WebSocket connection
        registry.addEndpoint("/chat")
                // Allow cross-origin requests from the specified origin
                .setAllowedOrigins("http://localhost:8080")
                // Enable SockJS fallback options for browsers that don’t support WebSocket
                .withSockJS();
    }

    /**
     * Configure message broker options.
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry)
    {
        // set message broker
        // Enable a simple in-memory message broker that will carry messages prefixed with "/topic"
        // Clients subscribe to these destinations to receive messages
        registry.enableSimpleBroker("/topic");

        // Set prefix for messages sent from clients to server that should be routed to message-handling methods
        // For example, messages sent to "/app/sendmessage" will be routed to appropriate controllers
        registry.setApplicationDestinationPrefixes("/app");
    }
}