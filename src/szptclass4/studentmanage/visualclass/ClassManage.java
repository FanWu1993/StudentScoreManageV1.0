package szptclass4.studentmanage.visualclass;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.jface.viewers.ComboViewer;

public class ClassManage {

	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="142,18"
	private Label label1 = null;
	private Composite composite = null;
	private Label label3 = null;
	private Label label4 = null;
	private Composite compositeOperate = null;
	private Combo comboGradeSele = null;
	private List listClass = null;
	private Button buttonAdd = null;
	private Button buttonDele = null;
	private Label label5 = null;
	private Label label6 = null;
	private ComboViewer comboViewer = null;

	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		gridData3.horizontalSpan = 2;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 7;
		sShell = new Shell();
		sShell.setText("班级管理");
		sShell.setLayout(gridLayout);
		sShell.setSize(new Point(300, 298));
		Label filler20 = new Label(sShell, SWT.NONE);
		Label filler5 = new Label(sShell, SWT.NONE);
		label1 = new Label(sShell, SWT.NONE);
		label1.setText("");
		label4 = new Label(sShell, SWT.NONE);
		label4.setText("");
		Label filler10 = new Label(sShell, SWT.NONE);
		Label filler13 = new Label(sShell, SWT.NONE);
		Label filler14 = new Label(sShell, SWT.NONE);
		Label filler19 = new Label(sShell, SWT.NONE);
		label5 = new Label(sShell, SWT.NONE);
		label5.setText("班级管理");
		label5.setLayoutData(gridData3);
		label5.setFont(new Font(Display.getDefault(), "黑体", 12, SWT.NORMAL));
		Label filler12 = new Label(sShell, SWT.NONE);
		Label filler7 = new Label(sShell, SWT.NONE);
		Label filler11 = new Label(sShell, SWT.NONE);
		Label filler9 = new Label(sShell, SWT.NONE);
		label6 = new Label(sShell, SWT.NONE);
		label6.setText("选择班级");
		createComboGradeSele();
		Label filler21 = new Label(sShell, SWT.NONE);
		Label filler1 = new Label(sShell, SWT.NONE);
		Label filler4 = new Label(sShell, SWT.NONE);
		Label filler2 = new Label(sShell, SWT.NONE);
		Label filler = new Label(sShell, SWT.NONE);
		Label filler3 = new Label(sShell, SWT.NONE);
		createComposite();
		Label filler6 = new Label(sShell, SWT.NONE);
		Label filler8 = new Label(sShell, SWT.NONE);
		label3 = new Label(sShell, SWT.NONE);
		label3.setText("");
	}

	/**
	 * This method initializes composite	
	 *
	 */
	private void createComposite() {
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData2.grabExcessVerticalSpace = true;
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 2;
		GridData gridData = new GridData();
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		composite = new Composite(sShell, SWT.NONE);
		composite.setLayoutData(gridData);
		composite.setLayout(gridLayout1);
		listClass = new List(composite, SWT.NONE);
		listClass.setLayoutData(gridData2);
		createCompositeOperate();
	}

	/**
	 * This method initializes compositeOperate	
	 *
	 */
	private void createCompositeOperate() {
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		gridData1.grabExcessHorizontalSpace = false;
		gridData1.grabExcessVerticalSpace = false;
		gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		compositeOperate = new Composite(composite, SWT.NONE);
		compositeOperate.setLayout(new GridLayout());
		compositeOperate.setLayoutData(gridData1);
		buttonAdd = new Button(compositeOperate, SWT.NONE);
		buttonAdd.setText("添加");
		buttonDele = new Button(compositeOperate, SWT.NONE);
		buttonDele.setText("删除");
	}

	/**
	 * This method initializes comboGradeSele	
	 *
	 */
	private void createComboGradeSele() {
		comboGradeSele = new Combo(sShell, SWT.NONE);
		comboGradeSele.setText("dfadfc"); 
	}
	public ClassManage(){
		createSShell();
	}
	public Shell getsShell(){
		return sShell;
	}

}
