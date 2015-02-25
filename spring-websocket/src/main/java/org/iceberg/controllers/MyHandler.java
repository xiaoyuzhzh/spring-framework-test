package org.iceberg.controllers;
import java.io.IOException;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler {
	 @Override
	 public void handleTextMessage(WebSocketSession session, TextMessage message) {
		 System.out.println("进入myhandler了");
		 System.out.println(session.getRemoteAddress()+" info:  "+message.getPayload());
		 try {
			session.sendMessage(new TextMessage("这个是返回的信息。"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
}