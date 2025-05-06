package nl.infosupport.swagshop;


import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChatModel model = OpenAiChatModel.builder()
                .modelName(OpenAiChatModelName.GPT_4_O)

                .apiKey("")
                .build();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Jij: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            var answer = model.chat(input);
            System.out.println("Bot: " + answer);
        }

        scanner.close();
    }
}