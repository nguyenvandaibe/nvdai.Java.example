package com.javapoint.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello world");
		
		JButton greetingButton = new JButton("Click me");
		greetingButton.setBounds(100, 100, 100, 30);
		
		frame.add(greetingButton);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
