package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private final String text;
    private final String letter;

    public Text(final String text, final String letter) {
        this.text = text;
        this.letter = letter;
    }

    public final String getWordsFromText() {
        List<String> words = new ArrayList<>();
        String regex = "(?<=^|\\.)\\S+\\s+(" + letter + "\\S*)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            words.add(matcher.group(1));
        }
        return String.join(" ", words);

    }

    public static void main(final String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Text <text> <letter>");
            return;
        }
        String text = args[0];
        String letter = args[1];

        Text texts = new Text(text, letter);
        String result = texts.getWordsFromText();
        System.out.println(result);
    }


}



