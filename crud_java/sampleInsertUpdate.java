private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (dataBaru == true) //inseert
        {
            try 
            {
                String sql = "insert into karyawan values"+"('"+jTextNip.getText()+"','"+jTextNama.getText()+"','"+jTextNik.getText()+"','"+jTextJabatan.getText()+"','"+jTextNoHp.getText()+"','"+jTextAlamat.getText()+"')";
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
                String sql = ("update karyawan set Nama='"+jTextNama.getText()+"',NIK='"+jTextNik.getText()+"',Jabatan='"+jTextJabatan.getText()+"',No_Hp='"+jTextNoHp.getText()+"',Alamat='"+jTextAlamat.getText()+"' where NIP = '"+jTextNip.getText()+"'");
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
    }       
