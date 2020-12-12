package nvdai.excercise.ecobike.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import nvdai.excercise.ecobike.bean.ElectrictBike;
import nvdai.excercise.ecobike.bean.SingleBike;
import nvdai.excercise.ecobike.controller.ElectricBikeController;
import nvdai.excercise.ecobike.controller.SingleBikeController;
import nvdai.excercise.ecobike.enums.TypeEnum;

@SuppressWarnings("serial")
public class TypeSelectorDialog extends JDialog {

	protected String types[] = { TypeEnum.SINGLE_BIKE, TypeEnum.ELECTRIC_BIKE };
	protected int DIALOG_WIDTH = 300;
	protected int DIALOG_HEIGHT = 300;

	public TypeSelectorDialog() {

		JLabel typeLabel = new JLabel("Select a type of bikes");
		JComboBox<String> typeComboBox = new JComboBox<String>(types);

		JButton submitTypeButton = new JButton("Continue");
		submitTypeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String type = (String) typeComboBox.getItemAt(typeComboBox.getSelectedIndex());
				System.out.println(type);
				if (type.equalsIgnoreCase(TypeEnum.SINGLE_BIKE)) {
					new SingleBikeFormDialog(new SingleBike(), new SingleBikeController());
				} else if (type.equalsIgnoreCase(TypeEnum.SINGLE_BIKE)) {
					new ElectrictBikeFormDialog(new ElectrictBike(), new ElectricBikeController());
				}
			}
		});

		JPanel typePanel = new JPanel();
		typePanel.setSize(200, 200);
		typePanel.add(typeLabel);
		typePanel.add(typeComboBox);
		typePanel.add(submitTypeButton);

		this.add(typePanel);
		this.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		this.setModal(true);
		this.setVisible(true);
	}
}
