package com.github.prkaspars.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.shell.Shell;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    private final Shell shell;

    @Autowired
    public MyCommandLineRunner(Shell shell) {
        this.shell = shell;
    }

    @Override
    public void run(String... args) throws Exception {
        shell.run(new StringInputProvider(args));
    }
}
