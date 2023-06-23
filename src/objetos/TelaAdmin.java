package objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaAdmin extends javax.swing.JFrame {
        ArrayList<Aluno> lista = new ArrayList<>();
    
    public TelaAdmin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        campoCpf = new javax.swing.JTextField();
        campoMatricula = new javax.swing.JTextField();
        campoIdade = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        btnCadastra = new javax.swing.JButton();
        btnEdita = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 240, -1));
        jPanel1.add(campoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 240, -1));
        jPanel1.add(campoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, -1));
        jPanel1.add(campoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 60, -1));

        labelNome.setForeground(new java.awt.Color(51, 51, 51));
        labelNome.setText("Nome:");
        jPanel1.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        labelCpf.setForeground(new java.awt.Color(51, 51, 51));
        labelCpf.setText("CPF:");
        jPanel1.add(labelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        labelMatricula.setForeground(new java.awt.Color(51, 51, 51));
        labelMatricula.setText("Matrícula:");
        jPanel1.add(labelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        labelIdade.setForeground(new java.awt.Color(51, 51, 51));
        labelIdade.setText("Idade:");
        jPanel1.add(labelIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        btnCadastra.setText("Cadastrar");
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 30));

        btnEdita.setText("Editar");
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdita, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 30));

        btnLista.setText("Listar");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });
        jPanel1.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 90, 30));

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        
        String nome = campoNome.getText();
        int idade = Integer.parseInt(campoIdade.getText());
        String cpf = campoCpf.getText();
        String matricula = campoMatricula.getText();
        Aluno a = new Aluno(nome, idade, cpf, matricula);
        JOptionPane.showMessageDialog(this,"Aluno "+a.getNome()+" Cadastrado com sucesso!");
        lista.add(a);
        campoNome.setText("");
        campoIdade.setText("");
        campoCpf.setText("");
        campoMatricula.setText("");
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        String alunos = "Alunos";
        for (Aluno a : lista) {
            alunos += "\n_________\nNome: " + a.getNome() + "\nIdade: " + a.getIdade() + "\nCPF: " + a.getCpf() + "\nMatrícula: " + a.getMatricula();
        }
        JOptionPane.showMessageDialog(this,alunos);
    }//GEN-LAST:event_btnListaActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        String maluno = JOptionPane.showInputDialog(null, "Digite a matrícula do aluno que deseja editar: ");
        for (Aluno a : lista) {
            if(maluno.equals(a.getMatricula())){
                String nome = JOptionPane.showInputDialog(null,"Digite o novo nome de "+a.getNome()); 
                a.setNome(nome);
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a idade nova de "+a.getNome()));
                a.setIdade(idade);
                String cpf = JOptionPane.showInputDialog(null,"Digite o novo CPF de "+a.getNome());
                a.setCpf(cpf);
                String matricula = JOptionPane.showInputDialog(null,"Digite a nova matrícula de "+a.getNome());
                a.setMatricula(matricula);
            }
            else{
                JOptionPane.showMessageDialog(null,"A matrícula "+maluno+" não existe, tente novamente");
            }
        }
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
            String maluno = JOptionPane.showInputDialog(null, "Digite a matrícula do aluno que deseja remover: ");
        for (Aluno a : lista) {
            if(maluno.equals(a.getMatricula())){
                JOptionPane.showMessageDialog(null,"O aluno "+a.getNome()+" foi removido");
                lista.remove(a);
                break;
            }
            else{
                JOptionPane.showMessageDialog(null,"A matrícula "+maluno+" não existe, tente novamente");
    }//GEN-LAST:event_btnRemoveActionPerformed
        }
    }
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnRemove;
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    // End of variables declaration//GEN-END:variables
}
