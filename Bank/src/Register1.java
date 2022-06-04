package bank;

import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register1 extends javax.swing.JFrame {

    public Register1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Id.grabFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        Lastname = new javax.swing.JTextField();
        Balance = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Password1 = new javax.swing.JPasswordField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel2.setBackground(new java.awt.Color(82, 169, 82));

        jPanel1.setBackground(new java.awt.Color(250, 247, 246));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-left-arrow-48.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Firstname.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Firstname.setForeground(new java.awt.Color(102, 102, 102));
        Firstname.setText("First Name");
        Firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstnameFocusGained(evt);
            }
        });
        Firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameActionPerformed(evt);
            }
        });
        Firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FirstnameKeyTyped(evt);
            }
        });

        Lastname.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Lastname.setForeground(new java.awt.Color(102, 102, 102));
        Lastname.setText("Last Name");
        Lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastnameFocusGained(evt);
            }
        });
        Lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameActionPerformed(evt);
            }
        });
        Lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LastnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LastnameKeyTyped(evt);
            }
        });

        Balance.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });

        Address.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        phonenumber.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        Password.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Password1.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N

        jComboBox3.setFont(new java.awt.Font("Urdu Typesetting", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jTextField8.setFont(new java.awt.Font("Urdu Typesetting", 0, 13)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(102, 102, 102));
        jTextField8.setText("DAY");
        jTextField8.setToolTipText("");
        jTextField8.setName(""); // NOI18N
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
        });
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Urdu Typesetting", 0, 13)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(102, 102, 102));
        jTextField9.setText("YEAR");
        jTextField9.setToolTipText("");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
        });
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel2.setText("User Name:");

        jLabel3.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel3.setText("E-mail:");

        jLabel4.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel5.setText("Confirm Password:");

        jLabel6.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel6.setText("Address:");

        jLabel7.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel7.setText("Telephone:");

        jLabel8.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel8.setText("Date of Join:");

        jLabel9.setFont(new java.awt.Font("Urdu Typesetting", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 169, 82));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-handshake-70.png"))); // NOI18N
        jLabel9.setText("Sign Up Form:");

        jButton1.setBackground(new java.awt.Color(253, 230, 183));
        jButton1.setFont(new java.awt.Font("Urdu Typesetting", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(65, 138, 65));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel10.setText("Balance");

        Id.setFont(new java.awt.Font("Urdu Typesetting", 0, 18)); // NOI18N

        jComboBox4.setFont(new java.awt.Font("Urdu Typesetting", 0, 13)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Urdu Typesetting", 0, 13)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(102, 102, 102));
        jTextField10.setText("DAY");
        jTextField10.setToolTipText("");
        jTextField10.setName(""); // NOI18N
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
        });
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Urdu Typesetting", 0, 13)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(102, 102, 102));
        jTextField11.setText("YEAR");
        jTextField11.setToolTipText("");
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
        });
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel11.setText("Birth Date");

        Email.setFont(new java.awt.Font("Urdu Typesetting", 0, 16)); // NOI18N
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Urdu Typesetting", 1, 20)); // NOI18N
        jLabel12.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                        .addComponent(Balance, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Address, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Password1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1))
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void FirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstnameFocusGained
        if (Firstname.getText().trim().toLowerCase().equals("first name")) {
            Firstname.setText("");
            Firstname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_FirstnameFocusGained

    private void FirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameActionPerformed

    }//GEN-LAST:event_FirstnameActionPerformed

    private void FirstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstnameKeyTyped

    }//GEN-LAST:event_FirstnameKeyTyped

    private void LastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastnameFocusGained
        if (Lastname.getText().trim().toLowerCase().equals("last name")) {
            Lastname.setText("");
            Lastname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_LastnameFocusGained

    private void LastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameActionPerformed

    }//GEN-LAST:event_LastnameActionPerformed

    private void LastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastnameKeyPressed

    }//GEN-LAST:event_LastnameKeyPressed

    private void LastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastnameKeyTyped

    }//GEN-LAST:event_LastnameKeyTyped

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed

    }//GEN-LAST:event_BalanceActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        if (jTextField8.getText().trim().toLowerCase().equals("day")) {
            jTextField8.setText("");
            jTextField8.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked

    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed

    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        if (jTextField9.getText().trim().toLowerCase().equals("year")) {
            jTextField9.setText("");
            jTextField9.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked

    }//GEN-LAST:event_jTextField9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
        PreparedStatement pst = null;

        if (Firstname.getText().trim().toLowerCase().equals("first name") || Lastname.getText().trim().toLowerCase().equals("last name")
                || phonenumber.getText().isEmpty() || jTextField10.getText().trim().toLowerCase().equals("day")
                || jTextField8.getText().trim().toLowerCase().equals("day") || jTextField9.getText().trim().toLowerCase().equals("year")
                || jTextField11.getText().trim().toLowerCase().equals("year") || jTextField8.getText().isEmpty() || jTextField10.getText().isEmpty()
                || jTextField11.getText().isEmpty() || Firstname.getText().isEmpty() || Lastname.getText().isEmpty()
                || Address.getText().isEmpty() || Balance.getText().isEmpty() || jTextField9.getText().isEmpty()
                || Id.getText().isEmpty() || Password.getText().isEmpty() || Password1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, " You Have to fill all the Fields... ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else if (!Password1.getText().equals(Password.getText()) || Password.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "The password Fields have to be equal & more than or equal 8... ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else if (jComboBox3.getSelectedItem().toString().trim().toLowerCase().equals("month") || jComboBox4.getSelectedItem().toString().trim().toLowerCase().equals("month")) {
            JOptionPane.showMessageDialog(this, "You Have to select the month before submittion.. ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
        } else {

            try {
                int ID = Integer.parseInt(Id.getText());
                double BC = Double.parseDouble(Balance.getText());
                int PH = Integer.parseInt(phonenumber.getText());
                int date = Integer.parseInt(jTextField8.getText()) + Integer.parseInt(jTextField9.getText()) + Integer.parseInt(jTextField10.getText())
                        + Integer.parseInt(jTextField11.getText());//TO catch all number Format exception;
                String query = "INSERT INTO CLIENT_INFORMATION VALUES(?,?,?,?,?,?,?,?,?,?)";
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/bankdatabase   ", "bank", "1234");

                pst = con.prepareStatement(query);
                pst.setString(2, Firstname.getText());
                pst.setString(3, Lastname.getText());
                pst.setString(10, Balance.getText());
                pst.setString(6, jComboBox4.getSelectedItem().toString() + "-" + jTextField8.getText() + "-" + jTextField9.getText());
                pst.setString(7, jComboBox3.getSelectedItem().toString() + "-" + jTextField10.getText() + "-" + jTextField11.getText());
                pst.setString(4, Email.getText());
                pst.setString(5, Address.getText());
                pst.setString(9, Password.getText());
                pst.setString(9, Password1.getText());
                pst.setString(1, Id.getText());
                pst.setString(8, phonenumber.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "REGISTER SUCCESSFULLY...", "MM BANK", JOptionPane.PLAIN_MESSAGE);

                try {

                    con.close();

                } catch (SQLException e) {
                }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, " INVALID INPUT For ID or BALANCE or Dates or Phone num. ", "MM BANK", JOptionPane.PLAIN_MESSAGE);
            }
            jTextField9.setForeground(Color.GRAY);
            jTextField10.setForeground(Color.GRAY);
            jTextField11.setForeground(Color.GRAY);
            jTextField8.setForeground(Color.GRAY);
            Firstname.setForeground(Color.GRAY);
            Lastname.setForeground(Color.GRAY);
            Firstname.setText("First Name");
            Lastname.setText("Last Name");
            Id.setText("");
            Email.setText("");
            Balance.setText("");
            Address.setText("");
            phonenumber.setText("");
            Password.setText("");
            Password1.setText("");
            jTextField9.setText("YEAR");
            jTextField10.setText("DAY");
            jTextField11.setText("YEAR");
            jTextField8.setText("DAY");
            jComboBox3.setSelectedIndex(0);;
            jComboBox4.setSelectedIndex(0);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        if (jTextField10.getText().trim().toLowerCase().equals("day")) {
            jTextField10.setText("");
            jTextField10.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked

    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained

        if (jTextField11.getText().trim().toLowerCase().equals("year")) {
            jTextField11.setText("");
            jTextField11.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked

    }//GEN-LAST:event_jTextField11MouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Register1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Balance;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Firstname;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Lastname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField Password1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField phonenumber;
    // End of variables declaration//GEN-END:variables
}
