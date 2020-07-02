package Displays;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Systems.Client;

public class StartDisp extends JPanel{
	
	StartDisp(){
		 setSize(1000, 600);
	this.setLayout(null);
	
	Font a=new Font("MS ゴシック", Font.BOLD, 14);
	
	JButton toForget=new JButton("パスワードを忘れた方"); 
	JButton toMakeAccount=new JButton("アカウント作成"); 
	JLabel iDLabel=new JLabel("ID");
	JLabel pasLabel=new JLabel("パスワード");
	
	iDLabel.setBounds(380,280,100,10);
	JTextField IDin=new JTextField();	
	IDin.setBounds(400,270,200,30);
	
	pasLabel.setBounds(325,305,100,20);
	JTextField pasin=new JTextField();
	pasin.setBounds(400,300,200,30);
  
	toForget.setBounds(400, 450, 200, 40);
    toForget.addActionListener(new toForgetB());
    toForget.setBackground(new Color(51,102,255));
    toForget.setForeground(Color.white);
    toForget.setFont(a);
    
    toMakeAccount.setBounds(400, 400,200,40);
    toMakeAccount.addActionListener(new toMakeAccountB());
    toMakeAccount.setBackground(new Color(51,102,255));
    toMakeAccount.setForeground(Color.white);
    toMakeAccount.setFont(a);
    
    JButton login=new JButton("ログイン"); 
	login.setBounds(450, 335, 100, 50);
	 login.addActionListener(new Login());
	 login.setBackground(new Color(51,102,255));
	 login.setForeground(Color.white);
	 login.setFont(a);
	 this.add(toMakeAccount);
    this.add(pasin);
	 this.add(IDin);
	this.add(toForget);
	this.add(iDLabel);
	this.add(login);
	this.add(pasLabel);
	
	
	}
	
	 public class toForgetB implements ActionListener{
	     	public void actionPerformed(ActionEvent e) {
	     		Disp.ChangeDisp(Disp.forget);
	     	}
	     }
	 
	 
	 public class Login implements ActionListener{
	     	public void actionPerformed(ActionEvent e) {

	     		//if(失敗){サブモーダルで失敗表示}
	     		
	     		//else
	     		Disp.mainmenu.reloadMainmenu();
	     		Disp.ChangeDisp(Disp.mainmenu);
	     		
	     		//Disp.myPlayer=サーバから来たオブジェクト
	     	
	     		
	     	}}
	     	 public class toMakeAccountB implements ActionListener{
	 	     	public void actionPerformed(ActionEvent e) {
	 	    Disp.ChangeDisp(Disp.makeaccount);
	 	     	}
	     }

	 }