package config;
public class session {
  private static session instance;
  private String username;
  private String email;
  private String useraddress;
  private String usertype;
  private String userid;
  private String userage;
  private String usercontactno;
  
    public static session getInstance(){
        if(instance == null){
            instance = new session();
        }
        return instance;
}
    
    public String getusername(){
        return username;
    }
    public void setusername(String username){
        this.username = username;
    }
    public String getuseremail(){
        return email;
    }
    public void setuseremail(String email){
        this.email = email;
    }
    public String getuseraddress(){
        return useraddress;
    }
    public void setuseraddress(String useraddress){
        this.useraddress = useraddress;
    }
    public String getusertype(){
        return usertype;
    }
    public void setusertype(String usertype){
        this.usertype = usertype;
    }
    public String getuserid(){
        return userid;
    }
    public void setuserid(String userid){
        this.userid = userid;
    }
    public String getuserage(){
        return userage;
    }
    public void setuserage(String userage){
        this.userage = userage;
    }
    public String getusercontactno(){
        return usercontactno;
    }
    public void setusercontactno(String usercontactno){
        this.usercontactno = usercontactno;
    }
    public void logout(){
        instance = null;
    }
    
}
