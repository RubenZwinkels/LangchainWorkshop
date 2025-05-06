package nl.infosupport.swagshop;


import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;

public class Main {
    public static void main(String[] args) {
        ChatModel model = OpenAiChatModel.builder()
                .modelName(OpenAiChatModelName.O3_MINI)
                .apiKey("")
                .build();

        var answer = model.chat("Hello World! Greetings from Info Support!");

        System.out.println(answer);
    }
}