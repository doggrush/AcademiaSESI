package objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    ArrayList<Aluno> lista = new ArrayList<>();
   
    public TelaLogin() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login2 = new javax.swing.JLabel();
        SESI = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        login = new javax.swing.JLabel();
        CampoMat = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        logar = new javax.swing.JButton();
        admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        login2.setBackground(new java.awt.Color(51, 51, 51));
        login2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        login2.setForeground(new java.awt.Color(51, 51, 51));
        login2.setText("Não possui login?");

        SESI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objetos/images/logo.png"))); // NOI18N
        SESI.setToolTipText("");

        welcome.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(51, 51, 51));
        welcome.setText("Bem Vindo à Academia SESI");

        CampoNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoNome.setText("Digite seu nome aqui");
        CampoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoNomeMouseClicked(evt);
            }
        });

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(51, 51, 51));
        login.setText("Faça seu login abaixo");

        CampoMat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoMat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoMat.setText("Digite sua matricula aqui");
        CampoMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CampoMatMouseClicked(evt);
            }
        });

        cadastrar.setText("Cadastrar-se");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        logar.setText("Conectar-se");
        logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logarMouseClicked(evt);
            }
        });
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });

        admin.setText("Administrador");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(login)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SESI)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcome)
                            .addComponent(CampoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(login2)
                                .addGap(18, 18, 18)
                                .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logar)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(admin)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SESI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CampoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login2)
                    .addComponent(cadastrar))
                .addGap(18, 18, 18)
                .addComponent(logar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(admin)
                .addContainerGap())
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

    private void CampoNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNomeMouseClicked
        CampoNome.setText(" ");
    }//GEN-LAST:event_CampoNomeMouseClicked

    private void CampoMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoMatMouseClicked
        CampoMat.setText(" ");
    }//GEN-LAST:event_CampoMatMouseClicked

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        Cadastro cadas = new Cadastro();
        cadas.show();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed
        String nome = CampoNome.getText().toLowerCase();
        String mat = CampoMat.getText().toLowerCase();
      //  JOptionPane.showMessageDialog(null, nome + mat);
        if (nome.equals("augusto")){
            if (mat.equals("123456")){
                Feed feed = new Feed();
                     feed.show();
            }
            else {
                JOptionPane.showMessageDialog(null,"Matricula invalida.");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Nome invalido.");
        }
        for (Aluno a : lista) {
                if (nome.equals(a.getNome())) {
                    
                 if (mat.equals(a.getMatricula())) {
                     Feed feed = new Feed();
                     feed.show();
                 }
                 else {
                     JOptionPane.showMessageDialog(null,"A matricula inserida não é valida para "+nome+", tente novamente.");
                 }
                }
                else {
                    JOptionPane.showMessageDialog(null, "O nome inserido não é valido, tente novamente.");
                }
            }         
    }//GEN-LAST:event_logarActionPerformed

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        String Senha = JOptionPane.showInputDialog(null,"Qual a senha do usuário Admin?");
        if (Senha.equals("123456")) {
            TelaAdmin ademe = new TelaAdmin();
                ademe.show();
        }
        else {
            JOptionPane.showMessageDialog(null,"Senha incorreta");
        }
    }//GEN-LAST:event_adminMouseClicked

    private void logarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logarMouseClicked

    public static void main(String args[]) {
       
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoMat;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JLabel SESI;
    private javax.swing.JButton admin;
    private javax.swing.JButton cadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logar;
    private javax.swing.JLabel login;
    private javax.swing.JLabel login2;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    private static class a {

        public a() {
        }
    }
}
