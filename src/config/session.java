package config;
public class session {
    private static session instance;
    private static String user_id;
    private static String user_name;
    private static String user_address;
    private static String user_age;
    private static String user_email;
    private static String user_contactno;
    private static String user_type;
    private static String user_status;

    private session() {

    }

    public static synchronized session getInstance() {
        if (instance == null) {
            instance = new session();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    public static String getuser_id() {
        return user_id;
    }

    public static void setuser_id(String user_id) {
        session.user_id = user_id;
    }

    public static String getuser_name() {
        return user_name;
    }

    public static void setuser_name(String user_name) {
        session.user_name = user_name;
    }

    public static String getaddress() {
        return user_address;
    }

    public static void setaddress(String user_address) {
        session.user_address = user_address;
    }

    public static String getage() {
        return user_age;
    }

    public static void setage(String user_age) {
        session.user_age = user_age;
    }

    public static String getemail() {
        return user_email;
    }

    public static void setemail(String user_email) {
        session.user_email = user_email;
    }

    public static String getcontactno() {
        return user_contactno;
    }

    public static void setcontactno(String user_contactno) {
        session.user_contactno = user_contactno;
    }

    public static String gettype() {
        return user_type;
    }

    public static void settype(String user_type) {
        session.user_type = user_type;
    }
    public static String getstatus() {
        return user_status;
    }

    public static void setstatus(String user_status) {
        session.user_status = user_status;
    }
}
