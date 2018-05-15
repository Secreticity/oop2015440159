import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class InFrame extends JFrame {
	
	private JButton bnum1;
	private JButton bnum2;
	private JButton bnum3;
	private JButton bnum4;
	private JButton bnum5;
	private JButton bnum6;
	private JButton bnum7;
	private JButton bnum8;
	private JButton bnum9;
	private JButton bnum0;
	private JButton bclr;
	private JButton badd;
	private JButton bequ;
	private JButton bbsp;
	private JTextField inputfield;
	private int stepflag = 0;
	private int fnum = 0;
	private int snum = 0;
	
	public InFrame() {
		/* PRESET */
		Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(390, 515);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Plus Calculator");
		Image img = kit.getImage("icon.gif");
		setIconImage(img);
		this.setResizable(false);
		MyListener buttonlisten = new MyListener();
		
		Rectangles rect = new Rectangles();
		this.add(rect);
		setVisible(true);
		/*Constructor*/
//		setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.add(panel);

		bnum7 = new JButton("7");
		bnum7.setBounds(25, 135, 80, 80);
		bnum8 = new JButton("8");
		bnum8.setBounds(110, 135, 80, 80);
		bnum9 = new JButton("9");
		bnum9.setBounds(195, 135, 80, 80);
		bbsp = new JButton("<-");
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
		bclr = new JButton("C");
		bclr.setBounds(195, 390, 80, 80);
		bequ = new JButton("=");
		bequ.setBounds(280, 305, 80, 165);
		badd = new JButton("+");
		badd.setBounds(280, 220, 80, 80);		

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
		JLabel oops2015440159 = new JLabel("2015440159 전전컴 김정용");
		oops2015440159.setBounds(10, 5, 300, 20);
		panel.add(oops2015440159);
		inputfield = new JTextField(30);
		inputfield.setBounds(30, 50, 328, 62);
		inputfield.setFont(new Font("SansSerif", Font.BOLD, 30));
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
	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
//			System.out.println(inputfield.getText());
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
			else if (e.getSource() == bnum0) {
				String tmptext = inputfield.getText();
				if (tmptext.length() >= 1 && stepflag < 2)
					inputfield.setText(tmptext+"0");
			}
			else if (e.getSource() == bclr) {
				stepflag = 0;
				fnum = 0;
				snum = 0;
				inputfield.setText(null);
			}
			else if (e.getSource() == badd) {
				if (stepflag == 0) {
					stepflag = 1;
					String tmptext = inputfield.getText();
					fnum = Integer.parseInt(tmptext);
					inputfield.setText(tmptext+" + ");
				}
			}
			else if (e.getSource() == bequ) {
				//Manual Input
				if (stepflag == 0) {
					String tmptext = inputfield.getText();
					if (tmptext.indexOf("+") != -1 && tmptext.indexOf(" + ") == -1) {
						fnum = Integer.parseInt(tmptext.substring(0,tmptext.indexOf("+")));
						snum = Integer.parseInt(tmptext.substring(tmptext.indexOf("+")+1, tmptext.length()));
						int result = fnum + snum;
						if (tmptext.concat(tmptext+String.valueOf(result)).length() < 28 )
							inputfield.setText(tmptext+" = "+result);
						else
							inputfield.setText(" = " + result);
					}
					else if (tmptext.indexOf(" + ") != -1) {
						fnum = Integer.parseInt(tmptext.substring(0,tmptext.indexOf(" + ")));
						snum = Integer.parseInt(tmptext.substring(tmptext.indexOf("+")+2, tmptext.length()));
						int result = fnum + snum;
						if (tmptext.concat(tmptext+String.valueOf(result)).length() < 28 )
							inputfield.setText(tmptext+" = "+result);
						else
							inputfield.setText(" = " + result);
					}
				}
				if (stepflag == 1) {
					stepflag = 2;
					String tmptext = inputfield.getText();
					snum = Integer.parseInt(tmptext.substring(3+tmptext.indexOf(" + ", 0)));
					int result = fnum+snum;
					if (tmptext.concat(tmptext+String.valueOf(result)).length() < 28 )
						inputfield.setText(tmptext+" = "+result);
					else
						inputfield.setText(" = " + result);
				}
			}
			else if (e.getSource() == bbsp) {
				
				if (stepflag < 2 && inputfield.getText().length() > 0) {
					String tmptext = inputfield.getText();

					if (tmptext.charAt(tmptext.length()-1) == ' ') {
						stepflag = 0;
						inputfield.setText(tmptext.substring(0, tmptext.length()-3));
					}
					else
						inputfield.setText(tmptext.substring(0, tmptext.length()-1));
				}
			}
		}
	}
}

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
