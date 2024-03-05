package Week_7.Activity_8a;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://www.example.com/index.html");
            System.out.println("Protocol Name :"+ url.getProtocol());
            System.out.println("Host Name :"+ url.getHost());
            System.out.println("Port Number :"+ url.getPort());
            System.out.println("File Path :"+ url.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
