package vehler;

import java.awt.Color;
import javax.swing.JOptionPane;

public class CurrentRide extends javax.swing.JFrame {

    int billCar;
    int billCarAC;
    int billCarPr;
        int billRickshaw;
        int billBike;
    private String username,type;
    public CurrentRide() {
        initComponents();
    }
    public CurrentRide(String username,String type)
    {
        initComponents();
        this.username=username;
        this.type=type;
        updateHeading.setVisible(false);
        checkAtPickup.setVisible(false);
        checkRunning.setVisible(false);
        updateButton.setVisible(false);
        calculateLabel.setVisible(false);
        kmLabel.setVisible(false);
        inkmLabel.setVisible(false);
        kmCombo.setVisible(false);
        calculateButton.setVisible(false);
        billLabel.setVisible(false);
        billText.setVisible(false);
        receivedButton.setVisible(false);
        pkrLabel.setVisible(false);
        mm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        checkRidesButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        removeVehicleButton = new javax.swing.JPanel();
        addVehicleButton5 = new javax.swing.JPanel();
        currentRideButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        settingsButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        checkRidesButton1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        removeVehicleButton1 = new javax.swing.JPanel();
        addVehicleButton6 = new javax.swing.JPanel();
        currentRideButton1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        settingsButton1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        logOutButton1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        checkRidesButton2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        removeVehicleButton2 = new javax.swing.JPanel();
        addVehicleButton7 = new javax.swing.JPanel();
        currentRideButton2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        settingsButton2 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        logOutButton2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        checkRidesButton3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        removeVehicleButton3 = new javax.swing.JPanel();
        addVehicleButton8 = new javax.swing.JPanel();
        currentRideButton3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        logOutButton3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pkrLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        firstHeadline = new javax.swing.JLabel();
        checkAtPickup = new javax.swing.JCheckBox();
        checkRunning = new javax.swing.JCheckBox();
        updateButton = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        billLabel = new javax.swing.JLabel();
        calculateLabel = new javax.swing.JLabel();
        kmCombo = new javax.swing.JComboBox();
        kmLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        updateHeading = new javax.swing.JLabel();
        billText = new javax.swing.JTextField();
        inkmLabel = new javax.swing.JLabel();
        receivedButton = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Vehler");

        checkRidesButton.setBackground(new java.awt.Color(51, 0, 102));
        checkRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseExited(evt);
            }
        });
        checkRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Check Rides");
        checkRidesButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        checkRidesButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

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

        currentRideButton.setBackground(new java.awt.Color(51, 0, 102));
        currentRideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseExited(evt);
            }
        });
        currentRideButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Current Ride");
        currentRideButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        currentRideButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        settingsButton.setBackground(new java.awt.Color(51, 0, 102));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Settings");
        settingsButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Settings_25px.png"))); // NOI18N
        settingsButton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton.setBackground(new java.awt.Color(51, 0, 102));
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

        jPanel4.setBackground(new java.awt.Color(51, 0, 102));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Vehler");

        checkRidesButton1.setBackground(new java.awt.Color(51, 0, 102));
        checkRidesButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRidesButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkRidesButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkRidesButton1MouseExited(evt);
            }
        });
        checkRidesButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Check Rides");
        checkRidesButton1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        checkRidesButton1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        removeVehicleButton1.setBackground(new java.awt.Color(51, 0, 102));
        removeVehicleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeVehicleButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeVehicleButton1MouseExited(evt);
            }
        });
        removeVehicleButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleButton6.setBackground(new java.awt.Color(51, 0, 102));
        addVehicleButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButton6MouseExited(evt);
            }
        });
        addVehicleButton6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        removeVehicleButton1.add(addVehicleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        currentRideButton1.setBackground(new java.awt.Color(51, 0, 102));
        currentRideButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentRideButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentRideButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentRideButton1MouseExited(evt);
            }
        });
        currentRideButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Current Ride");
        currentRideButton1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        currentRideButton1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        settingsButton1.setBackground(new java.awt.Color(51, 0, 102));
        settingsButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButton1MouseExited(evt);
            }
        });
        settingsButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Settings");
        settingsButton1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Settings_25px.png"))); // NOI18N
        settingsButton1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton1.setBackground(new java.awt.Color(51, 0, 102));
        logOutButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButton1MouseExited(evt);
            }
        });
        logOutButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Log Out");
        logOutButton1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        jPanel5.setBackground(new java.awt.Color(51, 0, 102));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Vehler");

        checkRidesButton2.setBackground(new java.awt.Color(51, 0, 102));
        checkRidesButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRidesButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkRidesButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkRidesButton2MouseExited(evt);
            }
        });
        checkRidesButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Check Rides");
        checkRidesButton2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        checkRidesButton2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        removeVehicleButton2.setBackground(new java.awt.Color(51, 0, 102));
        removeVehicleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeVehicleButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeVehicleButton2MouseExited(evt);
            }
        });
        removeVehicleButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleButton7.setBackground(new java.awt.Color(51, 0, 102));
        addVehicleButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButton7MouseExited(evt);
            }
        });
        addVehicleButton7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        removeVehicleButton2.add(addVehicleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        currentRideButton2.setBackground(new java.awt.Color(51, 0, 102));
        currentRideButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentRideButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentRideButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentRideButton2MouseExited(evt);
            }
        });
        currentRideButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Current Ride");
        currentRideButton2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        currentRideButton2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        settingsButton2.setBackground(new java.awt.Color(51, 0, 102));
        settingsButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButton2MouseExited(evt);
            }
        });
        settingsButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setText("Settings");
        settingsButton2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Settings_25px.png"))); // NOI18N
        settingsButton2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        logOutButton2.setBackground(new java.awt.Color(51, 0, 102));
        logOutButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButton2MouseExited(evt);
            }
        });
        logOutButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setText("Log Out");
        logOutButton2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkRidesButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(removeVehicleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(settingsButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentRideButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(checkRidesButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(currentRideButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(logOutButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkRidesButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(removeVehicleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(settingsButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentRideButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(checkRidesButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(currentRideButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(logOutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkRidesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(removeVehicleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                            .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(currentRideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(checkRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(currentRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVehicleButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkRidesButton3.setBackground(new java.awt.Color(0, 0, 0));
        checkRidesButton3.setToolTipText("");
        checkRidesButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRidesButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkRidesButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkRidesButton3MouseExited(evt);
            }
        });
        checkRidesButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Check Rides");
        checkRidesButton3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        checkRidesButton3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        jPanel6.add(checkRidesButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 390, 47));

        removeVehicleButton3.setBackground(new java.awt.Color(51, 0, 102));
        removeVehicleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeVehicleButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeVehicleButton3MouseExited(evt);
            }
        });
        removeVehicleButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addVehicleButton8.setBackground(new java.awt.Color(51, 0, 102));
        addVehicleButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addVehicleButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addVehicleButton8MouseExited(evt);
            }
        });
        addVehicleButton8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        removeVehicleButton3.add(addVehicleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.add(removeVehicleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 280, 93, -1));

        currentRideButton3.setBackground(new java.awt.Color(0, 0, 0));
        currentRideButton3.setToolTipText("");
        currentRideButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentRideButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentRideButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentRideButton3MouseExited(evt);
            }
        });
        currentRideButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setText("Current Ride");
        currentRideButton3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        currentRideButton3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        jPanel6.add(currentRideButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 234, 390, -1));

        logOutButton3.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton3.setToolTipText("");
        logOutButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButton3MouseExited(evt);
            }
        });
        logOutButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setText("Log Out");
        logOutButton3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 30));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 57, 30));

        jPanel6.add(logOutButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 390, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pkrLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        pkrLabel.setForeground(new java.awt.Color(102, 102, 102));
        pkrLabel.setText("(In PKR)");
        jPanel1.add(pkrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, -1, -1));

        confirmButton.setBackground(new java.awt.Color(255, 255, 255));
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButtonMouseExited(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Approval_104px_1.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout confirmButtonLayout = new javax.swing.GroupLayout(confirmButton);
        confirmButton.setLayout(confirmButtonLayout);
        confirmButtonLayout.setHorizontalGroup(
            confirmButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmButtonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        confirmButtonLayout.setVerticalGroup(
            confirmButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 200, 150));

        firstHeadline.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        firstHeadline.setForeground(new java.awt.Color(51, 0, 102));
        firstHeadline.setText("Press This To Check If You've Any Current Ride");
        jPanel1.add(firstHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        checkAtPickup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkAtPickup.setText("AtPickup");
        jPanel1.add(checkAtPickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        checkRunning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkRunning.setText("Running");
        jPanel1.add(checkRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        updateButton.setBackground(new java.awt.Color(255, 255, 255));
        updateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setText("Update");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });

        javax.swing.GroupLayout updateButtonLayout = new javax.swing.GroupLayout(updateButton);
        updateButton.setLayout(updateButtonLayout);
        updateButtonLayout.setHorizontalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel42)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        updateButtonLayout.setVerticalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 100, 40));

        billLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        billLabel.setForeground(new java.awt.Color(51, 0, 102));
        billLabel.setText("The Bill Is");
        jPanel1.add(billLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        calculateLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        calculateLabel.setForeground(new java.awt.Color(51, 0, 102));
        calculateLabel.setText("Calculate Bill");
        jPanel1.add(calculateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        kmCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9\t", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        jPanel1.add(kmCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 40, -1));

        kmLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        kmLabel.setForeground(new java.awt.Color(102, 102, 102));
        kmLabel.setText("Km covered:");
        jPanel1.add(kmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        calculateButton.setBackground(new java.awt.Color(255, 255, 255));
        calculateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateButtonMouseExited(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Calculate");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });

        javax.swing.GroupLayout calculateButtonLayout = new javax.swing.GroupLayout(calculateButton);
        calculateButton.setLayout(calculateButtonLayout);
        calculateButtonLayout.setHorizontalGroup(
            calculateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculateButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel46)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        calculateButtonLayout.setVerticalGroup(
            calculateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculateButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, 40));

        updateHeading.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        updateHeading.setForeground(new java.awt.Color(51, 0, 102));
        updateHeading.setText("Update your current Ride Status");
        jPanel1.add(updateHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        billText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        billText.setForeground(new java.awt.Color(102, 102, 102));
        billText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(billText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 240, -1));

        inkmLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        inkmLabel.setForeground(new java.awt.Color(102, 102, 102));
        inkmLabel.setText("(In Km)");
        jPanel1.add(inkmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        receivedButton.setBackground(new java.awt.Color(255, 255, 255));
        receivedButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 255), 3));
        receivedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receivedButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                receivedButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                receivedButtonMouseExited(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("Received");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel49MouseExited(evt);
            }
        });

        javax.swing.GroupLayout receivedButtonLayout = new javax.swing.GroupLayout(receivedButton);
        receivedButton.setLayout(receivedButtonLayout);
        receivedButtonLayout.setHorizontalGroup(
            receivedButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receivedButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel49)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        receivedButtonLayout.setVerticalGroup(
            receivedButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receivedButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(receivedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, 40));

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 1030, 646));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1440, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   public void mm()
   {
       billText.setEditable(false);
   }
    private void checkRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseClicked
    }//GEN-LAST:event_checkRidesButtonMouseClicked

    private void checkRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButtonMouseEntered

    private void checkRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButtonMouseExited

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

    private void currentRideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseClicked
        // TODO add your handling code here:
        CurrentRide cr= new CurrentRide(username,type);
        this.setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_currentRideButtonMouseClicked

    private void currentRideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButtonMouseEntered

    private void currentRideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButtonMouseExited

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonMouseExited

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

    private void checkRidesButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButton1MouseClicked

    private void checkRidesButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButton1MouseEntered

    private void checkRidesButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButton1MouseExited

    private void addVehicleButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton6MouseEntered

    private void addVehicleButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton6MouseExited

    private void removeVehicleButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_removeVehicleButton1MouseEntered

    private void removeVehicleButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_removeVehicleButton1MouseExited

    private void currentRideButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton1MouseClicked
        // TODO add your handling code here:
        CurrentRide cr= new CurrentRide(username,type);
        this.setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_currentRideButton1MouseClicked

    private void currentRideButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButton1MouseEntered

    private void currentRideButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButton1MouseExited

    private void settingsButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButton1MouseClicked

    private void settingsButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButton1MouseEntered

    private void settingsButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButton1MouseExited

    private void logOutButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton1MouseClicked
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButton1MouseClicked

    private void logOutButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutButton1MouseEntered

    private void logOutButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton1MouseExited
        // TODO add your handling code here:
        //logOutButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_logOutButton1MouseExited

    private void checkRidesButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton2MouseClicked
        // TODO add your handling code here:
        //        DriverRide driverride=new DriverRide(iidd);
        //        this.setVisible(false);
        //        driverride.setVisible(true);
    }//GEN-LAST:event_checkRidesButton2MouseClicked

    private void checkRidesButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton2MouseEntered
        // TODO add your handling code here:
        //checkRidesButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_checkRidesButton2MouseEntered

    private void checkRidesButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton2MouseExited
        // TODO add your handling code here:
        //checkRidesButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_checkRidesButton2MouseExited

    private void addVehicleButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton7MouseEntered

    private void addVehicleButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton7MouseExited

    private void removeVehicleButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton2MouseEntered
        // TODO add your handling code here:
        //removeVehicleButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_removeVehicleButton2MouseEntered

    private void removeVehicleButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton2MouseExited
        // TODO add your handling code here:
        //removeVehicleButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_removeVehicleButton2MouseExited

    private void currentRideButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton2MouseClicked
        // TODO add your handling code here:
        CurrentRide cr= new CurrentRide(username,type);
        this.setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_currentRideButton2MouseClicked

    private void currentRideButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton2MouseEntered
        // TODO add your handling code here:
        //currentRideButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_currentRideButton2MouseEntered

    private void currentRideButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton2MouseExited
        // TODO add your handling code here:
        //currentRideButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_currentRideButton2MouseExited

    private void settingsButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButton2MouseClicked
        // TODO add your handling code here:
//        DriverSettings ds=new DriverSettings(username,type);
//        this.setVisible(false);
//        ds.setVisible(true);
    }//GEN-LAST:event_settingsButton2MouseClicked

    private void settingsButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButton2MouseEntered
        // TODO add your handling code here:
        //settingsButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_settingsButton2MouseEntered

    private void settingsButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButton2MouseExited
        // TODO add your handling code here:
        //settingsButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_settingsButton2MouseExited

    private void logOutButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton2MouseClicked
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButton2MouseClicked

    private void logOutButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton2MouseEntered
        // TODO add your handling code here:
        //logOutButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_logOutButton2MouseEntered

    private void logOutButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton2MouseExited
        // TODO add your handling code here:
        //logOutButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_logOutButton2MouseExited

    private void checkRidesButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton3MouseClicked
        // TODO add your handling code here:
                DriverRide driverride=new DriverRide(username,type);
                this.setVisible(false);
                driverride.setVisible(true);
    }//GEN-LAST:event_checkRidesButton3MouseClicked

    private void checkRidesButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton3MouseEntered
        // TODO add your handling code here:
        //checkRidesButton3.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_checkRidesButton3MouseEntered

    private void checkRidesButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButton3MouseExited
        // TODO add your handling code here:
        //checkRidesButton3.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_checkRidesButton3MouseExited

    private void addVehicleButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton8MouseEntered

    private void addVehicleButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addVehicleButton8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addVehicleButton8MouseExited

    private void removeVehicleButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton3MouseEntered
        // TODO add your handling code here:
        //removeVehicleButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_removeVehicleButton3MouseEntered

    private void removeVehicleButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeVehicleButton3MouseExited
        // TODO add your handling code here:
        //removeVehicleButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_removeVehicleButton3MouseExited

    private void currentRideButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton3MouseClicked
        // TODO add your handling code here:
        CurrentRide cr= new CurrentRide(username,type);
        this.setVisible(false);
        cr.setVisible(true);
    }//GEN-LAST:event_currentRideButton3MouseClicked

    private void currentRideButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton3MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_currentRideButton3MouseEntered

    private void currentRideButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButton3MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_currentRideButton3MouseExited

    private void logOutButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton3MouseClicked
        // TODO add your handling code here:
        LoginMain lm=new LoginMain();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButton3MouseClicked

    private void logOutButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton3MouseEntered
        // TODO add your handling code here:
        //logOutButton.setBackground(new Color(85,65,118));
    }//GEN-LAST:event_logOutButton3MouseEntered

    private void logOutButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButton3MouseExited
        // TODO add your handling code here:
        //logOutButton.setBackground(new Color(51,0,102));
    }//GEN-LAST:event_logOutButton3MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel40MouseEntered

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseExited
        // TODO add your handling code here:
        //confirmButton.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_confirmButtonMouseExited

    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseEntered
        // TODO add your handling code here:
        //confirmButton.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_confirmButtonMouseEntered

    private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel42MouseExited

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:

   String answer;
        Ride ride=new Ride();
         DateTime dt=new DateTime();
        if(type=="Car(Mini)")
        {
           
        if(checkAtPickup.isSelected())
        {
            answer="AtPickUp";
            ride.updateRideStatus(username,answer);
        }
        else if(checkRunning.isSelected())
        {
           
            String time=dt.getTime();
            String date=dt.getDate();
            answer="Running";
            ride.updateRideStatus(username,answer);
          
            ride.updateStartTimeDateCar(username,date,time);
        }
        }
        
          if(type=="Car(Ac)")
        {
           
        if(checkAtPickup.isSelected())
        {
            answer="AtPickUp";
            ride.updateRideStatusAC(username,answer);
        }
        else if(checkRunning.isSelected())
        {
           
            String time=dt.getTime();
            String date=dt.getDate();
            answer="Running";
            ride.updateRideStatusAC(username,answer);
          
            ride.updateStartTimeDateCarAC(username,date,time);
        }
        }
         
       if(type=="Car(Premium)")
        {
           
        if(checkAtPickup.isSelected())
        {
            answer="AtPickUp";
            ride.updateRideStatusPr(username,answer);
        }
        else if(checkRunning.isSelected())
        {
           
            String time=dt.getTime();
            String date=dt.getDate();
            answer="Running";
            ride.updateRideStatusPr(username,answer);
          
            ride.updateStartTimeDateCarPr(username,date,time);
        }
        }
         if(type=="Rickshaw")
        {
            if(checkAtPickup.isSelected())
        {
            answer="AtPickUp";
            ride.updateRideStatusRickshaw(username,answer);
        }
        else if(checkRunning.isSelected())
        {
            answer="Running";
            ride.updateRideStatusRickshaw(username,answer);
            
            String time=dt.getTime();
            String date=dt.getDate();
            ride.updateStartTimeDateRickshaw(username, date, time);
        }
        
        }
         if(type=="Bike")
        {
            if(checkAtPickup.isSelected())
        {
            answer="AtPickUp";
            ride.updateRideStatusBike(username,answer);
        }
        else if(checkRunning.isSelected())
        {
            answer="Running";
            ride.updateRideStatusBike(username,answer);
            
            String time=dt.getTime();
            String date=dt.getDate();
            ride.updateStartTimeDateBike(username, date, time);
        }
        }
        
        
    }//GEN-LAST:event_updateButtonMouseClicked

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        // TODO add your handling code here:
        //updateButton.setBackground(new Color(153,102,255));
        //jLabel42.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        // TODO add your handling code here:
        //updateButton.setBackground(new Color(255,255,255));
        //setForeground(new Color(102,102,102));
    }//GEN-LAST:event_updateButtonMouseExited

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseExited

    private void calculateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseClicked
        // TODO add your handling code here:
        int km=Integer.parseInt(String.valueOf(kmCombo.getSelectedItem()));
        Ride ride=new Ride();
        String billStatus="Unpaid";
        if(type=="Car(Mini)")
        {
//            BookRide br = null;
//            String bill = br.nDis.getText();
//            
            
            billCar=km*106;
            billText.setText(Integer.toString(billCar));
            DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateCar(username,endtime);
            ride.updateBillStatusCar(username, billStatus,billCar);
        }
        else if(type=="Car(AC)")
        {
            billCarAC=km*120;
            billText.setText(Integer.toString(billCarAC));
            DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateCar(username,endtime);
            ride.updateBillStatusCar(username, billStatus,billCarAC);
        }
        else if(type=="Car(Premium)")
        {
            billCarPr=km*135;
            billText.setText(Integer.toString(billCarPr));
            DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateCar(username,endtime);
            ride.updateBillStatusCar(username, billStatus,billCarPr);
        }
        else if(type=="Rickshaw")
        {
            billRickshaw=km*80;
            billText.setText(Integer.toString(billRickshaw));
             DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateRickshaw(username,endtime);
            ride.updateBillStatusRickshaw(username, billStatus,billRickshaw);
        }
        else if(type=="Bike")
        {
            billBike=km*60;
            billText.setText(Integer.toString(billBike));
            DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateBus(username,endtime);
            ride.updateBillStatusBike(username, billStatus,billBike);
        }
    }//GEN-LAST:event_calculateButtonMouseClicked

    private void calculateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseEntered
        // TODO add your handling code here:
         //calculateButton.setBackground(new Color(153,102,255));
        //jLabel46.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_calculateButtonMouseEntered

    private void calculateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseExited
        // TODO add your handling code here:
        //updateButton.setBackground(new Color(255,255,255));
        //jLabel46.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_calculateButtonMouseExited

    private void jLabel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseExited

    private void receivedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedButtonMouseClicked
        // TODO add your handling code here:
        String answer;
        Ride ride=new Ride();
        String billStatus="Paid";
        if(type=="Car(Mini)")
        {
            
            answer="Completed";
            ride.updateBillStatusCar(username, billStatus,billCar);
            ride.updateRideStatus(username,answer);
            
        }
        
         else if(type=="Car(AC)")
        {
            answer="Completed";
            ride.updateBillStatusCarAC(username,billStatus,billCarAC);
            ride.updateRideStatusAC(username,answer);
            
        }
          else if(type=="Car(Premium)")
        {
            answer="Completed";
            ride.updateBillStatusCarPr(username,billStatus,billCarPr);
            ride.updateRideStatusPr(username,answer);
            
        }
        else if(type=="Rickshaw")
        {
            answer="Completed";
            ride.updateBillStatusRickshaw(username,billStatus,billRickshaw);
            ride.updateRideStatusRickshaw(username,answer);
            
        }
        else if(type=="Bike")
        {
            answer="Completed";
            ride.updateBillStatusBike(username,billStatus,billBike);
            ride.updateRideStatusBike(username,answer);
           
        }
    }//GEN-LAST:event_receivedButtonMouseClicked

    private void receivedButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedButtonMouseEntered
        // TODO add your handling code here:
        //receivedButton.setBackground(new Color(153,102,255));
        //jLabel49.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_receivedButtonMouseEntered

    private void receivedButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedButtonMouseExited
        // TODO add your handling code here:
         // receivedButton.setBackground(new Color(255,255,255));
        //jLabel49.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_receivedButtonMouseExited

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        // TODO add your handling code here:
         if(type=="Car(Mini)")
        {
            DriverCar dc=new DriverCar();
            if(dc.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                
                updateHeading.setVisible(true);
        checkAtPickup.setVisible(true);
        checkRunning.setVisible(true);
        updateButton.setVisible(true);
        calculateLabel.setVisible(true);
        kmLabel.setVisible(true);
        inkmLabel.setVisible(true);
        kmCombo.setVisible(true);
        calculateButton.setVisible(true);
        billLabel.setVisible(true);
        billText.setVisible(true);
        receivedButton.setVisible(true);
        pkrLabel.setVisible(true);        
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
        }
        else if(type=="Rickshaw")
        {
            DriverRickshaw dr=new DriverRickshaw();
            if(dr.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                updateHeading.setVisible(true);
        checkAtPickup.setVisible(true);
        checkRunning.setVisible(true);
        updateButton.setVisible(true);
        calculateLabel.setVisible(true);
        kmLabel.setVisible(true);
        inkmLabel.setVisible(true);
        kmCombo.setVisible(true);
        calculateButton.setVisible(true);
        billLabel.setVisible(true);
        billText.setVisible(true);
        receivedButton.setVisible(true);
        pkrLabel.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
            
            
        }
       
         else if(type=="Car(AC)")
        {
            DriverCarAC dc=new DriverCarAC();
            if(dc.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                updateHeading.setVisible(true);
        checkAtPickup.setVisible(true);
        checkRunning.setVisible(true);
        updateButton.setVisible(true);
        calculateLabel.setVisible(true);
        kmLabel.setVisible(true);
        inkmLabel.setVisible(true);
        kmCombo.setVisible(true);
        calculateButton.setVisible(true);
        billLabel.setVisible(true);
        billText.setVisible(true);
        receivedButton.setVisible(true);
        pkrLabel.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
            
            
        }
         
          else if(type=="Car(Premium)")
        {
            DriverCarPr dp=new DriverCarPr();
            if(dp.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                updateHeading.setVisible(true);
        checkAtPickup.setVisible(true);
        checkRunning.setVisible(true);
        updateButton.setVisible(true);
        calculateLabel.setVisible(true);
        kmLabel.setVisible(true);
        inkmLabel.setVisible(true);
        kmCombo.setVisible(true);
        calculateButton.setVisible(true);
        billLabel.setVisible(true);
        billText.setVisible(true);
        receivedButton.setVisible(true);
        pkrLabel.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
            
            
        }
         
           else if(type=="Bike")
        {
            DriverBike dk=new DriverBike();
            if(dk.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                updateHeading.setVisible(true);
        checkAtPickup.setVisible(true);
        checkRunning.setVisible(true);
        updateButton.setVisible(true);
        calculateLabel.setVisible(true);
        kmLabel.setVisible(true);
        inkmLabel.setVisible(true);
        kmCombo.setVisible(true);
        calculateButton.setVisible(true);
        billLabel.setVisible(true);
        billText.setVisible(true);
        receivedButton.setVisible(true);
        pkrLabel.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
            
            
        }
    }//GEN-LAST:event_confirmButtonMouseClicked

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
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentRide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addVehicleButton5;
    private javax.swing.JPanel addVehicleButton6;
    private javax.swing.JPanel addVehicleButton7;
    private javax.swing.JPanel addVehicleButton8;
    private javax.swing.JLabel billLabel;
    private javax.swing.JTextField billText;
    private javax.swing.JPanel calculateButton;
    private javax.swing.JLabel calculateLabel;
    private javax.swing.JCheckBox checkAtPickup;
    private javax.swing.JPanel checkRidesButton;
    private javax.swing.JPanel checkRidesButton1;
    private javax.swing.JPanel checkRidesButton2;
    private javax.swing.JPanel checkRidesButton3;
    private javax.swing.JCheckBox checkRunning;
    private javax.swing.JPanel confirmButton;
    private javax.swing.JPanel currentRideButton;
    private javax.swing.JPanel currentRideButton1;
    private javax.swing.JPanel currentRideButton2;
    private javax.swing.JPanel currentRideButton3;
    private javax.swing.JLabel firstHeadline;
    private javax.swing.JLabel inkmLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox kmCombo;
    private javax.swing.JLabel kmLabel;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JPanel logOutButton1;
    private javax.swing.JPanel logOutButton2;
    private javax.swing.JPanel logOutButton3;
    private javax.swing.JLabel pkrLabel;
    private javax.swing.JPanel receivedButton;
    private javax.swing.JPanel removeVehicleButton;
    private javax.swing.JPanel removeVehicleButton1;
    private javax.swing.JPanel removeVehicleButton2;
    private javax.swing.JPanel removeVehicleButton3;
    private javax.swing.JPanel settingsButton;
    private javax.swing.JPanel settingsButton1;
    private javax.swing.JPanel settingsButton2;
    private javax.swing.JPanel updateButton;
    private javax.swing.JLabel updateHeading;
    // End of variables declaration//GEN-END:variables
}
