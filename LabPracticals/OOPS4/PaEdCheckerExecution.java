import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordCheckerExecution {
    public static void main(String[] args) {
        Scanner in   = new Scanner(System.in);
        System.out.println("Please enter the password:");
        String str = in.nextLine();
        PasswordChecker chox = new PasswordChecker(str);
        System.out.println("Password :"+chox.getPwd());
        System.out.println(chox.pwdcheck(chox.getPwd()));
    }
}
class PasswordChecker{
    private String pwd;
    PasswordChecker(String pwd){
        this.pwd = pwd;
    }
    public String getPwd(){
        return pwd;
    }
    public  void setPwd(String pwd){
        this.pwd = pwd;
    }
    public boolean pwdcheck(String pwd ){
        
       
        if(pwd.toLowerCase().equals(pwd)){
            return true;
        }
        if(pwd.length()>=5 && pwd.length()<=12){
            
        for(int i=0;i<pwd.length();i++){
            char c = pwd.charAt(i);
            if(Character.isUpperCase(c) || !Character.isLetterOrDigit(c)){
                return false;
            }
        }
        return true;}
        return false;}}
