package ClassesDaAgenda.controller;

import ClassesDaAgenda.Cliente;
import ClassesDaAgenda.ContatoNaoExisteException;
import ClassesDaAgenda.OperacoesDoSistema;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class AgendaSearchController implements ActionListener {

    private OperacoesDoSistema operacoes;;
    private JFrame janelaPrincipal;

    public AgendaSearchController(OperacoesDoSistema operacoes, JFrame janela) {
        this.operacoes=operacoes;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String cpf = JOptionPane.showInputDialog(janelaPrincipal, "digite o cpf da pessoa que deseja encontrar");

        try{
            Cliente cliente=operacoes.pesquisaContato(cpf);
            JOptionPane.showMessageDialog(janelaPrincipal,"contato: "+cliente+" foi encontrado");
        }catch (ContatoNaoExisteException m){
            JOptionPane.showMessageDialog(janelaPrincipal,m.getMessage());

        }


    }



}
