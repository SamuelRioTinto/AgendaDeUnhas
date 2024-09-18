package ClassesDaAgenda.controller;


import ClassesDaAgenda.ContatoNaoExisteException;
import ClassesDaAgenda.OperacoesDoSistema;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaRemoveController implements ActionListener {

    private OperacoesDoSistema operacoes;
    private JFrame janelaPrincipal;

    public AgendaRemoveController (OperacoesDoSistema operacoes, JFrame janela) {
        this.operacoes = operacoes;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String cpf = JOptionPane.showInputDialog(janelaPrincipal,
                "digite o cpf da pessoa que sera removida");
        try {
            operacoes.removeContato(cpf);
            JOptionPane.showMessageDialog(janelaPrincipal, "contato removido com sucesso");
        } catch (ContatoNaoExisteException m) {
            JOptionPane.showMessageDialog(janelaPrincipal,m.getMessage());
        }
    }
}
