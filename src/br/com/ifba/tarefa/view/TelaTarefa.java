/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.tarefa.view;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import br.com.ifba.tarefa.entities.Tarefa;
import br.com.ifba.tarefa.dao.DAOTarefa;
import br.com.ifba.tarefa.infrastructure.service.Facade;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author João P. Arquim
 */
public class TelaTarefa extends javax.swing.JFrame {

    /**
     * Creates new form TelaTarefa
     */
    
    Facade fac = new Facade();
    
    public TelaTarefa() {
        initComponents();
        this.setLocationRelativeTo(null);// para iniciar a tela no centro do computador
        List<Tarefa> tarefas = obterTodos();
        prencherTabela(tarefas);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblDescricao = new javax.swing.JLabel();
        txtDes = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        jdcData = new com.toedter.calendar.JDateChooser();
        lblTitulo = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblPesquisar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Data", "Situação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTabela);

        btnEditar.setText("Atualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblDescricao.setBackground(new java.awt.Color(255, 255, 255));
        lblDescricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Descrição:");

        lblData.setBackground(new java.awt.Color(255, 255, 255));
        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Tarefas");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisar.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCadastrar)
                                        .addGap(69, 69, 69)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar)
                                    .addComponent(lblTitulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPesquisar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDeletar))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblData))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEditar)
                    .addComponent(btnDeletar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here
        Tarefa tab = new Tarefa();
        
        //setando os dados no banco de dados
        tab.setDescricao(txtDes.getText());
        tab.setDataFinalizacao(jdcData.getDate());
        tab.setFinalizado(true);
        
        //instanciando novo objeto da classe TarefaDAO
        fac.saveTarefa(tab);
        
        //salvando os dados no banco
        
        //cadastrando os dados da tabela da tela
        DefaultTableModel tar = (DefaultTableModel) tblTabela.getModel();
        Object[] dados = {tab.getId(),tab.getDescricao(),tab.getDataFinalizacao(),tab.isFinalizado()};
        tar.addRow(dados);
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        
        //instanciando novo objeto da classe Tarefa
        Tarefa tab = new Tarefa();
        
        int linha = tblTabela.getSelectedRow();//pegando a linha da tabela
        Long id = (Long) tblTabela.getValueAt(linha, 0);//pegando o id da tarefa
        
        tab.setId(id);//pegando o id 
        
        fac.deleteTarefa(tab);//deletando do banco
        
        //deletando os dados da tabela
        if(tblTabela.getSelectedRow() != -1){
            DefaultTableModel tar = (DefaultTableModel) tblTabela.getModel();
            tar.removeRow(tblTabela.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Erro!");
        }
        
        
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here
        
        Tarefa tab = new Tarefa();
        int linha = tblTabela.getSelectedRow();//pegando a linha da tabela
        Long id = (Long) tblTabela.getValueAt(linha, 0);//pegando o id da tarefa
        
        tab.setId(id);
        
        //setando os novos valores no banco de dados
        tab.setDescricao(txtDes.getText());
        tab.setDataFinalizacao(jdcData.getDate());
        tab.setFinalizado(true);
        
        fac.updateTarefa(tab);//atualizando no banco
        
        if(tblTabela.getSelectedRow() != -1){
            tblTabela.setValueAt(txtDes.getText(), tblTabela.getSelectedRow(), 1);
            tblTabela.setValueAt(jdcData.getDate(), tblTabela.getSelectedRow(), 2);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    
    public List<Tarefa> obterTodos(){
        
        return fac.getAllTarefa();
    }
     public void prencherTabela(List<Tarefa> tarefas){
         
         DefaultTableModel tar = (DefaultTableModel) tblTabela.getModel();
         tar.setNumRows(0);
         
         //prenchendo a tabela com os dados
         for(Tarefa tarefa: tarefas){
               Object[] dados = {tarefa.getId(),tarefa.getDescricao(),tarefa.getDataFinalizacao(),tarefa.isFinalizado()};
               tar.addRow(dados);
        }
     }
    
    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:
        
        //pegando o dado para pesquisar
        String busca = (txtPesquisa.getText()).toLowerCase();
        
        DefaultTableModel tar = (DefaultTableModel) tblTabela.getModel();
        tar.setNumRows(0);
        
        //criando uma lista de tarefas
        List<Tarefa> tarefas = obterTodos();
        
        //for para verificação do dado digitado é igual ao pesquisado
        for(Tarefa tarefa: tarefas){
            if(tarefa.getDescricao().toLowerCase().contains(busca)){
               Object[] dados = {tarefa.getId(),tarefa.getDescricao(),tarefa.getDataFinalizacao(),tarefa.isFinalizado()};
               tar.addRow(dados);
            }
        }
    
        
    }//GEN-LAST:event_txtPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTarefa().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
