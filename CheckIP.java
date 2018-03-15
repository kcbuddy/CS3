package cs3;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
public class CheckIP {
    NetworkInterface networkInterface;
    ObjectInputStream input;
    ServerSocket serverSocket;
    Socket socket;
    Inet4Address ipv4Address;
    Inet6Address ipv6Address;
    NetPermission netPermission;
    SocketPermission socketPermission;
    ArrayList badConnList;
    BadConn bandConn;
    
    public CheckIP(String ip){
       
        if(ip.length()>=12){
            
        }
        else{
            
        }
       
    }
    
    
}
