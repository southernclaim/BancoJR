package helper_classes;

import com.mycompany.gerenciadebanco.Cliente;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class OnClickEventHelper {

    public static void setOnClickColor(JButton button, Color pressedColor, Color originalColor) {
    button.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                button.setContentAreaFilled(false);
                button.setBackground(pressedColor);
                button.setOpaque(true);
                button.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setBackground(originalColor);
                button.repaint();
            }
        });
        
    }
    public static void perguntarValorSaque(JButton button, Cliente cliente, JLabel textosaldo) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String valorDigitado = JOptionPane.showInputDialog("Quanto deseja sacar?");
                int valorInt = 0;
                try {
                    valorInt = Integer.parseInt(valorDigitado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número inteiro.");
                    return;
                }
                cliente.sacar(valorInt);
                textosaldo.setText("Saldo: " + cliente.getSaldo());
            }
        });
    }
    public static void perguntarValorDeposito(JButton button, Cliente cliente, JLabel textosaldo) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String valorDigitado = JOptionPane.showInputDialog("Quanto deseja depositar?");
                int valorInt = 0;
                try {
                    valorInt = Integer.parseInt(valorDigitado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número inteiro.");
                    return;
                }
                cliente.depositar(valorInt);
                textosaldo.setText("Saldo: " + cliente.getSaldo());
            }
        });
    }

}