package xo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class XO extends JFrame implements ActionListener{
    
        int x,os,turn,count;
        JPanel p1 , p2 ,p3 ,p4,p5 ;
        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,r1,r2 ;
        JLabel t1,t2,t3,t4,t5,t6 ;
        
    
    public  XO()  {
        
    // Initializations
    
        x = 0 ;
        os = 0 ;
        count = 0 ;
        p1 = new JPanel() ;
        p2 = new JPanel() ;
        p3 = new JPanel() ;
        p4 = new JPanel() ;
        
        t1 = new JLabel("XO Game") ;
        t1.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 15));
        t2 = new JLabel ("X = " + x);
        t2.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        t3 = new JLabel ("O = " + os);
        t3.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        t4 = new JLabel ("X");
        t5 = new JLabel ("O");                
        t6 = new JLabel ("");
        t6.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        
    // Reset Buttons 
    
        r1 = new JButton ("Reset Score");
        r1.setBackground(Color.BLACK) ;
        r1.setForeground(Color.white);
        r1.setHorizontalTextPosition(JButton.CENTER);
        r1.setVerticalTextPosition(JButton.CENTER);
        r1.setBorder(new LineBorder(Color.WHITE));
        r1.setFont(new Font(Font.SERIF, Font.BOLD, 35));
        r1.addActionListener(this);
        
        r2 = new JButton ("Reset Game");
        r2.setBackground(Color.BLACK) ;
        r2.setForeground(Color.white);
        r2.setHorizontalTextPosition(JButton.CENTER);
        r2.setVerticalTextPosition(JButton.CENTER);
        r2.setBorder(new LineBorder(Color.WHITE));
        r2.setFont(new Font(Font.SERIF, Font.BOLD, 35));
        r2.addActionListener(this);
        
    // Labels
       
        t1.setHorizontalAlignment(JLabel.CENTER) ;
        t2.setHorizontalAlignment(JLabel.CENTER) ;
        t3.setHorizontalAlignment(JLabel.CENTER) ;
        t6.setHorizontalAlignment(JLabel.CENTER) ;
        
        t1.setForeground(Color.white);
        t2.setForeground(Color.white);
        t3.setForeground(Color.white);
        t6.setForeground(Color.white);
        
        
    // XO Buttons
        
        b1 = new JButton();
        b1.setBackground(Color.WHITE) ;
        b1.setBorder(new LineBorder(Color.BLACK));
        b1.addActionListener(this);

        b2 = new JButton();
        b2.setBackground(Color.WHITE) ;
        b2.setBorder(new LineBorder(Color.BLACK));
        b2.addActionListener(this);

        b3 = new JButton();
        b3.setBackground(Color.WHITE) ;
        b3.setBorder(new LineBorder(Color.BLACK));
        b3.addActionListener(this);

        b4 = new JButton();
        b4.setBackground(Color.WHITE) ;
        b4.setBorder(new LineBorder(Color.BLACK));
        b4.addActionListener(this);

        b5 = new JButton();
        b5.setBackground(Color.WHITE) ;
        b5.setBorder(new LineBorder(Color.BLACK));
        b5.addActionListener(this);

        b6 = new JButton();
        b6.setBackground(Color.WHITE) ;
        b6.setBorder(new LineBorder(Color.BLACK));
        b6.addActionListener(this);

        b7 = new JButton();
        b7.setBackground(Color.WHITE) ;
        b7.setBorder(new LineBorder(Color.BLACK));
        b7.addActionListener(this);

        b8 = new JButton();
        b8.setBackground(Color.WHITE) ;
        b8.setBorder(new LineBorder(Color.BLACK));
        b8.addActionListener(this);

        b9 = new JButton();
        b9.setBackground(Color.WHITE) ;
        b9.setBorder(new LineBorder(Color.BLACK));
        b9.addActionListener(this);
            
    // Panel 1
        
        p1.setBorder(BorderFactory.createEmptyBorder(25, 25, 15, 15));
        p1.setLayout(new GridLayout(3,3)) ;
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
            
    //Panel 2
     
        p2.setLayout(new BorderLayout()) ;
        p2.add(p1,BorderLayout.CENTER) ;
        p2.add(t1,BorderLayout.SOUTH) ;
        
    // Panel 3
     
         p3.setLayout(new GridLayout(5,1)) ;
         p3.add(t2);
         p3.add(t3);
         p3.add(t6);        
         p3.add(r1);
         p3.add(r2);
         
    //Panel 4
        
        p4.setLayout(new GridLayout(1,2)) ;
        p4.add(p2);
        p4.add(p3);
                   
    // Colors Of Panles
        
            p1.setBackground(Color.BLACK) ;
            p2.setBackground(Color.BLACK) ;
            p3.setBackground(Color.BLACK) ;    
            
            this.add(p4);
     } 
    public boolean XWin()
        {
               
           String val1 = b1.getText();
           String val2 = b2.getText();
           String val3 = b3.getText();
           String val4 = b4.getText();
           String val5 = b5.getText();
           String val6 = b6.getText();
           String val7 = b7.getText();
           String val8 = b8.getText();
           String val9 = b9.getText(); 
           
            return  val1.equals("X")&&val2.equals("X")&&val3.equals("X")||val4.equals("X")&&val5.equals("X")&&val6.equals("X")
                    ||val7.equals("X")&&val8.equals("X")&&val9.equals("X")||val1.equals("X")&&val4.equals("X")&&val7.equals("X")
                    ||val2.equals("X")&&val5.equals("X")&&val8.equals("X")||val3.equals("X")&&val6.equals("X")&&val9.equals("X")
                    ||val1.equals("X")&&val5.equals("X")&&val9.equals("X")||val3.equals("X")&&val5.equals("X")&&val7.equals("X");
        }
    public boolean OWin()
        {
              
           String val1 = b1.getText();
           String val2 = b2.getText();
           String val3 = b3.getText();
           String val4 = b4.getText();
           String val5 = b5.getText();
           String val6 = b6.getText();
           String val7 = b7.getText();
           String val8 = b8.getText();
           String val9 = b9.getText();
           
             return val1.equals("O")&&val2.equals("O")&&val3.equals("O")||val4.equals("O")&&val5.equals("O")&&val6.equals("O")
                    ||val7.equals("O")&&val8.equals("O")&&val9.equals("O")||val1.equals("O")&&val4.equals("O")&&val7.equals("O")
                    ||val2.equals("O")&&val5.equals("O")&&val8.equals("O")||val3.equals("O")&&val6.equals("O")&&val9.equals("O")
                    ||val1.equals("O")&&val5.equals("O")&&val9.equals("O")||val3.equals("O")&&val5.equals("O")&&val7.equals("O");
        }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();        
        if(o == b1 && b1.getText().equals("")&&!XWin()&&!OWin())    
        {    
            
          if(turn%2==0){             
            b1.setText(t4.getText());
            b1.setForeground(Color.RED);
            b1.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
            turn++;
            
          }        
          else{
              
            b1.setText(t5.getText());
            b1.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
            b1.setForeground(Color.BLACK);
            turn++;
            
          }
        }   
        if(o == b2 && b2.getText().equals("")&&!XWin()&&!OWin())
        {
          if(turn%2==0){             
             b2.setText(t4.getText());
             b2.setForeground(Color.RED);
             b2.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
             turn++;           
          }  
          else{
              
             b2.setText(t5.getText());
             b2.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
             b2.setForeground(Color.BLACK);
             turn++; 
             
          }
        }
        if(o == b3 && b3.getText().equals("")&&!XWin()&&!OWin())
        {
           if(turn%2==0){  
               
              b3.setForeground(Color.RED);
              b3.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
              b3.setText(t4.getText());
              turn++;
              
           }   
          else{
               
              b3.setText(t5.getText());
              b3.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
             b3.setForeground(Color.BLACK);
              turn++;
              
          }
        }
        if(o == b4 && b4.getText().equals("")&&!XWin()&&!OWin())
        {
            if(turn%2==0){   
                
               b4.setForeground(Color.RED);
               b4.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b4.setText(t4.getText());
               turn++;  
               
          }
          else{
                
              b4.setText(t5.getText());
              b4.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
              b4.setForeground(Color.BLACK);
              turn++; 
              
          }
        }
        if(o == b5 && b5.getText().equals("")&&!XWin()&&!OWin())
        {
            if(turn%2==0){ 
                
               b5.setForeground(Color.RED);
               b5.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b5.setText(t4.getText());
               turn++;  
               
          }
          else{
               b5.setText(t5.getText());
               b5.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
             b5.setForeground(Color.BLACK);
               turn++;           
        }
        }
       if(o == b6 && b6.getText().equals("")&&!XWin()&&!OWin())
        {
            
          if(turn%2==0)
          { 
              
               b6.setForeground(Color.RED);
               b6.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b6.setText(t4.getText());
               turn++;
               
          }   
          else{
              
               b6.setText(t5.getText());
               b6.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b6.setForeground(Color.BLACK);
               turn++; 
               
          }
          }
        if(o == b7 && b7.getText().equals("")&&!XWin()&&!OWin())
        {
          if(turn%2==0){  
              
                b7.setForeground(Color.RED);
                b7.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
                b7.setText(t4.getText());
                turn++;   
                
          }
          else{
              
               b7.setText(t5.getText());
               b7.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b7.setForeground(Color.BLACK);
               turn++; 
               
          }
        }
        if(o == b8 && b8.getText().equals("")&&!XWin()&&!OWin())
        {
           if(turn%2==0){ 
               
               b8.setForeground(Color.RED);
               b8.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b8.setText(t4.getText());
               turn++;  
               
          }   
          else{
               b8.setText(t5.getText());
               b8.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b8.setForeground(Color.BLACK);
               turn++;       
          }
        }
        if(o == b9 && b9.getText().equals("")&&!XWin()&&!OWin())
        {
           if(turn%2==0){
               b9.setForeground(Color.RED);
               b9.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b9.setText(t4.getText());
               turn++;   
          }
          else{
               b9.setText(t5.getText());
               b9.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 30));
               b9.setForeground(Color.BLACK);
               turn++;   
          }          
        }
        // Actionlistener for Reset Button
        // Button to reset Score 
         if (o == r1)
         {
             x = 0;
             os = 0;
             count = 0 ;
             t2.setText("X = " + x);
             t3.setText("O = " + os);  
             t6.setText("");
             b1.setText("");
             b2.setText("");
             b3.setText("");
             b4.setText("");
             b5.setText("");
             b6.setText("");
             b7.setText("");
             b8.setText("");
             b9.setText("");

             b1.setBackground(Color.WHITE) ;
             b2.setBackground(Color.WHITE) ;
             b3.setBackground(Color.WHITE) ;
             b4.setBackground(Color.WHITE) ;
             b5.setBackground(Color.WHITE) ;
             b6.setBackground(Color.WHITE) ;
             b7.setBackground(Color.WHITE) ;
             b8.setBackground(Color.WHITE) ;
             b9.setBackground(Color.WHITE) ;
         
         
         }    
         // Button to reset game
         if (o == r2)
           {
                 count = 0 ;
                 b1.setText("");
                 b2.setText("");
                 b3.setText("");
                 b4.setText("");
                 b5.setText("");
                 b6.setText("");
                 b7.setText("");
                 b8.setText("");
                 b9.setText("");
                 t6.setText("");

                 b1.setBackground(Color.WHITE) ;
                 b2.setBackground(Color.WHITE) ;
                 b3.setBackground(Color.WHITE) ;
                 b4.setBackground(Color.WHITE) ;
                 b5.setBackground(Color.WHITE) ;
                 b6.setBackground(Color.WHITE) ;
                 b7.setBackground(Color.WHITE) ;
                 b8.setBackground(Color.WHITE) ;
                 b9.setBackground(Color.WHITE) ;
         }
           // To get the value of the text on the button 
           
           String val1 = b1.getText();
           String val2 = b2.getText();
           String val3 = b3.getText();
           String val4 = b4.getText();
           String val5 = b5.getText();
           String val6 = b6.getText();
           String val7 = b7.getText();
           String val8 = b8.getText();
           String val9 = b9.getText();
           
          //IF X Wins
          
         if(XWin()&& count == 0)
         {     
             count++;
             t6.setText("Player X IS THE WINNER !!");
             x++;
             t2.setText("X = " + x);
             t3.setText("O = " + os); 

             if(val1.equals("X")&& val2.equals("X")&& val3.equals("X"))
             {
             b2.setBackground(new Color(0, 100, 0)) ;
             b1.setBackground(new Color(0, 100, 0)) ;
             b3.setBackground(new Color(0, 100, 0)) ;
             }

             else if(val4.equals("X") && val5.equals("X")&& val6.equals("X"))
             {
             b4.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b6.setBackground(new Color(0, 100, 0)) ;
             }

             else if (val7.equals("X")&& val8.equals("X") && val9.equals("X"))
             {
             b7.setBackground(new Color(0, 100, 0)) ;
             b8.setBackground(new Color(0, 100, 0)) ;
             b9.setBackground(new Color(0, 100, 0)) ;
             }

             else if (val1.equals("X") && val4.equals("X")&& val7.equals("X"))
             {
             b1.setBackground(new Color(0, 100, 0)) ;
             b4.setBackground(new Color(0, 100, 0)) ;
             b7.setBackground(new Color(0, 100, 0)) ;
             }

             else if (val2.equals("X")&& val5.equals("X") && val8.equals("X"))
             {
             b2.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b8.setBackground(new Color(0, 100, 0)) ;
             }

             else if (val3.equals("X") && val6.equals("X")&& val9.equals("X"))
             {
             b3.setBackground(new Color(0, 100, 0)) ;
             b6.setBackground(new Color(0, 100, 0)) ;
             b9.setBackground(new Color(0, 100, 0)) ;
             }

             else if (val1.equals("X")&& val5.equals("X") && val9.equals("X"))
             {
             b1.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b9.setBackground(new Color(0, 100, 0)) ;
             }

             else if (val3.equals("X") && val5.equals("X")&& val7.equals("X"))
             {
             b3.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b7.setBackground(new Color(0, 100, 0)) ;
             }
             }   

             // IF O Wins
             else if(OWin()&& count == 0)
             {

             count++;
             t6.setText("Player O IS THE WINNER !!");
             os++;
             t2.setText("X = " + x);
             t3.setText("O = " + os);  

             if(val1.equals("O")&& val2.equals("O")&& val3.equals("O"))
             {
             b2.setBackground(new Color(0, 100, 0)) ;
             b1.setBackground(new Color(0, 100, 0)) ;
             b3.setBackground(new Color(0, 100, 0)) ;}

             else if(val4.equals("O") && val5.equals("O")&& val6.equals("O"))
             {b4.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b6.setBackground(new Color(0, 100, 0)) ;}

             else if (val7.equals("O")&& val8.equals("O") && val9.equals("O"))
             {
             b7.setBackground(new Color(0, 100, 0)) ;
             b8.setBackground(new Color(0, 100, 0)) ;
             b9.setBackground(new Color(0, 100, 0)) ;}

             else if (val1.equals("O") && val4.equals("O")&& val7.equals("O"))
             {
             b1.setBackground(new Color(0, 100, 0)) ;
             b4.setBackground(new Color(0, 100, 0)) ;
             b7.setBackground(new Color(0, 100, 0)) ;}

             else if (val2.equals("O")&& val5.equals("O") && val8.equals("O"))
             {
             b2.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b8.setBackground(new Color(0, 100, 0)) ;}

             else if (val3.equals("O") && val6.equals("O")&& val9.equals("O"))
             {
             b3.setBackground(new Color(0, 100, 0)) ;
             b6.setBackground(new Color(0, 100, 0)) ;
             b9.setBackground(new Color(0, 100, 0)) ;}

             else if (val1.equals("O")&& val5.equals("O") && val9.equals("O"))
             {
             b1.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b9.setBackground(new Color(0, 100, 0)) ;}

            else if (val3.equals("O") && val5.equals("O")&& val7.equals("O"))
             {
             b3.setBackground(new Color(0, 100, 0)) ;
             b5.setBackground(new Color(0, 100, 0)) ;
             b7.setBackground(new Color(0, 100, 0)) ;}

    //         
         }   
         // IF they Draw
         else if(
                 !b1.getText().equals("")&&!b2.getText().equals("")&&!b3.getText().equals("")&&
                 !b4.getText().equals("")&&!b5.getText().equals("")&&!b6.getText().equals("")&&
                 !b7.getText().equals("")&&!b8.getText().equals("")&&!b9.getText().equals("")&&!XWin()&&!OWin())
         
         {
             
             t6.setText("DRAW!");
             t2.setText("X = " + x);
             t3.setText("O = " + os);
         
         }
         
           
    }
    
    // Main Class 
    
    public static void main(String[] args)
    {
        XO f = new XO();
        f.setVisible(true);
        f.setSize(550,350);
        f.setTitle("Tic Tac Toe");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.BLACK) ;
    }
} 