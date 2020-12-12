package nvdai.excercise.ecobike.gui;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import nvdai.excercise.ecobike.controller.ABikeController;

@SuppressWarnings("serial")
public abstract class ABikeForm<T> extends JDialog {

	protected T t;
	protected GridBagLayout layout;
	protected GridBagConstraints c = new GridBagConstraints();

	public ABikeForm(T t, ABikeController<T> controller) {
		super((Frame) null, "Create bike", true);
		this.t = t;

		setContentPane(new JPanel());
		layout = new GridBagLayout();
		getContentPane().setLayout(layout);

		this.buildControls();

		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				T newT = getInputs();
				controller.create(newT);
				ABikeForm.this.dispose();
			}
		});

		getContentPane().add(saveButton, c);

		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}

	public void buildControls() {
		System.out.println("ABikeForm buildControls");
	}

	public abstract T getInputs();
}
