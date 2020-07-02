package Systems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Displays.Disp;
import Displays.StartDisp;

public class Client {
	public static Player myPlayer=new Player();	
	
	
			static public class toSoundB implements ActionListener{
	 	public  void actionPerformed(ActionEvent e) {

	 	
	 	}
	 }
			public void logout(int situation) {//situationに応じたメッセージ
			myPlayer=null;
			Disp.ChangeDisp(Disp.start);
			//if(situation==){
			//ex 通信がきれました
			//}
			}
}

