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
			Landingframe=new JFrame("主界面");
		JPanel jp1,jp2,jp3;
		JLabel jlb1,jlb2;
		JButton jb1,jb2,jb3;
		JTextField users;
		JPasswordField passw;
		jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
		
        jlb1 = new JLabel("用户名");
        jlb2 = new JLabel("密    码");

        jb1 = new JButton("登录");
        jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loadinface();
				Landingframe.dispose();
			}
		});
        
        
        jb2 = new JButton("取消");
        jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
        
        
        jb3 = new JButton("注册");
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
			JFrame registframe=new JFrame("注册界面");
			JPanel jp1,jp2,jp3;
			JLabel jlb1,jlb2;
			JButton jb1,jb2,jb3;
			JTextField users;
			JPasswordField passw;
			
			jp1 = new JPanel();
	        jp2 = new JPanel();
	        jp3 = new JPanel();
			
	        jlb1 = new JLabel("用户名");
	        jlb2 = new JLabel("密    码");
	        
	        jb1 = new JButton("确认");
	        jb1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	        jb2 = new JButton("取消");
	        jb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
	        jb3 = new JButton("返回");
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
	        registframe.setTitle("注册界面");
	        registframe.setVisible(true);

		}

public void loadinface() {
	JFrame loadinface=new JFrame("操作界面");
	JButton jb1, jb2,jb3,jb4;
	JPanel jp1, jp2, jp3;
	JLabel jlb1;
	
	jp1 = new JPanel();
    jp2 = new JPanel();
    jp3 = new JPanel();
    
    jlb1=new JLabel("请选择操作");
    
    jb1 = new JButton("存款");
    jb1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
    jb2 = new JButton("取款");
    jb2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			
		}
	});
    jb3 = new JButton("余额查询");
    jb3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
    jb4 = new JButton("退出");
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
    this.setTitle("操作界面");
    this.setVisible(true);
      
}

public void moneyout() {
	JFrame mofrace=new JFrame("操作界面");
	JButton jb1, jb2;
	JPanel jp1, jp2, jp3;
	JLabel jlb1,jlb2;
	JTextField jtf1;
	
	jp1 = new JPanel();
    jp2 = new JPanel();
    jp3 = new JPanel();
    
    jlb1=new JLabel("余额:");
    jlb2=new JLabel("存入金额");
    
    jtf1 = new JTextField(10);
    
    jb1 = new JButton("确认");
    jb2 = new JButton("返回"); 
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
    this.setTitle("存款界面");
    this.setVisible(true);
}
public static void main(String args[]) {
	
			Landingface t2=new Landingface();
			t2.mainface();
			}
	
}
