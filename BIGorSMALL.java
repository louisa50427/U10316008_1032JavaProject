import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BIGorSMALL extends JFrame{
	JLabel label = new JLabel();
	JLabel win = new JLabel();
	JLabel lose = new JLabel();
	JPanel ask = new JPanel();
	JTextField txf = new JTextField(5);
	JTextField sc = new JTextField(5);
	JTextField louisa = new JTextField(15);
	JPanel chose = new JPanel();
	JPanel people = new JPanel();
	JPanel card = new JPanel();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel a = new JPanel();
	JPanel b = new JPanel();

	JButton p1 = new JButton("start");
	int score = 0;
	int count = 0;
	int round = 1;
	String i ;
	int all = 0;
	boolean y;

	ImageIcon o = new ImageIcon((getClass().getResource("card/o.jpg")));
	ImageIcon p = new ImageIcon((getClass().getResource("card/p.jpg")));
	ImageIcon[] deck = new ImageIcon[52];
	JButton[] jbt = new JButton[52];
	int[] array = new  int[52];
	int[] yours = new  int[5];
	int[] theirs = new  int[5];
	
				
	
	
	
	
	BIGorSMALL(){
		for(int i=0;i < 52;i++){
			y = true;
			while(y){
				y=false;
				array[i] =  (int)(Math.random()* 52);
				deck[array[i]] = new ImageIcon((getClass().getResource("card/"+(i+1)+".png")));
				for(int j=0;j<i;j++){ 
					if(array[i]==array[j]){
             					y=true;
					}
				}

           		}
     		} 
  		

		
		ask.add(new JLabel("準備好請按start"));
		chose.add(p1);


		people.add(new JLabel(o));
		people.add(new JLabel(p));
		
		this.add(ask,BorderLayout.NORTH);
		this.add(people,BorderLayout.CENTER);
		this.add(chose,BorderLayout.SOUTH);
		p1.addActionListener(new play1());

		
		for(int i = 0 ; i <52 ;i++){
			
			jbt[i] = new JButton(new ImageIcon((getClass().getResource("card/"+(i+1)+".png"))));
			deck[i] = new ImageIcon((getClass().getResource("card/"+(i+1)+".png")));
		}
		
		
	}
	
	public static void main(String[] args){
		BIGorSMALL frame = new BIGorSMALL();

		
		frame.setTitle("隨機比大小");
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	
		
	
	}
	class play1 implements ActionListener{
		
		

		@Override
		public void actionPerformed(ActionEvent E){
			
			Conan conan = new Conan();
		
		}

	}
	
	public class Conan extends JFrame{
		
		JFrame ka = new JFrame();
	
		Conan(){
			
			jbt[array[0]].addActionListener(new PUSH1());
			jbt[array[1]].addActionListener(new PUSH2());
			jbt[array[2]].addActionListener(new PUSH3());
			jbt[array[3]].addActionListener(new PUSH4());
			jbt[array[4]].addActionListener(new PUSH5());


			

			ka.setTitle("你是小智");
			ka.setVisible(true);
			ka.setSize(800,500);
			ka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ka.setLocationRelativeTo(null);
			
			
			
			
			for(int i = 0 ; i < 5 ; i++){
				card.add(jbt[array[i]]);
				
			}


			panel.add(louisa);
			panel.add(txf);
			panel.add(sc);
		
			panel2.setLayout(null);
			panel2.setBackground(Color.red);
			panel2.add(label);
			label.setBounds(200,50,200,200);
			win.setBounds(100,200,200,200);
			lose.setBounds(100,200,200,200);
			panel2.add(win);
			panel2.add(lose);
			a.add(new JLabel(o));
			b.add(new JLabel(p));
			ka.add(a,BorderLayout.WEST);
			ka.add(card,BorderLayout.SOUTH);
			ka.add(b,BorderLayout.EAST);
			ka.add(panel,BorderLayout.NORTH);
			ka.add(panel2,BorderLayout.CENTER);
			sc.setText("0");	

		}
	
	class PUSH1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent E){
			jbt[array[0]].setEnabled(false);
			if(round == 1){
				louisa.setText("第一回合:比小");
				if(array[0]<array[5]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[5]]);
					
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[5]]);
				}
				
				round++;
			}
			else if(round == 2){
				louisa.setText("第二回合:比大");
				if(array[0]>array[6]){
					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[6]]);
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[6]]);
				}
				
				round++;
			}
			else if(round == 3){
				louisa.setText("第三回合:比小");
				if(array[0]<array[7]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[7]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[7]]);
				}
				
				round++;
			}
			else if(round == 4){
					louisa.setText("第四回合:比大");
					if(array[0]>array[8]){
						score+=10;
						txf.setText("你贏了");
						i =  Integer.toString(score);
						sc.setText(i);
						label.setIcon(deck[array[8]]);
					}
					else{
						txf.setText("你輸了");
						i =  Integer.toString(score);
						sc.setText(i);
						label.setIcon(deck[array[8]]);
					}
				
				round++;
			}
			else if(round == 5){
				louisa.setText("第五回合:比小");
				if(array[0]<array[9]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[9]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[9]]);
				}
				
				round++;
				
				if(score >=30)
					win.setText("                                  win");
				else
					lose.setText("                                  lose");
				}
			}
		}
	}
	class PUSH2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent E){
			jbt[array[1]].setEnabled(false);
			if(round == 1){
				louisa.setText("第一回合:比小");
				if(array[1]<array[5]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[5]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[5]]);
				}
				
				round++;
			}
			else if(round == 2){
				louisa.setText("第二回合:比大");
				if(array[1]>array[6]){
					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[6]]);
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[6]]);
				}
				
				round++;
			}
			else if(round == 3){
				louisa.setText("第三回合:比小");
				if(array[1]<array[7]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[7]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[7]]);
				}
				
				round++;
			}
			else if(round == 4){
					louisa.setText("第四回合:比大");
					if(array[1]>array[8]){
						score+=10;
						txf.setText("你贏了");
						i =  Integer.toString(score);
						sc.setText(i);
						label.setIcon(deck[array[8]]);
					}
					else{
						txf.setText("你輸了");
						i =  Integer.toString(score);
						sc.setText(i);
						label.setIcon(deck[array[8]]);
					}
				
				round++;
			}
			else if(round == 5){
				louisa.setText("第五回合:比小");
				if(array[1]<array[9]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[9]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[9]]);
				}
				
				round++;
				if(score >=30)
					win.setText("                                  win");
				else
					lose.setText("                                  lose");
				
			}
		

		}
	}
	class PUSH3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent E){
			jbt[array[2]].setEnabled(false);

			if(round == 1){
				louisa.setText("第一回合:比小");
				if(array[2]<array[5]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[5]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[5]]);
				}
				
				round++;
			}
			else if(round == 2){
				louisa.setText("第二回合:比大");
				if(array[2]>array[6]){
					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[6]]);
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[6]]);
				}
		
				round++;
			}
			else if(round == 3){
				louisa.setText("第三回合:比小");
				if(array[2]<array[7]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[7]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[7]]);
				}
			
				round++;
			}
			else if(round == 4){
					louisa.setText("第四回合:比大");
					if(array[2]>array[8]){
						score+=10;
						txf.setText("你贏了");
						i =  Integer.toString(score);
						sc.setText(i);
						label.setIcon(deck[array[8]]);
					}
					else{
						txf.setText("你輸了");
						i =  Integer.toString(score);
						sc.setText(i);
						label.setIcon(deck[array[8]]);
					}
			
				round++;
			}
			else if(round == 5){
				louisa.setText("第五回合:比小");
				if(array[2]<array[9]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[9]]);
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
					label.setIcon(deck[array[9]]);
				}
				
				round++;
				if(score >=30)
					win.setText("                                  win");
				else
					lose.setText("                                  lose");
				
			}
		}
	}
	class PUSH4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent E){
			jbt[array[3]].setEnabled(false);

			if(round == 1){
				louisa.setText("第一回合:比小");
				if(array[3]<array[5]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[5]]);
				
				round++;
			}
			else if(round == 2){
				louisa.setText("第二回合:比大");
				if(array[3]>array[6]){
					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[6]]);
				
				round++;
			}
			else if(round == 3){
				louisa.setText("第三回合:比小");
				if(array[3]<array[7]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[7]]);
		
				round++;
			}
			else if(round == 4){
				louisa.setText("第四回合:比大");
				if(array[3]>array[8]){
					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
		
				}
				label.setIcon(deck[array[8]]);
				
				round++;
			}
			else if(round == 5){
				louisa.setText("第五回合:比小");
				if(array[3]<array[9]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[9]]);
				
				round++;
				if(score >=30)
					win.setText("                                  win");
				else
					lose.setText("                                  lose");
				
			}
		}
	}
	class PUSH5 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent E){
			jbt[array[4]].setEnabled(false);

			if(round == 1){
				louisa.setText("第一回合:比小");
				if(array[4]<array[5]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
		
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[5]]);
				
				round++;
			}
			else if(round == 2){
				louisa.setText("第二回合:比大");
				if(array[4]>array[6]){
					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{
					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[6]]);
			
				round++;
			}
			else if(round == 3){
				louisa.setText("第三回合:比小");
				if(array[4]<array[7]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[7]]);
				
				round++;
			}
			else if(round == 4){
				louisa.setText("第四回合:比大");
					if(array[4]>array[8]){
						score+=10;
						txf.setText("你贏了");
						i =  Integer.toString(score);
						sc.setText(i);
					
					}
					else{
						txf.setText("你輸了");
						i =  Integer.toString(score);
						sc.setText(i);
					
					}
					label.setIcon(deck[array[8]]);
				
				round++;
			}
			else if(round == 5){
				louisa.setText("第五回合:比小");
				if(array[4]<array[9]){

					score+=10;
					txf.setText("你贏了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				else{

					txf.setText("你輸了");
					i =  Integer.toString(score);
					sc.setText(i);
				
				}
				label.setIcon(deck[array[9]]);
				
				
				round++;
				if(score >=30)
					win.setText("                                  win");
				else 
					lose.setText("                                 lose");
				
			}
		}
	}

}	
