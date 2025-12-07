
package InterfazGrafica;

import java.awt.Color;

public class ActualizarUsuario extends javax.swing.JPanel {

    public ActualizarUsuario() {
        initComponents();

        // Placeholder ID de Usuario
        idUsuario.setText("ID de usuario");
        idUsuario.setForeground(Color.GRAY);
        idUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (idUsuario.getText().equals("ID de usuario")) {
                    idUsuario.setText("");
                    idUsuario.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (idUsuario.getText().isEmpty()) {
                    idUsuario.setForeground(Color.GRAY);
                    idUsuario.setText("ID de usuario");
                }
            }
        });

        // Placeholder Nuevo Nombre
        nuevoNombreField.setText("Nuevo nombre");
        nuevoNombreField.setForeground(Color.GRAY);
        nuevoNombreField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (nuevoNombreField.getText().equals("Nuevo nombre")) {
                    nuevoNombreField.setText("");
                    nuevoNombreField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (nuevoNombreField.getText().isEmpty()) {
                    nuevoNombreField.setForeground(Color.GRAY);
                    nuevoNombreField.setText("Nuevo nombre");
                }
            }
        });

        // Placeholder Nuevo Email
        nuevoEmailField.setText("Nuevo email");
        nuevoEmailField.setForeground(Color.GRAY);
        nuevoEmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (nuevoEmailField.getText().equals("Nuevo email")) {
                    nuevoEmailField.setText("");
                    nuevoEmailField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (nuevoEmailField.getText().isEmpty()) {
                    nuevoEmailField.setForeground(Color.GRAY);
                    nuevoEmailField.setText("Nuevo email");
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nuevoNombreField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        nuevoEmailField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        idUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nuevo Email:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar Usuario");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 330, 50));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Actualizar Usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 350, 70));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("ID De Usuario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, 30));

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Nuevo Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 150, 30));

        nuevoNombreField.setBorder(null);
        nuevoNombreField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nuevoNombreField.addActionListener(this::nuevoNombreFieldActionPerformed);
        jPanel1.add(nuevoNombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 330, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 270, -1));

        nuevoEmailField.setBorder(null);
        nuevoEmailField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nuevoEmailField.addActionListener(this::nuevoEmailFieldActionPerformed);
        jPanel1.add(nuevoEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 330, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 270, -1));

        idUsuario.setBorder(null);
        idUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idUsuario.addActionListener(this::idUsuarioActionPerformed);
        jPanel1.add(idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 330, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 270, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 37, 569, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoNombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoNombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoNombreFieldActionPerformed

    private void nuevoEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoEmailFieldActionPerformed

    private void idUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nuevoEmailField;
    private javax.swing.JTextField nuevoNombreField;
    // End of variables declaration//GEN-END:variables
}
