package szptclass4.studentmanage.visualclass;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.graphics.Color;

public class GradeMange {

	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="163,11"
	private Label label1 = null;
	private Label label2 = null;
	private Composite composite = null;
	private Label label3 = null;
	private Label label4 = null;
	private Label label5 = null;
	private List listGrade = null;
	private Composite compositeOperate = null;
	private Button buttonAdd = null;
	private Button buttonDele = null;
	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		GridData gridData2 = new GridData();
		gridData2.grabExcessHorizontalSpace = false;
		gridData2.grabExcessVerticalSpace = false;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		sShell = new Shell();
		sShell.setText("年级管理");
		sShell.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));
		sShell.setLayout(gridLayout);
		sShell.setSize(new Point(371, 250));
		label1 = new Label(sShell, SWT.NONE);
		label1.setText("");
		label1.setLayoutData(gridData2);
		Label filler = new Label(sShell, SWT.NONE);
		label3 = new Label(sShell, SWT.NONE);
		label3.setText("");
		Label filler1 = new Label(sShell, SWT.NONE);
		label2 = new Label(sShell, SWT.NONE);
		label2.setText("年级信息管理");
		label2.setLayoutData(gridData);
		label2.setFont(new Font(Display.getDefault(), "黑体", 12, SWT.NORMAL));
		Label filler3 = new Label(sShell, SWT.NONE);
		Label filler2 = new Label(sShell, SWT.NONE);
		createComposite();
		Label filler4 = new Label(sShell, SWT.NONE);
		label4 = new Label(sShell, SWT.NONE);
		label4.setText("");
	}
	/**
	 * This method initializes composite	
	 *
	 */
	private void createComposite() {
		GridData gridData4 = new GridData();
		gridData4.grabExcessVerticalSpace = true;
		gridData4.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData4.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData4.grabExcessHorizontalSpace = true;
		GridData gridData3 = new GridData();
		gridData3.horizontalSpan = 3;
		GridLayout gridLayout1 = new GridLayout();
		gridLayout1.numColumns = 4;
		GridData gridData1 = new GridData();
		gridData1.grabExcessHorizontalSpace = true;
		gridData1.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData1.grabExcessVerticalSpace = true;
		composite = new Composite(sShell, SWT.NONE);
		composite.setLayoutData(gridData1);
		composite.setLayout(gridLayout1);
		label5 = new Label(composite, SWT.NONE);
		label5.setText("全部年级");
		label5.setLayoutData(gridData3);
		Label filler7 = new Label(composite, SWT.NONE);
		Label filler5 = new Label(composite, SWT.NONE);
		Label filler6 = new Label(composite, SWT.NONE);
		listGrade = new List(composite, SWT.NONE);
		listGrade.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		listGrade.setForeground(new Color(Display.getCurrent(), 255, 255, 255));
		listGrade.setLayoutData(gridData4);
		createCompositeOperate();
	}
	/**
	 * This method initializes compositeOperate	
	 *
	 */
	private void createCompositeOperate() {
		GridData gridData5 = new GridData();
		gridData5.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData5.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		compositeOperate = new Composite(composite, SWT.NONE);
		compositeOperate.setLayout(new GridLayout());
		compositeOperate.setLayoutData(gridData5);
		buttonAdd = new Button(compositeOperate, SWT.NONE);
		buttonAdd.setText("添加");
		buttonDele = new Button(compositeOperate, SWT.NONE);
		buttonDele.setText("删除");
	}
	public GradeMange(){
		createSShell();
	}
	public  Shell getsShell(){
		return sShell;
	}

}
