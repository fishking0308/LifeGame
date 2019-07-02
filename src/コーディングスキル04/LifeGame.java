package コーディングスキル04;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class LifeGame {
	public static void main(String[] args){
		GameFrame frame = new GameFrame(Const.FRAME_SIZE.width,Const.FRAME_SIZE.height);
		frame.setTitle("LifeGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			frame.setCells(Const.CELL_SIZE);
		} catch (Exception e) {	e.printStackTrace(); }

		frame.setVisible(true);

	     Thread t = new Thread(frame);
	     t.start();
	}
}