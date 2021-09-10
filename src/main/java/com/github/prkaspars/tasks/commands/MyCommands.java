package com.github.prkaspars.tasks.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent()
public class MyCommands {

    @ShellMethod(value = "Echo stuff", key = "echo")
    public String echo(String text) {
        return "echoing " + text;
    }
}
