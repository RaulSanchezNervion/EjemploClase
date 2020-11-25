package asdasd;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

public class asdasd extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public asdasd(Composite parent, int style) {
		super(parent, style);
		
		Button btnCheckButton = new Button(this, SWT.CHECK);
		btnCheckButton.setBounds(59, 65, 111, 20);
		btnCheckButton.setText("Check Button");
		
		Button btnCheckButton_1 = new Button(this, SWT.CHECK);
		btnCheckButton_1.setBounds(59, 111, 111, 20);
		btnCheckButton_1.setText("Check Button d d");
		
		Button btnCheckButton_2 = new Button(this, SWT.CHECK);
		btnCheckButton_2.setBounds(59, 165, 111, 20);
		btnCheckButton_2.setText("Check Button hh 99");
		
		Label lblPreguntaTipoTest = new Label(this, SWT.NONE);
		lblPreguntaTipoTest.setBounds(37, 22, 182, 20);
		lblPreguntaTipoTest.setText("Question 2 ");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
