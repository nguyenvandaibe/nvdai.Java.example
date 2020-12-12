package nvdai.excercise.ecobike.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AdminGUI {

	public AdminGUI(AdminController controller) {

		JFrame rootFrame = new JFrame("Example application");
		rootFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		rootFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rootFrame.setVisible(true);

		JButton addBikeButton = new JButton("Add a bike");
		addBikeButton.setSize(100, 40);
		addBikeButton.setVisible(true);
		addBikeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controller.getTypeSelector();
			}
		});

		rootFrame.add(addBikeButton);
	}

	public static void main(String[] args) {
		new AdminGUI(new AdminController());
	}

}
