package com.zsq.testwebsocket.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Component
public class WebsocketTextHandler extends TextWebSocketHandler {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void handlerTextMessage(WebSocketSession session, TextMessage message) throws IOException {

        //得到message里面的数据
        String payload = message.getPayload();
        //打印输出数据
        logger.info("receive msg: {}", payload);

        //把数据打包成websocket发送出去
        session.sendMessage(new TextMessage("hi websocket"));

    }


}
