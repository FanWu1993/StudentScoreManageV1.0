package szptclass4.studentmanage.visualclass;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

public class TeacherReg {

	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="10,10"
	private Label label1 = null;
	private Label labelNumber = null;
	private Label labelNumber1 = null;
	private Label labelName = null;
	private Label labelSex = null;
	private Button buttonUP = null;
	private Text textNum = null;
	private Text textName = null;
	private Button radioButtonMale = null;
	private Button radioButtonFemale = null;
	private Label labelPhoto = null;
	private Button buttonTchReg = null;
	private Button buttonNext = null;
	private Label label3 = null;
	private Label label2 = null;
	private Label label5 = null;

	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		GridData gridData81 = new GridData();
		gridData81.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData81.verticalSpan = 2;
		GridData gridData71 = new GridData();
		gridData71.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData71.verticalSpan = 2;
		GridData gridData61 = new GridData();
		gridData61.verticalSpan = 2;
		gridData61.horizontalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		gridData61.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridData gridData9 = new GridData();
		gridData9.heightHint = 50;
		gridData9.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData9.horizontalSpan = 2;
		GridData gridData8 = new GridData();
		gridData8.grabExcessVerticalSpace = true;
		gridData8.grabExcessHorizontalSpace = true;
		GridData gridData7 = new GridData();
		gridData7.grabExcessHorizontalSpace = false;
		gridData7.grabExcessVerticalSpace = false;
		GridData gridData6 = new GridData();
		gridData6.grabExcessHorizontalSpace = false;
		gridData6.horizontalSpan = 2;
		gridData6.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData6.grabExcessVerticalSpace = false;
		GridData gridData5 = new GridData();
		gridData5.grabExcessHorizontalSpace = false;
		gridData5.horizontalSpan = 2;
		gridData5.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData5.grabExcessVerticalSpace = false;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = false;
		gridData4.horizontalSpan = 4;
		gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData4.grabExcessVerticalSpace = false;
		GridData gridData3 = new GridData();
		gridData3.grabExcessHorizontalSpace = false;
		gridData3.horizontalSpan = 2;
		gridData3.grabExcessVerticalSpace = false;
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = false;
		gridData2.horizontalSpan = 4;
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.heightHint = 2;
		gridData2.grabExcessVerticalSpace = false;
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.grabExcessVerticalSpace = true;
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 6;
		sShell = new Shell();
		sShell.setText("教师注册");
		sShell.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		sShell.setLayout(gridLayout);
		sShell.setSize(new Point(399, 317));
		label1 = new Label(sShell, SWT.NONE);
		label1.setText("");
		label1.setLayoutData(gridData);
		Label filler = new Label(sShell, SWT.NONE);
		Label filler23 = new Label(sShell, SWT.NONE);
		Label filler9 = new Label(sShell, SWT.NONE);
		Label filler11 = new Label(sShell, SWT.NONE);
		label2 = new Label(sShell, SWT.NONE);
		label2.setText("");
		label2.setLayoutData(gridData1);
		Label filler21 = new Label(sShell, SWT.NONE);
		label5 = new Label(sShell, SWT.CENTER);
		label5.setText("教师注册");
		label5.setFont(new Font(Display.getDefault(), "楷体", 18, SWT.NORMAL));
		label5.setLayoutData(gridData4);
		Label filler24 = new Label(sShell, SWT.NONE);
		Label filler1 = new Label(sShell, SWT.NONE);
		labelNumber = new Label(sShell, SWT.NONE);
		labelNumber.setText("");
		labelNumber.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
		labelNumber.setLayoutData(gridData2);
		Label filler20 = new Label(sShell, SWT.NONE);
		Label filler2 = new Label(sShell, SWT.NONE);
		labelNumber1 = new Label(sShell, SWT.NONE);
		labelNumber1.setText("编号：");
		labelNumber1.setLayoutData(gridData3);
		textNum = new Text(sShell, SWT.BORDER);
		textNum.setLayoutData(gridData5);
		Label filler19 = new Label(sShell, SWT.NONE);
		Label filler3 = new Label(sShell, SWT.NONE);
		labelName = new Label(sShell, SWT.NONE);
		labelName.setText("姓名：");
		labelName.setLayoutData(gridData7);
		Label filler22 = new Label(sShell, SWT.NONE);
		textName = new Text(sShell, SWT.BORDER);
		textName.setLayoutData(gridData6);
		Label filler18 = new Label(sShell, SWT.NONE);
		Label filler4 = new Label(sShell, SWT.NONE);
		labelSex = new Label(sShell, SWT.CENTER);
		labelSex.setText("性别：");
		labelSex.setLayoutData(gridData61);
		Label filler14 = new Label(sShell, SWT.NONE);
		radioButtonMale = new Button(sShell, SWT.RADIO);
		radioButtonMale.setText("男");
		radioButtonMale.setLayoutData(gridData71);
		radioButtonFemale = new Button(sShell, SWT.RADIO);
		radioButtonFemale.setText("女");
		radioButtonFemale.setLayoutData(gridData81);
		Label filler17 = new Label(sShell, SWT.NONE);
		Label filler6 = new Label(sShell, SWT.NONE);
		Label filler12 = new Label(sShell, SWT.NONE);
		Label filler10 = new Label(sShell, SWT.NONE);
		Label filler5 = new Label(sShell, SWT.NONE);
		buttonUP = new Button(sShell, SWT.NONE);
		buttonUP.setText("照片上传");
		Label filler8 = new Label(sShell, SWT.NONE);
		labelPhoto = new Label(sShell, SWT.NONE);
		labelPhoto.setText("照片预览");
		labelPhoto.setLayoutData(gridData9);
		Label filler16 = new Label(sShell, SWT.NONE);
		Label filler13 = new Label(sShell, SWT.NONE);
		buttonTchReg = new Button(sShell, SWT.NONE);
		buttonTchReg.setText("注    册");
		Label filler7 = new Label(sShell, SWT.NONE);
		Label filler65 = new Label(sShell, SWT.NONE);
		buttonNext = new Button(sShell, SWT.NONE);
		buttonNext.setText("下一个");
		Label filler15 = new Label(sShell, SWT.NONE);
		label3 = new Label(sShell, SWT.NONE);
		label3.setText("");
		label3.setLayoutData(gridData8);
	}
	public TeacherReg(){
		createSShell();
	}
	public Shell getsShell(){
		return sShell;
	}

}
