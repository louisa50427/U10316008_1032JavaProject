import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ghost extends JFrame{
	JButton jbt = new JButton("START");
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	ImageIcon[] deck = new ImageIcon[54];
	JLabel IM1;
	JLabel IM2;
	JLabel IM3;
	JLabel IM4;
	
	
	public ghost(){
		

		int[] array = new  int[4];

		for(int i = 0 ; i <52 ;i++){
			deck[i] = new ImageIcon((getClass().getResource("card/"+(i+1)+".png")));
		}
		deck[52] = new ImageIcon((getClass().getResource("card/53.png")));
		deck[53] = new ImageIcon((getClass().getResource("card/51.png")));
		
		ImageIcon start =  new ImageIcon((getClass().getResource("card/b2fv.png")));
		
		for(int i=0;i < 4;i++){
   			array[i] =  (int)(Math.random()* 54);
			for(int j=0;j<i;j++){ 
      				while(array[i]==array[j]){
             				array[i] =  (int)(Math.random()* 54);
           			}
     			 } 
  		}
		
		
		panel.setLayout(new GridLayout(1,4,7,7));
		IM1 = new JLabel(start);
		IM2 = new JLabel(start);
		IM3 = new JLabel(start);
		IM4 = new JLabel(start);
		
		panel.add(IM1);
		panel.add(IM2);
		panel.add(IM3);
		panel.add(IM4);
		
		
		this.add(panel2,BorderLayout.SOUTH);
		this.add(panel,BorderLayout.CENTER);
		jbt.addActionListener(new Refresh());
		panel2.add(jbt,BorderLayout.SOUTH);
	}
	
	

	
	
	public static void main(String[] args){
			
		
		
		ghost frame = new ghost();

		
		frame.setTitle("GHOST");
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	
		
	
	}
		
	
	class Refresh implements ActionListener{
	
		int[] array = new  int[4];

		

		@Override
		public void actionPerformed(ActionEvent E){

			for(int i=0;i < 4;i++){
   				array[i] =  (int)(Math.random()* 54);
				for(int j=0;j<i;j++){ 
      					while(array[i]==array[j]){
             					array[i] =  (int)(Math.random()* 54);
           				}
     				 } 
  			}
		
		
			panel.repaint();
			IM1.setIcon(deck[array[0]]);
			IM2.setIcon(deck[array[1]]);
			IM3.setIcon(deck[array[2]]);
			IM4.setIcon(deck[array[3]]);	
		}

	}
}
