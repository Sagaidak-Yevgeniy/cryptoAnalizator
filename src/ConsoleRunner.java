import javax.xml.transform.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        Application application = new Application(args);
        Result result = application.run();
        System.out.println(result);
    }
}


