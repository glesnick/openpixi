package org.openpixi.pixi.ui.panel.properties;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * A generic checkbox for setting boolean values.
 */
public class BooleanProperties {

	private boolean value;
	private String name;
	private JCheckBox boolCheck;

	public BooleanProperties(String name, boolean initialValue)
	{
		this.name = name;
		boolCheck = new JCheckBox(name);
		this.setValue(initialValue);
	}

	public void addComponents(Box box)
	{
		Box settingControls = Box.createVerticalBox();

		boolCheck.addItemListener(new CheckListener());
		boolCheck.setSelected(value);

		settingControls.add(boolCheck);
		settingControls.add(Box.createVerticalGlue());

		box.add(settingControls);
	}

	public boolean getValue()
	{
		return  value;
	}

	public void setValue(boolean value)
	{
		this.value = value;
		boolCheck.setSelected(value);
	}

	class CheckListener implements ItemListener {
		public void itemStateChanged(ItemEvent event){
			BooleanProperties.this.value =
					(event.getStateChange() == ItemEvent.SELECTED);
		}
	}
}