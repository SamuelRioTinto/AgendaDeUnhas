package ClassesDaAgenda.controller;

import ClassesDaAgenda.ContatoJaExisteException;
import ClassesDaAgenda.OperacoesDoSistema;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class AgendaAddController implements ActionListener {
    private OperacoesDoSistema operacoes;
    private JFrame janelaPrincipal;

    public AgendaAddController(OperacoesDoSistema operacoes, JFrame janela) {
        this.operacoes=operacoes;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do cliente");
        String telefone  =JOptionPane.showInputDialog(janelaPrincipal,
                "digite o seu numero de telefone");
        String cpf = JOptionPane.showInputDialog(janelaPrincipal,
                "digite seu cpf" );
        try {
            operacoes.cadastraCliente(nome,telefone,cpf);
            JOptionPane.showMessageDialog(janelaPrincipal,"foi cadastrato o cliente ");
        }catch (ContatoJaExisteException m){
            JOptionPane.showMessageDialog(janelaPrincipal,m.getMessage());
        }
    }
}
