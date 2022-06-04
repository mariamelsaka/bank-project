package bank;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Withdraw1 extends javax.swing.JFrame {

    long id;

    Connection conn = null;
    Statement stat = null;
    ResultSet result = null;

    public Withdraw1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Withdraw1(long id) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.id = id;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MM BANK");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(82, 169, 82));

        jPanel1.setBackground(new java.awt.Color(250, 247, 246));

        jTextField1.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 169, 82));
        jLabel1.setText(" Amount    Of    Money:");

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 169, 82));
        jLabel2.setText("Transfer To(ID):");

        jButton1.setBackground(new java.awt.Color(253, 230, 183));
        jButton1.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(82, 169, 82));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-left-arrow-48.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(104, 104, 104)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AccountBalance s = new AccountBalance();
        AccountBalance o = new AccountBalance();

        try {
            if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, " You have to fill all the Fields...", "MM BANK", JOptionPane.PLAIN_MESSAGE);
            } else {
                String query = "select*from bank.CLIENT_INFORMATION ";

                try {

                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bankdatabase", "bank", "1234");

                    stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                    result = stat.executeQuery(query);
                    result.next();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

                try {
                    long TRANid = Long.parseLong(jTextField2.getText());
                    int found = 0;
                    result.absolute(0);
                    while (result.next()) {
                        if (TRANid == result.getLong(1)) {
                            found = 1;

                            try {
                                long searchid = id;

                                result.absolute(0);
                                while (result.next()) {
                                    if (searchid == result.getLong(1)) {

                                        s.setBalance(result.getDouble("BALANCE"));
                                        Withdraw w = new Withdraw(s.getBalance());
                                        w.setWithdraw(Double.parseDouble(jTextField1.getText()));
                                        result.getRow();
                                        result.updateDouble("BALANCE", w.getBalance());
                                        result.updateRow();
                                        break;
                                    }
                                }
                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }
                            try {

                                result.absolute(0);
                                while (result.next()) {
                                    if (TRANid == result.getLong(1)) {
                                        o.setBalance(result.getDouble("BALANCE"));
                                        Deposit d = new Deposit(o.getBalance());
                                        d.setDeposite(Double.parseDouble(jTextField1.getText()));
                                        result.getRow();
                                        result.updateDouble("BALANCE", d.getBalance());
                                        result.updateRow();
                                        break;
                                    }
                                }

                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }

                            if (found == 1) {
                                JOptionPane.showMessageDialog(this, " Transfered successfully ", "MM BANK", JOptionPane.PLAIN_MESSAGE);

                            }

                            break;
                        }
                    }
                    if (found == 0) {
                        JOptionPane.showMessageDialog(this, " The user of this ID doesn't excist.. ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                } finally {
                    try {
                        stat.close();
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(Withdraw1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, " INVALID INPUT  ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } catch (AccountException ex) {
            JOptionPane.showMessageDialog(this, " Insufficient funds in your account ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
