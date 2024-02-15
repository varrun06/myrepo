//Program 42: DefangingIPAddress
package Programs25;

public class DefangingIPAddress {

    public static void main(String[] args) {

        String address = "1.1.1.1";

       
        String changeaddress = address.replace(".", "[.]");

        
        System.out.println(changeaddress);
    }
}
