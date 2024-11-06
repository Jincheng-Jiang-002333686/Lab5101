/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import model.Patient;
import utility.DatabaseConnector;

/**
 *
 * @author jincheng
 */
public class FormJPanel extends javax.swing.JPanel {
    
    ImageIcon profilePicture;
    JPanel bottomjPanel;

    /**
     * Creates new form FormJPanel
     */
    public FormJPanel(JPanel bottomjPanel) {
        this.bottomjPanel = bottomjPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        calendarPane1 = new com.jcalendar.pane.calendar.CalendarPane();
        jPanel1 = new javax.swing.JPanel();
        TitleJLabel = new javax.swing.JLabel();
        FirstNameJLabel = new javax.swing.JLabel();
        FirstNameJTextField = new javax.swing.JTextField();
        LastNameJTextField = new javax.swing.JTextField();
        LastNameJLabel = new javax.swing.JLabel();
        AgeJLabel = new javax.swing.JLabel();
        AgeJTextField = new javax.swing.JTextField();
        PhoneJLabel = new javax.swing.JLabel();
        PhoneJTextField = new javax.swing.JTextField();
        EmailJLabel = new javax.swing.JLabel();
        EmailJTextField = new javax.swing.JTextField();
        GenderJLabel = new javax.swing.JLabel();
        JRadioButtonMale = new javax.swing.JRadioButton();
        JRadioButtonFemale = new javax.swing.JRadioButton();
        JRadioButtonOthers = new javax.swing.JRadioButton();
        imgJLabel = new javax.swing.JLabel();
        patientJComboBox = new javax.swing.JComboBox<>();
        imageJButton = new javax.swing.JButton();
        patientTypeJLabel = new javax.swing.JLabel();
        imageJLabel = new javax.swing.JLabel();
        SubmitJButton1 = new javax.swing.JButton();
        calendarPane2 = new com.jcalendar.pane.calendar.CalendarPane();

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        TitleJLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        TitleJLabel.setText("Registration");

        FirstNameJLabel.setText("First Name:");

        FirstNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameJTextFieldActionPerformed(evt);
            }
        });

        LastNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameJTextFieldActionPerformed(evt);
            }
        });

        LastNameJLabel.setText("Last Name:");

        AgeJLabel.setText("Age:");

        PhoneJLabel.setText("Phone Number:");

        EmailJLabel.setText("Email:");

        GenderJLabel.setText("Gender:");

        buttonGroupGender.add(JRadioButtonMale);
        JRadioButtonMale.setText("Male");
        JRadioButtonMale.setActionCommand("MALE");
        JRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRadioButtonMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(JRadioButtonFemale);
        JRadioButtonFemale.setText("Female");
        JRadioButtonFemale.setActionCommand("FEMALE");

        buttonGroupGender.add(JRadioButtonOthers);
        JRadioButtonOthers.setText("Prefer Not to Say");
        JRadioButtonOthers.setActionCommand("Others");

        patientJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));
        patientJComboBox.setSelectedIndex(-1);

        imageJButton.setText("Upload Photo");
        imageJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageJButtonActionPerformed(evt);
            }
        });

        patientTypeJLabel.setText("Patient Type:");

        imageJLabel.setText("Select Image:");

        SubmitJButton1.setText("Submit");
        SubmitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(TitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PhoneJLabel)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AgeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LastNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FirstNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(GenderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EmailJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(patientTypeJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(imageJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(imageJButton)
                                            .addComponent(patientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calendarPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JRadioButtonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JRadioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JRadioButtonOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(257, 257, 257))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PhoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(SubmitJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeJLabel)
                    .addComponent(AgeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailJLabel)
                    .addComponent(EmailJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calendarPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JRadioButtonMale)
                            .addComponent(GenderJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JRadioButtonFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JRadioButtonOthers)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientTypeJLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imageJButton)
                            .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(SubmitJButton1)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameJTextFieldActionPerformed

    private void LastNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameJTextFieldActionPerformed

    private void JRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRadioButtonMaleActionPerformed

    private void imageJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageJButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
            try{
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                if (edited_image != null){
                    this.imgJLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture = new ImageIcon(edited_image);
                }
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_imageJButtonActionPerformed

    private void SubmitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitJButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String firstName = this.FirstNameJTextField.getText();
            String lastName = this.LastNameJTextField.getText();
            String age = this.AgeJTextField.getText();
            String phoneNumber = this.PhoneJTextField.getText();
            String email = this.EmailJTextField.getText();
            String gender = this.buttonGroupGender.getSelection().getActionCommand();
            String patientType = this.patientJComboBox.getSelectedItem().toString();
            
            String displayMessage;

            // Validate each field and provide specific error messages
            if (firstName.isEmpty()) {
                displayMessage = "Please enter your first name.";
            } else if (lastName.isEmpty()) {
                displayMessage = "Please enter your last name.";
            } else if (age.isEmpty()) {
                displayMessage = "Please enter your age.";
            } else if (phoneNumber.isEmpty()) {
                displayMessage = "Please enter your phone number.";
            } else if (email.isEmpty()) {
                displayMessage = "Please enter your email.";
            } else if (gender.isEmpty()) {
                displayMessage = "Please select your gender.";
            } else if (patientType.isEmpty()) {
                displayMessage = "Please select the patient type.";
            } else {
                // userInfo
                displayMessage = "First Name: " + firstName +
                    "\nLast Name: " + lastName +
                    "\nAge: " + age +
                    "\nPhone Number: " + phoneNumber +
                    "\nEmail: " + email +
                    "\nGender: " + gender +
                    "\nPatient Type: " + patientType;
            }

            System.out.println(displayMessage);
            
            JOptionPane.showMessageDialog(this, displayMessage, "User Profile", JOptionPane.HEIGHT, this.profilePicture);
            Patient p1 = new Patient();
            p1.setFirstName(firstName);
            p1.setLastName(lastName);
            p1.setAge(age);
            p1.setPhoneNumber(phoneNumber);
            p1.setEmail(email);
            p1.setGender(gender);
            p1.setPatientType(patientType);
            p1.setProfilePicture(profilePicture);
            
            DatabaseConnector.addPatient(p1);
            System.out.println("The patient has been stored in the Database");
            
            ViewJPanel newViewJPanel = new ViewJPanel(p1);
            this.bottomjPanel.add(newViewJPanel);
            CardLayout layout =(CardLayout)this.bottomjPanel.getLayout();
            layout.next(bottomjPanel);
        }
        catch(NullPointerException ne){
            String errorMessage = "You must enter user Info.";
            JOptionPane.showMessageDialog(this, errorMessage);
        }
        catch(Exception e){
            System.out.println("Exception has occured.");
            System.out.println(e);
        }
    }//GEN-LAST:event_SubmitJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeJLabel;
    private javax.swing.JTextField AgeJTextField;
    private javax.swing.JLabel EmailJLabel;
    private javax.swing.JTextField EmailJTextField;
    private javax.swing.JLabel FirstNameJLabel;
    private javax.swing.JTextField FirstNameJTextField;
    private javax.swing.JLabel GenderJLabel;
    private javax.swing.JRadioButton JRadioButtonFemale;
    private javax.swing.JRadioButton JRadioButtonMale;
    private javax.swing.JRadioButton JRadioButtonOthers;
    private javax.swing.JLabel LastNameJLabel;
    private javax.swing.JTextField LastNameJTextField;
    private javax.swing.JLabel PhoneJLabel;
    private javax.swing.JTextField PhoneJTextField;
    private javax.swing.JButton SubmitJButton1;
    private javax.swing.JLabel TitleJLabel;
    private javax.swing.ButtonGroup buttonGroupGender;
    private com.jcalendar.pane.calendar.CalendarPane calendarPane1;
    private com.jcalendar.pane.calendar.CalendarPane calendarPane2;
    private javax.swing.JButton imageJButton;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> patientJComboBox;
    private javax.swing.JLabel patientTypeJLabel;
    // End of variables declaration//GEN-END:variables
}
