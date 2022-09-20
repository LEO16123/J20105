package unit03.layoutExam;


import java.awt.*;

import javax.swing.*;

public class HelloGridLayout extends JFrame{

	HelloGridLayout(){
		
		
		
		JPanel p = new JPanel();
		add(p);
		
		JButton btn1 = new JButton("��ư 1");
		JButton btn2 = new JButton("��ư 2");
		JButton btn3 = new JButton("��ư 3");
		JButton btn4 = new JButton("��ư 4");
		JButton btn5 = new JButton("��ư 5");
		JButton btn6 = new JButton("��ư 6");

		
		p.setLayout(new GridLayout(0, 2));
		
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		
		setTitle("�׸��� ���̾ƿ�");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new HelloGridLayout();

	}

}
