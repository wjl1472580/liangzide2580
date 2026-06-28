package com.jichi.springai.functionCall;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class WeatherTools {

    @Tool(description = "获取城市天气")
    public String getWeather(@ToolParam(description = "城市名称") String city) {
        return "【" + city + "】天气：晴，25度，微风";
    }
}