/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import model.Sessao;

/**
 *
 * @author allan
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
       
        this.setTitle("Sistema Revisional de Locais Sustentáveis");
        this.setSize(1024, 768);
        
        txtArea.setVisible(false);
        JMenuBar menuBar = new JMenuBar();
        
        JMenu menuSustentabilidade = new JMenu("Sustentabilidade");
        JMenuItem menuOq = new JMenuItem("O que é");
        JMenuItem menuSair = new JMenuItem("Sair");
        menuSustentabilidade.add(menuOq);
        menuSustentabilidade.add(menuSair);
        menuBar.add(menuSustentabilidade);
        
        JMenu menuRevisionar = new JMenu("Revisionar");
        JMenuItem menuNovoLocal = new JMenuItem("Cadastrar novo local");
        JMenuItem menuConsultarLocal = new JMenuItem("Consultar local");
        JMenuItem menuAlterarLocal = new JMenuItem("Alterar local");
        JMenuItem menuExcluirLocal = new JMenuItem("Excluir local");
        menuRevisionar.add(menuNovoLocal);
        menuRevisionar.add(menuConsultarLocal);
        menuRevisionar.add(menuAlterarLocal);
        menuRevisionar.add(menuExcluirLocal);
        menuBar.add(menuRevisionar);
        
        JMenu menuEstrategico = new JMenu("Funções Estratégicas");
        JMenuItem menuFuncao1 = new JMenuItem("Consultar Estatisticas");
        JMenuItem menuFuncao2 = new JMenuItem("Consultar Desempenho");
        menuEstrategico.add(menuFuncao1);
        menuEstrategico.add(menuFuncao2);
        menuBar.add(menuEstrategico);
        
        
        menuOq.setEnabled(false);
        menuNovoLocal.setEnabled(false);
        menuConsultarLocal.setEnabled(false);
        menuAlterarLocal.setEnabled(false);
        menuExcluirLocal.setEnabled(false);
        menuFuncao1.setEnabled(false);
        menuFuncao2.setEnabled(false);
        
        super.setJMenuBar(menuBar);
        
        menuOq.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt){
               txtArea.setText("Sustentabilidade é um conceito relacionado ao desenvolvimento sustentável, ou seja, formado por um conjunto de ideias, estratégias e demais atitudes ecologicamente corretas, economicamente viáveis, socialmente justas e culturalmente diversas.\n\n" +
                "A sustentabilidade serve como alternativa para garantir a sobrevivência dos recursos naturais do planeta, ao mesmo tempo que permite aos seres humanos e sociedades soluções ecológicas de desenvolvimento.\n\n" +
                "Existem diversos conceitos ligados a sustentabilidade, como o crescimento sustentado, que é um aumento na economia constante e seguro; e a gestão sustentável, que é dirigir uma organização valorizando todos os fatores que a englobam, e é essencialmente ligado ao meio ambiente.\n" +
                "Vários desses conceitos incluem as palavras \"sustentável\" ou \"sustentado\". A diferença entre os dois termos é que o \"sustentável\" indica que há a possibilidade de sustentação, enquanto que o termo \"sustentado\" expressa que essa sustentação já foi alcançada.\n" +
                "Etimologicamente, a palavra sustentável tem origem no latim sustentare, que significa \"sustentar\", \"apoiar\" e \"conservar\".");
               txtArea.setVisible(true);
           } 
        });
        
        menuNovoLocal.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("Cadastrar novo local de revisão");
                txtArea.setVisible(true);
            }
        });
        
        menuConsultarLocal.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("Consultar local de revisão");
                txtArea.setVisible(true);
            }
        });
        
        menuAlterarLocal.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("Alterar local de revisão");
                txtArea.setVisible(true);
            }
        });
        
        menuExcluirLocal.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("Excluir local de revisão");
                txtArea.setVisible(true);
            }
        });
        
        menuFuncao1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("Consultar relatório de estatisticas");
                txtArea.setVisible(true);
            }
        });
        
        menuFuncao2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("Consultar relatório de desempenho");
                txtArea.setVisible(true);
            }
        });
        
        menuSair.addActionListener(new java.awt.event.ActionListener(){
           public void actionPerformed(java.awt.event.ActionEvent evt){
               dispose();
               new Login().setVisible(true);
           } 
        });
        
        
        String sessao = Sessao.getInstance().getNivel();
        
        if(sessao.equals("Diretor")){
            menuOq.setEnabled(true);
            menuNovoLocal.setEnabled(true);
            menuConsultarLocal.setEnabled(true);
            menuAlterarLocal.setEnabled(true);
            menuExcluirLocal.setEnabled(true);
            menuFuncao1.setEnabled(true);
            menuFuncao2.setEnabled(true);
        }
        else if(sessao.equals("Gerente")){
            menuOq.setEnabled(true);
            menuNovoLocal.setEnabled(true);
            menuConsultarLocal.setEnabled(true);
            menuAlterarLocal.setEnabled(true);
            menuExcluirLocal.setEnabled(false);
            menuFuncao1.setEnabled(false);
            menuFuncao2.setEnabled(false);
        }
        else{
            menuOq.setEnabled(true);
            menuNovoLocal.setEnabled(false);
            menuConsultarLocal.setEnabled(true);
            menuAlterarLocal.setEnabled(false);
            menuExcluirLocal.setEnabled(false);
            menuFuncao1.setEnabled(false);
            menuFuncao2.setEnabled(false);
        }
        
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
