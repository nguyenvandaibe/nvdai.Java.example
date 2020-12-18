package com.javapoint.swing;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello world");
		
		JButton greetingButton = new JButton("Click me");
		greetingButton.setBounds(100, 100, 100, 30);
		
		List<User> users = new ArrayList<User>();
		User user1 = new User(1, "User 1");
		User user2 = new User(2, "User 2");
		
		System.out.println(user1.getId());
		
		
		frame.add(greetingButton);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
