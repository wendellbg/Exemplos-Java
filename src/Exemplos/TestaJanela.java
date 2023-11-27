package Exemplos;
import javax.swing.*;
public class TestaJanela {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de clientes");
        janela.setBounds(150,150,700,500);
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
    }
}
