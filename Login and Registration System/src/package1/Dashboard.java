/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Uriel Papa
 */
public class Dashboard extends javax.swing.JFrame {
    private String loggedInFname;
    private String loggedInUsername;
    private String mobileNumber;
    private String address;
    private int userId;
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
    
        initComponents();
        editPhoto.setVisible(false);
    // Load the image path from the configuration file
    

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelDisplayImage = new javax.swing.JLabel();
        jLabelSelectedFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelMobileNumber = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editPhoto = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("About Us");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelSelectedFile.setText("upload");
        jLabelSelectedFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelSelectedFileActionPerformed(evt);
            }
        });

        jLabel1.setText("Upload Your Image Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelDisplayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelSelectedFile)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDisplayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSelectedFile)
                .addGap(17, 17, 17))
        );

        jLabel3.setText("Mobile Number:");

        jLabel4.setText("Address: ");

        jButton1.setText("edit info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        editPhoto.setText("edit Image");
        editPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(editPhoto))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelWelcome)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelMobileNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelAddress))
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPhoto)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveImagePathToConfig(String imagePath) {
        try {
            // Save the image path to a configuration file
            java.nio.file.Path configPath = java.nio.file.Paths.get("config.txt");
            java.nio.file.Files.write(configPath, imagePath.getBytes());
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving image path to configuration file", "System Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String loadImagePathFromConfig() {
        try {
            // Read the image path from the configuration file
            java.nio.file.Path configPath = java.nio.file.Paths.get("config.txt");
            if (java.nio.file.Files.exists(configPath)) {
                return new String(java.nio.file.Files.readAllBytes(configPath));
            }
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading image path from configuration file", "System Message", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
private void saveImagePathToDatabase(String imagePath, int userId) {
    try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/isdb", "root", "1234");
         PreparedStatement preparedStatement = cn.prepareStatement("UPDATE reg_tbl SET image_path = ? WHERE user_id = ?")) {

        // Display image path
        JOptionPane.showMessageDialog(null, "Image Path: " + imagePath);

        // Set image path in the prepared statement
        preparedStatement.setString(1, imagePath);

        // Display user ID
        JOptionPane.showMessageDialog(null, "User ID: " + userId);

        // Set user ID in the prepared statement
        preparedStatement.setInt(2, userId);

        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Image path saved successfully for user ID: " + userId);
        } else {
            JOptionPane.showMessageDialog(null, "No rows were affected. Image path not saved.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error in database operation: " + ex.getMessage(), "System Message", JOptionPane.ERROR_MESSAGE);
    }
}
private String loadImagePathFromDatabase() {
    try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/isdb", "root", "1234");
         PreparedStatement preparedStatement = cn.prepareStatement("SELECT image_path FROM reg_tbl WHERE user_id = ?")) {

        preparedStatement.setInt(1, userId);

        try (ResultSet rs = preparedStatement.executeQuery()) {
            if (rs.next()) {
                String imagePath = rs.getString("image_path");
                
                return imagePath;
            }
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error in database operation", "System Message", JOptionPane.ERROR_MESSAGE);
    }
    return null;
}

    private void jLabelSelectedFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelSelectedFileActionPerformed
    JFileChooser fileChooser = new JFileChooser();

    // Allow the user to choose only image files
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        // User selected a file
        java.io.File selectedFile = fileChooser.getSelectedFile();
        String fileName = selectedFile.getName();

        // Display the selected file name on the JLabel
        jLabelSelectedFile.setText("Selected File: " + fileName);

        // Load and display the selected image in a JLabel
        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
        jLabelDisplayImage.setIcon(icon);
        jLabelSelectedFile.setVisible(false);

        // Save the image path to the database
        saveImagePathToDatabase(selectedFile.getAbsolutePath(), getUserId());
    }
    }//GEN-LAST:event_jLabelSelectedFileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
              try {
            // Specify the URL you want to open
            String url = "https://web.facebook.com/yurieyel";

            // Use the Desktop class to open the default web browser
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));
            } else {
                // Handle the case where the Desktop class is not supported
                System.out.println("Desktop is not supported. You can manually open the link: " + url);
            }
        } catch (Exception e) {
            // Handle any exceptions that might occur
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    update_delete update = new update_delete();
                    update.setVisible(true);
                    setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPhotoActionPerformed
        // TODO add your handling code here:
          // Allow the user to choose a new image
    JFileChooser fileChooser = new JFileChooser();

    // Allow the user to choose only image files
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif");
    fileChooser.setFileFilter(filter);

    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        // User selected a file
        java.io.File selectedFile = fileChooser.getSelectedFile();
        String fileName = selectedFile.getName();

        // Display the selected file name on the JLabel
        jLabelSelectedFile.setText("Selected File: " + fileName);

        // Load and display the selected image in a JLabel
        ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
        jLabelDisplayImage.setIcon(icon);
        jLabelSelectedFile.setVisible(false);

        // Save the new image path to the database
        saveImagePathToDatabase(selectedFile.getAbsolutePath(), getUserId());
    }
    }//GEN-LAST:event_editPhotoActionPerformed
    public int getUserId() {
        return userId;
    }
   public void setLoggedInUser(int userId, String fname, String mobileNo, String address)  {
    this.userId = userId;
    this.loggedInFname = fname;
    this.mobileNumber = mobileNo;
    this.address = address;
      String savedImagePath = loadImagePathFromDatabase();
    if (savedImagePath != null && !savedImagePath.isEmpty()) {
        // Load and display the selected image in a JLabel
        ImageIcon icon = new ImageIcon(savedImagePath);
        jLabelDisplayImage.setIcon(icon);
        editPhoto.setVisible(true);
        jLabelSelectedFile.setVisible(false);
    }
    // Update JLabel or any other components to display user information
    jLabelWelcome.setText("Welcome, " + loggedInFname + "!");
    jLabelUsername.setText(loggedInUsername);
    jLabelMobileNumber.setText(mobileNumber);
    jLabelAddress.setText(address);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editPhoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelDisplayImage;
    private javax.swing.JLabel jLabelMobileNumber;
    private javax.swing.JButton jLabelSelectedFile;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}