import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewBalanceButton = new javax.swing.JButton();
        WithdrawButton = new javax.swing.JButton();
        DepositButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ChangePINButton = new javax.swing.JButton();
        ViewCashButton = new javax.swing.JButton();
        TransferButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewBalanceButton.setText("View Balance");
        ViewBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBalanceButtonActionPerformed(evt);
            }
        });

        WithdrawButton.setText("Withdraw");
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });

        DepositButton.setText("Deposit");
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        ChangePINButton.setText("Change Pin");
        ChangePINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePINButtonActionPerformed(evt);
            }
        });

        ViewCashButton.setText("View Cash in ATM");
        ViewCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCashButtonActionPerformed(evt);
            }
        });

        TransferButton.setText("Transfer");
        TransferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewBalanceButton)
                    .addComponent(WithdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChangePINButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewCashButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TransferButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBalanceButton)
                    .addComponent(ChangePINButton))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawButton)
                    .addComponent(TransferButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositButton)
                    .addComponent(ViewCashButton))
                .addGap(44, 44, 44)
                .addComponent(LogoutButton)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        
        //Changing CSV Values 
        /*A temporary file is created in which the data is copied from the Users.csv file but where
          the changes in the user's balance is changed accordingly. Then the Users.csv file is deleted and
          the temp.csv file is renamed as Users.csv*/
        //https://www.youtube.com/watch?v=TpyRKom0X_s was referred
        
        String csvFile = "Users.csv";
        User u = AccountPIN.user;
        int accNum = u.getAccNum();
        int PIN = u.getPIN();
        int balance = u.viewBalance();
        
        String tempFile = "temp.csv";
        File oldFile = new File(csvFile);
        File newFile = new File(tempFile);
        String fileAccNum ="", filePIN = "", fileBalance = "";
        
        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            Scanner obj = new Scanner(new File(csvFile));
            obj.useDelimiter("[,\n]");
            
            while (obj.hasNext()) {
                fileAccNum = obj.next();
                filePIN = obj.next();
                fileBalance = obj.next();
                fileBalance = fileBalance.replace("\r", "");
                
                if (Integer.parseInt(fileAccNum) == accNum) {
                    pw.println(accNum+","+PIN+","+balance);
                }
                else {
                    pw.println(fileAccNum + "," + filePIN + "," + fileBalance);
                }
            }
            obj.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(csvFile);
            newFile.renameTo(dump);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
        //To close this window and open the welcome page
        dispose();
        WelcomePage wp = new WelcomePage();
        wp.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ViewBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBalanceButtonActionPerformed
        User u = AccountPIN.user;
        JOptionPane.showMessageDialog(this, "The balance in your account is: Rs."+u.viewBalance());
    }//GEN-LAST:event_ViewBalanceButtonActionPerformed

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawButtonActionPerformed
        dispose();
        Withdraw w = new Withdraw();
        w.setVisible(true);
    }//GEN-LAST:event_WithdrawButtonActionPerformed

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositButtonActionPerformed
        dispose();
        Deposit d = new Deposit();
        d.setVisible(true);
    }//GEN-LAST:event_DepositButtonActionPerformed

    private void ChangePINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePINButtonActionPerformed
        dispose();
        ChangePIN c = new ChangePIN();
        c.setVisible(true);
    }//GEN-LAST:event_ChangePINButtonActionPerformed

    private void ViewCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCashButtonActionPerformed
        CashDispenser cd = WelcomePage.cashDispenser;
        JOptionPane.showMessageDialog(this, "Cash remaining in ATM is: Rs"+cd.showCash());
    }//GEN-LAST:event_ViewCashButtonActionPerformed

    private void TransferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferButtonActionPerformed
        dispose();
        Transfer t = new Transfer();
        t.setVisible(true);
    }//GEN-LAST:event_TransferButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePINButton;
    private javax.swing.JButton DepositButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton TransferButton;
    private javax.swing.JButton ViewBalanceButton;
    private javax.swing.JButton ViewCashButton;
    private javax.swing.JButton WithdrawButton;
    // End of variables declaration//GEN-END:variables
}
