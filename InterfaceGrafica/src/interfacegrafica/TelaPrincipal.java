package interfacegrafica;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {


    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jBarra = new javax.swing.JMenuBar();
        jPainel = new javax.swing.JMenu();
        jCadastrar = new javax.swing.JMenuItem();
        jListar = new javax.swing.JMenuItem();
        jImprimir = new javax.swing.JMenuItem();
        JProcesso = new javax.swing.JMenu();
        jConsultar = new javax.swing.JMenuItem();
        jAjuda = new javax.swing.JMenu();
        jSobre = new javax.swing.JMenuItem();
        jSistema = new javax.swing.JMenu();
        jFinalizar = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/FotorCreated.png"))); // NOI18N

        jPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Register-icon.png"))); // NOI18N
        jPainel.setText("Painel");

        jCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Register-icon.png"))); // NOI18N
        jCadastrar.setText("Cadastrar");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });
        jPainel.add(jCadastrar);

        jListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Actions-edit-copy-icon.png"))); // NOI18N
        jListar.setText("Listar");
        jListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarActionPerformed(evt);
            }
        });
        jPainel.add(jListar);

        jImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Actions-document-print-icon.png"))); // NOI18N
        jImprimir.setText("Imprimir");
        jImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImprimirActionPerformed(evt);
            }
        });
        jPainel.add(jImprimir);

        jBarra.add(jPainel);

        JProcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/process-accept-icon.png"))); // NOI18N
        JProcesso.setText("Processos");

        jConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/consult-icon.png"))); // NOI18N
        jConsultar.setText("Consultar");
        jConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarActionPerformed(evt);
            }
        });
        JProcesso.add(jConsultar);

        jBarra.add(JProcesso);

        jAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/8446_16x16.png"))); // NOI18N
        jAjuda.setText("Ajuda");

        jSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/file-info-icon.png"))); // NOI18N
        jSobre.setText("Sobre");
        jSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSobreActionPerformed(evt);
            }
        });
        jAjuda.add(jSobre);

        jBarra.add(jAjuda);

        jSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Sign-Close-icon.png"))); // NOI18N
        jSistema.setText("Sair");

        jFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/application-exit.png"))); // NOI18N
        jFinalizar.setText("Finalizar Sistema");
        jFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFinalizarActionPerformed(evt);
            }
        });
        jSistema.add(jFinalizar);

        jBarra.add(jSistema);

        setJMenuBar(jBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jImprimirActionPerformed

    private void jListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListarActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        // TODO add your handling code here:

        VisualizarJFrame tela = new VisualizarJFrame();
        tela.setVisible(true);
        this.setVisible(false);
        this.dispose();


    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsultarActionPerformed

    private void jFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFinalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jFinalizarActionPerformed

    private void jSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSobreActionPerformed
        JOptionPane.showMessageDialog(this, "Pessoa 3.4 (build 42945) [64-bit] © 2016 Todos Direitos Reservados", "Sobre Pessoa 3.4 (build 42945)", JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_jSobreActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JProcesso;
    private javax.swing.JMenu jAjuda;
    private javax.swing.JMenuBar jBarra;
    private javax.swing.JMenuItem jCadastrar;
    private javax.swing.JMenuItem jConsultar;
    private javax.swing.JMenuItem jFinalizar;
    private javax.swing.JMenuItem jImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jListar;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jPainel;
    private javax.swing.JMenu jSistema;
    private javax.swing.JMenuItem jSobre;
    // End of variables declaration//GEN-END:variables
}
