package cs3;


import java.util.ArrayList;
public class BadConn {
    int badConn;
    ArrayList badConnList;
    ArrayList bannedConnList;

    public ArrayList getBannedConnList() {
        return bannedConnList;
    }
    public void addBannedConn(String ip,ArrayList bannedConList){
        this.bannedConnList=bannedConList;
        bannedConnList.add(ip);
        
    }
    
    public int getBadConnTotal(){
        return badConn;
    }
    public void setBadConnTotal(int badConn){
        this.badConn=badConn;
    }

    public ArrayList getBadConnList() {
        return badConnList;
    }

    public void setBadConnList(ArrayList badConnList) {
        this.badConnList = badConnList;
    }
    public void addBadConn(String ip,ArrayList badConnList){
        this.badConnList=badConnList;
        badConnList.add(ip);
    }
    
}
