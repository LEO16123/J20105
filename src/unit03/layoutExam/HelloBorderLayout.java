package unit03.layoutExam;

import java.awt.*;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HelloBorderLayout extends JFrame{
	
	HelloBorderLayout(){
		JPanel p = new JPanel();
		add(p);
		
		JButton btn1 = new JButton("��ư 1");
		JButton btn2 = new JButton("��ư 2");
		JButton btn3 = new JButton("��ư 3");
		JButton btn4 = new JButton("��ư 4");
		JButton btn5 = new JButton("��ư 5");
		
		
		
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn1, BorderLayout.SOUTH);
		p.add(btn1, BorderLayout.EAST);
		p.add(btn1, BorderLayout.WEST);
		p.add(btn1, BorderLayout.CENTER);
		
		
		setTitle("���� ���̾ƿ�");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
