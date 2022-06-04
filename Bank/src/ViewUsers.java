package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ViewUsers extends javax.swing.JFrame {

    Admin a = new Admin();
    Connection conn = null;
    Statement stat = null;
    ResultSet result = null;

    public ViewUsers() {
        initComponents();

        this.setLocationRelativeTo(null);

    }

    public ViewUsers(Admin a) {
        initComponents();
        this.a = a;

        this.setLocationRelativeTo(null);
        String query = "select*from bank.CLIENT_INFORMATION ";
        try {

            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bankdatabase", "bank", "1234");

            stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            result = stat.executeQuery(query);
            result.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Dateofbirth = new javax.swing.JTextField();
        Balance = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Dateofjoin = new javax.swing.JTextField();
        Phonenumber = new javax.swing.JTextField();
        text_search_id = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        label_search_result = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MM BANK");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(82, 169, 82));

        jPanel1.setBackground(new java.awt.Color(250, 247, 246));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-left-arrow-48.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(253, 230, 183));
        jButton2.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(65, 138, 65));
        jButton2.setText("Apply Intrest And Tax");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(82, 169, 82));
        jLabel2.setText("First  Name  : ");

        jLabel14.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(82, 169, 82));
        jLabel14.setText("User ID:");

        Fname.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 169, 82));
        jLabel3.setText("E-mail:");

        jLabel6.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(82, 169, 82));
        jLabel6.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(82, 169, 82));
        jLabel8.setText("Birth Date :");

        jLabel7.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 169, 82));
        jLabel7.setText("Telephone:");

        Id.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        Email.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        Address.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        Dateofbirth.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        Balance.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        jButton5.setBackground(new java.awt.Color(253, 230, 183));
        jButton5.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(65, 138, 65));
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(253, 230, 183));
        jButton4.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(65, 138, 65));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(253, 230, 183));
        jButton3.setFont(new java.awt.Font("Urdu Typesetting", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(65, 138, 65));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 169, 82));
        jLabel9.setText("Balance:");

        jLabel10.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(82, 169, 82));
        jLabel10.setText("Date of Join :");

        Dateofjoin.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        Phonenumber.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonenumberActionPerformed(evt);
            }
        });

        text_search_id.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        jLabel18.setBackground(new java.awt.Color(253, 230, 183));
        jLabel18.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(82, 169, 82));
        jLabel18.setText("User  Id:");

        label_search_result.setFont(new java.awt.Font("Urdu Typesetting", 1, 16)); // NOI18N
        label_search_result.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(82, 169, 82));
        jLabel4.setText("Last  Name  : ");

        Lname.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-group-100 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(label_search_result, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Dateofjoin, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_search_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(label_search_result, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dateofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Dateofjoin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (text_search_id.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You have to enter the id before searching..", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else {
            try {
                long searchid = Long.parseLong(text_search_id.getText());
                int found = 0;
                result.absolute(0);
                while (result.next()) {
                    if (searchid == result.getLong(1)) {
                        found = 1;
                        Fname.setText(result.getString("FIRSTNAME"));
                        Lname.setText(result.getString("LASTNAME"));
                        Id.setText(String.valueOf(result.getLong("ID")));

                        Address.setText(result.getString("ADDRESS"));
                        Phonenumber.setText(result.getString("PHONENUMBER"));
                        Dateofjoin.setText(result.getString("DATEOFJOIN"));
                        Balance.setText(result.getDouble("BALANCE") + "");
                        Email.setText(result.getString("EMAIL"));
                        Dateofbirth.setText(result.getString("DATEOFBIRTH"));
                        label_search_result.setText("found");
                        break;
                    }
                }

                if (found == 0) {
                    label_search_result.setText(" not found");
                    Id.setText("");
                    Fname.setText("");
                    Lname.setText("");
                    Address.setText("");
                    Balance.setText("");
                    Dateofjoin.setText("");
                    Phonenumber.setText("");

                    Email.setText("");
                    Dateofbirth.setText("");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Fname.getText().isEmpty() || Lname.getText().isEmpty() || Id.getText().isEmpty() || Email.getText().isEmpty() || Address.getText().isEmpty()
                || Dateofbirth.getText().isEmpty() || Phonenumber.getText().isEmpty() || Balance.getText().isEmpty() || Dateofjoin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Some Fields are missing..", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else {
            try {
                int index = result.getRow();
                if (index != 0) {
                    String fn = Fname.getText();
                    String ln = Lname.getText();
                    int i = Integer.parseInt(Id.getText());
                    String em = Email.getText();
                    String adress1 = Address.getText();
                    String dobd = Dateofbirth.getText();
                    String phone = Phonenumber.getText();
                    double b = Double.parseDouble(Balance.getText());
                    String dateoj = Dateofjoin.getText();
                    result.updateString("FIRSTNAME", fn);
                    result.updateString("LASTNAME", ln);
                    result.updateInt("ID", i);
                    result.updateString("EMAIL", em);
                    result.updateString("ADDRESS", adress1);
                    result.updateString("DATEOFJOIN", dateoj);
                    result.updateString("DATEOFBIRTH", dobd);
                    result.updateString("PHONENUMBER", phone);
                    result.updateDouble("BALANCE", b);

                    result.updateRow();
                    label_search_result.setText("Updated");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, " INVALID Value for Balance or ID ", "MM BANK", JOptionPane.PLAIN_MESSAGE);

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            result.deleteRow();
            label_search_result.setText("deleted");
            Fname.setText("");
            Lname.setText("");
            Id.setText("");
            Email.setText("");
            Address.setText("");
            Dateofbirth.setText("");
            Phonenumber.setText("");
            Balance.setText("");
            Dateofjoin.setText("");
            text_search_id.setText("");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (Balance.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, " You can't Apply chances To an empty Field.. ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else if (a.getTax() == 0 || a.getInterest() == 0) {
            JOptionPane.showMessageDialog(this, " Tax or Interest is equal to zero  ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else {
            try {
                AccountBalance b = new AccountBalance(Double.parseDouble(Balance.getText()));
                Tax t = new Tax(b.getBalance());
                t.getAmountOfTax(a);
                Interest i = new Interest(b.getBalance());
                i.getAmountOfInterest(a);

                b.setBalance(i.getBalance() + t.getBalance() - b.getBalance());
                Balance.setText(String.valueOf(b.getBalance()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, " INVALID Value for Balance  ", "MM BANK", JOptionPane.PLAIN_MESSAGE);

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        try {
            stat.close();
            conn.close();

        } catch (SQLException e) {

        }

        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void PhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhonenumberActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Balance;
    private javax.swing.JTextField Dateofbirth;
    private javax.swing.JTextField Dateofjoin;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Lname;
    private javax.swing.JTextField Phonenumber;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel label_search_result;
    private javax.swing.JTextField text_search_id;
    // End of variables declaration//GEN-END:variables
}
