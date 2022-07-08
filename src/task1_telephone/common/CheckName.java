package task1_telephone.common;

public class CheckName {
    public static boolean checkName(String name){
       String regexName ="^[A-Z]+$" ;
       return name.matches(regexName);
    }
}
