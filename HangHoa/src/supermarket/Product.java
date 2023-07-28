package supermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Product extends javax.swing.JFrame {


    public Product() {
        initComponents();
        SelectProd();
        GetCat();
    }
Connection Con = null;
Statement St = null;
ResultSet Rs = null;

public void SelectProd()
{
    try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("Select *from producttbl");
        ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch (Exception e) 
    {
            e.printStackTrace();
    }
}
private void GetCat()
        {
            try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
        St = Con.createStatement();
        String query = "Select *from categorytbl";
        Rs = St.executeQuery(query);
        while(Rs.next())
        {
            String Mycat = Rs.getString("CATNAME");
            CatCb.addItem(Mycat);
        }
        
    }catch (Exception e) {
            e.printStackTrace();
    }
}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ProdName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProdId = new javax.swing.JTextField();
        CatCb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProdQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ProdPrice = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        tfTimKiem = new javax.swing.JTextField();
        TimKiemBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setText("Danh Sách Sản Phẩm");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 285, -1, 50));

        ProdName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNameActionPerformed(evt);
            }
        });
        jPanel2.add(ProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 123, 250, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Tên Sản Phẩm");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 122, 130, 22));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("ID Sản Phẩm");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 79, -1, 25));

        ProdId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdIdActionPerformed(evt);
            }
        });
        jPanel2.add(ProdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 79, 250, -1));

        CatCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CatCb.setToolTipText("Beverage");
        CatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbActionPerformed(evt);
            }
        });
        jPanel2.add(CatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 182, 278, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Danh Mục");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 182, -1, 25));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Số Lượng");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 110, 30));

        ProdQty.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ProdQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdQtyActionPerformed(evt);
            }
        });
        jPanel2.add(ProdQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 280, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Giá");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 40, 25));

        ProdPrice.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ProdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdPriceActionPerformed(evt);
            }
        });
        jPanel2.add(ProdPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 280, -1));

        AddBtn.setBackground(new java.awt.Color(0, 0, 0));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Thêm");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        UpdateBtn.setBackground(new java.awt.Color(0, 0, 0));
        UpdateBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Sửa");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        jPanel2.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        DeleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Xoá");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        ClearBtn.setBackground(new java.awt.Color(0, 0, 0));
        ClearBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Mặc Định");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel4.setText("Quản Lí Sản Phẩm");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, -1, 50));

        ProductTable.setBackground(new java.awt.Color(240, 240, 240));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Sản Phẩm", "Số Lượng", "Giá", "Danh Mục"
            }
        ));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 850, 220));

        tfTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(tfTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 190, -1));

        TimKiemBtn.setBackground(new java.awt.Color(0, 0, 0));
        TimKiemBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TimKiemBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimKiemBtn.setText("Tìm Kiếm");
        TimKiemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimKiemBtnMouseClicked(evt);
            }
        });
        TimKiemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBtnActionPerformed(evt);
            }
        });
        jPanel2.add(TimKiemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 900, 580));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 50, 30, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Người Dùng");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 50));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Đăng Xuất");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 100, 60));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Danh Mục");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 473, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/3rd.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 200));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/logout.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdPriceActionPerformed

    private void ProdQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdQtyActionPerformed

    private void CatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbActionPerformed

    private void ProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdIdActionPerformed

    private void ProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdNameActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(ProdId.getText().isEmpty()||ProdName.getText().isEmpty()||ProdPrice.getText().isEmpty()||ProdQty.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm thêm");
        }
        else
        {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            PreparedStatement add = Con.prepareStatement("insert into producttbl values(?,?,?,?,?)");
            add.setInt(1,Integer.valueOf(ProdId.getText()));
            add.setString(2, ProdName.getText());
            add.setInt(3,Integer.valueOf(ProdQty.getText()));
            add.setInt(4,Integer.valueOf(ProdPrice.getText()));
            add.setString(5,CatCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Sản Phẩm đã thêm thành công");
            Con.close();
            SelectProd();
        }catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
       ProdId.setText("");
       ProdName.setText("");
       ProdPrice.setText("");
       ProdQty.setText("");
       tfTimKiem.setText("");
       SelectProd();
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if(ProdId.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm để xoá");
        else
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                String PrId = ProdId.getText();
                String Query = "Delete from producttbl where PRODID="+PrId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Sản Phẩm đã được xoá thành công");
            }catch (Exception e)
            {
                e.printStackTrace();
            }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int MyIndex = ProductTable.getSelectedRow();
        ProdId.setText(model.getValueAt(MyIndex, 0).toString());
        ProdName.setText(model.getValueAt(MyIndex, 1).toString());
        ProdQty.setText(model.getValueAt(MyIndex, 2).toString());
        ProdPrice.setText(model.getValueAt(MyIndex, 3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        
        if(ProdId.getText().isEmpty()||ProdName.getText().isEmpty()||ProdQty.getText().isEmpty()||ProdPrice.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Chọn sản phẩm để cập nhật");
        }
        else
        {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            String Query = "Update producttbl set PRODNAME='"+ProdName.getText()+"'"+",PRODQTY="+ProdQty.getText()+""+",PRODPRICE="+ProdPrice.getText()+""+",PRODCAT='"+CatCb.getSelectedItem().toString()+"'"+"where PRODID="+ProdId.getText();
            Statement Add = Con.createStatement();
            Add.executeUpdate(Query);
            SelectProd();
            JOptionPane.showMessageDialog(this, "Sản Phẩm đã được cập nhật");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       new Seller().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         new Category().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Login().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void TimKiemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimKiemBtnMouseClicked
        // TODO add your handling code here:
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("Select *from producttbl where PRODNAME like'%"+tfTimKiem.getText().toString()+"%'");
            ProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_TimKiemBtnMouseClicked

    private void TimKiemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimKiemBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField ProdId;
    private javax.swing.JTextField ProdName;
    private javax.swing.JTextField ProdPrice;
    private javax.swing.JTextField ProdQty;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton TimKiemBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfTimKiem;
    // End of variables declaration//GEN-END:variables
}
