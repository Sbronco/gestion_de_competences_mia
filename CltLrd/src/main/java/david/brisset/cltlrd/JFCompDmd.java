/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.cltlrd;

import david.brisset.bnkshared.interfremote.ExpoLrdRemote;
import david.brisset.bnkshared.utilities.CollaborateurExport;
import david.brisset.bnkshared.utilities.DmdCompExport;
import david.brisset.bnkshared.utilities.EquipeExport;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.DefaultListModel;

/**
 *
 * @author David BRISSET
 */
public class JFCompDmd extends javax.swing.JFrame {

    /**
     * Creates new form JFCompDmd
     */
    private Context ctx;
    private ExpoLrdRemote appli;

    public JFCompDmd() throws NamingException {
        initComponents();
        ctx = new InitialContext();
        appli = (ExpoLrdRemote) ctx.lookup("david.brisset.bnkshared.interfremote.ExpoLrdRemote");

        List<EquipeExport> listEquipe = appli.listerEquipe();

        cb_equipe.removeAllItems();

        cb_equipe.addItem("");
        for (EquipeExport e : listEquipe) {
            cb_equipe.addItem(String.valueOf(e.getId()));
        }

        List<DmdCompExport> listCompetence = appli.listerDmdComp();
        DefaultListModel listModel = new DefaultListModel();

        for (DmdCompExport ce : listCompetence) {
            listModel.addElement(ce.getCompetence().getNom() + " " + ce.getStatus());
        }

        listDmdComp.setModel(listModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb_equipe = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDmdComp = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Liste des compétences demandées");

        cb_equipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_equipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_equipeActionPerformed(evt);
            }
        });

        listDmdComp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listDmdComp);

        jLabel2.setText("Identifiant équipe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(cb_equipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_equipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_equipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_equipeActionPerformed

        if (cb_equipe.getSelectedItem() != null && ( !((String) cb_equipe.getSelectedItem()).equals(""))) {
            List<DmdCompExport> listCompetence = appli.listerDmdComp(Long.parseLong((String) cb_equipe.getSelectedItem()));
            DefaultListModel listModel = new DefaultListModel();

            for (DmdCompExport ce : listCompetence) {
                listModel.addElement(ce.getCompetence().getNom() + " " + ce.getStatus());
            }

            listDmdComp.setModel(listModel);
        }
        else if( cb_equipe.getSelectedItem() != null && ((String) cb_equipe.getSelectedItem()).equals(""))
        {
           List<DmdCompExport> listCompetence = appli.listerDmdComp();
            DefaultListModel listModel = new DefaultListModel();

            for (DmdCompExport ce : listCompetence) {
                listModel.addElement(ce.getCompetence().getNom() + " " + ce.getStatus());
            } 
            
            listDmdComp.setModel(listModel);
        }
    }//GEN-LAST:event_cb_equipeActionPerformed

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
            java.util.logging.Logger.getLogger(JFCompDmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCompDmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCompDmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCompDmd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFCompDmd().setVisible(true);
                } catch (NamingException ex) {
                    Logger.getLogger(JFCompDmd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_equipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listDmdComp;
    // End of variables declaration//GEN-END:variables
}
