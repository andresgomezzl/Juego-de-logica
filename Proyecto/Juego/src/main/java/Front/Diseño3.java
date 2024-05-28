
package Front;

import Back.Main;
import java.awt.Color;


public class Diseño3 extends javax.swing.JFrame {

 
    public Diseño3() {
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Enviar = new javax.swing.JToggleButton();
        numeroIngresado = new javax.swing.JTextField();
        progreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(64, 19, 154));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 424));

        salir.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        salir.setText("Salir");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INGRESA TU NUMERO");

        Enviar.setBackground(new java.awt.Color(255, 255, 255));
        Enviar.setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        Enviar.setForeground(new java.awt.Color(0, 0, 0));
        Enviar.setText("ENVIAR");
        Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EnviarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EnviarMousePressed(evt);
            }
        });

        numeroIngresado.setBackground(new java.awt.Color(255, 255, 255));
        numeroIngresado.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        numeroIngresado.setForeground(new java.awt.Color(0, 0, 0));
        numeroIngresado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroIngresado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroIngresadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(229, 229, 229))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Enviar)
                            .addGap(327, 327, 327)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salir)
                    .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroIngresado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Enviar)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salir.setForeground(Color.RED);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setForeground(Color.WHITE);
    }//GEN-LAST:event_salirMouseExited

    private void EnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseEntered
        Enviar.setForeground(Color.GREEN);
    }//GEN-LAST:event_EnviarMouseEntered

    private void EnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMouseExited
        Enviar.setForeground(Color.BLACK);
    }//GEN-LAST:event_EnviarMouseExited
   
    private void EnviarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMousePressed
       
        String texto = numeroIngresado.getText(); 
       int numero = Integer.parseInt(texto); 
       Main mn = new Main();
       mn.usuario(numero);
       
       
    }//GEN-LAST:event_EnviarMousePressed
      
    private void numeroIngresadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroIngresadoKeyTyped
       
           char numeroUsuario = evt.getKeyChar();
        if (!Character.isDigit(numeroUsuario)) { 
        evt.consume();
        } else if (numeroIngresado.getText().length() >= 4) { 
        evt.consume();
        }
      
       
       
    }//GEN-LAST:event_numeroIngresadoKeyTyped
   
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Enviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeroIngresado;
    private javax.swing.JProgressBar progreso;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
}
