/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uditi
 */
public class update extends javax.swing.JFrame {

    /**
     * Creates new form update
     */
    public update() {
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

        jPanel1 = new javax.swing.JPanel();
        dept_button = new javax.swing.JButton();
        dep_button = new javax.swing.JButton();
        emp_button = new javax.swing.JButton();
        emplevel_button = new javax.swing.JButton();
        qual_button = new javax.swing.JButton();
        pos_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dept_button.setText("Department");
        dept_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_buttonActionPerformed(evt);
            }
        });

        dep_button.setText("Dependant");
        dep_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_buttonActionPerformed(evt);
            }
        });

        emp_button.setText("Employee");
        emp_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp_buttonActionPerformed(evt);
            }
        });

        emplevel_button.setText("EmpLevel");
        emplevel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplevel_buttonActionPerformed(evt);
            }
        });

        qual_button.setText("Qualification");
        qual_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qual_buttonActionPerformed(evt);
            }
        });

        pos_button.setText("Position");
        pos_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pos_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dept_button)
                    .addComponent(emp_button)
                    .addComponent(dep_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos_button)
                    .addComponent(qual_button)
                    .addComponent(emplevel_button))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dept_button)
                    .addComponent(pos_button))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dep_button)
                    .addComponent(qual_button))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emp_button)
                    .addComponent(emplevel_button))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dept_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_buttonActionPerformed
        // TODO add your handling code here:
        updateDepartment temp = new updateDepartment();
        temp.main(null);
        
    }//GEN-LAST:event_dept_buttonActionPerformed

    private void dep_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_buttonActionPerformed
        // TODO add your handling code here:
        updateDependent temp = new updateDependent();
        temp.main(null);
    }//GEN-LAST:event_dep_buttonActionPerformed

    private void emp_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emp_buttonActionPerformed
        // TODO add your handling code here:
        updateEmplevel temp = new updateEmplevel();
        temp.main(null);
    }//GEN-LAST:event_emp_buttonActionPerformed

    private void emplevel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplevel_buttonActionPerformed
        // TODO add your handling code here:
        updateEmplevel temp = new updateEmplevel();
        temp.main(null);
    }//GEN-LAST:event_emplevel_buttonActionPerformed

    private void qual_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qual_buttonActionPerformed
        // TODO add your handling code here:
        updateQualification temp = new updateQualification();
        temp.main(null);
    }//GEN-LAST:event_qual_buttonActionPerformed

    private void pos_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pos_buttonActionPerformed
        // TODO add your handling code here:
        updatePosition temp = new updatePosition();
        temp.main(null);
    }//GEN-LAST:event_pos_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dep_button;
    private javax.swing.JButton dept_button;
    private javax.swing.JButton emp_button;
    private javax.swing.JButton emplevel_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pos_button;
    private javax.swing.JButton qual_button;
    // End of variables declaration//GEN-END:variables
}
