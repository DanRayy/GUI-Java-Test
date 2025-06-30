/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dan-pc
 */
package heranca;

import java.awt.TextField;
import java.util.HashSet;
import java.util.Set;

public class JogadorGUI extends javax.swing.JFrame {
    
    
    /**
     * Creates new form JogadorGUI
     */
    Jogador jogador = null; //jogador sem nada
    
    public JogadorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxClasses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jButtonCriarPersonagem = new javax.swing.JButton();
        jButtonLimparDados = new javax.swing.JButton();
        jButtonDeletarJogador = new javax.swing.JButton();
        jToggleButtonExibirPersonagem = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfoPersonagem = new javax.swing.JTextArea();
        jLabelExibirPersonagem = new javax.swing.JLabel();
        jLabelInforClasses = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSelecClasse = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jComboBoxClasses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Classe", "Barbaro", "Paladino", "Ladrao", "Cavaleiro", "Assassino" }));
        jComboBoxClasses.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBoxClassesComponentAdded(evt);
            }
        });
        jComboBoxClasses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxClassesItemStateChanged(evt);
            }
        });
        jComboBoxClasses.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jComboBoxClassesComponentShown(evt);
            }
        });
        jComboBoxClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassesActionPerformed(evt);
            }
        });

        jLabel2.setText("Classe:");

        jLabel3.setText("Idade:");

        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });

        jButtonCriarPersonagem.setText("Criar personagem");
        jButtonCriarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarPersonagemActionPerformed(evt);
            }
        });

        jButtonLimparDados.setText("Limpar");
        jButtonLimparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparDadosActionPerformed(evt);
            }
        });

        jButtonDeletarJogador.setText("Deletar Personagem");
        jButtonDeletarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarJogadorActionPerformed(evt);
            }
        });

        jToggleButtonExibirPersonagem.setText("ExibirPersonagem");
        jToggleButtonExibirPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonExibirPersonagemActionPerformed(evt);
            }
        });

        jTextAreaInfoPersonagem.setEditable(false);
        jTextAreaInfoPersonagem.setColumns(20);
        jTextAreaInfoPersonagem.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfoPersonagem);

        jLabelExibirPersonagem.setText("Informações do jogador:");

        jLabelInforClasses.setText("Informações da classe selecionada: ");

        jTextAreaSelecClasse.setEditable(false);
        jTextAreaSelecClasse.setColumns(20);
        jTextAreaSelecClasse.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSelecClasse);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxClasses, 0, 256, Short.MAX_VALUE)
                            .addComponent(jTextFieldNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonCriarPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLimparDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDeletarJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButtonExibirPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelExibirPersonagem))
                            .addComponent(jLabelInforClasses))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxClasses, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCriarPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimparDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletarJogador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonExibirPersonagem)
                .addGap(8, 8, 8)
                .addComponent(jLabelExibirPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInforClasses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jComboBoxClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClassesActionPerformed

    private void jComboBoxClassesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBoxClassesComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClassesComponentAdded

    private void jComboBoxClassesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxClassesItemStateChanged
        // TODO add your handling code here:
        // evento quando muda a opção do combobox
        String classeSelecionada = (String) jComboBoxClasses.getSelectedItem();
        if(classeSelecionada.equals("Barbaro")){
            String infoBarbaro = "Vida: 100\nForca: 40\nDefesa: 15\nArmadura: 90\n";
            jTextAreaSelecClasse.setText(infoBarbaro);
        }
        else if(classeSelecionada.equals("Assassino")){
            String infoAssassino = "Vida: 100\nForca: 40\nDefesa: 15\nArmadura: 90\n";
            jTextAreaSelecClasse.setText(infoAssassino);
        }
        else if(classeSelecionada.equals("Cavaleiro")){
            String infoCavaleiro = "Vida: 140\nForca: 25\nDefesa: 15\nArmadura: 150\n";
            jTextAreaSelecClasse.setText(infoCavaleiro);
        }
        else if(classeSelecionada.equals("Ladrao")){
            String infoLadrao = "Vida: 80\nForca: 70\nDefesa: 10\nArmadura: 80\n";
            jTextAreaSelecClasse.setText(infoLadrao);
        }
        else if(classeSelecionada.equals("Paladino")){
            String infoPaladino = "Vida: 120\nForca: 50\nDefesa: 20\nArmadura: 50\n";
            jTextAreaSelecClasse.setText(infoPaladino);
        }
        else{
            jTextAreaSelecClasse.setText("");
        }
    }//GEN-LAST:event_jComboBoxClassesItemStateChanged

    private void jComboBoxClassesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxClassesComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClassesComponentShown

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jButtonCriarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarPersonagemActionPerformed

        String nome = jTextFieldNome.getText();
        int idade = Integer.parseInt(jTextFieldIdade.getText()); //transforma o texto em inteiro
        String classeSelecionada = (String) jComboBoxClasses.getSelectedItem();
        
        if(jogador != null){ //se o jogador n for nulo fala que ja existe
            System.out.println("-----------------------------");
            System.out.println("Jogador ja existe");
            System.out.println("-----------------------------");
            System.out.println("Nome: " + jogador.getNome());
            System.out.println("Idade: " + jogador.getIdade());
            System.out.println("orca: " + jogador.getForca());
            System.out.println("Defesa: " + jogador.getDefesa());
            System.out.println("Armadura: " + jogador.getArmadura());
            System.out.println("Classe: " + classeSelecionada());
            System.out.println("-----------------------------");
        }
        else{
            if(classeSelecionada.equals("Barbaro")){
                jogador = new Barbaro(nome, idade);
                System.out.println("\nJogador criado");              
            }
            else if(classeSelecionada.equals("Assassino")){
                jogador = new Assassino(nome, idade);
                System.out.println("\nJogador criado");               
            }
            else if(classeSelecionada.equals("Cavaleiro")){
                jogador = new Cavaleiro(nome, idade);
                System.out.println("\nJogador criado");
            }
            else if(classeSelecionada.equals("Ladrao")){
                jogador = new Ladrao(nome, idade);
                System.out.println("\nJogador criado");
            }
            else if(classeSelecionada.equals("Paladino")){
                jogador = new Paladino(nome, idade);
                System.out.println("\nJogador criado");
            }
            else if(classeSelecionada.equals("Selecione uma classe")){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Erro ao cirar personagem");
                System.out.println("Nenhuma classe foi selecionada");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            }
            else{
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Erro ao cirar personagem");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
        
    }//GEN-LAST:event_jButtonCriarPersonagemActionPerformed

    private void jButtonLimparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparDadosActionPerformed
        // limpa os dados
        jTextFieldNome.setText("");
        jTextFieldIdade.setText("");
    }//GEN-LAST:event_jButtonLimparDadosActionPerformed

    private void jButtonDeletarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarJogadorActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setText(""); 
        jTextFieldIdade.setText("");
        jogador = null; //deleta o jogador e volta jogador para nulo
        System.out.println("Jogador deletado");
    }//GEN-LAST:event_jButtonDeletarJogadorActionPerformed

    private void jToggleButtonExibirPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonExibirPersonagemActionPerformed
        // TODO add your handling code here:
        if(jToggleButtonExibirPersonagem.isSelected()){
            System.out.println("botao exibir personagem LIGADO");
            
            if(jogador != null){
            String infoPersonagem = "Nome: " + jogador.getNome()
                + "\n" + "Idade: " + jogador.getIdade() 
                + "\n" + "Forca: " + jogador.getForca()
                + "\n" + "Armadura: " + jogador.getArmadura()
                + "\n" + "Defesa: " + jogador.getDefesa();
            jTextAreaInfoPersonagem.setText(infoPersonagem);
            System.out.println("Exibindo personagem");            
            }
            else{
                jTextAreaInfoPersonagem.setText("nenhum personagem criado!");
                System.out.println("nenhum personagem foi criado");
            }
        }else{
            System.out.println("botao exibir personagem DESLIGADO");
            jTextAreaInfoPersonagem.setText("");
        }
    }//GEN-LAST:event_jToggleButtonExibirPersonagemActionPerformed

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
            java.util.logging.Logger.getLogger(JogadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogadorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogadorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarPersonagem;
    private javax.swing.JButton jButtonDeletarJogador;
    private javax.swing.JButton jButtonLimparDados;
    private javax.swing.JComboBox<String> jComboBoxClasses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelExibirPersonagem;
    private javax.swing.JLabel jLabelInforClasses;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaInfoPersonagem;
    private javax.swing.JTextArea jTextAreaSelecClasse;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JToggleButton jToggleButtonExibirPersonagem;
    // End of variables declaration//GEN-END:variables

    private String classeSelecionada() {
        return (String) jComboBoxClasses.getSelectedItem();
    }


}
