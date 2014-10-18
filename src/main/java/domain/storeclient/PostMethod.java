package domain.storeclient;

/**
 * Created by Nivek on 18/10/2014.
 */
public class PostMethod {

    private final String hostname;
    public String parameter1;
    public String value1;

    public PostMethod(String hostName) {
        this.hostname = hostName;
    }

    public void addParameter(String parameter1, String value1) {
        this.parameter1 = parameter1;
        this.value1 = value1;
    }
}
