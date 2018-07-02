package efre;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sw {

	
	public static void main(String[] args) throws IOException{
		ServerSocket a=new ServerSocket(9000);
		System.out.println("on port 9000");
		Socket b=a.accept();
		System.out.println("new connection:"+a.toString());
		InputStream c=b.getInputStream();
		OutputStream d=b.getOutputStream();
		byte []e=new byte[1024];
		int len;
		String oo="";
		while(true){
			len=c.read(e);
			oo=new String(e,0,len);                           
			if(oo.equals("exit")){
				break;
			}
			System.out.println("strenger: ".getBytes());
			d.write("ok.server".getBytes());
			d.flush();
		}
		d.close();
		c.close();
		b.close();
		a.close();
		
	}

}
