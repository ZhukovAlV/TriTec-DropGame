package com.company.game;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Сперва создается панель
        MyPanel panel = new MyPanel();
        // Затем окно
        new GameWindow(panel);
    }


}
