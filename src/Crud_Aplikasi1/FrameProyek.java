/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud_Aplikasi1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Yogi Arif Widodo <Yogi at scodeid.blogspot.com>
 */
public class FrameProyek extends javax.swing.JInternalFrame {
    
    
    /**
     * Creates new form FrameProyek
     */
 
    public boolean dataBaru;
    
    public FrameProyek() {
        initComponents();
        GetData(); //tampilkan ke grid
        dataBaru = true; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextNamaProyek = new javax.swing.JTextField();
        jBtnEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBtnDelete = new javax.swing.JButton();
        jTextPeriode = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextKeterangan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCrud = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextProyek = new javax.swing.JTextField();
        jBtnNew = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBtnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Data Proyek");

        jTextNamaProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaProyekActionPerformed(evt);
            }
        });

        jBtnEdit.setText("Edit");
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("PERIODE");

        jBtnDelete.setText("Delete");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jTableCrud.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCrud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCrudMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCrud);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("KETERANGAN");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("ID_PROYEK");

        jBtnNew.setText("New");
        jBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("NAMA_PROYEK");

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnDelete)
                                .addGap(8, 8, 8)))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextNamaProyek)
                                .addComponent(jTextPeriode)
                                .addComponent(jTextKeterangan)
                                .addComponent(jTextProyek))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(42, 42, 42)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEdit)
                    .addComponent(jBtnDelete))
                .addGap(0, 109, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jBtnNew))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jBtnSave))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addContainerGap(336, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNamaProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaProyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaProyekActionPerformed

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEditActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
    
        try 
        {
            String sql="delete from proyek WHERE ID_PROYEK='"+jTextProyek.getText()+"'";
            java.sql.Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data akan dihapus");
            pst.execute();
            
        dataBaru = true;

        jTextProyek.setText("");
        jTextNamaProyek.setText("");
        jTextPeriode.setText("");
        jTextKeterangan.setText("");
            
        } 
        catch (SQLException | HeadlessException e) 
        {
            
        }
        GetData();
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jTableCrudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCrudMouseClicked
        dataBaru = false;
        try
        {
            int row = jTableCrud.getSelectedRow();
            String tabel_click = (jTableCrud.getModel().getValueAt(row, 0).toString());

            java.sql.Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from proyek where ID_PROYEK='"+tabel_click+"'");

            if (sql.next())
            {
                jTextProyek.setText(sql.getString("ID_PROYEK"));
                jTextNamaProyek.setText(sql.getString("NAMA_PROYEK"));
                jTextPeriode.setText(sql.getString("PERIODE"));
                jTextKeterangan.setText(sql.getString("KETERANGAN"));
               
            }
        }
        catch (Exception e)
        {

        }
    }//GEN-LAST:event_jTableCrudMouseClicked

    private void jBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewActionPerformed
        dataBaru = true;

        jTextProyek.setText("");
        jTextNamaProyek.setText("");
        jTextPeriode.setText("");
        jTextKeterangan.setText("");
       
    }//GEN-LAST:event_jBtnNewActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        if (dataBaru == true) //inseert
        {
            try
            {
                String sql = "insert into proyek values"+"('"+jTextProyek.getText()+"','"+jTextNamaProyek.getText()+"','"+jTextPeriode.getText()+"','"+jTextKeterangan.getText()+"')";
                java.sql.Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            }
            catch (SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        else  //false
        {
            try
            {
                //                          ("update reservation set busname='"+jTextField10.getText()+"',busno='"+jTextField9.getText()+"',cusname='"+jTextField8.getText()+"',noofpass='"+jTextField7.getText()+"',amount='"+jTextField6.getText()+"' where cusname='"+jTextField8.getText()+"' ");
                String sql = ("update proyek set NAMA_PROYEK='"+jTextNamaProyek.getText()+"',PERIODE='"+jTextPeriode.getText()+"',KETERANGAN='"+jTextKeterangan.getText()+"' where ID_PROYEK = '"+jTextProyek.getText()+"'");
                java.sql.Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            }
            catch (SQLException | HeadlessException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        GetData();
    }//GEN-LAST:event_jBtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JButton jBtnNew;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableCrud;
    private javax.swing.JTextField jTextKeterangan;
    private javax.swing.JTextField jTextNamaProyek;
    private javax.swing.JTextField jTextPeriode;
    private javax.swing.JTextField jTextProyek;
    // End of variables declaration//GEN-END:variables
  private void GetData() 
    {
        try 
        {
            //connection
            Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql;
            sql = stm.executeQuery("select * from proyek");
            jTableCrud.setModel(DbUtils.resultSetToTableModel(sql));
            
        } catch (SQLException | HeadlessException e) 
        {
            
        }
    }
}
