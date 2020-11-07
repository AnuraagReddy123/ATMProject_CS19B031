import javax.swing.JOptionPane;
import java.util.Random;

public class ChangePIN extends javax.swing.JFrame {

    /**
     * Creates new form ChangePIN
     */
    public ChangePIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OldPINTF = new javax.swing.JTextField();
        NewPINTF = new javax.swing.JTextField();
        ConfirmNewPINTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        GenerateOTPButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        EnterOTPLabel = new javax.swing.JLabel();
        OTPTF = new javax.swing.JTextField();
        ChangePINButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Old PIN");

        jLabel2.setText("New PIN");

        jLabel3.setText("Confirm New PIN");

        GenerateOTPButton.setText("Generate OTP");
        GenerateOTPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateOTPButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Go Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        EnterOTPLabel.setText("EnterOTP");

        ChangePINButton.setText("Change PIN");
        ChangePINButton.setEnabled(false);
        ChangePINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePINButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EnterOTPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NewPINTF)
                    .addComponent(OldPINTF)
                    .addComponent(ConfirmNewPINTF, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(OTPTF))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(ChangePINButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(GenerateOTPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(OldPINTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NewPINTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfirmNewPINTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addComponent(GenerateOTPButton)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(EnterOTPLabel))
                    .addComponent(OTPTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ChangePINButton)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static int OTP = 0;
    private static int newPIN = 0;
    private static YourPhone yp = new YourPhone();
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void GenerateOTPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateOTPButtonActionPerformed
        User u = AccountPIN.user;
        int accNum = u.getAccNum();
        int PIN = u.getPIN();
        String phoneNumber = Long.toString(u.getPhoneNumber());
        Random rand = new Random();
        
        int oldPIN = 0, confirmNewPIN = 0;
        try {
            oldPIN = Integer.parseInt(OldPINTF.getText());
            newPIN = Integer.parseInt(NewPINTF.getText());
            confirmNewPIN = Integer.parseInt(ConfirmNewPINTF.getText());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer");
        }
        
        if (oldPIN == PIN) {
            if (newPIN == confirmNewPIN) {
                if (newPIN >= 0) {
                    if (newPIN != oldPIN) {
                        if (Integer.toString(newPIN).length() == 5) {
                            int selectedOption = JOptionPane.showConfirmDialog(this,"Are you sure you want to change your PIN?", "Confirmation", JOptionPane.YES_NO_OPTION);
                            if (selectedOption == 0) {
                                EnterOTPLabel.setVisible(true);
                                OTPTF.setVisible(true);
                                ChangePINButton.setVisible(true);
                                ChangePINButton.setEnabled(true);
                                JOptionPane.showMessageDialog(this, "Message sent to " + phoneNumber.substring(0,4)+"******\nCheck your messages for OTP");
                                GenerateOTPButton.setEnabled(false);
                                OTP = rand.nextInt(1000000);
                                yp.setVisible(true);
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Enter a 5 digit PIN");
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(this, "Your new PIN is the same as the old PIN");
                }
                else
                    JOptionPane.showMessageDialog(this, "Please do not enter a negative integer");
            }
            else
                JOptionPane.showMessageDialog(this, "New PIN and confirmation do not match");
        }
        else
            JOptionPane.showMessageDialog(this, "Please enter your correct Old Pin");
    }//GEN-LAST:event_GenerateOTPButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //When the window is opened the enter otp label is made invisible
        EnterOTPLabel.setVisible(false);
        OTPTF.setVisible(false);
        ChangePINButton.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void ChangePINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePINButtonActionPerformed
        User u = AccountPIN.user;
        int accNum = u.getAccNum();
        int PIN = u.getPIN();
        String phoneNumber = Long.toString(u.getPhoneNumber());
        
        Random rand = new Random();
        while (true) {
            int userOTP = Integer.parseInt(OTPTF.getText());
            if (userOTP == OTP) {
                JOptionPane.showMessageDialog(this, "PIN changed successfully!");
                u.setPIN(newPIN);
                yp.dispose();
                break;
            }
            else {
                JOptionPane.showMessageDialog(this, "Resending OTP...");
                OTP = rand.nextInt(1000000);
            } 
        }
    }//GEN-LAST:event_ChangePINButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ChangePINButton;
    private javax.swing.JTextField ConfirmNewPINTF;
    private javax.swing.JLabel EnterOTPLabel;
    private javax.swing.JButton GenerateOTPButton;
    private javax.swing.JTextField NewPINTF;
    private javax.swing.JTextField OTPTF;
    private javax.swing.JTextField OldPINTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
