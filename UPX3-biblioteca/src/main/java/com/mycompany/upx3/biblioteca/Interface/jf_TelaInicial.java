/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.upx3.biblioteca.Interface;

import com.mycompany.upx3.biblioteca.Livros;
import com.mycompany.upx3.biblioteca.cntrl_Livros;
import javax.swing.JOptionPane;

/**
 *
 * @author regis
 */
public class jf_TelaInicial extends javax.swing.JFrame {
    cntrl_Livros cl = new cntrl_Livros();
    /**
     * Creates new form jf_TelaInicial
     */
    public jf_TelaInicial() {
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

        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jbt_Visualizar = new javax.swing.JButton();
        jbt_Sair = new javax.swing.JButton();
        jbt_Cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtf_Nome = new javax.swing.JTextField();
        jtxtf_Id = new javax.swing.JTextField();
        jtxtf_Genero = new javax.swing.JTextField();
        jtxtf_Paginas = new javax.swing.JTextField();
        jtxtf_Disponiveis = new javax.swing.JTextField();

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 253, 252));

        jPanel3.setBackground(new java.awt.Color(1, 4, 3));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(59, 181, 116));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbt_Visualizar.setBackground(new java.awt.Color(34, 89, 109));
        jbt_Visualizar.setForeground(new java.awt.Color(236, 249, 242));
        jbt_Visualizar.setText("Visualizar");
        jbt_Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_VisualizarActionPerformed(evt);
            }
        });

        jbt_Sair.setBackground(new java.awt.Color(34, 89, 109));
        jbt_Sair.setForeground(new java.awt.Color(236, 249, 242));
        jbt_Sair.setText("Sair");
        jbt_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbt_Visualizar)
                    .addComponent(jbt_Sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbt_Visualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_Sair)
                .addContainerGap())
        );

        jbt_Cadastrar.setBackground(new java.awt.Color(46, 83, 142));
        jbt_Cadastrar.setForeground(new java.awt.Color(236, 249, 242));
        jbt_Cadastrar.setText("Cadastrar");
        jbt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_CadastrarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(236, 249, 242));
        jLabel1.setText("Nome:");

        jLabel2.setForeground(new java.awt.Color(236, 249, 242));
        jLabel2.setText("ID:");

        jLabel3.setForeground(new java.awt.Color(236, 249, 242));
        jLabel3.setText("Genero:");

        jLabel4.setForeground(new java.awt.Color(236, 249, 242));
        jLabel4.setText("Paginas:");

        jLabel5.setForeground(new java.awt.Color(236, 249, 242));
        jLabel5.setText("Disponiveis:");

        jtxtf_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_GeneroActionPerformed(evt);
            }
        });

        jtxtf_Paginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_PaginasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt_Cadastrar)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtf_Nome)
                            .addComponent(jtxtf_Id)
                            .addComponent(jtxtf_Genero)
                            .addComponent(jtxtf_Paginas)
                            .addComponent(jtxtf_Disponiveis, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jtxtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtf_Paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtf_Disponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jbt_Cadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtf_PaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_PaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_PaginasActionPerformed

    private void jtxtf_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_GeneroActionPerformed

    private void jbt_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbt_SairActionPerformed

    private void jbt_VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_VisualizarActionPerformed
        tabela_Visualizar visualizar = new tabela_Visualizar(null, true, cl);
        visualizar.setVisible(true);
    }//GEN-LAST:event_jbt_VisualizarActionPerformed

    private void jbt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CadastrarActionPerformed
        Livros livro = new Livros();
        
        livro.setNome(jtxtf_Nome.getText());
        livro.setId(Integer.parseInt(jtxtf_Id.getText()));
        livro.setGenero(jtxtf_Genero.getText());
        livro.setQtdPaginas(Integer.parseInt(jtxtf_Paginas.getText()));
        livro.setDisponiveis(Integer.parseInt(jtxtf_Disponiveis.getText()));
        
        if (cl.save(livro))  {
            JOptionPane.showMessageDialog(null, "Livro salvo com sucesso!");
            
            /**
             * Preparando os campos para mais inputs
             */
            jtxtf_Nome.setText("");
            jtxtf_Id.setText("");
            jtxtf_Genero.setText("");
            jtxtf_Paginas.setText("");
            jtxtf_Disponiveis.setText("");
            
            jtxtf_Nome.requestFocus();
        }else
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar, tente novamente.");
    }//GEN-LAST:event_jbt_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(jf_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jf_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jf_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jf_TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jf_TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton jbt_Cadastrar;
    private javax.swing.JButton jbt_Sair;
    private javax.swing.JButton jbt_Visualizar;
    private javax.swing.JTextField jtxtf_Disponiveis;
    private javax.swing.JTextField jtxtf_Genero;
    private javax.swing.JTextField jtxtf_Id;
    private javax.swing.JTextField jtxtf_Nome;
    private javax.swing.JTextField jtxtf_Paginas;
    // End of variables declaration//GEN-END:variables
}
