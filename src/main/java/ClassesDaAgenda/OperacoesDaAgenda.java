package ClassesDaAgenda;

import java.util.HashMap;
import java.util.Objects;

public class OperacoesDaAgenda implements OperacoesDoSistema {

    private HashMap<String,Cliente> ListaDeClientes;

    public OperacoesDaAgenda(){
        this.ListaDeClientes=new HashMap<>();
    }


    public boolean cadastraCliente(String nome, String telefone, String cpf) throws ContatoJaExisteException {
        if(ListaDeClientes.containsKey(cpf)){
            throw new ContatoJaExisteException("Conta ja esta cadastrado no sistema ");
        }
        Cliente cliente=new Cliente(nome,telefone,cpf,null);
        ListaDeClientes.put(cpf,cliente);
        return true;
    }

    public  Cliente pesquisaContato(String cpf)throws ContatoNaoExisteException{
        if(ListaDeClientes.containsKey(cpf)){
            Cliente cliente=this.ListaDeClientes.get(cpf);
            return cliente;
        }
        throw new ContatoNaoExisteException("o cliente nao existe no sistema ");
    }

    public boolean removeContato(String cpf)throws ContatoNaoExisteException{
        if(ListaDeClientes.containsKey(cpf)){
            ListaDeClientes.remove(cpf);
            return true;
        }
        throw new ContatoNaoExisteException("o cliente nao existe no sistema ");
    }

    public boolean EscolhaDeAtendimento(String cpf, EnumMes mes, EnumDia dia, String horario, EnumTipoAtendimento atendimento, double preco){
        Atendimento TipoAtendimento=new Atendimento(mes, dia, horario, atendimento, preco);
        Cliente cliente=this.ListaDeClientes.get(cpf);
        cliente.setAtendimento(TipoAtendimento);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperacoesDaAgenda that = (OperacoesDaAgenda) o;
        return Objects.equals(ListaDeClientes, that.ListaDeClientes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ListaDeClientes);
    }
}
