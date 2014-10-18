import domain.storeclient.MatrixHttpClient;

import java.io.IOException;

/**
 * Created by Nivek on 18/10/2014.
 */
public class DKOneRunner {
    public static void main (String[] args) throws IOException {
        MatrixHttpClient.connectToMatrix();
        System.out.print("hello world");
    }
}
