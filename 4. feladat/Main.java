import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

        Repository singleton = Repository.instance();
        singleton.someDatabaseThing();


}}