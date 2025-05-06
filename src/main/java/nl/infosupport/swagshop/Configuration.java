package nl.infosupport.swagshop;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import dev.langchain4j.service.AiServices;
import nl.infosupport.swagshop.model.Token;

public class Configuration {

    static Assistant assistant() {
        return AiServices.builder(Assistant.class)
                .chatModel(OpenAiChatModel.builder()
                        .apiKey(new Token().getToken())
                        .modelName(OpenAiChatModelName.GPT_4_O)
                        .build())
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .systemMessageProvider((var x) -> "Je bent de chatbot voor de Info Support swag shop, een digitale winkel! Houdt antwoorden vriendelijk maar kort en je antwoord in het nederlands")
                .build();
    }
}
