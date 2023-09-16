/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadEuroChem;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import cadEuroChem.SingupJFrame;
/**
 *
 * @author phsto
 */
public class SingupJFrame extends javax.swing.JFrame {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private MultiPainel multiPainel;
    /**
     * Creates new form SingupJFrame
     */
    public SingupJFrame() {
        initComponents();
        this.multiPainel = multiPainel;
        //COLOCAR O ICONE DO PROGRAMA
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/cadEuroChem/img/logoIcon.png")));
    }

    public Usuario getUsuarioCadastrado() {
        String auxName = Name.getText();
        String auxPassword = Password.getText();
        return new Usuario(auxName, auxPassword);
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
        jLabel1 = new javax.swing.JLabel();
        buttonSave = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        Name = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PMSYS v0.1");
        setSize(new java.awt.Dimension(1238, 720));

        jPanel1.setBackground(new java.awt.Color(51, 100, 225));
        jPanel1.setPreferredSize(new java.awt.Dimension(556, 410));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Aveline", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadEuroChem/img/logoIcon.png"))); // NOI18N
        jLabel1.setText("EUROCHEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 24, -1, -1));

        buttonSave.setBackground(new java.awt.Color(0, 255, 0));
        buttonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadEuroChem/img/icon3.png"))); // NOI18N
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 300, 84, 60));

        buttonClose.setBackground(new java.awt.Color(255, 51, 51));
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadEuroChem/img/return.png"))); // NOI18N
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 300, 84, 60));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 144, 300, 36));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 240, 300, 36));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 192, 300, 36));

        labelNome.setFont(new java.awt.Font("Aveline", 0, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(222, 255, 255));
        labelNome.setText("NOME:");
        jPanel1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 153, 70, -1));

        labelEmail.setFont(new java.awt.Font("Aveline", 0, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(222, 255, 255));
        labelEmail.setText("EMAIL:");
        jPanel1.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 195, 70, -1));

        labelSenha.setFont(new java.awt.Font("Aveline", 0, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(222, 255, 255));
        labelSenha.setText("SENHA:");
        jPanel1.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 252, -1, -1));

        buttonClear.setBackground(new java.awt.Color(255, 255, 51));
        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadEuroChem/img/imgClear.png"))); // NOI18N
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 300, 84, 60));

        jLabel5.setFont(new java.awt.Font("Aveline", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SINGOUT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 108, 108, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limparTexto(){
        Name.setText("");
        Email.setText("");
        Password.setText("");
    }
        
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        //Botão de Salvar
        String auxName = Name.getText();
        String auxEmail = Email.getText();
        String auxPassword = Password.getText();
        
        //EM CASO DE USAR O EMAIL
        //Usuario novoUsuario = new Usuario(auxName, auxEmail, auxPassword);
        // Obtenha o usuário cadastrado
        Usuario usuarioCadastrado = getUsuarioCadastrado();
        
        if (!usuarios.contains(usuarioCadastrado)) {
            // Usuário não existe na lista, adicione-o
            usuarios.add(usuarioCadastrado);
            System.out.println("Novo usuário adicionado:\nNOME: " + usuarioCadastrado.getName() + 
                "\nSenha: " + usuarioCadastrado.getPassword());
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        
            this.dispose();
            
            multiPainel.setVisible(true);
            // Chame o método setUsuarioCadastrado para fornecer as informações do usuário ao LoginJFrame
            LoginJFrame loginFrame = new LoginJFrame();
            loginFrame.setUsuarioCadastrado(usuarioCadastrado);
            loginFrame.setVisible(true);
        } else {
            System.out.println("Usuário já existe na lista:\nNOME: " + usuarioCadastrado.getName() + 
                "\nSenha: " + usuarioCadastrado.getPassword());
            JOptionPane.showMessageDialog(null, "ACESSO NEGADO: Usuário já existe");
        }
    /*
        if (!usuarios.contains(usuarioCadastrado)) {
            // Usuário não existe na lista, adicione-o
            usuarios.add(usuarioCadastrado);
            System.out.println("Novo usuário adicionado:\nNOME: " + usuarioCadastrado.getName() + 
                "\nSenha: " + usuarioCadastrado.getPassword());
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        } else {
            System.out.println("Usuário já existe na lista:\nNOME: " + usuarioCadastrado.getName() + 
                "\nSenha: " + usuarioCadastrado.getPassword());
            JOptionPane.showMessageDialog(null, "ACESSO NEGADO: Usuário já existe");
        } 
    */
    }//GEN-LAST:event_buttonSaveActionPerformed
    
    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // TODO add your handling code here:
        //Botão de Sair
        System.out.println("THANKS!");
        System.exit(0);
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        //Botão de Limpar
        limparTexto();
    }//GEN-LAST:event_buttonClearActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingupJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SingupJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    // End of variables declaration//GEN-END:variables
}
