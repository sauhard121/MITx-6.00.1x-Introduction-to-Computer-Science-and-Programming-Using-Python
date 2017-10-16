package proj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;
import javax.swing.*;

import java.util.Vector;
import java.util.Date;
import java.text.SimpleDateFormat;

class Main implements ActionListener {
	JFrame f;
	JButton b;
	JLabel l0, l,lp;
	JTextField t;
	JPasswordField pass;
	JPanel p;

	Main() {
		f = new JFrame("WELCOME");
		b = new JButton("LOGIN");
		lp = new JLabel("CYBER LINK");
		l = new JLabel("LOGIN ID");
		l0 = new JLabel("PASSWORD");
		t = new JTextField();
		pass = new JPasswordField();
		p = new JPanel();

		f.setBounds(350, 150, 700, 500);
		p.setBounds(0, 0, 700, 130);
		lp.setBounds(130, 30, 450, 70);
		l.setBounds(200, 200, 200, 25);
		l0.setBounds(200, 260, 200, 25);
		b.setBounds(250, 350, 150, 25);
		t.setBounds(300, 200, 150, 25);
		pass.setBounds(300, 260, 150, 25);

		lp.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 60));
		lp.setForeground(Color.magenta);
		p.setBackground(Color.BLUE);
		
		f.add(lp);
		f.add(l);
		f.add(l0);
		f.add(t);
		f.add(pass);
		f.add(b);
		f.add(p);
		
		b.addActionListener(this);

		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			if (t.getText().equals("java") && pass.getText().equals("itmindia")) {
				new Menu();
				f.dispose();
			} else {
				JOptionPane.showMessageDialog(null,"Enter valid Username or Password", "ERROR",	JOptionPane.ERROR_MESSAGE);
				t.setText("");
				pass.setText("");
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}

class Menu implements ActionListener {
	JFrame f1;
	JButton b1, b2, b3, b4;
	JLabel l1, l2, l3, l4;
	JPanel p1;

	Menu() {
		f1 = new JFrame("WELCOME");

		b1 = new JButton("New User");
		b2 = new JButton("PC Vacant");
		b3 = new JButton("Current User");
		b4 = new JButton("Users");
		l1 = new JLabel("CYBER LINK");
		l2 = new JLabel("Detail Of New Customer");
		l3 = new JLabel("Customer Present In Cafe");
		l4 = new JLabel("Customers Visited Cafe Till Date");
		p1 = new JPanel();

		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f1.setBounds(350, 150, 700, 500);
		p1.setBounds(0, 0, 700, 70);
		l1.setBounds(230, 5, 450, 70);
		l2.setBounds(270, 110, 150, 25);
		l3.setBounds(265, 230, 150, 25);
		l4.setBounds(248, 350, 250, 25);
		b1.setBounds(280, 150, 100, 25);
		b2.setBounds(150, 270, 100, 25);
		b3.setBounds(400, 270, 120, 25);
		b4.setBounds(285, 390, 100, 25);

		l1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 33));
		l1.setForeground(Color.magenta);
		p1.setBackground(Color.BLUE);

		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(p1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setResizable(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {

			new NewUser();
			f1.dispose();
		}
		if (e.getSource() == b2) {

			new PcVacant();
			f1.dispose();
		}
		if (e.getSource() == b3) {

			new CurrentUser();
			f1.dispose();
		}
		if (e.getSource() == b4) {

			new Users();
			f1.dispose();
		}

	}

}

class NewUser implements ActionListener {
	JFrame f2;
	JButton b11, b12, b13;
	JLabel l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
	String id3;

	NewUser() {
		f2 = new JFrame("NEW USER INFORMATION");
		b11 = new JButton("BACK");
		b12 = new JButton("SUBMIT");
		b13 = new JButton("RESET");
		l4 = new JLabel("NAME");
		l5 = new JLabel("H. NO");
		l6 = new JLabel("STREET");
		l7 = new JLabel("CITY");
		l8 = new JLabel("STATE");
		l9 = new JLabel("ZIP CODE");
		l10 = new JLabel("CONTACT NO");
		l11 = new JLabel("ID PROOF");
		l12 = new JLabel("ID ASSIGNED");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		t9 = new JTextField();

		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f2.setBounds(350, 150, 700, 500);
		l4.setBounds(110, 40, 100, 25);
		l5.setBounds(110, 80, 100, 25);
		l6.setBounds(110, 120, 100, 25);
		l7.setBounds(110, 160, 100, 25);
		l8.setBounds(110, 200, 100, 25);
		l9.setBounds(110, 240, 100, 25);
		l10.setBounds(110, 280, 100, 25);
		l11.setBounds(380, 40, 100, 25);
		l12.setBounds(380, 80, 100, 25);
		t1.setBounds(200, 40, 120, 25);
		t2.setBounds(200, 80, 120, 25);
		t3.setBounds(200, 120, 120, 25);
		t4.setBounds(200, 160, 120, 25);
		t5.setBounds(200, 200, 120, 25);
		t6.setBounds(200, 240, 120, 25);
		t7.setBounds(200, 280, 120, 25);
		t8.setBounds(470, 40, 120, 25);
		t9.setBounds(470, 80, 120, 25);
		b11.setBounds(130, 360, 100, 25);
		b12.setBounds(300, 360, 100, 25);
		b13.setBounds(470, 360, 100, 25);

		f2.add(l4);
		f2.add(l5);
		f2.add(l6);
		f2.add(l7);
		f2.add(l8);
		f2.add(l9);
		f2.add(l10);
		f2.add(l11);
		f2.add(l12);
		f2.add(t1);
		f2.add(t2);
		f2.add(t3);
		f2.add(t4);
		f2.add(t5);
		f2.add(t6);
		f2.add(t7);
		f2.add(t8);
		f2.add(t9);
		f2.add(b11);
		f2.add(b12);
		f2.add(b13);

		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
			PreparedStatement ps = con.prepareStatement("select Id_Assigned from Registration");
			ResultSet rs = ps.executeQuery();
			if (rs.last())
			{
				String id = (rs.getString("Id_Assigned"));
				String id1[] = id.split("_");
				int id2 = Integer.parseInt(id1[1]);
				if (id2 < 5) {
					id2++;
					id3 = id1[0] + "_" + id2;
					t9.setText(id3);
					t9.setEnabled(false);
				} else {
					char c[] = id1[0].toCharArray();
					int i = c[0];
					i++;
					char c1 = (char) i;
					id3 = String.valueOf(c1) + "_1";
					t9.setText(id3);
					t9.setEnabled(false);
				}
			}
			else 
			{
				String ss = "A_1";
				t9.setText(ss);
				t9.setEnabled(false);
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		f2.setLayout(null);
		f2.setVisible(true);
		f2.setResizable(false);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b11) {
			new Menu();
			f2.dispose();
		}
		if (e.getSource() == b12) {
/*
			Vector<String> addrow;
			@SuppressWarnings("rawtypes")
			Vector<Vector> totalRow = new Vector<Vector>();
*/
			  try 
			  { 
				  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami"); 
				  PreparedStatement ps=con.prepareStatement("insert into Registration values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"')");
				  int i=ps.executeUpdate();
				  JOptionPane.showConfirmDialog(null,"Inserted","Information",JOptionPane.PLAIN_MESSAGE); 
				  
				  new NewUser();
				  f2.dispose();
			  } 
			  catch(Exception e1) 
			  {
				  JOptionPane.showMessageDialog(null, "Enter Correct Values ");
			  
			  }
			 
		}
		if (e.getSource() == b13)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
		}
	}

}

class PcVacant implements ActionListener {
	JFrame f3;
	JButton b21, b22;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	String login;

	PcVacant() {
		f3 = new JFrame("PC'S VACANT");
		b21 = new JButton("ASSIGN");
		b22 = new JButton("BACK");
		l1 = new JLabel("USER ID");
		l2 = new JLabel("PC NUMBER");
		l3 = new JLabel("USER NAME");
		l4 = new JLabel("LOGIN TIME");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();

		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f3.setBounds(350, 150, 700, 500);
		l1.setBounds(350, 60, 100, 25);
		l2.setBounds(350, 120, 100, 25);
		l3.setBounds(350, 180, 100, 25);
		l4.setBounds(350, 240, 100, 25);
		t1.setBounds(460, 60, 120, 25);
		t2.setBounds(460, 120, 120, 25);
		t3.setBounds(460, 180, 120, 25);
		t4.setBounds(460, 240, 120, 25);
		b21.setBounds(280, 320, 100, 25);
		b22.setBounds(280, 380, 100, 25);

		f3.add(l1);
		f3.add(l2);
		f3.add(l3);
		f3.add(l4);
		f3.add(t1);
		f3.add(t2);
		f3.add(t3);
		f3.add(t4);
		f3.add(b21);
		f3.add(b22);

		b21.addActionListener(this);
		b22.addActionListener(this);

		f3.setLayout(null);
		f3.setVisible(true);
		f3.setResizable(false);
		//t4.setEnabled(false);

        // CURRENT TIMESTAMP
		Date datetime=new Date();
		SimpleDateFormat time= new SimpleDateFormat("HH:mm:ss");
		String login=time.format(datetime);
		t4.setText(login);
		
		Vector<String> columnname = new Vector<String>();
		columnname.addElement("PC NAME");
		columnname.addElement("STATUS");
		Vector<String> addrow;
		@SuppressWarnings("rawtypes")
		Vector<Vector> totalRow = new Vector<Vector>();
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
			PreparedStatement ps = con.prepareStatement("select * from pc_vacant where status='blank'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				addrow = new Vector<String>();
				addrow.addElement(rs.getString(1));
				addrow.addElement(rs.getString(2));
				totalRow.addElement(addrow);
			}

			JTable table = new JTable(totalRow, columnname);
			JScrollPane jps = new JScrollPane(table);
			jps.setBounds(50, 100, 150, 130);
			f3.add(jps);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b21) 
		{
//			Vector<String> columnname = new Vector<String>();
//			Vector<String> addrow;
//			@SuppressWarnings("rawtypes")
//			Vector<Vector> totalRow = new Vector<Vector>();
			try 
			{
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
			
				PreparedStatement ps = con.prepareStatement("insert into user( user_id , pc_name ,user_name ,login_time ) values('"+ t1.getText() + "','" + t2.getText() + "','"+ t3.getText() + "','" + t4.getText() + "')");
				int i = ps.executeUpdate();
				{
					try
					{
						PreparedStatement ps1 = con.prepareStatement("update pc_vacant set status='assign' where pc_name='"+t2.getText()+"'");
						int ii = ps1.executeUpdate();
					}
					catch(Exception ee )
					{
						JOptionPane.showMessageDialog(null," Exception "+ee); 
					}
				
					JOptionPane.showMessageDialog(null, "ASSIGNED PC >- -  "+t2.getText()+"\n TO ID >- -  "+t1.getText(),"INFORMATION",JOptionPane.PLAIN_MESSAGE);
					f3.dispose();
					new PcVacant();
				}
			}
			catch (SQLException e1) 
			{
				JOptionPane.showMessageDialog(null, "ENTER VALUES");
			    e1.printStackTrace();
			}
		
		}
		if (e.getSource() == b22) {
			new Menu();
			f3.dispose();
		}

	}
}

class CurrentUser implements ActionListener {
	JFrame f4;
	JButton b31, b32,b33;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	String logout;
	String pay,pcname=null;;

	CurrentUser()
	{
		f4 = new JFrame("CURRENT USERS");
		b31 = new JButton("BACK");
		b32=new JButton("PAYMENT");
		b33 = new JButton("SUBMIT");
		l1 = new JLabel("USER ID");
		l2 = new JLabel("LOGOUT  TIME");
		l3 = new JLabel("PAYMENT");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();

		f4.setBounds(350, 150, 700, 500);
		
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1.setBounds(110, 300, 100, 25);
		l2.setBounds(300, 300, 100, 25);
		l3.setBounds(515, 300, 100, 25);
		t1.setBounds(80, 330, 120, 25);
		t2.setBounds(280, 330, 120, 25);
		t3.setBounds(480, 330, 120, 25);
		b31.setBounds(100, 400, 100, 25);
		b32.setBounds(290, 400, 100, 25);
		b33.setBounds(480, 400, 100, 25);

		f4.add(l1);
		f4.add(l2);
		f4.add(l3);
		f4.add(t1);
		f4.add(t2);
		f4.add(t3);
		f4.add(b31);
		f4.add(b32);
		f4.add(b33);

		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);

		f4.setLayout(null);
		f4.setVisible(true);
		f4.setResizable(false);
		t3.setEnabled(false);
		t2.setEnabled(false);
		
		
	    // CURRENT TIMESTAMP
		Date datetime=new Date();
		SimpleDateFormat time= new SimpleDateFormat("HH:mm:ss");
		logout=time.format(datetime);
		t2.setText(logout);

		Vector<String> columnname = new Vector<String>();
		columnname.addElement("USER_ID");
		columnname.addElement("PC NO.");
		columnname.addElement("USER NAME");
		columnname.addElement("LOGIN TIME");
		Vector<String> addrow;
		@SuppressWarnings("rawtypes")
		Vector<Vector> totalRow = new Vector<Vector>();
		try 
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
			PreparedStatement ps = con.prepareStatement("select * from user where logout_time='00:00:00'");
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				addrow = new Vector<String>();
				addrow.addElement(rs.getString(1));
				addrow.addElement(rs.getString(2));
				addrow.addElement(rs.getString(3));
				addrow.addElement(rs.getString(4));
				totalRow.addElement(addrow);
			}

			JTable table = new JTable(totalRow, columnname);
			JScrollPane jps = new JScrollPane(table);
			jps.setBounds(120, 90, 450, 130);
			f4.add(jps);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b31) {
			new Menu();
			f4.dispose();
		}
		if(e.getSource() == b32)
		{   
			try 
			{   int payment=0;
				String logintime = null,logouttime = null;
				
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
				PreparedStatement ps = con.prepareStatement("select pc_name,login_time from user where user_id='"+t1.getText()+"'");
				ResultSet rs=ps.executeQuery();
				if(rs.next())
				{
					logintime=rs.getString("login_time");
					pcname = rs.getString("pc_name");
				}
				String intime1[]=logintime.split(":");
				String outtime1[]=logout.split(":");
				int intime = Integer.parseInt(intime1[0]);
				int outtime = Integer.parseInt(outtime1[0]);
				int in_time1 = Integer.parseInt(intime1[1]);
				int out_time1 = Integer.parseInt(outtime1[1]);
				int timer=outtime-intime;
				
				
				if((out_time1-in_time1)<0)
				{  timer--;
			       out_time1+=60; 
				}
				if(out_time1-in_time1>30)
					   timer++;			   
				else if((out_time1-in_time1)>10)
					  payment+=10;
				
				if(timer>0)
				{   if(timer==1)
						payment+= 30;
				    else
				    	payment+=30+(timer-1)*15;
				}
				//char c1 = (char)payment;
				pay= String.valueOf(payment);
				t3.setText(pay);
				
					
				
				
			}
			catch (SQLException e1) 
			{
			//JOptionPane.showMessageDialog(null, "ENTER USER ID");
		    e1.printStackTrace();
			}
						
	    }  
		if(e.getSource() == b33)
		{  
			try 
			{   int payment=0;
				String logintime = null,logouttime = null;
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
				PreparedStatement ps3 = con.prepareStatement("update user set payment='"+pay+"'where user_id='"+t1.getText()+"'");
         		int ii = ps3.executeUpdate();
         		PreparedStatement ps4 = con.prepareStatement("update pc_vacant set status='blank' where pc_name='"+ pcname +"'");
			    int iii = ps4.executeUpdate();	
			    f4.dispose();
			    new CurrentUser();
			}
			catch (SQLException e2) 
			{
			//JOptionPane.showMessageDialog(null, "ENTER USER ID");
		    e2.printStackTrace();
			}
			
		}
	    }
}

class Users implements ActionListener
{
	JFrame f5;
	JButton b41, b42;
	JLabel l1;
	public static JTextField tui;

	Users() 
	{
		f5 = new JFrame("USERS");		
		b41 = new JButton("BACK");
		b42 = new JButton("DETAILS");
		l1 = new JLabel("USER ID");
		tui = new JTextField();

		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f5.setBounds(350, 150, 700, 500);
		l1.setBounds(230, 280, 100, 25);
		tui.setBounds(300, 280, 100, 25);
		b41.setBounds(180, 350, 100, 25);
		b42.setBounds(380, 350, 100, 25);
		

		f5.add(l1);
		f5.add(tui);
		f5.add(b41);
		f5.add(b42);
		

		b41.addActionListener(this);
		b42.addActionListener(this);	
		f5.setLayout(null);
		f5.setVisible(true);
		f5.setResizable(false);

		Vector<String> columnname = new Vector<String>();
		columnname.addElement("USER_ID");
		columnname.addElement("PC NO.");
		columnname.addElement("USER NAME");
		columnname.addElement("LOGIN TIME");
		columnname.addElement("LOGOUT TIME");
		columnname.addElement("PAYMENT");
		Vector<String> addrow;

		@SuppressWarnings("rawtypes")
		Vector<Vector> totalRow = new Vector<Vector>();
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
			PreparedStatement ps = con.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				addrow = new Vector<String>();
				addrow.addElement(rs.getString(1));
				addrow.addElement(rs.getString(2));
				addrow.addElement(rs.getString(3));
				addrow.addElement(rs.getString(4));
				addrow.addElement(rs.getString(5));
				addrow.addElement(rs.getString(6));
				totalRow.addElement(addrow);
			}

			JTable table = new JTable(totalRow, columnname);
			JScrollPane jps = new JScrollPane(table);
			jps.setBounds(68, 90, 550, 130);
			f5.add(jps);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b41) 
		{
			new Menu();
			f5.dispose();
		}
		if (e.getSource() == b42)
		{   
			new Informtion();
			f5.dispose();
		}		
	}

}

class Informtion implements ActionListener
{
	JFrame f6;
	JButton b51;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,lp1,lp2,lp3,lp4,lp5,lp6,lp7,lp8,lp9;
	JPanel panel;

	Informtion()
	{
		f6 = new JFrame("DETAILED INFORMATION");
		b51 = new JButton("BACK");
		panel=new JPanel();

		f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f6.setBounds(350, 150, 700, 500);
		b51.setBounds(280, 410, 100, 25);

		b51.addActionListener(this);

		f6.add(b51);
		f6.add(panel);
		panel.setLayout(null);
		f6.setVisible(true);
		f6.setResizable(false);

		Vector<String> columnname = new Vector<String>();
		l1 = new JLabel("USER ID");
		l2 = new JLabel("NAME");
		l3 = new JLabel("H. NO");
		l4 = new JLabel("STREET");
		l5 = new JLabel("CITY");
		l6 = new JLabel("STATE");
		l7 = new JLabel("ZIP CODE");
		l8 = new JLabel("CONTACT NO");
		l9 = new JLabel("ID PROOF");
		
		l1.setBounds(200, 30, 100, 25);
		l2.setBounds(200, 70, 100, 25);
		l3.setBounds(200, 110, 100, 25);
		l4.setBounds(200, 150, 100, 25);
		l5.setBounds(200, 190, 100, 25);
		l6.setBounds(200, 230, 100, 25);
		l7.setBounds(200, 270, 100, 25);
		l8.setBounds(200, 310, 100, 25);
		l9.setBounds(200, 350, 100, 25);
		panel.setBounds(0,0,550,500);
		
		panel.setBackground(Color.WHITE);
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		panel.add(l6);
		panel.add(l7);
		panel.add(l8);
		panel.add(l9);
		
		Vector<String>columnName=new Vector<String>();
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3333/stu","root","miami");
			PreparedStatement ps = con.prepareStatement("select * from Registration where Id_Assigned='"+Users.tui.getText()+"'");
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				lp1 = new JLabel(rs.getString(9));
				lp2 = new JLabel(rs.getString(1));
				lp3 = new JLabel(rs.getString(2));
				lp4 = new JLabel(rs.getString(3));
				lp5 = new JLabel(rs.getString(4));
				lp6 = new JLabel(rs.getString(5));
				lp7 = new JLabel(rs.getString(6));
				lp8 = new JLabel(rs.getString(7));
				lp9= new JLabel(rs.getString(8));
				
				lp1.setBounds(410, 30, 120, 25);
				lp2.setBounds(410, 70, 120, 25);
				lp3.setBounds(410, 110, 120, 25);
				lp4.setBounds(410, 150, 120, 25);
				lp5.setBounds(410, 190, 120, 25);
				lp6.setBounds(410, 230, 120, 25);
				lp7.setBounds(410, 270, 120, 25);
				lp8.setBounds(410, 310, 120, 25);
				lp9.setBounds(410, 350, 120, 25);
				
				panel.add(lp1);
				panel.add(lp2);
				panel.add(lp3);
				panel.add(lp4);
				panel.add(lp5);
				panel.add(lp6);
				panel.add(lp7);
				panel.add(lp8);
                panel.add(lp9);
				
			}

		} 
		catch (Exception e)
		{   e.printStackTrace();
		}
	}
	

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b51) {
			new Users();
			f6.dispose();
		}

	}
}
