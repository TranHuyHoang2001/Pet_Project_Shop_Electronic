package supermarket;


public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Precentage = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Precentage.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Precentage.setForeground(new java.awt.Color(255, 255, 255));
        Precentage.setText("%");
        jPanel1.add(Precentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 100, 40));
        jPanel1.add(Myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 1100, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản Lí Hàng Hoá-N6");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 390, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/dribble_cart.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 370, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/ảnh Java/Picture1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 100, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/ảnh Java/anhdaidien - Copy.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/ảnh Java/Picture3.png"))); // NOI18N
        jLabel5.setText("jLabel1");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/ảnh Java/Picture4.png"))); // NOI18N
        jLabel6.setText("jLabel1");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 100, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket/ảnh Java/Picture2.png"))); // NOI18N
        jLabel7.setText("jLabel1");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 100, 100));

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

    public static void main(String args[]) {
        Splash Mysplash = new Splash();
        Mysplash.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                Mysplash.Myprogress.setValue(i);
                Mysplash.Precentage.setText(Integer.toString(i)+"%");
            }
            
        }catch(Exception e)
        {
            
        }
         new Login().setVisible(true);
         Mysplash.dispose(); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel Precentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
