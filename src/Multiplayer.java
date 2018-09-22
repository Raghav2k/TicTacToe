
import java.awt.Color;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raghavsharma
 */
public class Multiplayer extends javax.swing.JFrame {


private String [][] board = new String[3][3];
    
    private String player1 = "X";
    private String player2 = "O";
    private String currentply=player1;
    int num; 
    int ties=0;
    int wincounter_h=0;
    int wincounter_c=0;
    /**
     * Creates new form Multiplayer
     */
    public Multiplayer() {
        initComponents();
        getContentPane().setBackground(Color.orange);
    }
public void button(JButton button){
   {
       button.setText(player1);
       
       if (currentply.equalsIgnoreCase(player1))
       {
           button.setText(player1);
           button.setForeground(Color.red);
      
       }
       else{
           button.setText(player2);
           button.setForeground(Color.blue);
       }
       
       if (currentply.equalsIgnoreCase("X"))
       {
           currentply = "O";
       }
       else{
           currentply = "X";
       }
       
       
       }
   
   
    } 
private void choice(){
    JOptionPane.showMessageDialog(null, "Reset Game");
    txtplayer1.setText(Integer.toString(wincounter_h));
    txtplayer2.setText(Integer.toString(wincounter_c));
    txtties.setText(Integer.toString(ties));
    reset();
    
    
}

private void tie(){
   
    board[0][0] = btn1.getText();
    board[0][1]=  btn2.getText();
    board[0][2] = btn3.getText();
    board[1][0] = btn4.getText();
    board[1][1]=  btn5.getText();
    board[1][2] = btn6.getText();
    board[2][0] = btn7.getText();
    board[2][1]=  btn8.getText();
    board[2][2] = btn9.getText();
    
    if(!("").equals(btn1.getText()) && !("").equals(btn2.getText()) && !("").equals(btn3.getText()) && !("").equals(btn4.getText()) && !("").equals(btn5.getText()) && !("").equals(btn6.getText()) && !("").equals(btn7.getText()) && !("").equals(btn8.getText()) && !("").equals(btn9.getText()))
    {
        
    JOptionPane.showMessageDialog(null, "Tie game");
    ties++;
    choice();
    reset();
    
 
    }
}

 private void winner(int aClicked){

    
        
    board[0][0] = btn1.getText();
    board[0][1]=  btn2.getText();
    board[0][2] = btn3.getText();
    board[1][0] = btn4.getText();
    board[1][1]=  btn5.getText();
    board[1][2] = btn6.getText();
    board[2][0] = btn7.getText();
    board[2][1]=  btn8.getText();
    board[2][2] = btn9.getText();
    

  
    
if ((btn1.getText().equals("X")) && (btn2.getText().equals("X")) && (btn3.getText().equals("X")))
{
    
 JOptionPane.showMessageDialog(null, "Player 1 has won the game");
 wincounter_h++;
 choice();
 
}
else if((btn1.getText().equals("X")) && (btn4.getText().equals("X")) && (btn7.getText().equals("X"))){
 
 JOptionPane.showMessageDialog(null, "Player 1 has won the game");
 wincounter_h++;
 choice();
 
  }
else if ((btn3.getText().equals("X")) && (btn6.getText().equals("X")) && (btn9.getText().equals("X"))){
      
  JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  wincounter_h++;
  choice();
  
  }
  
else if((btn2.getText().equals("X")) && (btn5.getText().equals("X")) && (btn8.getText().equals("X")))
  {
  
  JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  wincounter_h++;
  choice(); 
  
  }
else if ((btn4.getText().equals("X")) && (btn5.getText().equals("X")) && (btn6.getText().equals("X")))
{
    
    JOptionPane.showMessageDialog(null, "Player 1 has won the game");

  wincounter_h++;
  
  choice();  
}
else if ((btn7.getText().equals("X")) && (btn8.getText().equals("X")) && (btn9.getText().equals("X")))
  {
  
      JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  
  wincounter_h++;
  choice();
  
  }
else if ((btn1.getText().equals("X")) && (btn5.getText().equals("X")) && (btn9.getText().equals("X")))
  {
      
      JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  
  wincounter_h++;
  choice();
  
  }
else if ((btn3.getText().equals("X")) && (btn5.getText().equals("X")) && (btn7.getText().equals("X")))
  {
      
  JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  
  wincounter_h++;
  choice();
  
  }
if ((btn1.getText().equals(player2)) && (btn2.getText().equals(player2)) && (btn3.getText().equals(player2)))
{
 JOptionPane.showMessageDialog(null, "Player 2 has won the game");
 wincounter_c++;
 choice();

 
}
else if((btn1.getText().equals(player2)) && (btn4.getText().equals(player2)) && (btn7.getText().equals(player2))){
 
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
      
      wincounter_c++;
      choice();
  }
else if ((btn3.getText().equals(player2)) && (btn6.getText().equals(player2)) && (btn9.getText().equals(player2))){
      
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();  
}
  
else if((btn2.getText().equals(player2)) && (btn5.getText().equals(player2)) && (btn8.getText().equals(player2)))
  {
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
      
  
  wincounter_c++;
  choice();
  }
else if ((btn4.getText().equals(player2)) && (btn5.getText().equals(player2)) && (btn6.getText().equals(player2)))
{
    JOptionPane.showMessageDialog(null, "Player 2 has won the game");

  
  wincounter_c++;
  choice();
}
else if ((btn7.getText().equals(player2)) && (btn8.getText().equals(player2)) && (btn9.getText().equals(player2)))
  {
     JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();
  }
else if ((btn1.getText().equals(player2)) && (btn5.getText().equals(player2)) && (btn9.getText().equals(player2)))
  {
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();
  }
else if ((btn3.getText().equals(player2)) && (btn5.getText().equals(player2)) && (btn7.getText().equals(player2)))
  {
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();
  }
 
}
 private void reset(){
    
    btn1.setText("");
    btn2.setText("");
    btn3.setText("");
    btn4.setText("");
    btn5.setText("");
    btn6.setText("");
    btn7.setText("");
    btn8.setText("");
    btn9.setText("");
    board = new String[3][3];
 }
 
 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        lblplayer1 = new javax.swing.JLabel();
        lblplayer2 = new javax.swing.JLabel();
        txtplayer2 = new javax.swing.JTextField();
        txtplayer1 = new javax.swing.JTextField();
        lblties = new javax.swing.JLabel();
        txtties = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnxit = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kokonor", 3, 48)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        btn1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lblplayer1.setText("Player 1");

        lblplayer2.setText("Player 2");

        lblties.setText("Ties");

        txtties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttiesActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnxit.setText("EXIT");
        btnxit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxitActionPerformed(evt);
            }
        });

        btnmenu.setText("Main Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblplayer2)
                            .addGap(18, 18, 18)
                            .addComponent(txtplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblplayer1)
                                .addComponent(lblties))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtties, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblplayer2)
                                    .addComponent(txtplayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblplayer1)
                                    .addComponent(txtplayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblties)
                                    .addComponent(txtties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnxit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        button(btn1);
        winner(1);
        tie();
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void txttiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttiesActionPerformed
        // TODO add your handling code her      
    }//GEN-LAST:event_txttiesActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
         button(btn2);
        winner(2);
        tie();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
         button(btn3);
        winner(3);
        tie();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
         button(btn4);
        winner(4);
        tie();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         button(btn5);
        winner(5);
        tie();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         button(btn6);
        winner(6);
        tie();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
         button(btn7);
        winner(7);
        tie();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
         button(btn8);
        winner(8);
        tie();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
         button(btn9);
        winner(9);
        tie();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnxitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnxitActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
        Intro jf = new Intro();
        jf.setVisible(true);
    }//GEN-LAST:event_btnmenuActionPerformed

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
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multiplayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multiplayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnxit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblplayer1;
    private javax.swing.JLabel lblplayer2;
    private javax.swing.JLabel lblties;
    private javax.swing.JTextField txtplayer1;
    private javax.swing.JTextField txtplayer2;
    private javax.swing.JTextField txtties;
    // End of variables declaration//GEN-END:variables
}
