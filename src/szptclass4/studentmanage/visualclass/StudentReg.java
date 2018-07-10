package szptclass4.studentmanage.visualclass;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Color;

public class StudentReg {

	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="10,10"
	private Label label1 = null;
	private Composite composite = null;
	private Label label2 = null;
	private Label label3 = null;
	private Label label4 = null;
	private Label labelNumber = null;
	private Label labelName = null;
	private Label labelSex = null;
	private Label label7 = null;
	private Label label8 = null;
	private Text textNum = null;
	private Text textName = null;
	private Button radioButtonMale = null;
	private Button radioButtonFemale = null;
	private Combo comboGrade = null;
	private Combo comboClass = null;
	private Button buttonUP = null;
	private Label labelPhoto = null;
	private Button buttonStuReg = null;
	private Button buttonNext = null;
	private Label label = null;
	private Label label5 = null;
	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		GridData gridData6 = new GridData();
		gridData6.grabExcessHorizontalSpace = true;
		gridData6.grabExcessVerticalSpace = true;
		GridData gridData5 = new GridData();
		gridData5.grabExcessVerticalSpace = true;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		sShell = new Shell();
		sShell.setText("学生注册");
		sShell.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		sShell.setLayout(gridLayout);
		sShell.setSize(new Point(423, 366));
		label1 = new Label(sShell, SWT.NONE);
		label1.setText("");
		label1.setLayoutData(gridData4);
		Label filler2 = new Label(sShell, SWT.NONE);
		label2 = new Label(sShell, SWT.NONE);
		label2.setText("");
		label2.setLayoutData(gridData6);
		Label filler3 = new Label(sShell, SWT.NONE);
		createComposite2();
		Label filler4 = new Label(sShell, SWT.NONE);
		label3 = new Label(sShell, SWT.NONE);
		label3.setText("");
		label3.setLayoutData(gridData5);
	}

	/**
	 * This method initializes composite	
	 *
	 */
	private void createComposite() {
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		
	}

	/**
	 * This method initializes composite	
	 *
	 */
	private void createComposite2() {
		GridData gridData12 = new GridData();
		gridData12.heightHint = 2;
		gridData12.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData12.horizontalSpan = 4;
		GridData gridData11 = new GridData();
		gridData11.horizontalSpan = 4;
		gridData11.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData8 = new GridData();
		gridData8.horizontalSpan = 2;
		gridData8.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData7 = new GridData();
		gridData7.horizontalSpan = 2;
		gridData7.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData3 = new GridData();
		gridData3.heightHint = 50;
		gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData3.horizontalSpan = 2;
		GridData gridData2 = new GridData();
		gridData2.heightHint = -1;
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 5;
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		composite = new Composite(sShell, SWT.NONE);
		composite.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		composite.setLayoutData(gridData1);
		composite.setLayout(gridLayout1);
		label4 = new Label(composite, SWT.CENTER);
		label4.setText("学生注册");
		label4.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		label4.setLayoutData(gridData11);
		label4.setFont(new Font(Display.getDefault(), "楷体", 18, SWT.NORMAL));
		Label filler17 = new Label(composite, SWT.NONE);
		label = new Label(composite, SWT.NONE);
		label.setText("Label");
		label.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
		label.setLayoutData(gridData12);
		Label filler16 = new Label(composite, SWT.NONE);
		labelNumber = new Label(composite, SWT.NONE);
		labelNumber.setText("学号：");
		label5 = new Label(composite, SWT.NONE);
		label5.setText("");
		textNum = new Text(composite, SWT.BORDER);
		textNum.setLayoutData(gridData7);
		Label filler8 = new Label(composite, SWT.NONE);
		labelName = new Label(composite, SWT.NONE);
		labelName.setText("姓名：");
		Label filler23 = new Label(composite, SWT.NONE);
		textName = new Text(composite, SWT.BORDER);
		textName.setLayoutData(gridData8);
		Label filler7 = new Label(composite, SWT.NONE);
		labelSex = new Label(composite, SWT.NONE);
		labelSex.setText("性别：");
		Label filler22 = new Label(composite, SWT.NONE);
		radioButtonMale = new Button(composite, SWT.RADIO);
		radioButtonMale.setText("男");
		radioButtonFemale = new Button(composite, SWT.RADIO);
		radioButtonFemale.setText("女");
		Label filler6 = new Label(composite, SWT.NONE);
		label7 = new Label(composite, SWT.NONE);
		label7.setText("年级：");
		Label filler21 = new Label(composite, SWT.NONE);
		createComboGrade();
		Label filler5 = new Label(composite, SWT.NONE);
		filler5.setBackground(new Color(Display.getCurrent(), 192, 192, 192));
		label8 = new Label(composite, SWT.NONE);
		label8.setText("班级：");
		Label filler20 = new Label(composite, SWT.NONE);
		createComboClass();
		Label filler1 = new Label(composite, SWT.NONE);
		buttonUP = new Button(composite, SWT.NONE);
		buttonUP.setText("照片上传");
		buttonUP.setLayoutData(gridData2);
		Label filler19 = new Label(composite, SWT.NONE);
		labelPhoto = new Label(composite, SWT.NONE);
		labelPhoto.setText("照片预览");
		labelPhoto.setLayoutData(gridData3);
		Label filler = new Label(composite, SWT.NONE);
		buttonStuReg = new Button(composite, SWT.NONE);
		buttonStuReg.setText("注    册");
		Label filler18 = new Label(composite, SWT.NONE);
		Label filler10 = new Label(composite, SWT.NONE);
		buttonNext = new Button(composite, SWT.NONE);
		buttonNext.setText("下一个");
	}

	/**
	 * This method initializes comboGrade	
	 *
	 */
	private void createComboGrade() {
		GridData gridData9 = new GridData();
		gridData9.horizontalSpan = 2;
		gridData9.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		comboGrade = new Combo(composite, SWT.NONE);
		comboGrade.setLayoutData(gridData9);
	}

	/**
	 * This method initializes comboClass	
	 *
	 */
	private void createComboClass() {
		GridData gridData10 = new GridData();
		gridData10.horizontalSpan = 2;
		gridData10.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		comboClass = new Combo(composite, SWT.NONE);
		comboClass.setLayoutData(gridData10);
	}
	public StudentReg(){
		createSShell();
	}
	public Shell getsShell(){
		return sShell;
	}

}
