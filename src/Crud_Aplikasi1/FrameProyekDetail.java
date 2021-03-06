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
public class FrameProyekDetail extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameProyekDetail
     */
    public boolean dataBaru;
    
    public FrameProyekDetail() {
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
        jTextIdProyek = new javax.swing.JTextField();
        jBtnEdit = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCrud = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextNip = new javax.swing.JTextField();
        jBtnNew = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBtnSave = new javax.swing.JButton();
        jTextKetarangan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Proyek Detail");

        jTextIdProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdProyekActionPerformed(evt);
            }
        });

        jBtnEdit.setText("Edit");
        jBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("NIP");

        jBtnNew.setText("New");
        jBtnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNewActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("ID_PROYEK");

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jTextKetarangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextKetaranganActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setText("KETERANGAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnDelete)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8))
                    .addGap(68, 68, 68)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextNip)
                        .addComponent(jTextIdProyek)
                        .addComponent(jTextKetarangan))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBtnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(42, 42, 42)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addComponent(jBtnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnDelete)
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jBtnNew))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextIdProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jBtnSave))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextKetarangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addContainerGap(387, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIdProyekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdProyekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdProyekActionPerformed

    private void jBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEditActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        
        try 
        {
            String sql="delete from proyek_detail WHERE NIP='"+jTextNip.getText()+"'";
            java.sql.Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Data akan dihapus");
            pst.execute();
            
            
        dataBaru = true;

        jTextNip.setText("");
        jTextIdProyek.setText("");
        jTextKetarangan.setText("");
            
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
            java.sql.ResultSet sql = stm.executeQuery("select * from proyek_detail where NIP='"+tabel_click+"'");

            if (sql.next())
            {
                jTextNip.setText(sql.getString("NIP"));
                jTextIdProyek.setText(sql.getString("ID_PROYEK"));
                jTextKetarangan.setText(sql.getString("KETERANGAN"));
            }
        }
        catch (Exception e)
        {

        }
    }//GEN-LAST:event_jTableCrudMouseClicked

    private void jBtnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNewActionPerformed
        dataBaru = true;

        jTextNip.setText("");
        jTextIdProyek.setText("");
        jTextKetarangan.setText("");
    }//GEN-LAST:event_jBtnNewActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        if (dataBaru == true) //inseert
        {
            try
            {
                String sql = "insert into proyek_detail values"+"('"+jTextNip.getText()+"','"+jTextIdProyek.getText()+"','"+jTextKetarangan.getText()+"')";
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
                String sql = ("update proyek_detail set ID_PROYEK='"+jTextIdProyek.getText()+"','"+jTextKetarangan.getText()+"' where NIP = '"+jTextNip.getText()+"'");
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

    private void jTextKetaranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextKetaranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextKetaranganActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnEdit;
    private javax.swing.JButton jBtnNew;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCrud;
    private javax.swing.JTextField jTextIdProyek;
    private javax.swing.JTextField jTextKetarangan;
    private javax.swing.JTextField jTextNip;
    // End of variables declaration//GEN-END:variables

    private void GetData() {
         try 
        {
            //connection
            Connection conn = Crud_Aplikasi1.Koneksi.connectDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql;
            sql = stm.executeQuery("select * from proyek_detail");
            jTableCrud.setModel(DbUtils.resultSetToTableModel(sql));
            
        } catch (SQLException | HeadlessException e) 
        {
            
        }
    }
}
