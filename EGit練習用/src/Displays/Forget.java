//5:ID入力

package Displays;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Forget extends JPanel {

	//IDを入力するためのテキストフィールド
	JTextField id = new JTextField(32);

	Forget(){
	this.setLayout(null);
	setSize(1000, 600);

	ImageIcon icon = new ImageIcon("logo.png");
	JLabel othello = new JLabel(icon);
	othello.setBounds(405, 25, 170, 80);
	JLabel name=new JLabel("パスワードを忘れた方");
	name.setFont(new Font("MS ゴシック", Font.BOLD, 20));
	name.setForeground(Color.WHITE);
	name.setBounds(380, 100, 250, 50);

	JLabel label = new JLabel("ID");
	label.setFont(new Font("MS ゴシック", Font.BOLD, 22));
	label.setForeground(Color.WHITE);
	label.setBounds(380, 270, 250, 25);

	id.setBounds(415, 270, 150, 25);

	JButton to_question = new JButton("次へ");
	to_question.setFont(new Font("MS ゴシック", Font.BOLD, 20));
	to_question.setBounds(415, 450, 150, 50);
	to_question.setForeground(Color.WHITE);
	to_question.setBackground(new Color(51, 102, 255));
	to_question.addActionListener(new toQuestion());

	this.add(othello);
	this.add(name);
	this.add(label);
	this.add(id);
	this.add(to_question);

	}

	 public class toQuestion implements ActionListener{
	     	public void actionPerformed(ActionEvent e) {

	     		String i = id.getText();//入力されたIDを取得

	     		Disp.ChangeDisp(Disp.question);
	     	}
	     }

}
