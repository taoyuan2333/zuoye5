package select;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TestFlowLayout {

    public static void main(String[] args) {

    	 Frame f = new Frame();//����һ���մ��ڡ�
    	 f.setTitle("Frame WHERECOME du");
    	 FlowLayout fl = new FlowLayout();  //ʹ��������
         f.setLayout(fl);//�޸Ĳ��ֹ���
         f.setSize(500, 400);//���ô��ڴ�С,
         f.setLocation(300, 200);//���ô��ڵĳ�ʼλ��
         f.setVisible(true);//��ʾ���ڡ�
    	 

         f.addWindowListener(new WindowAdapter(){
 			public void windowClosing(WindowEvent e){
 				Window window=(Window)e.getComponent();
 				window.dispose();
 			}
 		});


 		TextField textField = new TextField();
 		textField.setBounds(200, 100, 200, 50);
 		textField.setBackground(Color.white);
 		MyActionListener myActionListener = new MyActionListener(textField);//����һ����ť�����¼�����
 		f.add(textField);
 		Button button1= new Button("Choose couse");
 		Button button2= new Button("Back course");
 		button1.setBounds(100,100,100,100);
 		button1.setBackground(Color.orange);
 		button1.addActionListener(myActionListener);//���myActionListener�����¼�
 		f.add(button1);

 		button2.setBounds(300,300,300,300);
 		button2.setBackground(Color.red);
 		ActionListener myActionListener2=new MyActionListener2(textField);
		button2.addActionListener(myActionListener2);//���myActionListener�����¼�
 		f.add(button2);
        f.setLayout(null);//��ղ���
    }
    	
}
class MyActionListener implements ActionListener{
	
	 Course course=new Course(1, "Java", "�ۺ�¥",3,3);
	 Teacher teather=new Teacher(1, "������", "��",course);
	 Student student=new Student(1, "��Ԫ", "��",course,teacher);
	private TextField textField;
 
	public MyActionListener(TextField textField) {
		super();
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent e) {
		textField.setText(" " +student+ " ");
}
}
class MyActionListener2 implements ActionListener{
	
	private TextField textField;
	public MyActionListener2(TextField textField) {
		super();
		this.textField = textField;
	}
	public void actionPerformed(ActionEvent e) {
			textField.setText("not to chouse course");
	
	}
	
}
