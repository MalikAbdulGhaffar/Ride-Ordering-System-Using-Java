package vehler;

public class DriverSignUp extends javax.swing.JFrame {
    private String user;
    private String name,fname,age,gender,pass,cnic,contactNo,dob;

    public DriverSignUp()
    {
        
    }
    public DriverSignUp(String user,String name,String fname,String age, String gender, String pass,String cnic,String contactNo,String dob) {
       
        initComponents();
        this.user=user;
        this.name=name;
        this.fname=fname;
        this.age=age;
        this.gender=gender;
        this.pass=pass;
        this.cnic=cnic;
        this.contactNo=contactNo;
        this.dob=dob;
        mm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        showModel = new javax.swing.JTextField();
        showVersion = new javax.swing.JTextField();
        showPlateNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        showColor = new javax.swing.JTextField();
        showRDate = new javax.swing.JTextField();
        showCarName = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        showEDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkCar = new javax.swing.JCheckBox();
        checkRickshaw = new javax.swing.JCheckBox();
        checkBike = new javax.swing.JCheckBox();
        nextButton = new javax.swing.JButton();
        SignInButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        checkCarAC = new javax.swing.JCheckBox();
        checkCarPr = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 51, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 0));
        kGradientPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Color");

        showModel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showModel.setForeground(new java.awt.Color(102, 102, 102));
        showModel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        showVersion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showVersion.setForeground(new java.awt.Color(102, 102, 102));
        showVersion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        showPlateNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showPlateNo.setForeground(new java.awt.Color(102, 102, 102));
        showPlateNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Model");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Version");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Exp Date");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("PlateNo");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Reg Date");

        showColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showColor.setForeground(new java.awt.Color(102, 102, 102));
        showColor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        showRDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showRDate.setForeground(new java.awt.Color(102, 102, 102));
        showRDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        showCarName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showCarName.setForeground(new java.awt.Color(102, 102, 102));
        showCarName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Name");

        showEDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showEDate.setForeground(new java.awt.Color(102, 102, 102));
        showEDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showRDate, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(showPlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showModel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showColor, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel22)
                            .addGap(18, 18, 18)
                            .addComponent(showVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showCarName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(showEDate, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(showVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(showColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(showPlateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(showRDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(showEDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(showCarName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(720, 140, 370, 480);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Do you want to Sign In?");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(270, 490, 300, 31);

        checkCar.setBackground(new java.awt.Color(255, 255, 255));
        checkCar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkCar.setForeground(new java.awt.Color(204, 204, 204));
        checkCar.setText("Car");
        checkCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(checkCar);
        checkCar.setBounds(100, 270, 80, 21);

        checkRickshaw.setBackground(new java.awt.Color(255, 255, 255));
        checkRickshaw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkRickshaw.setForeground(new java.awt.Color(204, 204, 204));
        checkRickshaw.setText("Rickshaw");
        checkRickshaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRickshawActionPerformed(evt);
            }
        });
        kGradientPanel1.add(checkRickshaw);
        checkRickshaw.setBounds(400, 270, 80, 21);

        checkBike.setBackground(new java.awt.Color(255, 255, 255));
        checkBike.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkBike.setForeground(new java.awt.Color(204, 204, 204));
        checkBike.setText("Bike");
        checkBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBikeActionPerformed(evt);
            }
        });
        kGradientPanel1.add(checkBike);
        checkBike.setBounds(490, 270, 60, 21);

        nextButton.setBackground(new java.awt.Color(153, 102, 255));
        nextButton.setForeground(new java.awt.Color(102, 102, 102));
        nextButton.setText("Next");
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextButtonMouseEntered(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(nextButton);
        nextButton.setBounds(280, 340, 80, 30);

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

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("SignIn");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        SignInButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        kGradientPanel1.add(SignInButton);
        SignInButton.setBounds(280, 530, 140, 40);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("What do you drive?");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(220, 200, 300, 31);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hurry Up! Passengers are waiting for you.");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(80, 40, 500, 50);
        kGradientPanel1.add(jSeparator3);
        jSeparator3.setBounds(80, 90, 480, 20);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Your Vehicle's Details");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(770, 60, 280, 50);
        kGradientPanel1.add(jSeparator4);
        jSeparator4.setBounds(760, 110, 290, 20);

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");

        javax.swing.GroupLayout xpanelLayout = new javax.swing.GroupLayout(xpanel);
        xpanel.setLayout(xpanelLayout);
        xpanelLayout.setHorizontalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        xpanelLayout.setVerticalGroup(
            xpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-");

        javax.swing.GroupLayout ypanelLayout = new javax.swing.GroupLayout(ypanel);
        ypanel.setLayout(ypanelLayout);
        ypanelLayout.setHorizontalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        ypanelLayout.setVerticalGroup(
            ypanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ypanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
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
        jPanel2.setBounds(1200, 10, 67, 30);

        checkCarAC.setBackground(new java.awt.Color(255, 255, 255));
        checkCarAC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkCarAC.setForeground(new java.awt.Color(204, 204, 204));
        checkCarAC.setText("Car(AC)");
        checkCarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCarACActionPerformed(evt);
            }
        });
        kGradientPanel1.add(checkCarAC);
        checkCarAC.setBounds(190, 270, 80, 21);

        checkCarPr.setBackground(new java.awt.Color(255, 255, 255));
        checkCarPr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkCarPr.setForeground(new java.awt.Color(204, 204, 204));
        checkCarPr.setText("Car(Premium)");
        checkCarPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCarPrActionPerformed(evt);
            }
        });
        kGradientPanel1.add(checkCarPr);
        checkCarPr.setBounds(280, 270, 110, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1293, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void mm()
    {
    showModel.setEditable(false);
    showVersion.setEditable(false);
    showColor.setEditable(false);
    showPlateNo.setEditable(false);
    showRDate.setEditable(false);
    showEDate.setEditable(false);
    showCarName.setEditable(false);
    }
    private void checkCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCarActionPerformed

    private void checkRickshawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRickshawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRickshawActionPerformed

    private void checkBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBikeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBikeActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void SignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        LoginMain reg=new LoginMain();
        reg.setVisible(true);
    }//GEN-LAST:event_SignInButtonMouseClicked

    private void SignInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseEntered
        // TODO add your handling code here:
        //SignInButton.setBackground(new Color(204,153,255));
    }//GEN-LAST:event_SignInButtonMouseEntered

    private void SignInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseExited
        // TODO add your handling code here:
        //SignInButton.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_SignInButtonMouseExited

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        String type;        
if(checkCar.isSelected())
{
    
        DriverCar driver=new DriverCar(name,fname,age,gender,user,pass,"Car(Mini)",cnic,contactNo,dob);
        driver.addDriver();
    type=checkCar.getText();
    Car car=new Car();
   int result;
    result = car.assignCar();
    String model=car.getRModel(result);
    String version=car.getRVersion(result);
    String color=car.getRColor(result);
    String plateNo=car.getRPlateNo(result);
    String rDate=car.getRRDate(result);
    String eDate=car.getEDate(result);
    String carName=car.getCarName(result);
    showModel.setText(model);
    showVersion.setText(version);
    showColor.setText(color);
    showPlateNo.setText(plateNo);
    showRDate.setText(rDate);
    showEDate.setText(eDate);
    showCarName.setText(carName);
    DriverCar dd=new DriverCar();
    dd.insertDriverCarData(user,name,type,plateNo,result,carName);
}

else if(checkCarAC.isSelected())
{
    
     DriverCarAC driverac =new DriverCarAC(name,fname,age,gender,user,pass,"Car(AC)",cnic,contactNo,dob);
     driverac.addDriver();
     type=checkCarAC.getText();
    CarAC carac=new CarAC();
   int result;
    result = carac.assignCar();
    String model=carac.getRModel(result);
    String version=carac.getRVersion(result);
    String color=carac.getRColor(result);
    String plateNo=carac.getRPlateNo(result);
    String rDate=carac.getRRDate(result);
    String eDate=carac.getEDate(result);
    String carName=carac.getCarName(result);
    showModel.setText(model);
    showVersion.setText(version);
    showColor.setText(color);
    showPlateNo.setText(plateNo);
    showRDate.setText(rDate);
    showEDate.setText(eDate);
    showCarName.setText(carName);
    DriverCarAC ad=new DriverCarAC();
    ad.insertDriverCarData(user,name,type,plateNo,result,carName);
}
else if(checkCarPr.isSelected())
{
    
     DriverCarPr driverpr =new DriverCarPr(name,fname,age,gender,user,pass,"Car(Premium)",cnic,contactNo,dob);
     driverpr.addDriver();
     type=checkCarPr.getText();
    CarPremium carpr =new CarPremium();
   int result;
    result = carpr.assignCar();
    String model=carpr.getRModel(result);
    String version=carpr.getRVersion(result);
    String color=carpr.getRColor(result);
    String plateNo=carpr.getRPlateNo(result);
    String rDate=carpr.getRRDate(result);
    String eDate=carpr.getEDate(result);
    String carName=carpr.getCarName(result);
    showModel.setText(model);
    showVersion.setText(version);
    showColor.setText(color);
    showPlateNo.setText(plateNo);
    showRDate.setText(rDate);
    showEDate.setText(eDate);
    showCarName.setText(carName);
    DriverCarPr pr=new DriverCarPr();
    pr.insertDriverCarData(user,name,type,plateNo,result,carName);
}
else if(checkRickshaw.isSelected())
{
    
    DriverRickshaw driverri=new DriverRickshaw(name,fname,age,gender,user,pass,"Rickshaw",cnic,contactNo,dob);
        driverri.addDriver();
        type=checkRickshaw.getText();
    Rickshaw rickshaw=new Rickshaw();
   int result;
    result = rickshaw.assignRickshaw();
    String model=rickshaw.getRModel(result);
    String version=rickshaw.getRVersion(result);
    String color=rickshaw.getRColor(result);
    String plateNo=rickshaw.getRPlateNo(result);
    String rDate=rickshaw.getRRDate(result);
    String eDate=rickshaw.getEDate(result);
    String carName=rickshaw.getRickshawName(result);
    showModel.setText(model);
    showVersion.setText(version);
    showColor.setText(color);
    showPlateNo.setText(plateNo);
    showRDate.setText(rDate);
    showEDate.setText(eDate);
    showCarName.setText(carName);
    DriverRickshaw drr=new DriverRickshaw();
    drr.insertDriverRickshawData(user,name,type,plateNo,result,carName);
}
else if(checkBike.isSelected())
{
    
    DriverBike driverb=new DriverBike(name,fname,age,gender,user,pass,"Bike",cnic,contactNo,dob);
        driverb.addDriver();
        type=checkBike.getText();
    Bike bike=new Bike();
   int result;
    result = bike.assignBike();
    String model=bike.getBModel(result);
    String version=bike.getBVersion(result);
    String color=bike.getBColor(result);
    String plateNo=bike.getBPlateNo(result);
    String rDate=bike.getBRDate(result);
    String eDate=bike.getEDate(result);
    String carName=bike.getBikeName(result);
    showModel.setText(model);
    showVersion.setText(version);
    showColor.setText(color);
    showPlateNo.setText(plateNo);
    showRDate.setText(rDate);
    showEDate.setText(eDate);
    showCarName.setText(carName);
    DriverBike bbb=new DriverBike();
    bbb.insertDriverBikeData(user,name,type,plateNo,result,carName);
}
    }//GEN-LAST:event_nextButtonActionPerformed

    private void nextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseEntered
        // TODO add your handling code here:
        //nextButton.setBackground(new Color(204,153,255));
        
    }//GEN-LAST:event_nextButtonMouseEntered

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
        setState(DriverSignUp.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(0,51,153));
    }//GEN-LAST:event_ypanelMouseExited

    private void checkCarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCarACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCarACActionPerformed

    private void checkCarPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCarPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkCarPrActionPerformed

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
            java.util.logging.Logger.getLogger(DriverSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignInButton;
    private javax.swing.JCheckBox checkBike;
    private javax.swing.JCheckBox checkCar;
    private javax.swing.JCheckBox checkCarAC;
    private javax.swing.JCheckBox checkCarPr;
    private javax.swing.JCheckBox checkRickshaw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField showCarName;
    private javax.swing.JTextField showColor;
    private javax.swing.JTextField showEDate;
    private javax.swing.JTextField showModel;
    private javax.swing.JTextField showPlateNo;
    private javax.swing.JTextField showRDate;
    private javax.swing.JTextField showVersion;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}