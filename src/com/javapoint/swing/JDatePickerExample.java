package com.javapoint.swing;

import java.awt.Frame;
import java.awt.GridBagLayout;
import java.util.Properties;

import javax.swing.JFrame;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class JDatePickerExample {

	public static void main(String[] args) {
		Frame frame = new JFrame("JDatePickerExample");
		
		UtilDateModel model = new UtilDateModel();
		//model.setDate(20,04,2014);
		// Need this...
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		// Don't know about the formatter, but there it is...
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
		 
		frame.setLayout(new GridBagLayout());
		frame.add(datePicker);
		frame.setVisible(true);
//		frame.setExtendedState(JFrame.MAXIMIZED	_BOTH);
		frame.setSize(300, 300);
	}

}
