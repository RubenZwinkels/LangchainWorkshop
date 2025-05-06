package nl.infosupport.swagshop;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import dev.langchain4j.service.AiServices;

public class Configuration {

    static Assistant assistant() {
        return AiServices.builder(Assistant.class)
                .chatModel(OpenAiChatModel.builder()
                        .apiKey("sk-pro-10CIj2oroBwOOuF4h9HytXtMEa0kb85xMb-LQM0ck3ApMgA")
                        .modelName(OpenAiChatModelName.O3_MINI)
                        .build())
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }
}
