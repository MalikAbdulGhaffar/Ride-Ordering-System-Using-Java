/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehler;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BookRide extends javax.swing.JFrame {

    /**
     * Creates new form BookRide
     */
    private String username;
    private String name;
    public BookRide(String username,String name) {
        this.username=username;
        this.name=name;
        initComponents();
    }
    public BookRide() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bookRideButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeVehicleButton = new javax.swing.JPanel();
        addVehicleButton5 = new javax.swing.JPanel();
        myRidesButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        fromCombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        xpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ypanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bDis = new javax.swing.JLabel();
        dislbl1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nDis = new javax.swing.JLabel();
        aDis = new javax.swing.JLabel();
        pDis = new javax.swing.JLabel();
        rDis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        bookRideButton.setBackground(new java.awt.Color(0, 0, 0));
        bookRideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookRideButtonMouseExited(evt);
            }
        });
        bookRideButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Book Ride");
        bookRideButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Add_Key_25px.png"))); // NOI18N
        bookRideButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        removeVehicleButton.setBackground(new java.awt.Color(51, 0, 102));
        removeVehicleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeVehicleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeVehicleButtonMouseExited(evt);
            }
        });
        removeVehicleButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleButton5.setBackground(new java.awt.Color(51, 0, 102));
        addVehicleButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButton5MouseExited(evt);
            }
        });
        addVehicleButton5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        removeVehicleButton.add(addVehicleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        myRidesButton.setBackground(new java.awt.Color(0, 0, 0));
        myRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myRidesButtonMouseExited(evt);
            }
        });
        myRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("My Rides");
        myRidesButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        myRidesButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        logOutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Log Out");
        logOutButton.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookRideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(removeVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                    .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(bookRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(myRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 646));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Where do you want to go?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, -1, -1));

        toCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gulshan e Iqbal", "Shah Faisal", "Gulistan e Jauhar", "Shahre Faisal", "DHA " }));
        toCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toComboActionPerformed(evt);
            }
        });
        jPanel2.add(toCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 230, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Select your Ride.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        fromCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gulshan e Iqbal", "Shah Faisal", "Gulistan e Jauhar", "Shahre Faisal", "DHA " }));
        fromCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromComboActionPerformed(evt);
            }
        });
        jPanel2.add(fromCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 230, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("TOTAL Fare");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Car (Premium)");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 150, 80));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Rickshaw");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 130, 70));

        jPanel4.setOpaque(false);

        xpanel.setBackground(new java.awt.Color(255, 255, 255));
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

        ypanel.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(ypanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(xpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Car(Mini)");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 150, 80));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Car (AC)");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 150, 80));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Bike");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, -1, 70));

        jButton1.setText("Confirm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 120, 40));

        bDis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(bDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, 70, 30));

        dislbl1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(dislbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 70, 30));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Select your pickup location");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("TOTAL DISTANCE");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        nDis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(nDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 80, 30));

        aDis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(aDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 70, 30));

        pDis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(pDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 70, 30));

        rDis.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(rDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1350, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookRideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookRideButtonMouseClicked

    private void bookRideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bookRideButtonMouseEntered

    private void bookRideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookRideButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bookRideButtonMouseExited

    private void addVehicleButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseEntered

    private void addVehicleButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton5MouseExited

    private void removeVehicleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_removeVehicleButtonMouseEntered

    private void removeVehicleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_removeVehicleButtonMouseExited

    private void myRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseClicked
        // TODO add your handling code here:
        MyRides mr=new MyRides(username,name);
        this.setVisible(false);
        mr.setVisible(true);
    }//GEN-LAST:event_myRidesButtonMouseClicked

    private void myRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_myRidesButtonMouseEntered

    private void myRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myRidesButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_myRidesButtonMouseExited

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutButtonMouseExited

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
        //xpanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_xpanelMouseExited

    private void ypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseClicked
        // TODO add your handling code here:
        setState(BookRide.ICONIFIED);
    }//GEN-LAST:event_ypanelMouseClicked

    private void ypanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseEntered
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(153,51,255));
    }//GEN-LAST:event_ypanelMouseEntered

    private void ypanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ypanelMouseExited
        // TODO add your handling code here:
        //ypanel.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_ypanelMouseExited

    private void fromComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromComboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fromComboActionPerformed

    private void toComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toComboActionPerformed

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
        //jPanel1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        //jPanel1.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        String currentLocation=String.valueOf(toCombo.getSelectedItem());
        String finalLocation=String.valueOf(fromCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null,"PLEASE WAIT, WE're FINDING A DRIVER FOR YOU ");
        DriverCarPr dp=new DriverCarPr();
        int iidd=dp.assignDriver(username,name,currentLocation,finalLocation);
        String dname=dp.getRRDriverName(iidd);
        String cname=dp.getRRCarName(iidd);
        JOptionPane.showMessageDialog(null,"YOUR RIDE HAS BEEN BOOKED \n DRIVER's NAME : "+dname+"\n CAR NAME : "+cname);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        // TODO add your handling code here:
        //jPanel7.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        // TODO add your handling code here:
        //jPanel7.setBackground(new Color(204,204,204));

    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        String currentLocation=String.valueOf(toCombo.getSelectedItem());
        String finalLocation=String.valueOf(fromCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null,"PLEASE WAIT, WE're FINDING A DRIVER FOR YOU ");
        DriverRickshaw dg=new DriverRickshaw();
        int iidd=dg.assignDriver(username,name,currentLocation,finalLocation);
        String dname=dg.getRRDriverName(iidd);
        String cname=dg.getRRRickshawName(iidd);
        JOptionPane.showMessageDialog(null,"YOUR RIDE HAS BEEN BOOKED \n DRIVER's NAME : "+dname+"\n RICKSHAW NAME : "+cname);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        String currentLocation=String.valueOf(toCombo.getSelectedItem());
        String finalLocation=String.valueOf(fromCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null,"PLEASE WAIT, WE're FINDING A DRIVER FOR YOU ");
        DriverCar dr=new DriverCar();
        int find=dr.assignDriver(username,name,currentLocation,finalLocation);
        String dname=dr.getRRDriverName(find);
        String cname=dr.getRRCarName(find);
        JOptionPane.showMessageDialog(null,"YOUR RIDE HAS BEEN BOOKED \n DRIVER's NAME : "+dname+"\n CAR NAME : "+cname);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        String currentLocation=String.valueOf(toCombo.getSelectedItem());
        String finalLocation=String.valueOf(fromCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null,"PLEASE WAIT, WE're FINDING A DRIVER FOR YOU ");
        DriverCarAC dc=new DriverCarAC();
        int iidd=dc.assignDriver(username,name,currentLocation,finalLocation);
        String dname=dc.getRRDriverName(iidd);
        String cname=dc.getRRCarName(iidd);
        JOptionPane.showMessageDialog(null,"YOUR RIDE HAS BEEN BOOKED \n DRIVER's NAME : "+dname+"\n CAR NAME : "+cname);
      
    }//GEN-LAST:event_jPanel6MouseClicked

    
    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
         String currentLocation=String.valueOf(toCombo.getSelectedItem());
        String finalLocation=String.valueOf(fromCombo.getSelectedItem());
        JOptionPane.showMessageDialog(null,"PLEASE WAIT, WE're FINDING A Rider FOR YOU ");
        DriverBike dk=new DriverBike();
        int iidd=dk.assignDriver(username,name,currentLocation,finalLocation);
        String dname=dk.getRRDriverName(iidd);
        String cname=dk.getBBBikeName(iidd);
        JOptionPane.showMessageDialog(null,"YOUR RIDE HAS BEEN BOOKED \n DRIVER's NAME : "+dname+"\n RICKSHAW NAME : "+cname);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        double distance;
        
        String value = fromCombo.getSelectedItem().toString();
        String value1 = toCombo.getSelectedItem().toString();
        double base,a,b,c,d,e;
        
        if(value.contains("Gulshan e Iqbal") && value1.contains("Shah Faisal")){
            distance = 9;
            dislbl1.setText(String.valueOf(distance+ " km"));
            e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
        else if(value.contains("Gulshan e Iqbal") && value1.contains("Gulistan e Jauhar")){
            distance = 7;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Gulshan e Iqbal") && value1.contains("Shahre e Faisal")){
           distance = 13;
            dislbl1.setText(String.valueOf(distance + " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Gulshan e Iqbal") && value1.contains("DHA")){
            distance = 18;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
        
        else if(value.contains("Shah Faisal") && value1.contains("Gulshan e Iqbal")){
            distance = 9;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Shah Faisal") && value1.contains("Gulistan e Jauhar")){
            distance = 8;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Shah Faisal") && value1.contains("Shahre Faisal")){
            distance = 6;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Shah Faisal") && value1.contains("DHA")){
            distance = 19;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
        
          else if(value.contains("Gulistan e Jauhar") && value1.contains("Gulshan e Iqbal")){
            distance = 7;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }  
         else if(value.contains("Gulistan e Jauhar") && value1.contains("Shah Faisal")){
            distance = 8.4;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Gulistan e Jauhar") && value1.contains("Shahre Faisal")){
            distance = 14;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Gulistan e Jauhar") && value1.contains("DHA")){
            distance = 25;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
        
         else if(value.contains("Shahre Faisal") && value1.contains("Gulshan e Iqbal")){
            distance = 13;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Shahre Faisal") && value1.contains("Shah Faisal")){
            distance = 6.4;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Shahre Faisal") && value1.contains("Gulistan e Jauhar")){
            distance = 14;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("Shahre Faisal") && value1.contains("DHA")){
            distance = 12.3;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
        
         else if(value.contains("DHA") && value1.contains("Gulshan e Iqbal")){
            distance = 18;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("DHA") && value1.contains("Shah Faisal")){
            distance = 19;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("DHA") && value1.contains("Gulistan e Jauhar")){
            distance = 25;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
         else if(value.contains("DHA") && value1.contains("Shahre Faisal")){
            distance = 12;
            dislbl1.setText(String.valueOf(distance+ " km"));
             e= fareCal5(distance, 60);
            d=fareCal4(distance, 80);
            a=fareCal1(distance, 106);
            b= fareCal2(distance, 120);
            c= fareCal3(distance, 135);
            
            nDis.setText(String.valueOf(a));
            aDis.setText(String.valueOf(b));
            pDis.setText(String.valueOf(c));
            rDis.setText(String.valueOf(d));
            bDis.setText(String.valueOf(e));
        }
        


    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    public double fareCal1(double Tdistance, double baseFare){
        double TFares = Tdistance * baseFare;
        return TFares;
    }
     public double fareCal2(double Tdistance, double baseFare){
        double TFares = Tdistance * baseFare;
        return TFares;
    }
      public double fareCal3(double Tdistance, double baseFare){
        double TFares = Tdistance * baseFare;
        return TFares;
    }
       public double fareCal4(double Tdistance, double baseFare){
        double TFares = Tdistance * baseFare;
        return TFares;
    }
       
       public double fareCal5(double Tdistance, double baseFare){
        double TFares = Tdistance * baseFare;
        return TFares;
    }
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
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookRide().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel aDis;
    private javax.swing.JPanel addVehicleButton5;
    public javax.swing.JLabel bDis;
    private javax.swing.JPanel bookRideButton;
    public javax.swing.JLabel dislbl1;
    private javax.swing.JComboBox fromCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JPanel myRidesButton;
    public javax.swing.JLabel nDis;
    public javax.swing.JLabel pDis;
    public javax.swing.JLabel rDis;
    private javax.swing.JPanel removeVehicleButton;
    private javax.swing.JComboBox toCombo;
    private javax.swing.JPanel xpanel;
    private javax.swing.JPanel ypanel;
    // End of variables declaration//GEN-END:variables
}
