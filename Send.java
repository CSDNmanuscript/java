package i0p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		DatagramSocket a=new DatagramSocket(50000);
		byte[] b="UDP���ݰ�".getBytes();
		DatagramPacket c=new DatagramPacket(b,b.length);
		c.setAddress(InetAddress.getByName("192.168.10.247")/*getLocalHost()*/);
		c.setPort(60000);
		for(int i=0;i<10;i++){
			a.send(c);
			Thread.sleep(1000);
		}
		System.out.println("ok");
	}

}
