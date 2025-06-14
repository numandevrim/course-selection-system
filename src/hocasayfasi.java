
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Numan
 */
public class hocasayfasi extends javax.swing.JFrame {

    /**
     * Creates new form hocasayfasi
     */
    public hocasayfasi() {
        initComponents();
        try {
            
            
            mesajta.setLineWrap(true);
            mesajta.setWrapStyleWord(true);
            
            
            
            taleplistele();
            onaylananlistele();
            ogrencilistele();
            derscombolistele();
            
            
            
            ogrencinotf.setVisible(false);
            ogrenciadtf.setVisible(false);
            ogrencisoyadtf.setVisible(false);
            derskodtf.setVisible(false);
            dersadtf.setVisible(false);
            dersaktstf.setVisible(false);
            dersturtf.setVisible(false);
            
            ogrencinotf2.setVisible(false);
            ogrenciadtf2.setVisible(false);
            ogrencisoyadtf2.setVisible(false);

            
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(hocasayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taleptbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        mesajta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        reddetbtn = new javax.swing.JButton();
        onaylabtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ogrencinotf = new javax.swing.JLabel();
        ogrenciadtf = new javax.swing.JLabel();
        ogrencisoyadtf = new javax.swing.JLabel();
        derskodtf = new javax.swing.JLabel();
        dersadtf = new javax.swing.JLabel();
        dersaktstf = new javax.swing.JLabel();
        dersturtf = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        onaylanantbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ogrencitbl = new javax.swing.JTable();
        bilgibtn = new javax.swing.JButton();
        talepgonderbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        derscombo = new javax.swing.JComboBox<>();
        ogrencinotf2 = new javax.swing.JLabel();
        ogrenciadtf2 = new javax.swing.JLabel();
        ogrencisoyadtf2 = new javax.swing.JLabel();

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taleptbl.setModel(new javax.swing.table.DefaultTableModel(
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
        taleptbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taleptblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taleptbl);

        mesajta.setColumns(20);
        mesajta.setRows(5);
        jScrollPane2.setViewportView(mesajta);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("ÖĞRENCİ MESAJI");

        reddetbtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        reddetbtn.setText("REDDET");
        reddetbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reddetbtnMouseClicked(evt);
            }
        });

        onaylabtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        onaylabtn.setText("ONAYLA");
        onaylabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onaylabtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("ÖĞRENCİ NO            AD                        SOYAD               DERS KODU            DERS ADI                                                                                   AKTS            TÜR");

        ogrencinotf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ogrencinotf.setText("jLabel3");

        ogrenciadtf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ogrenciadtf.setText("jLabel4");

        ogrencisoyadtf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ogrencisoyadtf.setText("jLabel5");

        derskodtf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        derskodtf.setText("jLabel6");

        dersadtf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        dersadtf.setText("jLabel7");

        dersaktstf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        dersaktstf.setText("jLabel8");

        dersturtf.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        dersturtf.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(onaylabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(reddetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ogrencinotf)
                        .addGap(65, 65, 65)
                        .addComponent(ogrenciadtf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ogrencisoyadtf)
                        .addGap(59, 59, 59)
                        .addComponent(derskodtf)
                        .addGap(72, 72, 72)
                        .addComponent(dersadtf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dersaktstf)
                        .addGap(36, 36, 36)
                        .addComponent(dersturtf)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrencinotf)
                    .addComponent(ogrenciadtf)
                    .addComponent(ogrencisoyadtf)
                    .addComponent(derskodtf)
                    .addComponent(dersadtf)
                    .addComponent(dersaktstf)
                    .addComponent(dersturtf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onaylabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reddetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("GELEN TALEPLER", jPanel1);

        onaylanantbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(onaylanantbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1321, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ONAYLANAN TALEPLER", jPanel2);

        ogrencitbl.setModel(new javax.swing.table.DefaultTableModel(
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
        ogrencitbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrencitblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ogrencitbl);

        bilgibtn.setText("ÖĞRENCİ BİLGİLERİNİ GÖRÜNTÜLE");
        bilgibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bilgibtnMouseClicked(evt);
            }
        });

        talepgonderbtn.setText("TALEP GÖNDER");
        talepgonderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                talepgonderbtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("ÖĞRENCİ NO                  ÖĞRENCİ ADI                           ÖĞRENCİ SOYADI");

        ogrencinotf2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ogrencinotf2.setText("jLabel4");

        ogrenciadtf2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ogrenciadtf2.setText("jLabel5");

        ogrencisoyadtf2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ogrencisoyadtf2.setText("jLabel6");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(bilgibtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ogrencinotf2)
                        .addGap(93, 93, 93)
                        .addComponent(ogrenciadtf2)
                        .addGap(154, 154, 154)
                        .addComponent(ogrencisoyadtf2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(talepgonderbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                    .addComponent(derscombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bilgibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(derscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(talepgonderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogrencinotf2)
                            .addComponent(ogrenciadtf2)
                            .addComponent(ogrencisoyadtf2))))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("ÖĞRENCİLER", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onaylabtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onaylabtnMouseClicked
        
        
        if (derskodtf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Onaylanacak Talep Seçin");
        }
        else{
             int input = JOptionPane.showConfirmDialog(null, "Onaylamak İstediğinize Emin misiniz?");
            // 0=yes, 1=no, 2=cancel

            if (input==0) {
                 try {
                    //con = DriverManager.getConnection(url);
                    con = DriverManager.getConnection(url,user,pw);
                    
                    st= con.createStatement();
                    String query = "INSERT INTO onaylanandersler (ogrencino, derskodu, hocasicilno) VALUES (?, ?, ?)";
                    PreparedStatement preparedStatement = con.prepareStatement(query);

                    preparedStatement.setString(1, ogrencinotf.getText());
                    preparedStatement.setString(2, derskodtf.getText());
                    preparedStatement.setString(3, giris.sicilno);
                    preparedStatement.executeUpdate();
                    
                    
                    
                    query= "delete from talepler where ogrencino='" + ogrencinotf.getText() + "' and hocasicilno='" + giris.sicilno + "' and derskodu='" + derskodtf.getText() + "'";
                    st = con.createStatement();
                    st.executeUpdate(query);
                    
                    
                    
                    JOptionPane.showMessageDialog(this, "Talep Onaylandı");
                    taleplistele();
                    onaylananlistele();
                    
                    con.close();
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(hocasayfasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
        ogrencinotf.setText("");
        ogrenciadtf.setText("");
        ogrencisoyadtf.setText("");
        derskodtf.setText("");
        dersadtf.setText("");
        dersaktstf.setText("");
        dersturtf.setText("");
        mesajta.setText("");
        
        
        
        
    }//GEN-LAST:event_onaylabtnMouseClicked

    private void taleptblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taleptblMouseClicked
        
        ogrencinotf.setVisible(true);
        ogrenciadtf.setVisible(true);
        ogrencisoyadtf.setVisible(true);
        derskodtf.setVisible(true);
        dersadtf.setVisible(true);
        dersaktstf.setVisible(true);
        dersturtf.setVisible(true);

            int selectedRow = taleptbl.getSelectedRow();

            String ogrencino, ogrenciad, ogrencisoyad, derskod, dersad, dersakts, derstur, mesaj;
            ogrencino = (String) taleptbl.getValueAt(selectedRow, 0);
            ogrenciad = (String) taleptbl.getValueAt(selectedRow, 1);
            ogrencisoyad = (String) taleptbl.getValueAt(selectedRow, 2);
            derskod = (String) taleptbl.getValueAt(selectedRow, 3);
            dersad = (String) taleptbl.getValueAt(selectedRow, 4);
            dersakts =  taleptbl.getValueAt(selectedRow, 5).toString();
            derstur = (String) taleptbl.getValueAt(selectedRow, 6);
            mesaj = (String) taleptbl.getValueAt(selectedRow, 7);

            if (selectedRow != -1) {
                ogrencinotf.setText(ogrencino);
                ogrenciadtf.setText(ogrenciad);
                ogrencisoyadtf.setText(ogrencisoyad);
                derskodtf.setText(derskod);
                dersadtf.setText(dersad);
                dersaktstf.setText(dersakts);
                dersturtf.setText(derstur);
                mesajta.setText(mesaj);
            }
            
            
            /*
            con = DriverManager.getConnection(url,user,pw);
            st= con.createStatement();
            String sql = "select d.dersad from dersler d, hocaninverdigidersler v where d.derskodu = v.derskodu and v.hocasicilno = '" + sicilno + "'";
            rs = st.executeQuery(sql);
            derscombo.removeAllItems();
            derscombo.addItem("DERS SEÇİN");
            while (rs.next()) {
                String isim = rs.getString("dersad");
                derscombo.addItem(isim);
            }
            con.close();
            */
            
        
        
        
        
        
    }//GEN-LAST:event_taleptblMouseClicked

    private void reddetbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reddetbtnMouseClicked
        
        if (derskodtf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silinecek Talep Seçin");
        }
        else{
             int input = JOptionPane.showConfirmDialog(null, "Silmek İstediğinize Emin misiniz?");
            // 0=yes, 1=no, 2=cancel

            if (input==0) {
                 try {
                    //con = DriverManager.getConnection(url);
                    con = DriverManager.getConnection(url,user,pw);
                    String query= "delete from talepler where ogrencino='" + ogrencinotf.getText() + "' and hocasicilno='" + giris.sicilno + "' and derskodu='" + derskodtf.getText() + "'";
                    st = con.createStatement();
                    st.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Talep Silindi");
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(hocasayfasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        ogrencinotf.setText("");
        ogrenciadtf.setText("");
        ogrencisoyadtf.setText("");
        derskodtf.setText("");
        dersadtf.setText("");
        dersaktstf.setText("");
        dersturtf.setText("");
        mesajta.setText("");
        
        
        try {
            taleplistele();
        } catch (SQLException ex) {
            Logger.getLogger(hocasayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_reddetbtnMouseClicked

    private void ogrencitblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrencitblMouseClicked
        
        ogrencinotf2.setVisible(true);
        ogrenciadtf2.setVisible(true);
        ogrencisoyadtf2.setVisible(true);

            int selectedRow = ogrencitbl.getSelectedRow();

            String ogrencino, ogrenciad, ogrencisoyad, derskod, dersad, dersakts, derstur, mesaj;
            ogrencino = (String) ogrencitbl.getValueAt(selectedRow, 0);
            ogrenciad = (String) ogrencitbl.getValueAt(selectedRow, 1);
            ogrencisoyad = (String) ogrencitbl.getValueAt(selectedRow, 2);
            
            /*derskod = (String) taleptbl.getValueAt(selectedRow, 3);
            dersad = (String) taleptbl.getValueAt(selectedRow, 4);
            dersakts =  taleptbl.getValueAt(selectedRow, 5).toString();
            derstur = (String) taleptbl.getValueAt(selectedRow, 6);
            mesaj = (String) taleptbl.getValueAt(selectedRow, 7);*/

            if (selectedRow != -1) {
                ogrencinotf2.setText(ogrencino);
                ogrenciadtf2.setText(ogrenciad);
                ogrencisoyadtf2.setText(ogrencisoyad);
            }
        
    }//GEN-LAST:event_ogrencitblMouseClicked

    private void talepgonderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_talepgonderbtnMouseClicked
        
        if (derscombo.getSelectedItem().equals("DERS SEÇİNİZ")) {
            JOptionPane.showMessageDialog(this, "DERS SEÇİNİZ!");
        }

        else{
            try {
                con = DriverManager.getConnection(url,user,pw);

                String ders = (String) derscombo.getSelectedItem();


                int sayac = 0;
                st= con.createStatement();
                String sql = "select COUNT(t.hocasicilno) from talepler t, dersler d where t.derskodu = d.derskodu and ogrencino  = '" + ogrencinotf2.getText() + "' and hocasicilno = '"+ giris.sicilno + "' and dersad = '" + derscombo.getSelectedItem()+ "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    sayac = rs.getInt("COUNT");
                }

                String derskod = "";
                sql = "select d.derskodu from dersler d, hocaninverdigidersler v where d.derskodu = v.derskodu and d.dersad = '" + derscombo.getSelectedItem() + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    derskod = rs.getString("derskodu");
                }
                
                if (sayac==0) {
                    st= con.createStatement();
                    sql = "INSERT INTO talepler (ogrencino, hocasicilno, derskodu, yon, mesaj) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = con.prepareStatement(sql);

                    preparedStatement.setString(1, ogrencinotf2.getText());
                    preparedStatement.setString(2, giris.sicilno);
                    preparedStatement.setString(3, derskod);
                    preparedStatement.setBoolean(4, true);
                    preparedStatement.setString(5, null);
                        
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "TALEP GÖNDERİLDİ!");
                }
                else {
                    JOptionPane.showMessageDialog(this, "Ders Zaten Talep Edilmiş!");
                }

                
                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        
        
        
        
    }//GEN-LAST:event_talepgonderbtnMouseClicked

    private void bilgibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bilgibtnMouseClicked
        
        bilgigoruntulemeogrencino = ogrencinotf2.getText();
        new bilgigoruntule().setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_bilgibtnMouseClicked

    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String url = "jdbc:postgresql://localhost:5432/derssecim";
    String user ="postgres";
    String pw = "1234";
    
    
    
    giris girissayfasi = new giris();
    
    
    public static String bilgigoruntulemeogrencino = "";
    
    
    
    public void taleplistele() throws SQLException {
    
        con = DriverManager.getConnection(url,user,pw);
        st= con.createStatement();
        String sql = "select o.no, o.ad, o.soyad, d.derskodu, d.dersad, d.akts, d.tur, t.mesaj from hoca h, dersler d, talepler t, ogrenci o where h.sicilno = t.hocasicilno and d.derskodu = t.derskodu and o.no = t.ogrencino and t.yon = false and t.hocasicilno = '" + giris.sicilno + "'";
        ResultSet resultSet = st.executeQuery(sql);

        DefaultTableModel tableModel = new DefaultTableModel();
        taleptbl.setModel(tableModel);
        
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
            taleptbl.setRowHeight(0,50);
        }
        while (resultSet.next()) {
            Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
            taleptbl.setRowHeight(0,50);
        }
        
        for (int i = 0; i <= 500; i++) {
            taleptbl.setRowHeight(i,50);
        }
        
        
        
        taleptbl.getColumnModel().getColumn(0).setPreferredWidth(80);
        taleptbl.getColumnModel().getColumn(1).setPreferredWidth(120);
        taleptbl.getColumnModel().getColumn(2).setPreferredWidth(50);
        taleptbl.getColumnModel().getColumn(3).setPreferredWidth(50);
        taleptbl.getColumnModel().getColumn(4).setPreferredWidth(350);
        taleptbl.getColumnModel().getColumn(5).setPreferredWidth(50);
        taleptbl.getColumnModel().getColumn(6).setPreferredWidth(80);
        taleptbl.getColumnModel().getColumn(6).setPreferredWidth(50);
        taleptbl.getColumnModel().getColumn(6).setPreferredWidth(50);
        
        
        Font customFont = new Font("Arial", Font.BOLD, 14);
        taleptbl.setFont(customFont);
        
        con.close();
        
    }
    
    public void onaylananlistele() throws SQLException {
    
        con = DriverManager.getConnection(url,user,pw);
        st= con.createStatement();
        String sql = "SELECT d.derskodu, d.dersad, d.akts, d.tur, o.no, o.ad, o.soyad FROM dersler d, onaylanandersler od, ogrenci o where d.derskodu = od.derskodu and od.ogrencino = o.no and od.hocasicilno ='" + giris.sicilno + "'";
        ResultSet resultSet = st.executeQuery(sql);

        DefaultTableModel tableModel = new DefaultTableModel();
        onaylanantbl.setModel(tableModel);
        
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
            onaylanantbl.setRowHeight(0,50);
        }
        while (resultSet.next()) {
            Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
            
        }
        
        for (int i = 0; i <= 500; i++) {
            onaylanantbl.setRowHeight(i,50);
        }
        
        
        onaylanantbl.getColumnModel().getColumn(0).setPreferredWidth(50);
        onaylanantbl.getColumnModel().getColumn(1).setPreferredWidth(400);
        onaylanantbl.getColumnModel().getColumn(2).setPreferredWidth(30);
        onaylanantbl.getColumnModel().getColumn(3).setPreferredWidth(50);
        onaylanantbl.getColumnModel().getColumn(3).setPreferredWidth(80);
        onaylanantbl.getColumnModel().getColumn(3).setPreferredWidth(150);
        onaylanantbl.getColumnModel().getColumn(3).setPreferredWidth(100);

        
        Font customFont = new Font("Arial", Font.BOLD, 14);
        onaylanantbl.setFont(customFont);
        
        con.close();
    }
    
    public void ogrencilistele() throws SQLException {
    
        con = DriverManager.getConnection(url,user,pw);
        st= con.createStatement();
        String sql = "select o.no, o.ad, o.soyad, o.gno from ogrenci o, onaylanandersler od where o.no <> od.ogrencino";
        ResultSet resultSet = st.executeQuery(sql);

        DefaultTableModel tableModel = new DefaultTableModel();
        ogrencitbl.setModel(tableModel);
        
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnName(i));
            ogrencitbl.setRowHeight(0,50);
        }
        while (resultSet.next()) {
            Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
            
        }
        
        for (int i = 0; i <= 500; i++) {
            ogrencitbl.setRowHeight(i,50);
        }
        
        
        ogrencitbl.getColumnModel().getColumn(0).setPreferredWidth(50);
        ogrencitbl.getColumnModel().getColumn(1).setPreferredWidth(70);
        ogrencitbl.getColumnModel().getColumn(2).setPreferredWidth(50);
        ogrencitbl.getColumnModel().getColumn(3).setPreferredWidth(50);

        
        Font customFont = new Font("Arial", Font.BOLD, 14);
        onaylanantbl.setFont(customFont);
        
        con.close();
        
    }
    
    
    public void derscombolistele() {
        try {
           //con = DriverManager.getConnection(url);
            con = DriverManager.getConnection(url,user,pw);
            st = con.createStatement();
            rs = st.executeQuery("select d.dersad from dersler d, hocaninverdigidersler v where d.derskodu = v.derskodu and v.hocasicilno = '" + giris.sicilno + "'");
            
            derscombo.addItem("DERS SEÇİNİZ");
            while (rs.next()) {
                derscombo.addItem(rs.getString("dersad"));
            }
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(hocasayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hocasayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hocasayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hocasayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hocasayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bilgibtn;
    private javax.swing.JLabel dersadtf;
    private javax.swing.JLabel dersaktstf;
    private javax.swing.JComboBox<String> derscombo;
    private javax.swing.JLabel derskodtf;
    private javax.swing.JLabel dersturtf;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea mesajta;
    private javax.swing.JLabel ogrenciadtf;
    private javax.swing.JLabel ogrenciadtf2;
    private javax.swing.JLabel ogrencinotf;
    private javax.swing.JLabel ogrencinotf2;
    private javax.swing.JLabel ogrencisoyadtf;
    private javax.swing.JLabel ogrencisoyadtf2;
    private javax.swing.JTable ogrencitbl;
    private javax.swing.JButton onaylabtn;
    private javax.swing.JTable onaylanantbl;
    private javax.swing.JButton reddetbtn;
    private javax.swing.JButton talepgonderbtn;
    private javax.swing.JTable taleptbl;
    // End of variables declaration//GEN-END:variables
}
