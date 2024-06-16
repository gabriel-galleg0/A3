
package interfaceGui;

import a3.GerenciadorCliente;
import entidades.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class CadastrarClientes extends javax.swing.JFrame {
        private static GerenciadorCliente gerenciadorCliente = new GerenciadorCliente(10);
        private static ModeloTabelaCliente modeloTabela;

    /**
     * Creates new form CadastrarClientes
     */
    public CadastrarClientes() {
        initComponents();
        
        modeloTabela = new ModeloTabelaCliente();
        tbClientes.setModel(modeloTabela);
        atualizarTabela();
    }
    
     private void atualizarTabela(){
         if(gerenciadorCliente != null){
             modeloTabela.setClientes(gerenciadorCliente.getClientes());
         }
    
}

     private void limparCampos() {
        nomeField.setText("");
        telefoneField.setText("");
        cpfField.setText("");
        nivelField.setText("");
        enderecoField.setText("");
         
        
    }
     
     public boolean validaCampos(String nome, String cpf, String telefone, String endereco){
     if(nome.trim().isEmpty() || cpf.trim().isEmpty() || telefone.trim().isEmpty() || endereco.trim().isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos para cadastrar", "ERRO", HEIGHT);
         return false;
     }
     return true;
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        nomeLb = new javax.swing.JLabel();
        cpfLb = new javax.swing.JLabel();
        enderecoLb = new javax.swing.JLabel();
        telLb = new javax.swing.JLabel();
        nivelLb = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        cpfField = new javax.swing.JTextField();
        enderecoField = new javax.swing.JTextField();
        telefoneField = new javax.swing.JTextField();
        nivelField = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        voltarCadCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane.setViewportView(tbClientes);

        nomeLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeLb.setText("Insira o nome:");

        cpfLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfLb.setText("Insira o CPF: ");

        enderecoLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enderecoLb.setText("Insira o endereço:");

        telLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telLb.setText("Insira o Telefone: ");

        nivelLb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nivelLb.setText("Insira o Nível: ");

        nomeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cpfField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        enderecoField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        telefoneField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        nivelField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        voltarCadCliente.setBackground(new java.awt.Color(204, 0, 0));
        voltarCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        voltarCadCliente.setText("VOLTAR");
        voltarCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarCadClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltarCadCliente)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLb)
                            .addComponent(cpfLb)
                            .addComponent(enderecoLb)
                            .addComponent(telLb)
                            .addComponent(nivelLb))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nivelField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(btnCadastrar))
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nomeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(cpfField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(enderecoField, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLb)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLb)
                    .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecoLb)
                    .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telLb)
                    .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nivelLb)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nivelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(voltarCadCliente)
                .addGap(32, 32, 32)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = nomeField.getText().trim();
        String cpf = cpfField.getText().trim();
        String endereco = enderecoField.getText().trim();
        String telefone = telefoneField.getText().trim();
        String nivel = nivelField.getText().trim();
        
        
      if (validaCampos(nome, cpf, telefone, endereco)) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setCpf(cpf);
        novoCliente.setEndereco(endereco);
        novoCliente.setTelefone(telefone);
        novoCliente.setNivel(nivel);

        gerenciadorCliente.inserirCliente(novoCliente);
        atualizarTabela();
        limparCampos();
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void voltarCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarCadClienteActionPerformed
        TelaPrincipal tp = new TelaPrincipal();
        this.dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_voltarCadClienteActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField cpfField;
    private javax.swing.JLabel cpfLb;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JLabel enderecoLb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nivelField;
    private javax.swing.JLabel nivelLb;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLb;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tbClientes;
    private javax.swing.JLabel telLb;
    private javax.swing.JTextField telefoneField;
    private javax.swing.JButton voltarCadCliente;
    // End of variables declaration//GEN-END:variables
}
