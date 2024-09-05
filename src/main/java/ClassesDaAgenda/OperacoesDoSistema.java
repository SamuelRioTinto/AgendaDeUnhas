package ClassesDaAgenda;

public interface OperacoesDoSistema {

    public  boolean cadastraCliente(String nome,String telefone,String cpf)throws ContatoJaExisteException;

    public  Cliente pesquisaContato(String cpf)throws ContatoNaoExisteException;

    public  boolean existeContato(String cpf);

    public  boolean removeContato(String cpf)throws ContatoNaoExisteException;

    public  void EscoliaDeAtendimento(Cliente cliente,int opcaoDeAtendimento);


}
