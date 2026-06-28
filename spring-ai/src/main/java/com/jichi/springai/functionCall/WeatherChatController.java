package com.jichi.springai.functionCall;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherChatController {

    private final ChatClient chatClient;
    private final WeatherTools weatherTools;

    // 构造方法注入
    public WeatherChatController(ChatClient.Builder builder, WeatherTools weatherTools) {
        this.chatClient = builder.build();
        this.weatherTools = weatherTools;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        // 重点：工具在这里注册！不在builder里注册！
        return chatClient.prompt()
                .user(message)
                .tools(weatherTools)  // 这行是关键！
                .call()
                .content();
    }
}