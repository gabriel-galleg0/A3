package a3;
import entidades.Cliente;



public class GerenciadorCliente {
    private  Cliente[] clientes;
    private int fila;
    private int proximoId =1;

    /**
     * Método Construtor com Cliente e fila
     * @param clientes
     * @param fila 
     */
    public GerenciadorCliente(Cliente[] clientes, int fila) {
        this.clientes = clientes;
        this.fila = fila;
    }
    
        //Método Construtor
    public GerenciadorCliente(int filaInicial) {
        this.clientes = new Cliente[filaInicial];
        this.fila = 0;
    }
    
  
    
 
        //Método que irá inserir o Cliente
    public void inserirCliente(Cliente novoCliente){  
        novoCliente.setId(proximoId++);
        if (fila == clientes.length){
        reiniciarLista();
        }
        clientes[fila++] = novoCliente;
        
    }
   
    /**
     * Método que cria um novo array de clientes utilizando o array anterior *2 mantendo os dados que já foram salvos 
     */
    private void reiniciarLista(){
    Cliente[] novoArray = new Cliente[clientes.length*2];
    for (int i = 0; i< clientes.length; i++){
    novoArray[i] = clientes[i];
    }
    clientes = novoArray;
    }
    
   
    
    
        /**
         * Método privativo para buscar o indice referente no array para usar quando for criado o método de excluir cliente
         * @param id
         * @return 
         */
    private int buscarIndiceClientePorId(int id){
        for (int i = 0; i<fila; i++){
            if(clientes[i].getId()==id){
        return i;
        }
    }
    return -1;
  }
    
        //Método para excluir o cliente utilizando o indice do array que criamos anteriormente   
    public void excluirClientePorId(int id){
    int indice = buscarIndiceClientePorId(id);
    if (indice != -1){
    for (int i = indice; i < fila -1; i++){
    clientes[i] = clientes[i +1];
    }
    fila--;
   }   
  }
 
        //Método para Buscar o cliente pelo id
    public Cliente buscarClientePorId(int id){
    int indice = buscarIndiceClientePorId(id);
    if(indice != -1){
    return clientes[indice];
    }
    return null;
    }
    
//Método que atualiza todos os dados
   public void atualizarCliente(int id, String nome, String cpf, String telefone, String endereco, String nivel) {
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            if (nome != null && !nome.isEmpty()) cliente.setNome(nome);
            if (cpf != null && !cpf.isEmpty()) cliente.setCpf(cpf);
            if (telefone != null && !telefone.isEmpty()) cliente.setTelefone(telefone);
            if (endereco != null && !endereco.isEmpty()) cliente.setEndereco(endereco);
            if (nivel != null && !nivel.isEmpty()) cliente.setNivel(nivel);
        }
    }
        //Método para atualizar algum atributo do cliente a partir do Id dele
    public void atualizarIndividualPorId(int id, String atributo, String atribuir){
    int indice = buscarIndiceClientePorId(id);
    
    if(indice != -1){
        switch(atributo){
            case "nome":
                clientes[indice].setNome(atribuir);
                break;
            case "cpf":
                clientes[indice].setCpf(atribuir);
                break;
            case "Telefone":
                clientes[indice].setTelefone(atribuir);
                break;
            case "nivel":
                clientes[indice].setNivel(atribuir);
                break;
            case "Endereco":
                clientes[indice].setEndereco(atribuir);
                break;
            default:
                System.out.println("Atributo não existe");
                    
        }
    
    }
    
    }
    
        //Método para listar todos os clientes cadastrados
      public void listaDeClientes(){
      for(int i = 0; i <fila; i++){
          System.out.println(clientes[i].getId() + " - " + clientes[i].getNome());
      }
      
      }
      
        public Cliente[] getClientes() {
        Cliente[] clientesAtivos = new Cliente[fila];
        System.arraycopy(clientes, 0, clientesAtivos, 0, fila);
        return clientesAtivos;
    }
    /**
     * Método que gera a lista com todos os clientes para aparecer no JOptionPane
     * @return 
     */
    public String gerarListaClientes() {
    StringBuilder lista = new StringBuilder();
    if (fila > 0) {
        for (int i = 0; i < fila; i++) {
            lista.append(clientes[i].getId()).append(" - ").append(clientes[i].getNome()).append("\n");
        }
    } else {
        lista.append("Nenhum cliente encontrado.");
    }
    return lista.toString();
}

}

      