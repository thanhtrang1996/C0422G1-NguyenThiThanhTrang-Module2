package task1_telephone.common;

public class CheckManufacturer {
    public static boolean checkManufacturer(String manufacturer){
        String regexManufacturer = "^([A-Z][a-z]+\\s[A-Z][a-z]+)|[A-Z][a-z]+$";
       return manufacturer.matches(regexManufacturer);
    }
}
