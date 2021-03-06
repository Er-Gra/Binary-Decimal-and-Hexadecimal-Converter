/*
 * May 15, 2020
 * Erika Graham
 * Binary, Hexadecimal, and Decimal converter
 */

public class FrmBinaryHexadecimalConverter extends javax.swing.JFrame {

    /**
     * Creates new form FrmBinaryHexadecimalConverter
     */
    public FrmBinaryHexadecimalConverter() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDecToBin = new javax.swing.JButton();
        btnBinToDec = new javax.swing.JButton();
        lblDecToBinOut = new javax.swing.JLabel();
        lblBinToDecOut = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnHexToDec = new javax.swing.JButton();
        lblHexToDecOut = new javax.swing.JLabel();
        lblDecToHexOut = new javax.swing.JLabel();
        btnDecToHex = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtDecToBinIn = new javax.swing.JTextField();
        txtBinToDecIn = new javax.swing.JTextField();
        txtDecToHexIn = new javax.swing.JTextField();
        txtHexToDecIn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("---NUMBER SYSTEMS---");

        jLabel2.setText("Decimal and Binary");

        jLabel3.setText("Enter a decimal number:");

        jLabel4.setText("Enter a binary number:");

        btnDecToBin.setText("Dec. to Bin.");
        btnDecToBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecToBinActionPerformed(evt);
            }
        });

        btnBinToDec.setText("Bin. to Dec.");
        btnBinToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinToDecActionPerformed(evt);
            }
        });

        lblDecToBinOut.setText("...");

        lblBinToDecOut.setText("...");

        jLabel7.setText("Decimal and Hexadecimal");

        jLabel8.setText("Enter a hexadecimal number:");

        btnHexToDec.setText("Hex. to Dec.");
        btnHexToDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHexToDecActionPerformed(evt);
            }
        });

        lblHexToDecOut.setText("...");

        lblDecToHexOut.setText("...");

        btnDecToHex.setText("Dec. to Hex.");
        btnDecToHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecToHexActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter a decimal number:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDecToBinIn, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(txtBinToDecIn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHexToDecIn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(txtDecToHexIn))))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecToBin)
                            .addComponent(btnBinToDec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBinToDecOut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDecToBinOut, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHexToDec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHexToDecOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDecToHex)
                        .addGap(66, 66, 66)
                        .addComponent(lblDecToHexOut)))
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnDecToBin)
                    .addComponent(lblDecToBinOut)
                    .addComponent(txtDecToBinIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnBinToDec)
                    .addComponent(lblBinToDecOut)
                    .addComponent(txtBinToDecIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnDecToHex)
                    .addComponent(lblDecToHexOut)
                    .addComponent(txtDecToHexIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnHexToDec)
                    .addComponent(lblHexToDecOut)
                    .addComponent(txtHexToDecIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnDecToBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecToBinActionPerformed
        // get the value from the user
        int Decimal = Integer.parseInt(txtDecToBinIn.getText());
        // call method to convert from decimal to binary
        String binary = Integer.toBinaryString(Decimal);
        //print the result
        lblDecToBinOut.setText(binary);
    }//GEN-LAST:event_btnDecToBinActionPerformed

    private void btnBinToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinToDecActionPerformed
        // get the binary value from the user
        String binary = txtBinToDecIn.getText();
        // call method to convert from binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        //print the result
        lblBinToDecOut.setText(String.valueOf(decimal));
    }//GEN-LAST:event_btnBinToDecActionPerformed

    private void btnDecToHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecToHexActionPerformed
        // get the decimal value from the user
        int Decimal = Integer.parseInt(txtDecToHexIn.getText());
        // call the method to convert from decimal to hexadecimal
        String hexadecimal = Integer.toHexString(Decimal);
        //print the result to user
        lblDecToHexOut.setText(hexadecimal);
    }//GEN-LAST:event_btnDecToHexActionPerformed

    private void btnHexToDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHexToDecActionPerformed
        // get the hexadecimal value from the user
        String hex = txtHexToDecIn.getText();
        // call the method to convert from decimal to hexadecimal
        int decimal = Integer.parseInt(hex, 16);
        //print the result to user
        lblHexToDecOut.setText(String.valueOf(decimal));
    }//GEN-LAST:event_btnHexToDecActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBinaryHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBinaryHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBinaryHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBinaryHexadecimalConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBinaryHexadecimalConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBinToDec;
    private javax.swing.JButton btnDecToBin;
    private javax.swing.JButton btnDecToHex;
    private javax.swing.JButton btnHexToDec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBinToDecOut;
    private javax.swing.JLabel lblDecToBinOut;
    private javax.swing.JLabel lblDecToHexOut;
    private javax.swing.JLabel lblHexToDecOut;
    private javax.swing.JTextField txtBinToDecIn;
    private javax.swing.JTextField txtDecToBinIn;
    private javax.swing.JTextField txtDecToHexIn;
    private javax.swing.JTextField txtHexToDecIn;
    // End of variables declaration//GEN-END:variables
}
