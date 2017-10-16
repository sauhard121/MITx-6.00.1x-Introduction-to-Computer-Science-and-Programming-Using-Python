
  







	import java.io.*;
	import java.net.*;

	class file_upload  implements Serializable
	{
	byte b1[];
	
	void setB1(byte b2[])
	{
	b1=b2;
	}
	
	byte [] getB1()
	{
	return b1;
	}
	}
	

	
	class server 
	{
	
	
	
		
	public static void main(String x[])
	{
	try
	{
	ServerSocket s1 = new ServerSocket(1024);
	Socket s2 = s1.accept();
	
	
	
	
	}
	catch(IOException e1)
	{
	
	
	
	
	}
	try
	{
	ServerSocket s3 = new ServerSocket(1028);
	Socket s4 = s3.accept();
	
	
	}
	catch(IOException e1)
	{
	
	
	}
	}
	