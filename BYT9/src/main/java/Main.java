import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

import static com.sun.webkit.network.URLs.newURL;

public class Main {
    public static void main(String args[]) throws IOException {
        URL address = newURL("http://www.pja.edu.pl/");
        URLConnection connect = address.openConnection();
        long longtime = connect.getLastModified();
        Date modifiedDate = new Date(longtime);
        System.out.println(modifiedDate.toString());

    }
}
