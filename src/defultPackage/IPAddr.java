package defultPackage;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddr {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress myIP = InetAddress.getLocalHost();
		
		System.out.println("My IP Address is ");
		
		System.out.println(myIP.getCanonicalHostName()); // hostname - jxxxx
		System.out.println(myIP.getHostAddress());  // eg ip is 192.168.1.154
		System.out.println(myIP.getHostName()); //same has above it
		System.out.println(myIP.getAddress()); // random number
		
	}

}
