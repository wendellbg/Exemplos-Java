package Exemplos;
import java.awt.*;
import javax.swing.*;
public class JanelaCadastro extends JFrame{
    JLabel rtNome = new JLabel("Nome");
    JLabel rtEndereco = new JLabel("Endereço");
    JTextField txtNome = new JTextField(null, 20); //Aqui você vai criar um campo do tipo texto para o nome
    JTextField txtEndereco = new JTextField(null, 30); //Aqui você vai criar um campo do tipo texto para o endereço
    JButton btnGravar = new JButton("Gravar"); //Aqui você vai criar o objeto botão Gravar
    JButton btnFechar = new JButton("Fechar"); //Aqui você vai criar o objeto botão Fechar
    public JanelaCadastro() {
        setLayout(new GridLayout(4,2)); //Aqui a disposição dos componentes é em grade
        getContentPane().add(rtNome);
        getContentPane().add(txtNome);
        getContentPane().add(rtEndereco);
        getContentPane().add(txtEndereco);
        getContentPane().add(btnGravar);
        getContentPane().add(btnFechar);
        setSize(100,100);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        JanelaCadastro cadastro = new JanelaCadastro();
    }
}
