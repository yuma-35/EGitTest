//6:新パスワード設定

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

public class Question extends JPanel{

	JTextField ans = new JTextField(32);	//答え
	JTextField pw = new JTextField(32);	//新しいパスワード
	JTextField re_pw = new JTextField(32);	//新しいパスワードの確認


	Question(){

		this.setLayout(null);
		setSize(1000,600);

		ImageIcon icon = new ImageIcon("logo.png");
		JLabel othello = new JLabel(icon);
		othello.setBounds(405, 25, 170, 80);
		JLabel name=new JLabel("パスワードを忘れた方");
		name.setFont(new Font("MS ゴシック", Font.BOLD, 20));
		name.setForeground(Color.WHITE);
		name.setBounds(380, 100, 250, 50);

		JLabel label1 = new JLabel("ID:");
		label1.setFont(new Font("MS ゴシック", Font.BOLD, 16));
		label1.setForeground(Color.WHITE);
		label1.setBounds(350, 150, 250, 25);
		JLabel label2 = new JLabel("ここにIDを表示");	//このラベルにIDを表示
		label2.setFont(new Font("MS ゴシック", Font.BOLD, 16));
		label2.setForeground(Color.WHITE);
		label2.setBounds(400, 150, 250, 25);
		JLabel label3 = new JLabel("秘密の質問:");
		label3.setFont(new Font("MS ゴシック", Font.BOLD, 16));
		label3.setForeground(Color.WHITE);
		label3.setBounds(285, 180, 250, 25);
		JLabel label4 = new JLabel("ここに秘密の質問を表示");	//このラベルに秘密の質問を表示
		label4.setFont(new Font("MS ゴシック", Font.BOLD, 16));
		label4.setForeground(Color.WHITE);
		label4.setBounds(400, 180, 300, 25);
		JLabel label5 = new JLabel("答え");
		label5.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label5.setForeground(Color.WHITE);
		label5.setBounds(150, 260, 250, 25);
		JLabel label6 = new JLabel("新しいパスワード");
		label6.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label6.setForeground(Color.WHITE);
		label6.setBounds(150, 300, 250, 25);
		JLabel label7 = new JLabel("新しいパスワード(確認)");
		label7.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label7.setForeground(Color.WHITE);
		label7.setBounds(150, 340, 250, 25);

		ans.setBounds(415, 260, 150, 25);
		pw.setBounds(415, 300, 150, 25);
		re_pw.setBounds(415, 340, 150, 25);

		JButton completion = new JButton("完了");
		completion.setFont(new Font("MS ゴシック", Font.BOLD, 20));
		completion.setBounds(415, 450, 150, 50);
		completion.setForeground(Color.WHITE);
		completion.setBackground(new Color(51, 102, 255));
		completion.addActionListener(new toMainmenu());

		this.add(othello);
		this.add(name);
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(label5);
		this.add(ans);
		this.add(label6);
		this.add(pw);
		this.add(label7);
		this.add(re_pw);
		this.add(completion);

	}

	public class toMainmenu implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			//入力された情報の取得
			String a = ans.getText();
			String p = pw.getText();
			String rp = re_pw.getText();

			Disp.ChangeDisp(Disp.mainmenu);
		}
	}

}
