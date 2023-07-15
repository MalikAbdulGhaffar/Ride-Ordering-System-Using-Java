package vehler;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registerPassword = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        registerName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        registerFather = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        registerAge = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cnicText = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        contactnoText = new javax.swing.JTextField();
        uu = new javax.swing.JLabel();
        registerUsername = new javax.swing.JTextField();
        registerButton = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        registerAsCombo = new javax.swing.JComboBox();
        checkFemale = new javax.swing.JCheckBox();
        checkMale = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        dobCombo2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        SignInButton = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 255));
        kGradientPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Sign Up ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Register As");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Password");

        registerPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerPassword.setForeground(new java.awt.Color(102, 102, 102));
        registerPassword.setText("jPasswordField1");
        registerPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        registerPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerPasswordFocusGained(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("For A Free Account");

        registerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerName.setForeground(new java.awt.Color(102, 102, 102));
        registerName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Father Name");

        registerFather.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerFather.setForeground(new java.awt.Color(102, 102, 102));
        registerFather.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Age");

        registerAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerAge.setForeground(new java.awt.Color(102, 102, 102));
        registerAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Gender");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 153));
        jLabel33.setText("CNIC No");

        cnicText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cnicText.setForeground(new java.awt.Color(102, 102, 102));
        cnicText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Contact No");

        contactnoText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactnoText.setForeground(new java.awt.Color(102, 102, 102));
        contactnoText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        uu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        uu.setForeground(new java.awt.Color(153, 153, 153));
        uu.setText("Username");

        registerUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerUsername.setForeground(new java.awt.Color(102, 102, 102));
        registerUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        registerButton.setBackground(new java.awt.Color(0, 0, 0));
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registerButtonKeyPressed(evt);
            }
        });
        registerButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("EMAIL");
        registerButton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Register");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        registerButton.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        registerAsCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Driver", "Passenger" }));

        checkFemale.setText("Female");

        checkMale.setText("Male");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("DOB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uu)
                            .addComponent(registerUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jLabel34)
                            .addComponent(contactnoText, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jLabel33)
                            .addComponent(cnicText, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(registerFather, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(registerAsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkMale)
                                .addGap(46, 46, 46)
                                .addComponent(checkFemale))
                            .addComponent(jLabel20)
                            .addComponent(registerAge, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(registerPassword)
                            .addComponent(dobCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerAsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerFather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dobCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel19)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFemale)
                    .addComponent(checkMale))
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(800, 10, 400, 700);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Vehicles at your footsteps");
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(130, 180, 250, 40);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vehicle Management System");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(60, 90, 780, 120);
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(290, 220, 360, 300);

        jPanel2.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(0, 51, 153));
        xpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xpanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xpanelMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("X");

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ypanel.setBackground(new java.awt.Color(0, 51, 153));
        ypanel.setForeground(new java.awt.Color(255, 255, 255));
        ypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ypanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ypanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ypanelMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("-");

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel2);
        jPanel2.setBounds(1220, 10, 104, 30);

        SignInButton.setBackground(new java.awt.Color(0, 0, 0));
        SignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInButtonMouseExited(evt);
            }
        });
        SignInButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("SignIn");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        SignInButton.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(SignInButton);
        SignInButton.setBounds(140, 650, 140, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1344, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        // TODO add your handling code here:
if(registerName.getText(). equals("")||registerFather.getText(). equals("")||registerUsername.getText(). equals("")||registerPassword.getText(). equals("")||registerAge.getText(). equals("")||cnicText.getText().equals("")||contactnoText.getText().equals(""))
{
        JOptionPane.showMessageDialog(null,"Please fill All Fields");

}
else if(checkMale.isSelected()==false&&checkFemale.isSelected()==false)
{
    JOptionPane.showMessageDialog(null,"Please fill All Fields");
}
else
{
    String name=registerName.getText();
    String age=registerAge.getText();
    String fName=registerFather.getText();
    String user=registerUsername.getText();
    String pass=registerPassword.getText();
    String regAs=String.valueOf(registerAsCombo.getSelectedItem());
    String gender=null;
    String cnic=cnicText.getText();
    String contactNo=contactnoText.getText();
    String dob = ((JTextField) dobCombo2.getDateEditor().getUiComponent()).getText();
    if(checkMale.isSelected())
    {
        gender=checkMale.getText();
    }
    else if(checkFemale.isSelected())
    {
        gender=checkFemale.getText();
    }
    if(regAs=="Passenger")
    {
        Passenger passenger=new Passenger(name,fName,age,gender,user,pass,cnic,contactNo,dob);
        passenger.addPassPass();
        
    }
    else if(regAs=="Driver")
    {
        
//           DriverSignUp ds=new DriverSignUp(user,name,fName,age,gender,sec,pass);
        DriverSignUp ds=new DriverSignUp(user,name,fName,age,gender,pass,cnic,contactNo,dob);
            this.setVisible(false);
            ds.setVisible(true);
    }
    registerName.setText("");
       registerUsername.setText("");
        registerPassword.setText("");
        registerFather.setText("");
        registerAge.setText("");
        cnicText.setText("");
        contactnoText.setText("");
//    this.setVisible(false);
//    LoginMain login=new LoginMain();
//    login.setVisible(true);
    
}
    }//GEN-LAST:event_registerButtonMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void registerPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerPasswordFocusGained
        // TODO add your handling code here:
        registerPassword.setText("");
    }//GEN-LAST:event_registerPasswordFocusGained

    private void xpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_xpanelMouseClicked

    private void xpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseEntered
        // TODO add your handling code here:
        //xpanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_xpanelMouseEntered

    private void xpanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xpanelMouseExited
        // TODO add your handling code here:
        //xpanel.setBackground(new Color(0,51,153));
    }//GEN-LAST:event_xpanelMouseExited

    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseClicked
        // TODO add your handling code here:
        setState(RegistrationForm.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
       // ypanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(0,51,153));
    }//GEN-LAST:event_ypanelMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        // TODO add your handling code here:
       // registerButton.setBackground(new Color(204,153,255));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        // TODO add your handling code here:
       // registerButton.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_registerButtonMouseExited

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MouseClicked

    private void SignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        LoginMain reg=new LoginMain();
        reg.setVisible(true);
    }//GEN-LAST:event_SignInButtonMouseClicked

    private void SignInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseEntered
        // TODO add your handling code here:
       // SignInButton.setBackground(new Color(204,153,255));
    }//GEN-LAST:event_SignInButtonMouseEntered

    private void SignInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseExited
        // TODO add your handling code here:
        //SignInButton.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_SignInButtonMouseExited

    private void registerButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonKeyPressed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignInButton;
    private javax.swing.JCheckBox checkFemale;
    private javax.swing.JCheckBox checkMale;
    private javax.swing.JTextField cnicText;
    private javax.swing.JTextField contactnoText;
    private com.toedter.calendar.JDateChooser dobCombo2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField registerAge;
    private javax.swing.JComboBox registerAsCombo;
    private javax.swing.JPanel registerButton;
    private javax.swing.JTextField registerFather;
    private javax.swing.JTextField registerName;
    private javax.swing.JPasswordField registerPassword;
    private javax.swing.JTextField registerUsername;
    private javax.swing.JLabel uu;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}
