package szptclass4.studentmanage.visualclass;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class UserLogin {

	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="211,20"
	private Label labelLog = null;
	private Composite composite = null;
	private Label label1 = null;
	private Label labelType = null;
	private Label labelName = null;
	private Label labelPass = null;
	private Combo comboType = null;
	private Text textName = null;
	private Text textPass = null;
	private Button buttonLogin = null;
	private Button buttonRext = null;
	private Button buttonExit = null;
	private Label label2 = null;
	private Label label = null;

	/**
	 * This method initializes composite	
	 *
	 */
	private void createComposite() {
		GridData gridData12 = new GridData();
		gridData12.grabExcessHorizontalSpace = true;
		gridData12.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData12.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData12.grabExcessVerticalSpace = true;
		GridData gridData11 = new GridData();
		gridData11.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridData gridData10 = new GridData();
		gridData10.horizontalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		gridData10.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		GridData gridData9 = new GridData();
		gridData9.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridData gridData8 = new GridData();
		gridData8.horizontalSpan = 2;
		gridData8.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData7 = new GridData();
		gridData7.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		gridData7.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData7.horizontalSpan = 2;
		GridData gridData6 = new GridData();
		gridData6.horizontalSpan = 2;
		GridData gridData5 = new GridData();
		gridData5.grabExcessHorizontalSpace = true;
		gridData5.grabExcessVerticalSpace = false;
		GridData gridData4 = new GridData();
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData4.grabExcessVerticalSpace = true;
		gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData3.horizontalSpan = 2;
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.horizontalSpan = 2;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 6;
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		composite = new Composite(sShell, SWT.NONE);
		composite.setLayoutData(gridData1);
		composite.setLayout(gridLayout);
		label1 = new Label(composite, SWT.NONE);
		label1.setText("");
		label1.setLayoutData(gridData4);
		Label filler = new Label(composite, SWT.NONE);
		Label filler5 = new Label(composite, SWT.NONE);
		Label filler7 = new Label(composite, SWT.NONE);
		Label filler12 = new Label(composite, SWT.NONE);
		label = new Label(composite, SWT.NONE);
		label.setText(" ");
		label.setLayoutData(gridData12);
		Label filler1 = new Label(composite, SWT.NONE);
		labelType = new Label(composite, SWT.NONE);
		labelType.setText("用户类型：");
		labelType.setLayoutData(gridData6);
		createComboType();
		Label filler11 = new Label(composite, SWT.NONE);
		Label filler13 = new Label(composite, SWT.NONE);
		Label filler2 = new Label(composite, SWT.NONE);
		labelName = new Label(composite, SWT.CENTER);
		labelName.setText("用 户 名：");
		labelName.setLayoutData(gridData2);
		textName = new Text(composite, SWT.BORDER);
		textName.setLayoutData(gridData7);
		Label filler10 = new Label(composite, SWT.NONE);
		Label filler3 = new Label(composite, SWT.NONE);
		labelPass = new Label(composite, SWT.CENTER);
		labelPass.setText("密    码：");
		labelPass.setLayoutData(gridData3);
		textPass = new Text(composite, SWT.BORDER);
		textPass.setLayoutData(gridData8);
		Label filler9 = new Label(composite, SWT.NONE);
		Label filler6 = new Label(composite, SWT.NONE);
		buttonLogin = new Button(composite, SWT.NONE);
		buttonLogin.setText("登录");
		buttonLogin.setLayoutData(gridData9);
		buttonLogin.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				String userType=comboType.getText();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
			    if(userType.equals("管理员")){
			    	AdminMainShell adminmain=new AdminMainShell();
			    	adminmain.getsShell().open();		   
			    	}
			    else
			    	MessageDialog.openInformation(sShell, "信息提示", "系统1.0版本不含教师与学生子系统，请选择管理员");
			}
		});
		Label filler8 = new Label(composite, SWT.NONE);
		buttonRext = new Button(composite, SWT.CENTER);
		buttonRext.setText("重置");
		buttonRext.setLayoutData(gridData10);
		buttonExit = new Button(composite, SWT.NONE);
		buttonExit.setText("退出");
		buttonExit.setLayoutData(gridData11);
		Label filler4 = new Label(composite, SWT.NONE);
		label2 = new Label(composite, SWT.NONE);
		label2.setText("");
		label2.setLayoutData(gridData5);
	}

	/**
	 * This method initializes comboType	
	 *
	 */
	private void createComboType() {
		comboType  = new Combo(composite, SWT.NONE);
		comboType.setText("请选择");
		comboType.add("管理员");
		comboType.add("学生");
		comboType.add("教师");
		Combo co=new Combo(comboType, SWT.DROP_DOWN);
		
		
		String[] TEXT={"xueshen","jiaoshi"};
		co.setItems(TEXT);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Before this is run, be sure to set up the launch configuration (Arguments->VM Arguments)
		 * for the correct SWT library path in order to run with the SWT dlls. 
		 * The dlls are located in the SWT plugin jar.  
		 * For example, on Windows the Eclipse SWT 3.1 plugin jar is:
		 *       installation_directory\plugins\org.eclipse.swt.win32_3.1.0.jar
		 */
		Display display = Display.getDefault();
		UserLogin thisClass = new UserLogin();
		thisClass.createSShell();
		thisClass.sShell.open();

		while (!thisClass.sShell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.heightHint = 80;
		sShell = new Shell();
		sShell.setText("学生成绩管理系统");
		sShell.setToolTipText("");
		sShell.setSize(new Point(350, 270));
		sShell.setLayout(new GridLayout());
		labelLog = new Label(sShell, SWT.CENTER);
		labelLog.setText("");
		labelLog.setImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/images/login.png")));
		labelLog.setLayoutData(gridData);
		createComposite();
	}

}
