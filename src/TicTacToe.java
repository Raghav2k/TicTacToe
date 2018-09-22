/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.Vector;
/**
 *
 * @author raghavsharma
 */
public class TicTacToe extends javax.swing.JFrame {

    private String [][] board = new String[3][3];
    
    private String player1 = "X";
    private String player2 = "O";
    private String currentply = player1;
    private String flag = "N";
    Vector vector=new Vector();
    int num;   
    int ties=0;
    int wincounter_h=0;
    int wincounter_c=0;
    
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
        
        getContentPane().setBackground(Color.orange);
    }

    
    public void button(JButton button){
   {
       if (currentply.equals(player1))
       {
           
           button.setText(player1);
           button.setForeground(Color.blue);
           
       }
       else if (currentply.equals(player2))
       {
           button.setForeground(Color.blue);
           currentply=player1;   
           
          
       }
       }
   
   
    } 
    
    private void choice(){
    JOptionPane.showMessageDialog(null, "Reset Game");
   txthuman.setText(Integer.toString(wincounter_h));
    txtcomputer.setText(Integer.toString(wincounter_c));
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
    reset();
    ties++;
    choice();
    
    }
}
    private void winner(int aClicked){

    if (vector.contains(aClicked)){
    	return;
    }
    vector.add(aClicked);    
    board[0][0] = btn1.getText();
    board[0][1]=  btn2.getText();
    board[0][2] = btn3.getText();
    board[1][0] = btn4.getText();
    board[1][1]=  btn5.getText();
    board[1][2] = btn6.getText();
    board[2][0] = btn7.getText();
    board[2][1]=  btn8.getText();
    board[2][2] = btn9.getText();
  
    if (vector.size() < 9)
    {
        boolean vGetNextNum = Boolean.TRUE;
        while (vGetNextNum)
        {
              num = (int)(Math.ceil(Math.random()*9)); 
//            JOptionPane.showMessageDialog(null, "Hello" + num);
              if (!vector.contains(num)){
              vGetNextNum = Boolean.FALSE;
              break;
            }
                           
                       
        }
        vector.add(num);

//        JOptionPane.showMessageDialog(null, num);
    //  
     
        if (num==1)   
        {
            if (btn1.getText().equals("")){
                btn1.setText(player2);            
            
            }
                              
        }
        else if(num==2)    
        {
            
           if (btn2.getText().equals("")){
                btn2.setText(player2);
            }
        }
        else if (num==3)    
        {
            if (btn3.getText().equals("")){
                btn3.setText(player2);
            }
        }
        else if (num==4)   
        {
            if (btn4.getText().equals("")){
                btn4.setText(player2);
            }
        }        
        else if (num==5)    
        {
            if (btn5.getText().equals("")){
                btn5.setText(player2);
            }
        }
        else if (num==6)   
        {
            if (btn6.getText().equals("")){
                btn6.setText(player2);
            }
        }
        else if (num==7)  
        {
           if (btn7.getText().equals("")){
                btn7.setText(player2);
            }
        }
        else if (num==8) 
        {
            if (btn8.getText().equals("")){
                btn8.setText(player2);
            }
        }
        else if (num==9)    
        {
             if (btn9.getText().equals("")){
                btn9.setText(player2);
            }
        
      }
    	
    }
        
  
    
if ((btn1.getText().equals("X")) && (btn2.getText().equals("X")) && (btn3.getText().equals("X")))
{
    
 JOptionPane.showMessageDialog(null, "Player 1 has won the game");
 wincounter_h++;
 choice();
 flag = "Y";
}
else if((btn1.getText().equals("X")) && (btn4.getText().equals("X")) && (btn7.getText().equals("X"))){
 
 JOptionPane.showMessageDialog(null, "Player 1 has won the game");
 wincounter_h++;
 choice();
 flag = "Y";
  }
else if ((btn3.getText().equals("X")) && (btn6.getText().equals("X")) && (btn9.getText().equals("X"))){
      
  JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  wincounter_h++;
  choice();
  flag = "Y";
  }
  
else if((btn2.getText().equals("X")) && (btn5.getText().equals("X")) && (btn8.getText().equals("X")))
  {
  
  JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  wincounter_h++;
  choice(); 
  flag = "Y";
  }
else if ((btn4.getText().equals("X")) && (btn5.getText().equals("X")) && (btn6.getText().equals("X")))
{
    
    JOptionPane.showMessageDialog(null, "Player 1 has won the game");

  wincounter_h++;
  flag = "Y";
  choice();  
}
else if ((btn7.getText().equals("X")) && (btn8.getText().equals("X")) && (btn9.getText().equals("X")))
  {
  
      JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  
  wincounter_h++;
  choice();
  flag = "Y";
  }
else if ((btn1.getText().equals("X")) && (btn5.getText().equals("X")) && (btn9.getText().equals("X")))
  {
      
      JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  
  wincounter_h++;
  choice();
  flag = "Y";
  }
else if ((btn3.getText().equals("X")) && (btn5.getText().equals("X")) && (btn7.getText().equals("X")))
  {
      
      JOptionPane.showMessageDialog(null, "Player 1 has won the game");
  
  wincounter_h++;
  choice();
  flag = "Y";
  }
if ((btn1.getText().equals("O")) && (btn2.getText().equals("O")) && (btn3.getText().equals("O")))
{
 JOptionPane.showMessageDialog(null, "Player 2 has won the game");
 choice();
 wincounter_c++;
 
}
else if((btn1.getText().equals("O")) && (btn4.getText().equals("O")) && (btn7.getText().equals("O"))){
 
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
      
      wincounter_c++;
      choice();
  }
else if ((btn3.getText().equals("O")) && (btn6.getText().equals("O")) && (btn9.getText().equals("O"))){
      
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();  
}
  
else if((btn2.getText().equals("O")) && (btn5.getText().equals("O")) && (btn8.getText().equals("O")))
  {
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
      
  
  wincounter_c++;
  choice();
  }
else if ((btn4.getText().equals("O")) && (btn5.getText().equals("O")) && (btn6.getText().equals("O")))
{
    JOptionPane.showMessageDialog(null, "Player 2 has won the game");

  
  wincounter_c++;
  choice();
}
else if ((btn7.getText().equals("O")) && (btn8.getText().equals("O")) && (btn9.getText().equals("O")))
  {
     JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();
  }
else if ((btn1.getText().equals("O")) && (btn5.getText().equals("O")) && (btn9.getText().equals("O")))
  {
      JOptionPane.showMessageDialog(null, "Player 2 has won the game");
  
  wincounter_c++;
  choice();
  }
else if ((btn3.getText().equals("O")) && (btn5.getText().equals("O")) && (btn7.getText().equals("O")))
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
 vector=new Vector();
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

        btn1 = new javax.swing.JButton();
        lbltitle = new javax.swing.JLabel();
        lblturn = new javax.swing.JLabel();
        lblcom = new javax.swing.JLabel();
        txthuman = new javax.swing.JTextField();
        txtcomputer = new javax.swing.JTextField();
        lblhuman1 = new javax.swing.JLabel();
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
        btnmenu = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbltitle.setFont(new java.awt.Font("Kokonor", 3, 48)); // NOI18N
        lbltitle.setText("TIC TAC TOE");

        lblcom.setText("Computer");

        txthuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthumanActionPerformed(evt);
            }
        });

        lblhuman1.setText("Human");

        lblties.setText("Ties");

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

        btnmenu.setText("Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcom, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblhuman1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txthuman, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblties, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtties, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(81, 81, 81)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(lbltitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82)))
                .addComponent(lblturn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblturn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbltitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblties)
                            .addComponent(lblhuman1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txthuman, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtties, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        button(btn1);
        winner(1);
        tie();
    }//GEN-LAST:event_btn1ActionPerformed

    private void txthumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthumanActionPerformed

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

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
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
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnmenu;
    private javax.swing.JLabel lblcom;
    private javax.swing.JLabel lblhuman1;
    private javax.swing.JLabel lblties;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblturn;
    private javax.swing.JTextField txtcomputer;
    private javax.swing.JTextField txthuman;
    private javax.swing.JTextField txtties;
    // End of variables declaration//GEN-END:variables
}
