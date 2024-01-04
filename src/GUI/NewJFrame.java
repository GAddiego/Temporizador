/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import control.Control;
import control.Checker;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import javax.swing.AbstractAction;
import javax.swing.Action;
import language.Language;

/**
 *
 * @author Gonzalo
 */
public class NewJFrame extends javax.swing.JFrame {

    Control control;
    boolean forced;
    

    public NewJFrame() {
        initComponents();
        buttonGroupLanguages.add(jRadioButtonSpanish);
        buttonGroupLanguages.add(jRadioButtonEnglish);
        changeLanguage(SPANISH);
        control = new Control();

        jTextFieldHour.setText(String.valueOf(control.getHours()));
        jTextFieldMinute.setText(String.valueOf(control.getMinutes()));
        jTextFieldRemainingTime.setText("--:--");

//        //Adding the verifiers, user can only write integers in the textfields
//        jTextFieldHour.setInputVerifier(new Checker());
//        jTextFieldMinute.setInputVerifier(new Checker());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupLanguages = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldHour = new javax.swing.JTextField();
        jTextFieldMinute = new javax.swing.JTextField();
        jLabelHour = new javax.swing.JLabel();
        jLabelMinute = new javax.swing.JLabel();
        jCheckBoxForzar = new javax.swing.JCheckBox();
        jButtonPlus10Minutes = new javax.swing.JButton();
        jButtonPlus5Minutes = new javax.swing.JButton();
        jTextFieldRemainingTime = new javax.swing.JTextField();
        jLabelRemainingTime = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jButtonShutdown = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jRadioButtonSpanish = new javax.swing.JRadioButton();
        jRadioButtonEnglish = new javax.swing.JRadioButton();
        jLabelLanguage = new javax.swing.JLabel();
        jButtonCurrentTime = new javax.swing.JButton();
        jButtonPlusOneMinute = new javax.swing.JButton();
        jButtonLessOneMinute = new javax.swing.JButton();
        jButtonLessOneHour = new javax.swing.JButton();
        jButtonPlusOneHour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 153, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setText("Titulo");
        background.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextFieldHour.setText("jTextField1");
        jTextFieldHour.setMaximumSize(new java.awt.Dimension(70, 22));
        jTextFieldHour.setMinimumSize(new java.awt.Dimension(70, 22));
        jTextFieldHour.setName(""); // NOI18N
        jTextFieldHour.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldHourFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldHourFocusLost(evt);
            }
        });
        background.add(jTextFieldHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, -1));

        jTextFieldMinute.setText("jTextField1");
        jTextFieldMinute.setMaximumSize(new java.awt.Dimension(70, 22));
        jTextFieldMinute.setMinimumSize(new java.awt.Dimension(70, 22));
        jTextFieldMinute.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMinuteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMinuteFocusLost(evt);
            }
        });
        background.add(jTextFieldMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 80, -1));

        jLabelHour.setText("Hora");
        background.add(jLabelHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabelMinute.setText("Minute");
        background.add(jLabelMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jCheckBoxForzar.setText("Forzar");
        background.add(jCheckBoxForzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jButtonPlus10Minutes.setText("+10");
        jButtonPlus10Minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlus10MinutesActionPerformed(evt);
            }
        });
        background.add(jButtonPlus10Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 60, -1));

        jButtonPlus5Minutes.setText("+5");
        jButtonPlus5Minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlus5MinutesActionPerformed(evt);
            }
        });
        background.add(jButtonPlus5Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 60, -1));

        jTextFieldRemainingTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRemainingTime.setText("tiempo restante");
        jTextFieldRemainingTime.setEnabled(false);
        background.add(jTextFieldRemainingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        jLabelRemainingTime.setText("Tiempo restante:");
        background.add(jLabelRemainingTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        background.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jButtonShutdown.setText("Apagar");
        jButtonShutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShutdownActionPerformed(evt);
            }
        });
        background.add(jButtonShutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jButtonReset.setText("Reiniciar");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        background.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jRadioButtonSpanish.setSelected(true);
        jRadioButtonSpanish.setText("Español");
        jRadioButtonSpanish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSpanishActionPerformed(evt);
            }
        });
        background.add(jRadioButtonSpanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jRadioButtonEnglish.setText("Inglés");
        jRadioButtonEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEnglishActionPerformed(evt);
            }
        });
        background.add(jRadioButtonEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabelLanguage.setText("Idioma:");
        background.add(jLabelLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jButtonCurrentTime.setText("Hora actual");
        jButtonCurrentTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCurrentTimeActionPerformed(evt);
            }
        });
        background.add(jButtonCurrentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jButtonPlusOneMinute.setText("+");
        jButtonPlusOneMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusOneMinuteActionPerformed(evt);
            }
        });
        background.add(jButtonPlusOneMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jButtonLessOneMinute.setText("-");
        jButtonLessOneMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLessOneMinuteActionPerformed(evt);
            }
        });
        background.add(jButtonLessOneMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jButtonLessOneHour.setText("-");
        jButtonLessOneHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLessOneHourActionPerformed(evt);
            }
        });
        background.add(jButtonLessOneHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jButtonPlusOneHour.setText("+");
        jButtonPlusOneHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusOneHourActionPerformed(evt);
            }
        });
        background.add(jButtonPlusOneHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEnglishActionPerformed
        jRadioButtonSpanish.setSelected(false);
        if (jRadioButtonEnglish.isSelected()) {
            jRadioButtonEnglish.setSelected(true);
        }
        changeLanguage(ENGLISH);
    }//GEN-LAST:event_jRadioButtonEnglishActionPerformed

    private void jRadioButtonSpanishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSpanishActionPerformed
        jRadioButtonEnglish.setSelected(false);
        if (jRadioButtonSpanish.isSelected()) {
            jRadioButtonSpanish.setSelected(true);
        }
        changeLanguage(SPANISH);
    }//GEN-LAST:event_jRadioButtonSpanishActionPerformed

    private void jButtonCurrentTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCurrentTimeActionPerformed
        LocalDateTime localDate = LocalDateTime.now();
        jTextFieldHour.setText(String.valueOf(localDate.getHour()));
        jTextFieldMinute.setText(String.valueOf(localDate.getMinute()));
    }//GEN-LAST:event_jButtonCurrentTimeActionPerformed

    //If the textBoxes hour/minute lost the focus, we check if the hour is correct
    private void jTextFieldMinuteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMinuteFocusLost
        String minute = jTextFieldMinute.getText();
        boolean isInt = false;
        int newMinute;

        try {
            newMinute = Integer.parseInt(minute);
            isInt = true;

            if (!isInt || newMinute < 0 || newMinute > 59) {
                LocalDateTime localDate = LocalDateTime.now();
                jTextFieldMinute.setText(String.valueOf(localDate.getMinute()));
            }

        } catch (Exception e) {
            LocalDateTime localDate = LocalDateTime.now();
            jTextFieldMinute.setText(String.valueOf(localDate.getMinute()));
        }

    }//GEN-LAST:event_jTextFieldMinuteFocusLost

    //Cuando el cuadro gana el foco, añade el oyente que se activa al pulsar enter,
    //hace la misma acción que al perder el foco (comprobar si es entero y entra en el rango)
    private void jTextFieldMinuteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMinuteFocusGained
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldMinuteFocusLost(evt);
            }
        };
        jTextFieldMinute.addActionListener(action);
    }//GEN-LAST:event_jTextFieldMinuteFocusGained

    private void jTextFieldHourFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHourFocusLost
        String hour = jTextFieldHour.getText();
        boolean isInt = false;
        int newHour;

        try {
            newHour = Integer.parseInt(hour);
            isInt = true;

            if (!isInt || newHour < 0 || newHour > 23) {
                LocalDateTime localDate = LocalDateTime.now();
                jTextFieldHour.setText(String.valueOf(localDate.getHour()));
            }

        } catch (Exception e) {
            LocalDateTime localDate = LocalDateTime.now();
            jTextFieldHour.setText(String.valueOf(localDate.getHour()));
        }
    }//GEN-LAST:event_jTextFieldHourFocusLost

    private void jTextFieldHourFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHourFocusGained
        Action action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldHourFocusLost(evt);
            }
        };
        jTextFieldHour.addActionListener(action);
    }//GEN-LAST:event_jTextFieldHourFocusGained

    private void jButtonPlusOneMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusOneMinuteActionPerformed
        int minute = Integer.parseInt(jTextFieldMinute.getText());
        
        if(minute==59){
            jTextFieldMinute.setText("0");
            int hour = Integer.parseInt(jTextFieldHour.getText());
            jTextFieldHour.setText(String.valueOf(hour+1));
        }else{
            jTextFieldMinute.setText(String.valueOf(minute+1));
        }
    }//GEN-LAST:event_jButtonPlusOneMinuteActionPerformed

    private void jButtonLessOneMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLessOneMinuteActionPerformed
        int minute = Integer.parseInt(jTextFieldMinute.getText());
        if(minute==0){
            jTextFieldMinute.setText("59");
            int hour = Integer.parseInt(jTextFieldHour.getText());
            jTextFieldHour.setText(String.valueOf(hour-1));
        }else{
            jTextFieldMinute.setText(String.valueOf(minute-1));
        }
    }//GEN-LAST:event_jButtonLessOneMinuteActionPerformed

    private void jButtonLessOneHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLessOneHourActionPerformed
        int hour = Integer.parseInt(jTextFieldHour.getText());
        if(hour==0){
            jTextFieldHour.setText("23");
        }else{
            jTextFieldHour.setText(String.valueOf(hour-1));
        }
    }//GEN-LAST:event_jButtonLessOneHourActionPerformed

    private void jButtonPlusOneHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusOneHourActionPerformed
        int hour = Integer.parseInt(jTextFieldHour.getText());
        if(hour==23 ){
            jTextFieldHour.setText("0");
        }else{
            jTextFieldHour.setText(String.valueOf(hour+1));
        }
    }//GEN-LAST:event_jButtonPlusOneHourActionPerformed

    private void jButtonPlus5MinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlus5MinutesActionPerformed
        int minute = Integer.parseInt(jTextFieldMinute.getText());
        int newMinute = minute+5;
        if(newMinute>59){
            newMinute=newMinute-60;
            jTextFieldMinute.setText(String.valueOf(newMinute));
            int hour = Integer.parseInt(jTextFieldHour.getText());
            jTextFieldHour.setText(String.valueOf(hour+1));
        }else{
            jTextFieldMinute.setText(String.valueOf(newMinute));
        }
    }//GEN-LAST:event_jButtonPlus5MinutesActionPerformed

    private void jButtonPlus10MinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlus10MinutesActionPerformed
        int minute = Integer.parseInt(jTextFieldMinute.getText());
        int newMinute = minute+10;
        if(newMinute>59){
            newMinute=newMinute-60;
            jTextFieldMinute.setText(String.valueOf(newMinute));
            int hour = Integer.parseInt(jTextFieldHour.getText());
            jTextFieldHour.setText(String.valueOf(hour+1));
        }else{
            jTextFieldMinute.setText(String.valueOf(newMinute));
        }
    }//GEN-LAST:event_jButtonPlus10MinutesActionPerformed

    private void jButtonShutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShutdownActionPerformed
        
        forced = jCheckBoxForzar.isSelected();
        
        int hour = Integer.parseInt(jTextFieldHour.getText());
        int minute = Integer.parseInt(jTextFieldMinute.getText());
        long secondsRemaining = control.calculateSeconds(hour, minute);
        
        control.shutDown(secondsRemaining, forced);
    }//GEN-LAST:event_jButtonShutdownActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        
        forced = jCheckBoxForzar.isSelected();
        
        int hour = Integer.parseInt(jTextFieldHour.getText());
        int minute = Integer.parseInt(jTextFieldMinute.getText());
        long secondsRemaining = control.calculateSeconds(hour, minute);
        
        control.reset(secondsRemaining, forced);
        
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        control.cancelShutDown();
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private void changeLanguage(String nameLanguage) {
        Language language = new Language(nameLanguage);

        this.setTitle(language.getProperty("titulo"));
        this.jLabelTitle.setText(language.getProperty("titulo"));
        this.jLabelHour.setText(language.getProperty("hora"));
        this.jLabelMinute.setText(language.getProperty("minuto"));
        this.jCheckBoxForzar.setText(language.getProperty("forzar"));
        this.jLabelRemainingTime.setText(language.getProperty("tiempo_restante"));
        this.jButtonCancel.setText(language.getProperty("cancelar"));
        this.jButtonShutdown.setText(language.getProperty("apagar"));
        this.jButtonReset.setText(language.getProperty("reiniciar"));
        this.jLabelLanguage.setText(language.getProperty("idioma"));
        this.jRadioButtonSpanish.setText(language.getProperty("espanol"));
        this.jRadioButtonEnglish.setText(language.getProperty("ingles"));
        this.jButtonCurrentTime.setText(language.getProperty("hora_actual"));

    }

    private final String ENGLISH = "english";
    private final String SPANISH = "spanish";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.ButtonGroup buttonGroupLanguages;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCurrentTime;
    private javax.swing.JButton jButtonLessOneHour;
    private javax.swing.JButton jButtonLessOneMinute;
    private javax.swing.JButton jButtonPlus10Minutes;
    private javax.swing.JButton jButtonPlus5Minutes;
    private javax.swing.JButton jButtonPlusOneHour;
    private javax.swing.JButton jButtonPlusOneMinute;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonShutdown;
    private javax.swing.JCheckBox jCheckBoxForzar;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelLanguage;
    private javax.swing.JLabel jLabelMinute;
    private javax.swing.JLabel jLabelRemainingTime;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jRadioButtonEnglish;
    private javax.swing.JRadioButton jRadioButtonSpanish;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldMinute;
    private javax.swing.JTextField jTextFieldRemainingTime;
    // End of variables declaration//GEN-END:variables
}
