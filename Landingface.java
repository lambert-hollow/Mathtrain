package ATM;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Landingface extends JFrame{

	public Landingface(){}
		JFrame Landingframe;
		
public void mainface() {
			Landingframe=new JFrame("������");
		JPanel jp1,jp2,jp3;
		JLabel jlb1,jlb2;
		JButton jb1,jb2,jb3;
		JTextField users;
		JPasswordField passw;
		jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
		
        jlb1 = new JLabel("�û���");
        jlb2 = new JLabel("��    ��");

        jb1 = new JButton("��¼");
        jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loadinface();
				Landingframe.dispose();
			}
		});
        
        
        jb2 = new JButton("ȡ��");
        jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
        
        
        jb3 = new JButton("ע��");
        jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				;
				// TODO Auto-generated method stub
				Registface();
				Landingframe.dispose();
			}
		});
        
        users =new JTextField(10);
        passw=new JPasswordField(10);
        Landingframe.setLayout(new GridLayout(3,1));
        
        jp1.add(jlb1);
        jp1.add(users);
        
        jp2.add(jlb2);
        jp2.add(passw);
        
        jp3.add(jb1);
        jp3.add(jb2);
        jp3.add(jb3);
        
        Landingframe.add(jp1);
        Landingframe.add(jp2);
        Landingframe.add(jp3);
        
        Landingframe.setSize(520,200);
        Landingframe.setLocation(700,500);
        Landingframe.setTitle("ATM");
        Landingframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Landingframe.setVisible(true);
        
        
	}
		
public void Registface() {
			JFrame registframe=new JFrame("ע�����");
			JPanel jp1,jp2,jp3;
			JLabel jlb1,jlb2;
			JButton jb1,jb2,jb3;
			JTextField users;
			JPasswordField passw;
			
			jp1 = new JPanel();
	        jp2 = new JPanel();
	        jp3 = new JPanel();
			
	        jlb1 = new JLabel("�û���");
	        jlb2 = new JLabel("��    ��");
	        
	        jb1 = new JButton("ȷ��");
	        jb1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	        jb2 = new JButton("ȡ��");
	        jb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	        jb3 = new JButton("����");
	        jb3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	        users =new JTextField(10);
	        passw=new JPasswordField(10);
	        registframe.setLayout(new GridLayout(3,1));
	        
	        jp1.add(jlb1);
	        jp1.add(users);
	        
	        jp2.add(jlb2);
	        jp2.add(passw);
	        
	        jp3.add(jb1);
	        jp3.add(jb2);
	        jp3.add(jb3);
	        
	        registframe.add(jp1);
	        registframe.add(jp2);
	        registframe.add(jp3);
	        
	        registframe.setSize(520,200);
	        registframe.setLocation(700,500);
	        registframe.setTitle("ע�����");
	        registframe.setVisible(true);

		}

public void loadinface() {
	JFrame loadinface=new JFrame("��������");
	JButton jb1, jb2,jb3,jb4;
	JPanel jp1, jp2, jp3;
	JLabel jlb1;
	
	jp1 = new JPanel();
    jp2 = new JPanel();
    jp3 = new JPanel();
    
    jlb1=new JLabel("��ѡ�����");
    
    jb1 = new JButton("���");
    jb1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
    jb2 = new JButton("ȡ��");
    jb2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			
		}
	});
    jb3 = new JButton("����ѯ");
    jb3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
    jb4 = new JButton("�˳�");
    jb4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
    this.setLayout(new GridLayout(3, 1));
    
    jp1.add(jlb1);
    
    jp2.add(jb1);
    jp2.add(jb2);
    
    jp2.add(jb3);
    jp2.add(jb4);
    
    this.add(jp1);
    this.add(jp2);
    this.add(jp3);
    
    this.setSize(420,200);
    this.setLocation(700,500);
    this.setTitle("��������");
    this.setVisible(true);
      
}

public void moneyout() {
	JFrame mofrace=new JFrame("��������");
	JButton jb1, jb2;
	JPanel jp1, jp2, jp3;
	JLabel jlb1,jlb2;
	JTextField jtf1;
	
	jp1 = new JPanel();
    jp2 = new JPanel();
    jp3 = new JPanel();
    
    jlb1=new JLabel("���:");
    jlb2=new JLabel("������");
    
    jtf1 = new JTextField(10);
    
    jb1 = new JButton("ȷ��");
    jb2 = new JButton("����"); 
    this.setLayout(new GridLayout(3, 1));
    
    jp1.add(jlb1);
    
    jp2.add(jlb2);
    jp2.add(jtf1);

    jp3.add(jb1);
    jp3.add(jb2);
      
    this.add(jp1);
    this.add(jp2);
    this.add(jp3);
    
    this.setSize(420,200);
    this.setLocation(700,500);
    this.setTitle("������");
    this.setVisible(true);
}
public static void main(String args[]) {
	
			Landingface t2=new Landingface();
			t2.mainface();
			}
	
}
