package Visao.Consultar;


import DAO.Conexao;
import DAO.FilmeDAO;
import Modelo.Filme;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ConsultarFilme extends javax.swing.JFrame {

   
    public ConsultarFilme() {
        initComponents();
        setSize(936,460);
        setResizable(false);
        setLocationRelativeTo(this);
        setTitle("Video Locadora");
        AtualizaTable();
    }
    public void AtualizaTable(){
        
        Connection con = Conexao.AbrirConexao();
        FilmeDAO db = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = db.ListarFilme();
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        int i = 0;
        for(Filme tab : lista){
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getCodigo(), i, 0);
            jTable1.setValueAt(tab.getTitulo(), i, 1);
            jTable1.setValueAt(tab.getAno(), i, 2);
            jTable1.setValueAt(tab.getDuracao(), i, 3);
            jTable1.setValueAt(tab.getCod_categoria(), i, 4);
            jTable1.setValueAt(tab.getCod_classificacao(), i, 5);
            i++;
        }
            Conexao.FecharConexao(con);
        }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Ano", "Duração", "Categoria", "Classificação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 910, 320));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setText("Pesquisa por Titulo:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar por Código:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Todos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField2)))))
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         AtualizaTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String texto = jTextField1.getText();
        if(texto.equals("")){
            JOptionPane.showMessageDialog(null, "Campo não pode ficar em branco!!");
        }else{
        
        Connection con = Conexao.AbrirConexao();
        FilmeDAO db = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = db.Pesquisar_Nome_Filme(jTextField1.getText());
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        int i = 0;
        for(Filme tab : lista){
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getCodigo(), i, 0);
            jTable1.setValueAt(tab.getTitulo(), i, 1);
            jTable1.setValueAt(tab.getAno(), i, 2);
            jTable1.setValueAt(tab.getDuracao(), i, 3);
            jTable1.setValueAt(tab.getCod_categoria(), i, 4);
            jTable1.setValueAt(tab.getCod_classificacao(), i, 5);
            i++;
        }
            Conexao.FecharConexao(con);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String texto = jTextField2.getText();
        if(texto.equals("")){
            JOptionPane.showMessageDialog(null, "Campo não pode ficar em branco!!");
        }else{
        
        int cod = Integer.parseInt(jTextField2.getText());
        Connection con = Conexao.AbrirConexao();
        FilmeDAO db = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = db.Pesquisar_Cod_Filme(cod);
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        int i = 0;
        for(Filme tab : lista){
            tbm.addRow(new String[i]);
           jTable1.setValueAt(tab.getCodigo(), i, 0);
            jTable1.setValueAt(tab.getTitulo(), i, 1);
            jTable1.setValueAt(tab.getAno(), i, 2);
            jTable1.setValueAt(tab.getDuracao(), i, 3);
            jTable1.setValueAt(tab.getCod_categoria(), i, 4);
            jTable1.setValueAt(tab.getCod_classificacao(), i, 5);
            i++;
        }
            Conexao.FecharConexao(con);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
