package com.github.prkaspars.tasks;

import org.springframework.shell.Input;

import java.util.List;

public class ArrayInput implements Input {
    private final String[] words;

    public ArrayInput(String[] words) {
        this.words = words;
    }

    @Override
    public String rawText() {
        return String.join(" ", words);
    }

    @Override
    public List<String> words() {
        return List.of(words);
    }
}
