
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Marlon Martins
 * @since 06/11/2018 - 18:11
 * @version simulador de portas logicas 2.0 - SwingGUI
 */
public class Main extends javax.swing.JFrame {
    
    /**
     * Creates new form Main
     */
    public Main() {
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

        jBtg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbAnd = new javax.swing.JRadioButton();
        jrbOr = new javax.swing.JRadioButton();
        jrbNot = new javax.swing.JRadioButton();
        jlValorA = new javax.swing.JLabel();
        jValorB = new javax.swing.JLabel();
        jtValorA = new javax.swing.JTextField();
        jtValorb = new javax.swing.JTextField();
        jcNotA = new javax.swing.JCheckBox();
        jcNotB = new javax.swing.JCheckBox();
        jbCalcular = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbHistorico = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBtg.add(jrbAnd);
        jrbAnd.setText("AND");
        jrbAnd.setActionCommand("AND");
        jrbAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAndActionPerformed(evt);
            }
        });

        jBtg.add(jrbOr);
        jrbOr.setText("OR");
        jrbOr.setActionCommand("OR");
        jrbOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOrActionPerformed(evt);
            }
        });

        jBtg.add(jrbNot);
        jrbNot.setText("NOT");
        jrbNot.setActionCommand("NOT");
        jrbNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNotActionPerformed(evt);
            }
        });

        jlValorA.setText("Valor A");

        jValorB.setText("Valor B");

        jcNotA.setText("NOT");

        jcNotB.setText("NOT");

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbHistorico.setText("Historico");
        jbHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jValorB)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtValorb))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlValorA)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtValorA, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbAnd)
                                .addGap(58, 58, 58)
                                .addComponent(jrbOr)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbNot)
                            .addComponent(jcNotA)
                            .addComponent(jcNotB)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbHistorico)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAnd)
                    .addComponent(jrbOr)
                    .addComponent(jrbNot))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorA)
                    .addComponent(jtValorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcNotA))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValorB)
                    .addComponent(jtValorb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcNotB))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcular)
                    .addComponent(jbLimpar)
                    .addComponent(jbHistorico))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jrbNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNotActionPerformed
        desabilitarCampos();
    }//GEN-LAST:event_jrbNotActionPerformed

    private void jrbOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOrActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jrbOrActionPerformed

    private void jrbAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAndActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_jrbAndActionPerformed

    private void jbHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistoricoActionPerformed

    }//GEN-LAST:event_jbHistoricoActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        calcular();
        limpar();
    }//GEN-LAST:event_jbCalcularActionPerformed

    private void desabilitarCampos(){
        if(jrbNot.isSelected()){
            jtValorb.setEnabled(false);
            jcNotB.setEnabled(false);
        }
    }
    private void habilitarCampos(){
        if(jrbAnd.isSelected() || jrbOr.isSelected()){
            jtValorb.setEnabled(true);
            jcNotB.setEnabled(true);
        }
    }
    
    private void calcular(){
        int saida = 0;
        String resp = "";
        try {
            //Validação do button group
            if(jBtg.isSelected(null)){
               throw new NumberFormatException("Escolha uma porta lógica"); 
            }
            
            //Validação Valor A
            String valorA = jtValorA.getText();
            if(valorA.isEmpty()){
                throw new NumberFormatException("Preencha o valor A");
            }
            if(!valorA.equalsIgnoreCase("1")&&!valorA.equalsIgnoreCase("0")){
                throw new NumberFormatException("Preencha o valor A apenas com 1 ou 0");
            }
            if(jcNotA.isSelected()){
                if(valorA.equals("1")){
                    valorA = "0";
                }else if(valorA.equals("0")){
                    valorA = "1";
                }
            }
            
            //Validação valor B
            String valorB = jtValorb.getText();
            if(jtValorb.isEnabled()){
                if(valorB.isEmpty()){
                    throw new NumberFormatException("Preencha o valor B");
                }
                if(!valorB.equalsIgnoreCase("1")&&!valorB.equalsIgnoreCase("0")){
                    throw new NumberFormatException("Preencha o valor B apenas com 1 ou 0");
                }
            }
            if(jcNotB.isSelected()){
                if(valorB.equals("1")){
                    valorB = "0";
                }else if(valorB.equals("0")){
                    valorB = "1";
                }
            }
            
            //Switch para escolher porta lógica
            switch(jBtg.getSelection().getActionCommand()){
                //case Porta AND    
                case "AND":
                    if(valorA.equals("0") && valorB.equals("0")){
                        saida = 0;
                    }else if(valorA.equals("0") && valorB.equals("1")){
                        saida = 0;
                    }else if(valorA.equals("1") && valorB.equals("0")){
                        saida = 0;
                    }else if(valorA.equals("1") && valorB.equals("1")){
                        saida = 1;
                    }
                    
                    //print da tabela verdade e da saida
                    if(jcNotA.isSelected() && jcNotB.isSelected()){
                        resp = " Tabela Verdade "
                            + "\n A'| B'| S"
                            + "\n 1 | 1 | 1"
                            + "\n 1 | 0 | 0"
                            + "\n 0 | 1 | 0"
                            + "\n 0 | 0 | 0"
                            + "\n\n A saída é: "+saida;
                    }else if(jcNotB.isSelected()){
                        resp = " Tabela Verdade "
                            + "\n A | B'| S"
                            + "\n 0 | 1 | 0"
                            + "\n 0 | 0 | 0"
                            + "\n 1 | 1 | 1"
                            + "\n 1 | 0 | 0"
                            + "\n\n A saída é: "+saida;
                    }else if(jcNotA.isSelected()){
                        resp = " Tabela Verdade "
                            + "\n A'| B | S"
                            + "\n 1 | 0 | 0"
                            + "\n 1 | 1 | 1"
                            + "\n 0 | 0 | 0"
                            + "\n 0 | 1 | 0"
                            + "\n\n A saída é: "+saida;
                    }else{
                        resp = " Tabela Verdade "
                            + "\n A | B | S"
                            + "\n 0 | 0 | 0"
                            + "\n 0 | 1 | 0"
                            + "\n 1 | 0 | 0"
                            + "\n 1 | 1 | 1"
                            + "\n\n A saída é: "+saida;
                    }
                    break;
                //case Porta OR
                case "OR":
                    if(valorA.equals("0") && valorB.equals("0")){
                        saida = 0;
                    }else if(valorA.equals("0") && valorB.equals("1")){
                        saida = 1;
                    }else if(valorA.equals("1") && valorB.equals("0")){
                        saida = 1;
                    }else if(valorA.equals("1") && valorB.equals("1")){
                        saida = 1;
                    }
                    
                    //print da tabela verdade e da saida
                    if(jcNotA.isSelected() && jcNotB.isSelected()){
                        resp = " Tabela Verdade A'+B'"
                            + "\n A'| B'| S"
                            + "\n 1 | 1 | 1"
                            + "\n 1 | 0 | 1"
                            + "\n 0 | 1 | 1"
                            + "\n 0 | 0 | 0"
                            + "\n\n A saída é: "+saida;
                    }else if(jcNotB.isSelected()){
                        resp = " Tabela Verdade A+B'"
                            + "\n A | B'| S"
                            + "\n 0 | 1 | 1"
                            + "\n 0 | 0 | 0"
                            + "\n 1 | 1 | 1"
                            + "\n 1 | 0 | 1"
                            + "\n\n A saída é: "+saida;
                    }else if(jcNotA.isSelected()){
                        resp = " Tabela Verdade A'+B"
                            + "\n A'| B | S"
                            + "\n 1 | 0 | 1"
                            + "\n 1 | 1 | 1"
                            + "\n 0 | 0 | 0"
                            + "\n 0 | 1 | 1"
                            + "\n\n A saída é: "+saida;
                    }else{
                        resp = " Tabela Verdade "
                            + "\n A | B | S"
                            + "\n 0 | 0 | 0"
                            + "\n 0 | 1 | 1"
                            + "\n 1 | 0 | 1"
                            + "\n 1 | 1 | 1"
                            + "\n\n A saída é: "+saida;
                    }
                     
                    break;    
                case "NOT":
                    if(valorA.equals("0")){
                        saida = 1;
                    }else if(valorA.equals("1")){
                        saida = 0;
                    }
                    //print da tabela verdade e da saida
                    if(jcNotA.isSelected()){
                        resp = " Tabela Verdade A'"
                            + "\n A'| S"
                            + "\n 1 | 0"
                            + "\n 0 | 1"
                            + "\n\n A saída é: "+saida;
                    }else{
                        resp = " Tabela Verdade A"
                            + "\n A | S"
                            + "\n 0 | 1"
                            + "\n 1 | 0"
                            + "\n\n A saída é: "+saida;
                    }
                    break;    
            }
            
            txtArea.setText(resp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Erro! "+e.getMessage());
        }
    }//calcular
    
    private void limpar(){
        jtValorA.setText("");
        jtValorb.setText("");
        jcNotA.setSelected(false);
        jcNotB.setSelected(false);
        jBtg.clearSelection();
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup jBtg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jValorB;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbHistorico;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JCheckBox jcNotA;
    private javax.swing.JCheckBox jcNotB;
    private javax.swing.JLabel jlValorA;
    private javax.swing.JRadioButton jrbAnd;
    private javax.swing.JRadioButton jrbNot;
    private javax.swing.JRadioButton jrbOr;
    private javax.swing.JTextField jtValorA;
    private javax.swing.JTextField jtValorb;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}