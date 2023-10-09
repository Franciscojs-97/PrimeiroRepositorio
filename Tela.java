/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaPrincipal;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        this.setLocationRelativeTo(null); //Para a localização do Jframe ao ser aberto
        
        //Para aceitar apenas números, conforme regra preestabelecida na classe TipoCaractere
        caixaOc1.setDocument(new TipoCaractere()); 
        caixaHosts.setDocument(new TipoCaractere());
        painel1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        caixaOc1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painel1 = new javax.swing.JPanel();
        mascaraRes = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caixaHosts = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MÁSCARA DE REDE");
        setIconImage(new ImageIcon(getClass().getResource("APP.jpg")).getImage());
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        caixaOc1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        caixaOc1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caixaOc1.setToolTipText("1º octeto do IP");
        caixaOc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaOc1ActionPerformed(evt);
            }
        });
        caixaOc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caixaOc1KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jButton2.setText("Limpar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1º OCT");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QTD HOSTS");

        painel1.setBackground(new java.awt.Color(204, 204, 204));
        painel1.setForeground(new java.awt.Color(204, 204, 204));

        mascaraRes.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        mascaraRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mascaraRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mascaraRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mascaraResMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mascaraRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mascaraRes, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        caixaHosts.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        caixaHosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        caixaHosts.setToolTipText("Quantidade de hosts que pretende utilizar na rede ou sub rede, considere adicionar/somar +2 para contabilizar o IP de REDE e o IP do BRODCAST\n");
        caixaHosts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caixaHostsKeyTyped(evt);
            }
        });

        jDesktopPane1.setLayer(caixaOc1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(painel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(caixaHosts, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(caixaOc1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(caixaHosts, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)))
                .addGap(44, 44, 44))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaHosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caixaOc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {caixaHosts, caixaOc1});

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaOc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaOc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaOc1ActionPerformed

    private void caixaOc1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaOc1KeyTyped
        // TODO add your handling code here:
        //Para aceitar a digitação de apenas 3 caracteres no primeiro campo de texto
        if (caixaOc1.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_caixaOc1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            //Declaração da variáveis
            int oc1,oc2,oc3,oc4,qHost;
            int bits2,bin3,bin4;
            //Verifica os valores digitados
              if(caixaOc1.getText().isEmpty()||caixaHosts.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this, "Todos os campo são de preenchimento obrigatório", "PREENCHIMENTO OBRIGATÓRIO", JOptionPane.WARNING_MESSAGE);
                 return;
              }else if(caixaOc1.getText().equals("127")){
                  JOptionPane.showMessageDialog(this, "Número não pode ser utilizado, pois é um número reservado para teste de rede", "1º OCTETO", JOptionPane.WARNING_MESSAGE);
                  caixaOc1.setText("");
                  return;
              }else if(caixaHosts.getText().equals("0")){
                  JOptionPane.showMessageDialog(this, "Informe um número diferente de 0", "QTD HOSTS", HEIGHT);
                  return;
              }else{
              oc1 = Integer.parseInt(caixaOc1.getText());
              qHost = Integer.parseInt(caixaHosts.getText());
              int tabela[] = {128,64,32,16,8,4,2,1};
        int tabelaT;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        int hostclassA = 16581373;
        int hostclassB = 65023;
        int hostclassC = 254;
        
        /*Verifica e torna verdadeira a variável que 
         conforme o IP e as regras de REDES se ela é da 
         classe A, B ou C
        */ 
            if(oc1>=1 && oc1<=126){
                System.out.println("IP classe: A");
                a = true;

            }else if(oc1>=128 && oc1 <=191){
                b = true;
                System.out.println("IP classe: B");

            }else if(oc1>=192 && oc1 <=223){
                c = true;
                System.out.println("IP classe: C");
            }
            //Conforme regra de IP, mostra mensagem caso o  octeto não seja preencido corretamente
              if(oc1<1 || oc1>223){
                 JOptionPane.showMessageDialog(this, "Deve ser informado um número entre 1 e 223", "Erro no 1º OCTETO", JOptionPane.WARNING_MESSAGE);
                  caixaOc1.setText("");
                 return;
              }
              //Mosta mensagem caso o número de hosts supere o limite que a rede suporta
              if(a==true && qHost>hostclassA){
                JOptionPane.showMessageDialog(this, "Número superior a quantidade suportada pela rede de classe A", "", JOptionPane.WARNING_MESSAGE);
                mascaraRes.setText("");
                painel1.setVisible(false);
                return;
              }else if(b==true && qHost>hostclassB){
                JOptionPane.showMessageDialog(this, "Número superior a quantidade suportada pela rede de classe B", "", JOptionPane.WARNING_MESSAGE);
                mascaraRes.setText("");
                painel1.setVisible(false);
                return;
              }else if(c==true && qHost>hostclassC){
                JOptionPane.showMessageDialog(this, "Número superior a quantidade suportada pela rede de classe C", "", JOptionPane.WARNING_MESSAGE);
                mascaraRes.setText("");
                painel1.setVisible(false);
                return;
              }
              
        
        //Calculo da quantidade de bits necessários para a quantidade de hosts informado
        int bin=2;
        int cont = 2;
       
        while(bin<qHost){
            bin=(int)Math.pow(2, cont);
            
            int qMH = bin;
                    if(bin>qHost)
                        {
                            continue;
                        }
           
                    cont++;
        }

       int bitsRede = 32-(cont);
        //Cálculo para definir o número da máscara
            
                bin3 = ((int) bitsRede/8)*8;
               bin4=(int) bitsRede/8;
                bitsRede = bitsRede-bin3;
 
                int ccont=0;
                tabelaT=0;
                    while(ccont<(bitsRede)){
                        tabelaT+=tabela[ccont];
                        ccont++;
                    }
                    //informa na tela a máscara conforme calculo realizado acima
                    if(bin4==1){
                        mascaraRes.setText("\nMáscara ideal: 255."+tabelaT+".0.0");
                    }else if(bin4==2){
                        mascaraRes.setText("\nMáscara ideal: 255.255."+tabelaT+".0");
                    }else if(bin4==3){
                        mascaraRes.setText("\nMáscara ideal: 255.255.255."+tabelaT);
                    }else{
                       mascaraRes.setText("\nMáscara ideal: "+tabelaT+".0.0.0");
                    }
                    System.out.println("\nA Máscara sugerida acima é a menor possível sem que aja desperdício de IP na rede.");
      
                  
           }
                    
        
              painel1.setVisible(true);
        }catch(RuntimeException e){
            
            JOptionPane.showMessageDialog(this, "Erro inexperado no codigo fonte", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
       
       
       
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Limpa o conteúdo digitado nos campos de texto
        caixaOc1.setText("");
        caixaHosts.setText("");
        painel1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Será considerado apenas o 1º octeto do IP para varificação da quantiade de hosts suportado pela máscara de rede e pela classe do IP", "", WIDTH);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void mascaraResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascaraResMouseClicked
        // TODO add your handling code here:
        
        /*Quando ocorrer o click no número da mascara gerada, 
        abrirá um pop-up informando a quantidade de hosts que a 
        mascara permite configurar 
        */
        
        if(caixaOc1.getText().isEmpty()||caixaHosts.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Todos os campo são de preenchimento obrigatório", "PREENCHIMENTO OBRIGATÓRIO", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int qHost = Integer.parseInt(caixaHosts.getText());
        int bin=2;
        int cont = 2;

        while(bin<qHost){
            bin=(int)Math.pow(2, cont);

            int qMH = bin;
            if(bin>qHost)
            {
                continue;
            }

            cont++;
        }

        JOptionPane.showMessageDialog(this, "Quantidade de hosts que essa máscara permite configurar: "+(bin-2), "QTD MÁX", WIDTH);
    }//GEN-LAST:event_mascaraResMouseClicked

    private void caixaHostsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaHostsKeyTyped
        // TODO add your handling code here:
        //Para aceitar a digitação de apenas 3 caracteres no segundo campo de texto
        if(caixaHosts.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_caixaHostsKeyTyped

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
               
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caixaHosts;
    private javax.swing.JTextField caixaOc1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel mascaraRes;
    private javax.swing.JPanel painel1;
    // End of variables declaration//GEN-END:variables
}
