package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaConversor extends JPanel {
    protected JTabbedPane tabbedPane1;
    protected JPanel panel1;
    protected JTabbedPane tabbedPane2;
    protected JButton converterMoedaButton;
    protected JButton converterTemperaturaButton;
    protected JComboBox comboBox1;
    protected JComboBox comboBox2;
    protected JComboBox comboBox3;
    protected JComboBox comboBox4;
    protected JTextField textField1;
    protected JTextField textField2;

    protected ConversorMoeda conversorMoeda = new ConversorMoeda();
    protected ConversorTemperatura conversorTemperatura = new ConversorTemperatura();

    public JanelaConversor() {
        converterMoedaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String moedaOrigem = comboBox1.getSelectedItem().toString();
                String moedaDestino = comboBox2.getSelectedItem().toString();
                double valor = Double.parseDouble(textField1.getText());

                double resultado = conversorMoeda.converter(moedaOrigem, moedaDestino, valor);
                String resultadoFormatado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, "O resultado da conversão é: " + resultadoFormatado);
            }
        });

        converterTemperaturaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temperaturaOrigem = comboBox3.getSelectedItem().toString();
                String temperaturaDestino = comboBox4.getSelectedItem().toString();
                double valor = Double.parseDouble(textField2.getText());

                double resultado = conversorTemperatura.converter(temperaturaOrigem, temperaturaDestino, valor);
                String resultadoFormatado = String.format("%.2f", resultado);
                JOptionPane.showMessageDialog(null, "O resultado da conversão é: " + resultadoFormatado);
            }
        });
    }

}
