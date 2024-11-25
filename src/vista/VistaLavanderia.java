package vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import lavanderia.Lavanderia;
/**
 *
 * @author jaide
 */
public class VistaLavanderia extends javax.swing.JFrame {

    /**
     * Creates new form VistaLavanderia
     */
    public VistaLavanderia() {
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidadDeRopa = new javax.swing.JTextField();
        temperatura = new javax.swing.JTextField();
        suciedad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cantidadDetergente = new javax.swing.JLabel();
        cantidadAgua = new javax.swing.JLabel();

        jDialog1.setBackground(new java.awt.Color(242, 242, 100));

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialog2.setBackground(new java.awt.Color(242, 242, 100));

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(23, 255, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cantida de ropa (KG)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Temperatura del agua (°C)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Suciedad de la ropa (%)");

        cantidadDeRopa.setText("0-20");
        cantidadDeRopa.setPreferredSize(new java.awt.Dimension(80, 22));
        cantidadDeRopa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadDeRopaMouseClicked(evt);
            }
        });
        cantidadDeRopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadDeRopaActionPerformed(evt);
            }
        });
        cantidadDeRopa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadDeRopaKeyTyped(evt);
            }
        });

        temperatura.setText("5-40");
        temperatura.setPreferredSize(new java.awt.Dimension(80, 22));
        temperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperaturaMouseClicked(evt);
            }
        });
        temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturaActionPerformed(evt);
            }
        });
        temperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                temperaturaKeyTyped(evt);
            }
        });

        suciedad.setText("0-100");
        suciedad.setPreferredSize(new java.awt.Dimension(80, 22));
        suciedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suciedadMouseClicked(evt);
            }
        });
        suciedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suciedadActionPerformed(evt);
            }
        });
        suciedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                suciedadKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Lavanderia de Taylor");

        calcular.setText("Calcular");
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMouseClicked(evt);
            }
        });

        jLabel1.setText("Cantidad de agua(L)");

        jLabel8.setText("Cantidad de detergente(gr)");

        cantidadDetergente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadDetergente.setText("-");

        cantidadAgua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadAgua.setText("-");
        cantidadAgua.setPreferredSize(new java.awt.Dimension(50, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calcular)
                        .addGap(16, 16, 16)))
                .addGap(194, 194, 194))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(cantidadAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(61, 61, 61)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cantidadDeRopa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suciedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(temperatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cantidadDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantidadDeRopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suciedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcular)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantidadAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantidadDetergente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(96, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suciedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suciedadActionPerformed
    }//GEN-LAST:event_suciedadActionPerformed

    private void cantidadDeRopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDeRopaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadDeRopaActionPerformed

    private void temperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temperaturaActionPerformed

    private void cantidadDeRopaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadDeRopaKeyTyped
        letra(evt);
    }//GEN-LAST:event_cantidadDeRopaKeyTyped

    private void cantidadDeRopaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadDeRopaMouseClicked
        if (cantidadDeRopa.getText().equals("0-20")) {  // Comparar el contenido con equals()
            cantidadDeRopa.setText("");  // Eliminar el texto
        }
    }//GEN-LAST:event_cantidadDeRopaMouseClicked

    private void temperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaMouseClicked
        if (temperatura.getText().equals("5-40")) {  // Comparar el contenido con equals()
            temperatura.setText("");  // Eliminar el texto
        }
    }//GEN-LAST:event_temperaturaMouseClicked

    private void suciedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suciedadMouseClicked
        if (suciedad.getText().equals("0-100")) {  // Comparar el contenido con equals()
            suciedad.setText("");  // Eliminar el texto
        }
    }//GEN-LAST:event_suciedadMouseClicked

    private void temperaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temperaturaKeyTyped
        letra(evt);
    }//GEN-LAST:event_temperaturaKeyTyped

    private void suciedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suciedadKeyTyped
        letra(evt);
    }//GEN-LAST:event_suciedadKeyTyped

    private void calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseClicked
        verificarYModificarCampos(cantidadDeRopa, "0-20");
        verificarYModificarCampos(temperatura, "5-40");
        verificarYModificarCampos(suciedad, "0-100");

        int cantidadRopa = Integer.parseInt(cantidadDeRopa.getText());
        int temp = Integer.parseInt(temperatura.getText());
        int sucieda = Integer.parseInt(suciedad.getText());

        // Validar los rangos para cada variable utilizando la función general
        if (!validarRangos(cantidadRopa, 0, 20, "cantidad de ropa") ||
            !validarRangos(temp, 5, 40, "temperatura") ||
            !validarRangos(sucieda, 0, 100, "suciedad de ropa")) {
            return;  // Si algún valor es inválido, salimos de la función
        }
        
        Lavanderia lavadora = new Lavanderia();
        String[] ans = lavadora.calcular(cantidadRopa, temp, sucieda);
        cantidadAgua.setText(ans[0]);
        cantidadDetergente.setText(ans[1]);
    }//GEN-LAST:event_calcularMouseClicked
    private void letra(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }
    
    private boolean validarRangos(int variable, int minimo, int maximo, String varNombre) {
    if (variable < minimo || variable > maximo) {
        JOptionPane.showMessageDialog(this, String.format("La %s se sale de los rangos establecidos",varNombre));
        return false;
    } 
        return true;
    }
    
    private void verificarYModificarCampos(javax.swing.JTextField campo, String valorEsperado) {
    if (campo.getText().equals(valorEsperado) || campo.getText().equals("")) {
        campo.setText("-1");
    }
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
            java.util.logging.Logger.getLogger(VistaLavanderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLavanderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLavanderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLavanderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLavanderia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JLabel cantidadAgua;
    private javax.swing.JTextField cantidadDeRopa;
    private javax.swing.JLabel cantidadDetergente;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField suciedad;
    private javax.swing.JTextField temperatura;
    // End of variables declaration//GEN-END:variables
}
