
import javax.swing.JOptionPane;

public class SitAlunoForm extends javax.swing.JFrame {
    Aluno aluno = new Aluno();

    public SitAlunoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFaltas = new javax.swing.JTextField();
        textAulas = new javax.swing.JTextField();
        textMencao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ButtonCadastrar = new javax.swing.JButton();
        nome_text = new javax.swing.JLabel();
        ButtonSituacao = new javax.swing.JButton();
        disc_text = new javax.swing.JLabel();
        porcFaltas = new javax.swing.JTextField();
        aulas_text = new javax.swing.JLabel();
        situacao = new javax.swing.JTextField();
        faltas_text = new javax.swing.JLabel();
        porcFaltas_text = new javax.swing.JLabel();
        mencao_text = new javax.swing.JLabel();
        situacao_text = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        encerrar = new javax.swing.JButton();
        textDisc = new javax.swing.JTextField();
        ButtonExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        textFaltas.setBackground(new java.awt.Color(204, 255, 204));
        textFaltas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textFaltas.setForeground(new java.awt.Color(0, 0, 0));
        textFaltas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));

        textAulas.setBackground(new java.awt.Color(204, 255, 204));
        textAulas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textAulas.setForeground(new java.awt.Color(0, 0, 0));
        textAulas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));

        textMencao.setBackground(new java.awt.Color(204, 255, 204));
        textMencao.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textMencao.setForeground(new java.awt.Color(0, 0, 0));
        textMencao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));

        jLabel1.setBackground(new java.awt.Color(0, 102, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("B O L E T I M");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));

        ButtonCadastrar.setBackground(new java.awt.Color(153, 255, 153));
        ButtonCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtonCadastrar.setForeground(new java.awt.Color(0, 153, 102));
        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        nome_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nome_text.setForeground(new java.awt.Color(0, 0, 0));
        nome_text.setText("Nome do aluno(a):");

        ButtonSituacao.setBackground(new java.awt.Color(153, 255, 153));
        ButtonSituacao.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtonSituacao.setForeground(new java.awt.Color(0, 153, 102));
        ButtonSituacao.setText("Situação");
        ButtonSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSituacaoActionPerformed(evt);
            }
        });

        disc_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        disc_text.setForeground(new java.awt.Color(0, 0, 0));
        disc_text.setText("Disciplina selecionada:");

        porcFaltas.setBackground(new java.awt.Color(0, 153, 102));
        porcFaltas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        porcFaltas.setForeground(new java.awt.Color(0, 0, 0));

        aulas_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        aulas_text.setForeground(new java.awt.Color(0, 0, 0));
        aulas_text.setText("Total de aulas:");

        situacao.setBackground(new java.awt.Color(0, 153, 102));
        situacao.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        situacao.setForeground(new java.awt.Color(0, 0, 0));

        faltas_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        faltas_text.setForeground(new java.awt.Color(0, 0, 0));
        faltas_text.setText("Quant. de faltas:");

        porcFaltas_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        porcFaltas_text.setForeground(new java.awt.Color(0, 0, 0));
        porcFaltas_text.setText("Porcentagem de faltas:");

        mencao_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mencao_text.setForeground(new java.awt.Color(0, 0, 0));
        mencao_text.setText("Menção final:");

        situacao_text.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        situacao_text.setForeground(new java.awt.Color(0, 0, 0));
        situacao_text.setText("Situação:");

        textNome.setBackground(new java.awt.Color(204, 255, 204));
        textNome.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textNome.setForeground(new java.awt.Color(0, 0, 0));
        textNome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));
        textNome.setCaretColor(new java.awt.Color(0, 51, 51));

        encerrar.setBackground(new java.awt.Color(204, 255, 204));
        encerrar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        encerrar.setForeground(new java.awt.Color(0, 153, 102));
        encerrar.setText("Encerrar programa");
        encerrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));
        encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarActionPerformed(evt);
            }
        });

        textDisc.setBackground(new java.awt.Color(204, 255, 204));
        textDisc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        textDisc.setForeground(new java.awt.Color(0, 0, 0));
        textDisc.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));

        ButtonExibir.setBackground(new java.awt.Color(153, 255, 153));
        ButtonExibir.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ButtonExibir.setForeground(new java.awt.Color(0, 153, 102));
        ButtonExibir.setText("Exibir");
        ButtonExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mencao_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(situacao_text, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(textMencao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(porcFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ButtonSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ButtonExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aulas_text)
                                    .addComponent(faltas_text)
                                    .addComponent(disc_text)
                                    .addComponent(nome_text))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textAulas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(porcFaltas_text)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(disc_text))
                            .addComponent(nome_text))
                        .addGap(20, 20, 20)
                        .addComponent(aulas_text)
                        .addGap(20, 20, 20)
                        .addComponent(faltas_text)
                        .addGap(22, 22, 22)
                        .addComponent(mencao_text))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textMencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrar)
                    .addComponent(ButtonSituacao)
                    .addComponent(ButtonExibir))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porcFaltas_text, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(porcFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(situacao_text))
                .addGap(83, 83, 83)
                .addComponent(encerrar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        aluno.nome = this.textNome.getText();
        aluno.disc = this.textDisc.getText();
        aluno.setAulas(Double.parseDouble(this.textAulas.getText()));
        aluno.setFaltas(Double.parseDouble(this.textFaltas.getText()));
        aluno.setMencao(this.textMencao.getText());
        
        JOptionPane.showMessageDialog(null, "Aluno cadastrado no sistema!");
        
        this.textNome.setText("");
        this.textDisc.setText("");
        this.textAulas.setText("");
        this.textFaltas.setText("");
        this.textMencao.setText("");
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void encerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarActionPerformed
       System.exit(0);
    }//GEN-LAST:event_encerrarActionPerformed

    private void ButtonSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSituacaoActionPerformed
        this.textNome.setText(""+aluno.nome);
        double perc=aluno.VerificarFaltas();
        this.porcFaltas.setText(""+perc+"%");
        String msg = aluno.VerificarSit(perc);
        this.situacao.setText(msg);
    }//GEN-LAST:event_ButtonSituacaoActionPerformed

    private void ButtonExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExibirActionPerformed

        this.textNome.setText(aluno.nome);
        this.textDisc.setText(aluno.disc);
        this.textAulas.setText(""+aluno.getAulas());
        this.textFaltas.setText(""+aluno.getFaltas());
        this.textMencao.setText(aluno.getMencao());
    }//GEN-LAST:event_ButtonExibirActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SitAlunoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SitAlunoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SitAlunoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SitAlunoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SitAlunoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonExibir;
    private javax.swing.JButton ButtonSituacao;
    private javax.swing.JLabel aulas_text;
    private javax.swing.JLabel disc_text;
    private javax.swing.JButton encerrar;
    private javax.swing.JLabel faltas_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mencao_text;
    private javax.swing.JLabel nome_text;
    private javax.swing.JTextField porcFaltas;
    private javax.swing.JLabel porcFaltas_text;
    private javax.swing.JTextField situacao;
    private javax.swing.JLabel situacao_text;
    private javax.swing.JTextField textAulas;
    private javax.swing.JTextField textDisc;
    private javax.swing.JTextField textFaltas;
    private javax.swing.JTextField textMencao;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
