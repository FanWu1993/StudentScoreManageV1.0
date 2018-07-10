package szptclass4.studentmanage.visualclass;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class AdminMainShell {

	private Shell sShell = null;  //  @jve:decl-index=0:visual-constraint="133,87"
	private Menu menuBar = null;
	private Menu submenuBaseInfo = null;
	private Menu submenuStuAndTch = null;
	private Menu submenuCourse = null;
	private Menu submenuSys = null;
	private Label label1 = null;
	private ToolBar toolBar = null;
	private Label label2 = null;
	private Label label3 = null;

	/**
	 * This method initializes sShell
	 */
	private void createSShell() {
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		sShell = new Shell();
		sShell.setText("����Ա�Ӳ˵�");
		sShell.setLayout(gridLayout);
		sShell.setSize(new Point(500, 300));
		label1 = new Label(sShell, SWT.NONE);
		label1.setText("");
		Label filler3 = new Label(sShell, SWT.NONE);
		label2 = new Label(sShell, SWT.NONE);
		label2.setText("");
		Label filler1 = new Label(sShell, SWT.NONE);
		menuBar = new Menu(sShell, SWT.BAR);
		MenuItem submenuItemBaseInfo = new MenuItem(menuBar, SWT.CASCADE);
		submenuItemBaseInfo.setText("������Ϣ����");
		MenuItem submenuItemStuAndTch = new MenuItem(menuBar, SWT.CASCADE);
		submenuItemStuAndTch.setText("ѧ�����ʦ����");
		MenuItem submenuItemCourse = new MenuItem(menuBar, SWT.CASCADE);
		submenuItemCourse.setText("�γ����ſι���");
		MenuItem submenuItemSys = new MenuItem(menuBar, SWT.CASCADE);
		submenuItemSys.setText("ϵͳ");
		submenuSys = new Menu(submenuItemSys);
		MenuItem pushAbout = new MenuItem(submenuSys, SWT.PUSH);
		pushAbout.setText("����");
		pushAbout.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				MessageDialog.openInformation(sShell, "ϵͳ��Ϣ", "ѧ���ɼ�����ϵͳV1.0�汾");//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
			}
			public void widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent e) {
			}
		});
		MenuItem pushExit = new MenuItem(submenuSys, SWT.PUSH);
		pushExit.setText("�˳�");
		pushExit.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
			//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
			}
			public void widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent e) {
			}
		});
		submenuItemSys.setMenu(submenuSys);
		submenuCourse = new Menu(submenuItemCourse);
		MenuItem pushCourseManage = new MenuItem(submenuCourse, SWT.PUSH);
		pushCourseManage.setText("�γ̹���");
		MenuItem pushCourseArrange = new MenuItem(submenuCourse, SWT.PUSH);
		pushCourseArrange.setText("�༶�ſ�");
		submenuItemCourse.setMenu(submenuCourse);
		submenuStuAndTch = new Menu(submenuItemStuAndTch);
		MenuItem pushStudentReg = new MenuItem(submenuStuAndTch, SWT.PUSH);
		pushStudentReg.setText("ѧ��ע��");
		pushStudentReg
				.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						StudentReg studentreg=new StudentReg();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
					    studentreg.getsShell().open();
					}
					public void widgetDefaultSelected(
							org.eclipse.swt.events.SelectionEvent e) {
					}
				});
		MenuItem pushStudentQuary = new MenuItem(submenuStuAndTch, SWT.PUSH);
		pushStudentQuary.setText("ѧ����Ϣ��ѯ");
		MenuItem separator = new MenuItem(submenuStuAndTch, SWT.SEPARATOR);
		MenuItem pushTeacherReg = new MenuItem(submenuStuAndTch, SWT.PUSH);
		pushTeacherReg.setText("��ʦע��");
		pushTeacherReg
				.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						TeacherReg teacher=new TeacherReg();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
					    teacher.getsShell().open();
					}
					public void widgetDefaultSelected(
							org.eclipse.swt.events.SelectionEvent e) {
					}
				});
		MenuItem pushTeacherQuery = new MenuItem(submenuStuAndTch, SWT.PUSH);
		pushTeacherQuery.setText("��ʦ��Ϣ��ѯ");
		submenuItemStuAndTch.setMenu(submenuStuAndTch);
		submenuBaseInfo = new Menu(submenuItemBaseInfo);
		MenuItem pushGradeSet = new MenuItem(submenuBaseInfo, SWT.PUSH);
		pushGradeSet.setText("�꼶����");
		pushGradeSet
				.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						GradeMange grademange=new GradeMange();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
					   grademange.getsShell().open();
					}
					public void widgetDefaultSelected(
							org.eclipse.swt.events.SelectionEvent e) {
					}
				});
		
		MenuItem pushClassSet = new MenuItem(submenuBaseInfo, SWT.PUSH);
		pushClassSet.setText("�༶����");
		pushClassSet
				.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						ClassManage classmanage=new ClassManage();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
					    classmanage.getsShell().open();
					}
					public void widgetDefaultSelected(
							org.eclipse.swt.events.SelectionEvent e) {
					}
				});
		submenuItemBaseInfo.setMenu(submenuBaseInfo);
		sShell.setMenuBar(menuBar);
		createToolBar();
		Label filler2 = new Label(sShell, SWT.NONE);
		label3 = new Label(sShell, SWT.NONE);
		label3.setText("");
	}

	/**
	 * This method initializes toolBar	
	 *
	 */
	private void createToolBar() {
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.CENTER;
		gridData.grabExcessVerticalSpace = true;
		toolBar = new ToolBar(sShell, SWT.NONE);
		toolBar.setLayoutData(gridData);
		ToolItem toolItemStudentReg = new ToolItem(toolBar, SWT.PUSH);
		toolItemStudentReg.setImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/images/student.png")));
		toolItemStudentReg.setText("ѧ��ע��");
		toolItemStudentReg
				.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						StudentReg studentreg=new StudentReg();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
					    studentreg.getsShell().open();
					}
					public void widgetDefaultSelected(
							org.eclipse.swt.events.SelectionEvent e) {
					}
				});
		ToolItem toolItemSeparator1 = new ToolItem(toolBar, SWT.SEPARATOR);
		ToolItem toolItemTeacherReg = new ToolItem(toolBar, SWT.PUSH);
		toolItemTeacherReg.setImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/images/teacher.png")));
		toolItemTeacherReg.setText("��ʦע��");
		toolItemTeacherReg
				.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
					public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
						TeacherReg teacher=new TeacherReg();//System.out.println("widgetSelected()"); // TODO Auto-generated Event stub widgetSelected()
					    teacher.getsShell().open();
					}
					public void widgetDefaultSelected(
							org.eclipse.swt.events.SelectionEvent e) {
					}
				});
		ToolItem toolItemSeparator2 = new ToolItem(toolBar, SWT.SEPARATOR);
		ToolItem toolItemCourseManage = new ToolItem(toolBar, SWT.PUSH);
		toolItemCourseManage.setImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/images/coursemanage.png")));
		toolItemCourseManage.setText("�γ̹���");
		ToolItem toolItemSeparator3 = new ToolItem(toolBar, SWT.SEPARATOR);
		ToolItem toolItemCourseArrange = new ToolItem(toolBar, SWT.PUSH);
		toolItemCourseArrange.setImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/images/courseArrange.png")));
		toolItemCourseArrange.setText("�༶�ſ�");
	}
	public AdminMainShell(){
		createSShell();
	}

	

	public Shell getsShell() {
		// TODO Auto-generated method stub
		return sShell;
	}

}
