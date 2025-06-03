package com.mycompany.gerenciadebanco;
import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class GerenciaDeBanco{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String sobrenome = JOptionPane.showInputDialog("Qual o seu sobrenome?");
        String cpf = JOptionPane.showInputDialog("Qual o seu cpf? (123.456.789-00");
        Cliente cliente = new Cliente(nome, sobrenome, cpf);
        JFrame tela = new JFrame("Banco JR");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(678, 365);
        tela.setResizable(false);
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(Color.decode("#f4c064"));
        JLabel nomedoapp = new JLabel("Banco JR");
        nomedoapp.setBounds(25, 13, 121, 26);
        nomedoapp.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 25));
        nomedoapp.setForeground(Color.decode("#000"));
        painel.add(nomedoapp);

    final JLabel textosaldo = new JLabel("Saldo: " + String.valueOf(cliente.getSaldo()));
    textosaldo.setBounds(44, 276, 180, 32);
    textosaldo.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 22));
    textosaldo.setForeground(Color.decode("#000"));
    painel.add(textosaldo);

    JButton sacar = new JButton("Sacar");
     sacar.setBounds(514, 261, 106, 30);
     sacar.setBackground(Color.decode("#bca8e4"));
     sacar.setForeground(Color.decode("#000"));
     sacar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     sacar.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     sacar.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(sacar, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     OnClickEventHelper.perguntarValorSaque(sacar, cliente, textosaldo);
     painel.add(sacar);

      JButton depositar = new JButton("Depositar");
     depositar.setBounds(514, 191, 106, 30);
     depositar.setBackground(Color.decode("#bca8e4"));
     depositar.setForeground(Color.decode("#000"));
     depositar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     depositar.setBorder(new RoundedBorder(4, Color.decode("#3d364a"), 1));
     depositar.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(depositar, Color.decode("#7c6f97"), Color.decode("#bca8e4"));
     OnClickEventHelper.perguntarValorDeposito(depositar, cliente, textosaldo);
     painel.add(depositar);

    JLabel textodeposito = new JLabel("Deposito");
     textodeposito.setBounds(514, 171, 106, 18);
     textodeposito.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     textodeposito.setForeground(Color.decode("#000"));
     painel.add(textodeposito);

     JLabel textosacar = new JLabel("Saque");
     textosacar.setBounds(514, 239, 106, 18);
     textosacar.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     textosacar.setForeground(Color.decode("#000"));
     painel.add(textosacar);

     JLabel textonome = new JLabel(nome + " " + sobrenome);
     textonome.setBounds(27, 58, 167, 23);
     textonome.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     textonome.setForeground(Color.decode("#000"));
     painel.add(textonome);

     JLabel textocpf = new JLabel(cpf);
     textocpf.setBounds(28, 77, 158, 18);
     textocpf.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
     textocpf.setForeground(Color.decode("#000"));
     painel.add(textocpf);

     tela.add(painel);
     tela.setVisible(true);
    
            
           
                   // double valorDeposito = scanner.nextDouble();
                  //  cliente.depositar(valorDeposito);
               //     break;
                
                 //  // double valorSaque = scanner.nextDouble();
               //     cliente.sacar(valorSaque);
               
            }
        }