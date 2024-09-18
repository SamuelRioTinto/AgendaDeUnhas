package ClassesDaAgenda;

public interface OperacoesDoSistema {

    public  boolean cadastraCliente(String nome,String telefone,String cpf)throws ContatoJaExisteException;

    public  Cliente pesquisaContato(String cpf)throws ContatoNaoExisteException;

    public  boolean removeContato(String cpf)throws ContatoNaoExisteException;

    public boolean EscolhaDeAtendimento(String cpf, EnumMes mes, EnumDia dia, String horario, EnumTipoAtendimento atendimento, double preco);


}
