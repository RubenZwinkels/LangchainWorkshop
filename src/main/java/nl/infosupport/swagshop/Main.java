package nl.infosupport.swagshop;


import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Assistant assistant = Configuration.assistant();
        String answer = assistant.chat("How many 'R' are in the word Strawberry?");

        System.out.println(answer);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Jij: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            var answer2 = assistant.chat(input);
            System.out.println("Bot: " + answer2);
        }

        scanner.close();
    }
}