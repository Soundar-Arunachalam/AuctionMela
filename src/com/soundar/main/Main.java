package com.soundar.main;
import java.awt.EventQueue;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("English", "IN"));
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                new Login();

            }
        });
    }
}
