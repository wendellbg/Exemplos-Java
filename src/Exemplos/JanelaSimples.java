package Exemplos;
import javax.swing.*;
public class JanelaSimples {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Clientes");
        JButton botao = new JButton("Aperte aqui");
        JLabel rotulo = new JLabel("Clique no botão");
        JPanel painel = new JPanel();
        painel.add(botao);
        painel.add(rotulo);
        janela.getContentPane().add(painel);
        janela.setBounds(100,100,400,300);
        janela.setVisible(true);
    }
}
