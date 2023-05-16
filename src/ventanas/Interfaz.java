/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author soulw
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalida = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        salidaConversor = new javax.swing.JLabel();
        Conversor = new javax.swing.JButton();
        monedaB = new javax.swing.JComboBox<>();
        monedaA = new javax.swing.JComboBox<>();
        Text = new javax.swing.JLabel();
        entradaConversor = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Divisas");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalida.setBackground(new java.awt.Color(0, 153, 102));
        botonSalida.setForeground(new java.awt.Color(242, 242, 242));
        botonSalida.setText("Salir");
        botonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        salidaConversor.setText("Salida");
        jPanel1.add(salidaConversor);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 70, -1));

        Conversor.setBackground(new java.awt.Color(0, 153, 102));
        Conversor.setForeground(new java.awt.Color(242, 242, 242));
        Conversor.setText("Convertir");
        Conversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversorActionPerformed(evt);
            }
        });
        getContentPane().add(Conversor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        monedaB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "MXN", "AUD", "YEN" }));
        monedaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaBActionPerformed(evt);
            }
        });
        getContentPane().add(monedaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        monedaA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "MXN", "AUD", "YEN" }));
        monedaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaAActionPerformed(evt);
            }
        });
        getContentPane().add(monedaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        Text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Text.setForeground(new java.awt.Color(255, 255, 255));
        Text.setText("A");
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        entradaConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaConversorActionPerformed(evt);
            }
        });
        getContentPane().add(entradaConversor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 70, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LdbjSA.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalidaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonSalidaActionPerformed

    private void ConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConversorActionPerformed

    private void monedaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaBActionPerformed

    private void monedaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaAActionPerformed

    private void entradaConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaConversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaConversorActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Conversor;
    private javax.swing.JLabel Text;
    private javax.swing.JButton botonSalida;
    private javax.swing.JTextField entradaConversor;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> monedaA;
    private javax.swing.JComboBox<String> monedaB;
    private javax.swing.JLabel salidaConversor;
    // End of variables declaration//GEN-END:variables
}
