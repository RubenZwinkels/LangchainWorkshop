package nl.infosupport.swagshop;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import dev.langchain4j.service.AiServices;

public class Configuration {

    static Assistant assistant() {
        return AiServices.builder(Assistant.class)
                .chatModel(OpenAiChatModel.builder()
                        .apiKey("")
                        .modelName(OpenAiChatModelName.O3_MINI)
                        .build())
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }
}
