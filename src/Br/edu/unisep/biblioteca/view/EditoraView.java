package Br.edu.unisep.biblioteca.view;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

    public class EditoraView {
        public void exibir() {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SwingUtilities.invokeLater(()->{
                try{
                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            });


            JFrame janela = new JFrame("Editora");
            janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            janela.setSize(500, 300);
            janela.setLayout(new BorderLayout());

            JPanel painel = new JPanel(new GridLayout(3, 2, 10, 10));
            painel.setBackground(Color.WHITE);

            JLabel codigo = new JLabel("Código:");
            codigo.setForeground(Color.BLACK);
            codigo.setFont(new Font("Times New Roman", Font.BOLD, 20));
            painel.add(codigo);

            JTextField textCodigo = new JTextField(5);
            painel.add(textCodigo);

            JLabel nome = new JLabel("Nome:");
            nome.setForeground(Color.BLACK);
            nome.setFont(new Font("Times New Roman", Font.BOLD, 20));
            painel.add(nome);

            JTextField textNome = new JTextField(5);
            painel.add(textNome);

            JLabel cidade = new JLabel("Cidade:");
            cidade.setForeground(Color.BLACK);
            cidade.setFont(new Font("Times New Roman", Font.BOLD, 20));
            painel.add(cidade);

            JTextField textCidade = new JTextField(5);
            painel.add(textCidade);

            JPanel botoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
            JButton salvar = new JButton("Salvar");
            botoes.add(salvar);

            JButton sair = new JButton("Sair");
            botoes.add(sair);

            janela.add(painel, BorderLayout.CENTER);
            janela.add(botoes, BorderLayout.SOUTH);

            janela.setVisible(true);
        }
}
