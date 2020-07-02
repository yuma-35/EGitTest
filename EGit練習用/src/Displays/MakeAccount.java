//4:アカウント作成

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

public class MakeAccount extends JPanel{

	JTextField id = new JTextField(32);	//id
	JTextField question = new JTextField(32);	//秘密の質問
	JTextField ans = new JTextField(32);	//秘密の質問の答え
	JTextField pw = new JTextField(32);	//パスワード
	JTextField re_pw = new JTextField(32);	//パスワードの確認

	MakeAccount() {
		this.setLayout(null);	//レイアウトマネージャーを無効
		setSize(1000,600);

		ImageIcon icon = new ImageIcon("logo.png");
		JLabel othello = new JLabel(icon);
		othello.setBounds(405, 25, 170, 80);
		JLabel name = new JLabel("アカウント作成");
		name.setFont(new Font("MS ゴシック", Font.BOLD, 20));
		name.setForeground(Color.WHITE);
		name.setBounds(415, 100, 250, 50);

		JLabel label1 = new JLabel("ID(プレイヤ名)");
		label1.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label1.setForeground(Color.WHITE);
		label1.setBounds(150, 190, 250, 25);
		JLabel label2 = new JLabel("秘密の質問");
		label2.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label2.setForeground(Color.WHITE);
		label2.setBounds(150, 230, 250, 25);
		JLabel label3 = new JLabel("答え");
		label3.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label3.setForeground(Color.WHITE);
		label3.setBounds(150, 270, 250, 25);
		JLabel label4 = new JLabel("新しいパスワード");
		label4.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label4.setForeground(Color.WHITE);
		label4.setBounds(150, 310, 250, 25);
		JLabel label5 = new JLabel("新しいパスワード(確認)");
		label5.setFont(new Font("MS ゴシック", Font.BOLD, 22));
		label5.setForeground(Color.WHITE);
		label5.setBounds(150, 350, 250, 25);

		id.setBounds(415, 190, 150, 25);
		question.setBounds(415, 230, 150, 25);
		ans.setBounds(415, 270, 150, 25);
		pw.setBounds(415, 310, 150, 25);
		re_pw.setBounds(415, 350, 150, 25);

		JButton completion = new JButton("完了");
		completion.setFont(new Font("MS ゴシック", Font.BOLD, 20));
		completion.setBounds(415, 450, 150, 50);
		completion.setForeground(Color.WHITE);
		completion.setBackground(new Color(51, 102, 255));
		completion.addActionListener(new toMainmenu());

		this.add(othello);
		this.add(name);
		this.add(label1);
		this.add(id);
		this.add(label2);
		this.add(question);
		this.add(label3);
		this.add(ans);
		this.add(label4);
		this.add(pw);
		this.add(label5);
		this.add(re_pw);
		this.add(completion);
	}

	//"完了"が押されたとき
	public class toMainmenu implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			//入力情報を取得
			String i = id.getText();
			String q = question.getText();
			String a = ans.getText();
			String p = pw.getText();
			String rp = re_pw.getText();

			Disp.ChangeDisp(Disp.mainmenu);
		}
	}

}
