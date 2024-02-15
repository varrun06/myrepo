//6
package LeetCode25;

public class DefangingIPAddress1108 {

    public static void main(String[] args) {

        String address = "1.1.1.1";

       
        String changeaddress = address.replace(".", "[.]");

        
        System.out.println(changeaddress);
    }
}
