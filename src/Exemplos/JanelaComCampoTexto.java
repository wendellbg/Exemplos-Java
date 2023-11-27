package Exemplos;
import java.awt.*;
import javax.swing.*;
public class JanelaComCampoTexto extends JFrame {
    JTextField txtNome = new JTextField(null, 20); //Aqui você vai criar um campo do tipo texto para o nome
    JTextField txtEndereco = new JTextField(null, 30); //Aqui você vai criar um campo do tipo texto para o endereço
    JButton btnGravar = new JButton("Gravar"); //Aqui você vai criar o objeto botão Gravar
    JButton btnFechar = new JButton("Fechar"); //Aqui você vai criar o objeto botão Fechar
    //Aqui está o método construtor, não esquece disso hein!
    public JanelaComCampoTexto() {
        setLayout(new FlowLayout()); //posiciona os componentes um após o outro
        getContentPane().add(txtNome); //Adiciona o campo Nome
        getContentPane().add(txtEndereco); //Adiciona o campo Endereço
        getContentPane().add(btnGravar); //Adiciona o botão Gravar
        getContentPane().add(btnFechar); //Adiciona o botão Fechar
        setBounds(150,150,800,500); //Aqui você define a posição e o tamanho da janela ao mesmo tempo
        setTitle("Janela com Botão"); //Aqui você define o título da janela
        setVisible(true); //Aqui você mostra a janela na tela

    }
    public static void main(String[] args) {
        JanelaComCampoTexto janela = new JanelaComCampoTexto(); //Cria o objeto janela com campo texto e botão
    }
}

