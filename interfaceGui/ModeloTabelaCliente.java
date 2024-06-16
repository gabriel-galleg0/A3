
package interfaceGui;

import entidades.Cliente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gabri
 */
public class ModeloTabelaCliente extends AbstractTableModel {
    
    private static Cliente[] clientes;
    public static String[] colunas = {"ID", "Nome","CPF", "Endereço", "Telefone", "Nível" };
    
    public ModeloTabelaCliente(){
    this.clientes = new Cliente[0];
}

    @Override
    public int getRowCount() {
        return clientes.length;
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes[rowIndex];
        
       switch(columnIndex){
           case 0: return cliente.getId();
            case 1: return cliente.getNome();
            case 2: return cliente.getCpf();
            case 3: return cliente.getEndereco();
            case 4: return cliente.getTelefone();
            case 5: return cliente.getNivel();
            default: return null;
       }
    }
    
     public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
        fireTableDataChanged();
    }
    
}
