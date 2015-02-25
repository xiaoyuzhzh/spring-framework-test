//package org.iceberg.config;
//
//import org.iceberg.controllers.MyHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//@Configuration
//@EnableWebSocket
//public class WebSocketConfig implements WebSocketConfigurer {
//
//	public void registerWebSocketHandlers(WebSocketHandlerRegistry arg0) {
//		// TODO Auto-generated method stub
//		registry.addHandler(myHandler(), "/myHandler");
//	}
//	
//	@Bean
//	public WebSocketHandler myHandler() {
//	 return new MyHandler();
//	}
//	
//	
//}