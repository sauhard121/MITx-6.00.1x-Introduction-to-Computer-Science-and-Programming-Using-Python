   







	import java.io.*;
	import java.net.*;

	
class file_upload  implements Serializable
	{
	byte b1[];
	



		void setB1(byte b2[])
	{
	b1=b2;
	}
	
		byte[] getB1()
	{
	return b1;
	}
	}





	
class client extends file_upload 




	{
	static Socket s1;
	static InetAddress a;
	
		






		static void send_image ()
	{
	System.out.println("Image");
	
	}
	



		static void send_packet()

	{
	
	DatagramPacket p1=new DatagramPacket(n1,0,n1.length,a,1024)
	
	p1.send(s1);

	}






		static void send_video()
	{
	System.out.println("Video");
	
	}
	
	



		static void send_text()
	{
	System.out.println("Enter Text");
	BufferedReader r2 =new BufferedReader(new InputStreamReader(System.in));
	String c1;
	r2.readLine(c1); 
	byte n1[]=c1.getBytes();		
	
	}
	
	
	

		 static void message() 
	{
	try
	{
	
	System.out.println("Message");
	s1 = new Socket(a,1024); // Exception 
	
	choice();		

	}
	
	catch(IOException e1)
	{
	message();
	
	}
	
	
	}
	






		static void choice()
	{
	BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{	

	System.out.println("1 For Image");
	System.out.println("2 For Video");
	System.out.println("3 For Text");
	System.out.println("4 For Quit");
	try
	{	
	
	String c1=r1.readLine();
	if(c1.equals("1"))
	send_image();
	if(c1.equals("2"))
	send_video();
	if(c1.equals("3"))
	send_text();

	}
	catch(IOException e1)
	{
	System.out.println(e1);
	}
	
	}			 			
	
	}
	
	public static void main(String x[])
	{
	try
	{
	a = InetAddress.getLocalHost();
	s1 = new Socket(a,1024);
	
	
	
	}
	catch(UnknownHostException e1)
	{
	System.out.println(e1);
	}
	catch(IOException e1)
	{
	
	
	message();

	
	}
	
	}
	}
	