
package PresentationLayer;
import DomainLayer.DomainModel.InfoHospital;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import PresentationLayer.PresentationController.IngressarPacientView;

public class IngressarPacient1 extends javax.swing.JFrame {
    
    private IngressarPacientView IngPacView;
    
    public IngressarPacient1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jnTs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHospitales = new javax.swing.JTable();

        jButton2.setText("Sortir");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Text de l'error");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Text de l'error");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Hospitals Lliures per Especialitat");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jnTs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnTsActionPerformed(evt);
            }
        });

        jLabel2.setText("nTs:");

        jButton3.setText("Continuar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Label.setForeground(new java.awt.Color(255, 0, 0));
        Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label.setText("Text de l'error");
        Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        tablaHospitales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaHospitales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton3)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jnTs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jnTs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jnTsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnTsActionPerformed

    }//GEN-LAST:event_jnTsActionPerformed

    /* ---------------------- FUNCIONES IMPLEMENTADAS POR ELI --------------------------- */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                                                        // Accion provocada al seleccionar el boton Continuar.
        String nTs = jnTs.getText();                                    // Recoge los datos:  hospital, numHab, nTs y data introducidos por el usuario. 
        int x = tablaHospitales.getSelectedRow();
        
        try {
            IngPacView.hospitalClient((String)tablaHospitales.getValueAt(x,0), 1, nTs);  // Recoge la fila seleccionada por el usuario.         
        } 
        catch (Exception ex) {
            Logger.getLogger(IngressarPacient1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);                                                     // Boton Salir.
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public void inicializarVista(ArrayList<InfoHospital> llistatHospitals) {    // Muestra por pantalla los hospitales.
                
        Object[][] infoHospitals = new Object[llistatHospitals.size()][4];      // Objeto para crear las filas cada uno de los hospitales.

        for(int i = 0; i < llistatHospitals.size(); ++i) {
                infoHospitals[i][0] = (String) llistatHospitals.get(i).nom;
                infoHospitals[i][1] = (String) llistatHospitals.get(i).adreça;
                infoHospitals[i][2] = (String) llistatHospitals.get(i).descripcio;
                infoHospitals[i][3] = toStringArray(llistatHospitals.get(i).hab);
        }

        Object[] titolColumna = new Object[4];                                  // Objeto para crear las columnas.
        titolColumna[0] = "Nom Hospital";
        titolColumna[1] = "Adreça";
        titolColumna[2] = "Descripció";
        titolColumna[3] = "Habitacions";  

        
        tablaHospitales.setModel(new javax.swing.table.DefaultTableModel(infoHospitals,titolColumna));
        
        Label.setVisible(false);                                                // Hace invisible el campo "Text de l'error"
                       
    }
    
     private Object toStringArray(ArrayList<Integer> hab) {                     // Pasa las habitaciones del hospital de Integer a String.
        String res = "";
        for(int i = 0; i < hab.size() - 1; ++i) {
            res = res + hab.get(i).toString() + ",";
        }
        res = res + hab.get(hab.size()-1).toString();
        return res;
    }
     
    public void mostrarMissatge(String txt) {                                   // Mensaje de "Text de l'error"
        Label.setText(txt);
        Label.setVisible(true);
    }
    
    /* ------------------------ FIN -------------------------------------------------------*/
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
            java.util.logging.Logger.getLogger(IngressarPacient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngressarPacient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngressarPacient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngressarPacient1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngressarPacient1().setVisible(true);
               
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jnTs;
    private javax.swing.JTable tablaHospitales;
    // End of variables declaration//GEN-END:variables

}
