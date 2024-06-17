package a3;

import entidades.Funcionarios;



public class GerenciadorFunc {
    private  Funcionarios[] funcionarios;
    private int fila;
    private int proximoId =1;

    /**
     * Método Construtor com Cliente e fila
     * @param clientes
     * @param fila 
     */
    public GerenciadorFunc(Funcionarios[] funcionarios, int fila) {
        this.funcionarios = funcionarios;
        this.fila = fila;
    }
    
        //Método Construtor
    public GerenciadorFunc(int filaInicial) {
        this.funcionarios = new Funcionarios[filaInicial];
        this.fila = 0;
    }
    
  
    
 
        //Método que irá inserir o Cliente
    public void inserirCliente(Funcionarios novoFuncionarios){  
        novoFuncionarios.setId(proximoId++);
        if (fila == funcionarios.length){
        reiniciarLista();
        }
        funcionarios[fila++] = novoFuncionarios;
        
    }
   
    /**
     * Método que cria um novo array de clientes utilizando o array anterior *2 mantendo os dados que já foram salvos 
     */
    private void reiniciarLista(){
    Funcionarios[] novoArray = new Funcionarios[funcionarios.length*2];
    for (int i = 0; i< funcionarios.length; i++){
    novoArray[i] = funcionarios[i];
    }
    funcionarios = novoArray;
    }
    
   
    
    
        /**
         * Método privativo para buscar o indice referente no array para usar quando for criado o método de excluir cliente
         * @param id
         * @return 
         */
    private int buscarIndiceFuncPorId(int id){
        for (int i = 0; i<fila; i++){
            if(funcionarios[i].getId()==id){
        return i;
        }
    }
    return -1;
  }
    
        //Método para excluir o cliente utilizando o indice do array que criamos anteriormente   
    public void excluirFuncPorId(int id){
    int indice = buscarIndiceFuncPorId(id);
    if (indice != -1){
    for (int i = indice; i < fila -1; i++){
    funcionarios[i] = funcionarios[i +1];
    }
    fila--;
   }   
  }
 
        //Método para Buscar o cliente pelo id
    public Funcionarios buscarFuncPorId(int id){
    int indice = buscarIndiceFuncPorId(id);
    if(indice != -1){
    return funcionarios[indice];
    }
    return null;
    }
    
//Método que atualiza todos os dados
   public void atualizarFunc(int id,String nome, String cpf, String telefone, String endereco, String cargo) {
        Funcionarios funcionarios = buscarFuncPorId(id);
        if (funcionarios != null) {
            if (nome != null && !nome.isEmpty()) funcionarios.setNome(nome);
            if (cpf != null && !cpf.isEmpty()) funcionarios.setCpf(cpf);
            if (telefone != null && !telefone.isEmpty()) funcionarios.setTelefone(telefone);
            if (endereco != null && !endereco.isEmpty()) funcionarios.setEndereco(endereco);
            if (cargo != null && !cargo.isEmpty()) funcionarios.setCargo(cargo);
        }
    }
        //Método para atualizar algum atributo do cliente a partir do Id dele
    public void atualizarIndividualPorId(int id, String atributo, String atribuir){
    int indice = buscarIndiceFuncPorId(id);
    
    if(indice != -1){
        switch(atributo){
            case "nome":
                funcionarios[indice].setNome(atribuir);
                break;
            case "cpf":
                funcionarios[indice].setCpf(atribuir);
                break;
            case "Telefone":
                funcionarios[indice].setTelefone(atribuir);
                break;
            case "nivel":
                funcionarios[indice].setCargo(atribuir);
                break;
            case "Endereco":
                funcionarios[indice].setEndereco(atribuir);
                break;
            default:
                System.out.println("Atributo não existe");
                    
        }
    
    }
    
    }
    
        //Método para listar todos os clientes cadastrados
      public void listaDeFunc(){
      for(int i = 0; i <fila; i++){
          System.out.println(funcionarios[i].getId() + " - " + funcionarios[i].getNome());
      }
      
      }
      
        public Funcionarios[] getClientes() {
        Funcionarios[] funcionariosAtivos = new Funcionarios[fila];
        System.arraycopy(funcionarios, 0, funcionariosAtivos, 0, fila);
        return funcionariosAtivos;
    }
    /**
     * Método que gera a lista com todos os clientes para aparecer no JOptionPane
     * @return 
     */
    public String gerarListaFunc() {
    StringBuilder lista = new StringBuilder();
    if (fila > 0) {
        for (int i = 0; i < fila; i++) {
            lista.append(funcionarios[i].getId()).append(" - ").append(funcionarios[i].getNome()).append("\n");
        }
    } else {
        lista.append("Nenhum cliente encontrado.");
    }
    return lista.toString();
}

}

      