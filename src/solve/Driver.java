package solve;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class Driver {
//	
//    public static void main(String[] args){
//        boolean isDone = false;
//        Scanner s = new Scanner(System.in);
//        CalculatorSolutionVisitor visitor = new CalculatorSolutionVisitor();
//        do{
//            System.out.println("Enter an expression? (Y/N)");
//            String input = s.nextLine();
//            switch(input){
//                case "Y":
//                case "y":
//                    isDone = false;
//                    break;
//                case "N":
//                case "n":
//                    isDone = true;
//                    break;
//                default:
//                    isDone = true;
//            }
//
//            System.out.println("Please enter your expression:");
//            String expression = s.nextLine();
//
//            Float output = visitor.solve(expression);
//            if(output != null){
//                System.out.println("Answer: "+ output);
//            }else{
//                System.out.println("Invalid Expression.");
//            }
//        }while(!isDone);
//
//    }
	
	private JFrame frame;
	
     private JTextField Result;

     String display = "";
 
     CalculatorSolutionVisitor visitor = new CalculatorSolutionVisitor();
     private JButton btnClear;
     private JButton btnOne;
     private JButton btnTwo;
     private JButton btnThree;
     private JButton btnFour;
     private JButton btnFive;
     private JButton btnSix;
     private JButton btnSeven;
     private JButton btnEight;
     private JButton btnNine;
     private JButton btnZero;
     private JButton btnLeft;
     private JButton btnRight; 
     private JButton btnAdd;
     private JButton btnSub;
     private JButton btnMul;
     private JButton btnDiv;
     private JButton btnEquals;
 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Driver window = new Driver();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Driver() {
		
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 278, 400);
		frame.setTitle("Calculator");
 
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        
        Result = new JTextField();
        Result.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Result.setBounds(15, 16, 228, 34);
        p2.add(Result);
        Result.setColumns(10);
        Result.setEditable(false);

        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        
        btnSeven = new JButton("7");
        btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnSeven.setBounds(16, 58, 52, 44);
        p2.add(btnSeven);
        
        btnEight = new JButton("8");
        btnEight.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnEight.setBounds(71, 58, 52, 44);
        p2.add(btnEight);
        
        btnNine = new JButton("9");
        btnNine.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNine.setBounds(125, 58, 52, 44);
        p2.add(btnNine);
        
        btnFour = new JButton("4");
        btnFour.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnFour.setBounds(17, 118, 52, 44);
        p2.add(btnFour);
        
        btnFive = new JButton("5");
        btnFive.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnFive.setBounds(71, 118, 52, 44);
        p2.add(btnFive);
        
        btnSix = new JButton("6");
        btnSix.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnSix.setBounds(125, 118, 52, 44);
        p2.add(btnSix);
        
        btnOne = new JButton("1");
        btnOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnOne.setBounds(15, 178, 52, 44);
        p2.add(btnOne);
        
        btnTwo = new JButton("2");
        btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnTwo.setBounds(68, 178, 52, 44);
        p2.add(btnTwo);
        
        btnThree = new JButton("3");
        btnThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnThree.setBounds(122, 178, 52, 44);
        p2.add(btnThree);
        
        btnLeft = new JButton("(");
        btnLeft.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnLeft.setBounds(15, 238, 52, 44);
        p2.add(btnLeft);
        
        btnZero = new JButton("0");
        btnZero.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnZero.setBounds(69, 238, 52, 44);
        p2.add(btnZero);
        
        btnRight = new JButton(")");
        btnRight.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnRight.setBounds(123, 238, 52, 44);
        p2.add(btnRight);
        
        btnClear = new JButton("Clear");
        btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnClear.setBounds(15, 301, 162, 29);
        p2.add(btnClear);
        
        btnAdd = new JButton("+");
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnAdd.setBounds(192, 58, 52, 50);
        p2.add(btnAdd);
        
        btnSub = new JButton("-");
        btnSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnSub.setBounds(192, 112, 52, 50);
        p2.add(btnSub);
        
        btnMul = new JButton("*");
        btnMul.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnMul.setBounds(192, 166, 52, 50);
        p2.add(btnMul);
        
        btnDiv = new JButton("/");
        btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnDiv.setBounds(192, 220, 52, 50);
        p2.add(btnDiv);
        
        btnEquals = new JButton("=");
        btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnEquals.setBounds(192, 280, 52, 50);
        p2.add(btnEquals);
  
        frame.getContentPane().add(p);

        btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "1");
			}
		});
        
        btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "2");
			}
		});
        
        btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "3");
			}
		});
        
        btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "4");
			}
		});
        
        btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "5");
			}
		});
        
        btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "6");
			}
		});
        
        btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "7");
			}
		});
        
        btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "8");
			}
		});
        
        btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "9");
			}
		});
        
        btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "0");
			}
		});

        btnLeft.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				display = Result.getText();
 	            Result.setText(display + "(");

 			}
 		});
        
        btnRight.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				display = Result.getText();
 	            Result.setText(display + ")");

 			}
 		});
        
        btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "+");

			}
		});
        
        btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "-");
			}
		});
        
        btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "*");

			}
		});
        
        btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText();
	            Result.setText(display + "/");

			}
		});
        
        btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display = Result.getText()+";";
				Float output = visitor.solve(display);
				
	            if(output != null){
	            	Result.setText(output+"");
	            }else{
	            	Result.setText("Invalid Expression");
	            }
			}
		});
	
        btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Result.setText("");
	            
			}
		});
	}
}
