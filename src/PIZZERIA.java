
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class PIZZERIA extends javax.swing.JFrame {


    public PIZZERIA() {
        initComponents();
        this.setLocationRelativeTo(null);
        btgTamaño.add(rdbPequeña);
        btgTamaño.add(rdbMediana);
        btgTamaño.add(rdbFamiliar);

    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTamaño = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        chkPanceta = new javax.swing.JCheckBox();
        chkAnchoas = new javax.swing.JCheckBox();
        chkCebollas = new javax.swing.JCheckBox();
        chkPimiento = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rdbPequeña = new javax.swing.JRadioButton();
        rdbMediana = new javax.swing.JRadioButton();
        rdbFamiliar = new javax.swing.JRadioButton();
        btnTotal = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PIZZERIA JAVA - Ayala Nelson");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredientes"));

        chkPanceta.setText("Panceta");
        chkPanceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPancetaActionPerformed(evt);
            }
        });

        chkAnchoas.setText("Anchoas");
        chkAnchoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnchoasActionPerformed(evt);
            }
        });

        chkCebollas.setText("Cebollas");

        chkPimiento.setText("Pimiento");
        chkPimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPanceta)
                    .addComponent(chkAnchoas)
                    .addComponent(chkCebollas)
                    .addComponent(chkPimiento))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chkPanceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkAnchoas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCebollas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPimiento))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño"));

        rdbPequeña.setText("Pequeña");
        rdbPequeña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPequeñaActionPerformed(evt);
            }
        });

        rdbMediana.setText("Mediana");
        rdbMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMedianaActionPerformed(evt);
            }
        });

        rdbFamiliar.setSelected(true);
        rdbFamiliar.setText("Familiar");
        rdbFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFamiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbPequeña)
                    .addComponent(rdbMediana)
                    .addComponent(rdbFamiliar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbPequeña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbMediana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbFamiliar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnTotal.setText("Total");
        btnTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        lblResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblResultado.setEnabled(false);

        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTotal)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkPimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPimientoActionPerformed

    private void chkAnchoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnchoasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnchoasActionPerformed

    private void chkPancetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPancetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPancetaActionPerformed

    private void rdbFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbFamiliarActionPerformed

    private void rdbPequeñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPequeñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbPequeñaActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        int total = 0;
        if(rdbPequeña.isSelected()){
            total = 70;
            if(chkPanceta.isSelected()) {
                total = total+15;
            }
            if(chkAnchoas.isSelected()) {
                total = total+18;
            }
            if(chkCebollas.isSelected()) {
                total = total+10;

            }
            if(chkPimiento.isSelected()) {
                total = total+12;
            }}
        if(rdbMediana.isSelected()) {
            total = 90;
            if(chkPanceta.isSelected()) {
                total = total+15;
            }
            if(chkAnchoas.isSelected()) {
                total = total+18;
            }
            if(chkCebollas.isSelected()) {
                total = total+10;

            }
            if(chkPimiento.isSelected()) {
                total = total+12;
            }}
        if(rdbFamiliar.isSelected()) {
            total = 110;
            if(chkPanceta.isSelected()) {
                total = total+15;
            }
            if(chkAnchoas.isSelected()) {
                total = total+18;
            }
            if(chkCebollas.isSelected()) {
                total = total+10;

            }
            if(chkPimiento.isSelected()) {
                total = total+12;
            }

        }
       
        String total1 = String.valueOf(total);
        lblResultado.setText(total1);
    }//GEN-LAST:event_btnTotalActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //cambio la pregunta
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
        
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rdbMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMedianaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMedianaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIZZERIA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTamaño;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotal;
    private javax.swing.JCheckBox chkAnchoas;
    private javax.swing.JCheckBox chkCebollas;
    private javax.swing.JCheckBox chkPanceta;
    private javax.swing.JCheckBox chkPimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton rdbFamiliar;
    private javax.swing.JRadioButton rdbMediana;
    private javax.swing.JRadioButton rdbPequeña;
    // End of variables declaration//GEN-END:variables
}
