package src;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JanelaConversor janela = new JanelaConversor();
        janela.add(janela.panel1);
        JFrame conversor = new JFrame("Challenge Conversor");
        conversor.setContentPane(janela);
        conversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        conversor.pack();
        conversor.setLocationRelativeTo(null);
        conversor.setVisible(true);
    }
}