package com.github.prkaspars.tasks;

import org.springframework.shell.Input;
import org.springframework.shell.InputProvider;

public class StringInputProvider implements InputProvider {

    private final String[] words;

    private boolean done;

    public StringInputProvider(String[] words) {
        this.words = words;
    }

    @Override
    public Input readInput() {
        if (!done) {
            done = true;
            return new ArrayInput(words);
        } else {
            return null;
        }
    }
}
