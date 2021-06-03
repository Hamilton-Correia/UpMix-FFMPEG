
package view;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author HAMILTON
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        setIcon();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelByName = new javax.swing.JLabel();
        jLabelEng = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Up-Mix de Áudio");
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(111, 190, 80, 23);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(191, 190, 60, 23);

        jLabelUsuario.setText("  Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(60, 130, 60, 14);

        jLabelSenha.setText(" Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(70, 160, 50, 14);

        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(120, 120, 130, 30);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(120, 150, 130, 30);

        jLabelByName.setText("by Hamilton");
        getContentPane().add(jLabelByName);
        jLabelByName.setBounds(760, 270, 70, 20);

        jLabelEng.setText("Engenharia");
        getContentPane().add(jLabelEng);
        jLabelEng.setBounds(760, 290, 70, 20);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\55929\\Documents\\NetBeansProjects\\ProjetoUpmix\\src\\main\\java\\imagens\\Java_logo_icon.png")); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 850, 320);

        setSize(new java.awt.Dimension(865, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkLogin (String login, String senha){
        return login.equals("engenharia")&&senha.equals("redeam");
    }

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        if(this.checkLogin(jTextFieldUsuario.getText(), new String(jPasswordFieldSenha.getPassword()))){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if(this.checkLogin(jTextFieldUsuario.getText(), new String(jPasswordFieldSenha.getPassword()))){
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
            }            
        }
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jTextFieldUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if(this.checkLogin(jTextFieldUsuario.getText(), new String(jPasswordFieldSenha.getPassword()))){
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
            }            
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyPressed
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelByName;
    private javax.swing.JLabel jLabelEng;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\55929\\Documents\\NetBeansProjects\\ProjetoUpmix\\src\\main\\java\\imagens\\icon.png"));
    }

    
}
