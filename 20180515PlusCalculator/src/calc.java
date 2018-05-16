import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class InFrame extends JFrame {
	
	/* JButton for Calculator */
	private JButton bnum1;		//Button1
	private JButton bnum2;		//Button2
	private JButton bnum3;		//Button3
	private JButton bnum4;		//Button4
	private JButton bnum5;		//Button5
	private JButton bnum6;		//Button6
	private JButton bnum7;		//Button7
	private JButton bnum8;		//Button8
	private JButton bnum9;		//Button9
	private JButton bnum0;		//Button0
	private JButton bclr;		//Button - Clear
	private JButton badd;		//Button - Addition
	private JButton bequ;		//Button - Result KEY
	private JButton bbsp;		//Button - Backspace
	
	/* JTextfield for equation display */
	private JTextField inputfield;

	/* integers */
	private int stepflag = 0;	//0: initial state & first number; 1: second number; 2: final result;
	private int fnum = 0;		//first number
	private int snum = 0;		//second number
	
	//public InFrame
	//Frame & Panel Configuration
	public InFrame() {
		/* FRAME PRESET */
		
		Toolkit kit = Toolkit.getDefaultToolkit();		//Frame
		Image img = kit.getImage("icon.gif");			//Image
		setIconImage(img);								//Setting
		setSize(390, 515);		//Frame Size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Close Operation - App Close
		setTitle("Plus Calculator");	//Title Setting
		this.setResizable(false);		//NOT ALLOWED to Resize APP
		MyListener buttonlisten = new MyListener();	//For ButtonAction
		setVisible(true);
		
		//Calculator Shape Formation
		Rectangles rect = new Rectangles();
		this.add(rect);
		
		/* Panel Configuration */
//		setLayout(new FlowLayout());	commented to use .setBounds()
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);
		
		/* JLabel for Identification */
		JLabel oops2015440159 = new JLabel("2015440159 전전컴 김정용");
		oops2015440159.setBounds(10, 5, 300, 20);
		panel.add(oops2015440159);
		
		/* Button Position and labeling */
		bnum7 = new JButton("7");
		bnum7.setBounds(25, 135, 80, 80);
		bnum8 = new JButton("8");
		bnum8.setBounds(110, 135, 80, 80);
		bnum9 = new JButton("9");
		bnum9.setBounds(195, 135, 80, 80);
		bbsp = new JButton("←");			//Backspace
		bbsp.setBounds(280, 135, 80, 80);
		bnum4 = new JButton("4");
		bnum4.setBounds(25, 220, 80, 80);
		bnum5 = new JButton("5");
		bnum5.setBounds(110, 220, 80, 80);
		bnum6 = new JButton("6");
		bnum6.setBounds(195, 220, 80, 80);
		bnum1 = new JButton("1");
		bnum1.setBounds(25, 305, 80, 80);
		bnum2 = new JButton("2");
		bnum2.setBounds(110, 305, 80, 80);
		bnum3 = new JButton("3");
		bnum3.setBounds(195, 305, 80, 80);
		bnum0 = new JButton("0");
		bnum0.setBounds(25, 390, 165, 80);
		bclr = new JButton("C");			//Clear
		bclr.setBounds(195, 390, 80, 80);
		bequ = new JButton("=");			//Equals
		bequ.setBounds(280, 305, 80, 165);
		badd = new JButton("+");			//Addition
		badd.setBounds(280, 220, 80, 80);		

		/* ButtonActionListener */
		bnum0.addActionListener(buttonlisten);
		bnum1.addActionListener(buttonlisten);
		bnum2.addActionListener(buttonlisten);
		bnum3.addActionListener(buttonlisten);
		bnum4.addActionListener(buttonlisten);
		bnum5.addActionListener(buttonlisten);
		bnum6.addActionListener(buttonlisten);
		bnum7.addActionListener(buttonlisten);
		bnum8.addActionListener(buttonlisten);
		bnum9.addActionListener(buttonlisten);
		bclr.addActionListener(buttonlisten);
		badd.addActionListener(buttonlisten);
		bequ.addActionListener(buttonlisten);
		bbsp.addActionListener(buttonlisten);
		
		/* JTextField for equation display */
		inputfield = new JTextField(30);
		inputfield.setBounds(30, 50, 328, 62);
		inputfield.setFont(new Font("SansSerif", Font.BOLD, 30));
		
		/* panel.add */
		panel.add(inputfield);
		panel.add(bnum1);
		panel.add(bnum2);
		panel.add(bnum3);
		panel.add(bnum4);
		panel.add(bnum5);
		panel.add(bnum6);
		panel.add(bnum7);
		panel.add(bnum8);
		panel.add(bnum9);
		panel.add(bnum0);
		panel.add(bclr);
		panel.add(bequ);
		panel.add(bbsp);	
		panel.add(badd);
	}
	/* private class MyListener used for various ButtonAction */
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
//			System.out.println(inputfield.getText());	//temporally used for checking inputfield.getText()
			/* 
			 * From Button1 ~ Button9, the action attaches clicked numbers to inputfield.
			 * Exceptions:
			 *   When clicked after result: reset everything and add the number.
			 */
			if (e.getSource() == bnum1) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("1");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"1");
				}
			}
			else if (e.getSource() == bnum2) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("2");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"2");
				}
			}
			else if (e.getSource() == bnum3) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("3");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"3");
				}
			}
			else if (e.getSource() == bnum4) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("4");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"4");
				}
			}
			else if (e.getSource() == bnum5) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("5");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"5");
				}
			}
			else if (e.getSource() == bnum6) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("6");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"6");
				}
			}
			else if (e.getSource() == bnum7) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("7");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"7");
				}
			}
			else if (e.getSource() == bnum8) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("8");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"8");
				}
			}
			else if (e.getSource() == bnum9) {
				if (stepflag == 2) {
					stepflag = 0;
					inputfield.setText("9");
				}
				else {
					String tmptext = inputfield.getText();
					inputfield.setText(tmptext+"9");
				}
			}
			/* 
			 * Button0 functions only when there are already some numbers in inputfield.
			 * Also, when result came out, no action occurs.
			 */
			else if (e.getSource() == bnum0) {
				String tmptext = inputfield.getText();
				if (tmptext.length() >= 1 && stepflag < 2)
					inputfield.setText(tmptext+"0");
			}
			/*
			 * Button Clear clears everything from integers to textfield.
			 */
			else if (e.getSource() == bclr) {
				stepflag = 0;
				fnum = 0;
				snum = 0;
				inputfield.setText(null);
			}
			/*
			 * Button Addition sets first number and makes stepflag to 1 (ready for second number receiving).
			 */
			else if (e.getSource() == badd) {
				if (stepflag == 0) {
					stepflag = 1;
					String tmptext = inputfield.getText();
					fnum = Integer.parseInt(tmptext);
					inputfield.setText(tmptext+" + ");
				}
			}
			/*
			 * Button Equal calculates the whole equation.
			 * Two types of calculations:
			 *   1. When the user input the whole equation
			 *   2. When the user trigger button action
			 *   Successful result/Termination ends with stepflag = 2
			 */
			else if (e.getSource() == bequ) {
				//1. When the user input the whole equation
				if (stepflag == 0) {
					String tmptext = inputfield.getText();
					if (tmptext.indexOf("+") != -1 && tmptext.substring(tmptext.indexOf("+")+1,tmptext.length()-1).indexOf('+') != -1) {
						//more than two addition signs - ERROR message
						stepflag = 2;
						inputfield.setText("Equation ERROR");
					}
					else if (tmptext.indexOf("+") != -1 && tmptext.indexOf(" + ") == -1) {	//When wrote like "15+20"
						fnum = Integer.parseInt(tmptext.substring(0,tmptext.indexOf("+")));
						snum = Integer.parseInt(tmptext.substring(tmptext.indexOf("+")+1, tmptext.length()));
						int result = fnum + snum;
						stepflag = 2;
						if (tmptext.concat(tmptext+String.valueOf(result)).length() < 28 )	//if whole equation is too long for the APP
							inputfield.setText(tmptext+" = "+result);
						else
							inputfield.setText(" = " + result);
					}
					else if (tmptext.indexOf(" + ") != -1) {							//When wrote like "15 + 20"
						fnum = Integer.parseInt(tmptext.substring(0,tmptext.indexOf(" + ")));
						snum = Integer.parseInt(tmptext.substring(tmptext.indexOf("+")+2, tmptext.length()));
						int result = fnum + snum;
						stepflag = 2;
						if (tmptext.concat(tmptext+String.valueOf(result)).length() < 28 )	//if whole equation is too long for the APP
							inputfield.setText(tmptext+" = "+result);
						else
							inputfield.setText(" = " + result);
					}
				}
				//2. When the user trigger button action
				if (stepflag == 1) {
					stepflag = 2;
					String tmptext = inputfield.getText();
					snum = Integer.parseInt(tmptext.substring(3+tmptext.indexOf(" + ", 0)));
					int result = fnum+snum;
					if (tmptext.concat(tmptext+String.valueOf(result)).length() < 28 )	//if whole equation is too long for the APP
						inputfield.setText(tmptext+" = "+result);
					else
						inputfield.setText(" = " + result);
				}
			}
			/*
			 * Button Backspace erases the last character from the inputfield.
			 * Doesn't work when no numbers are present.
			 * Erases also + sign.
			 */
			else if (e.getSource() == bbsp) {
				
				if (stepflag < 2 && inputfield.getText().length() > 0) {
					String tmptext = inputfield.getText();

					if (tmptext.charAt(tmptext.length()-1) == ' ') {
						stepflag = 0;		//erases + sign.
						inputfield.setText(tmptext.substring(0, tmptext.length()-3));
					}
					else if (tmptext.charAt(tmptext.length()-1) == '+'){
						stepflag = 0;		//erases + sign.
						inputfield.setText(tmptext.substring(0, tmptext.length()-1));
					}
					else
						inputfield.setText(tmptext.substring(0, tmptext.length()-1));
				}
			}
		}
	}
}

//class Rectangles for calculator design
class Rectangles extends JPanel {

	  public void paint(Graphics g) {

		g.setColor(Color.BLACK);
		g.drawRect(22, 44, 342, 72);
		g.setColor(Color.WHITE);
		g.fillRect(23, 45, 340, 70);
	  }
}
public class calc {

	public static void main(String[] args) {

		InFrame calc = new InFrame();

	}

}
