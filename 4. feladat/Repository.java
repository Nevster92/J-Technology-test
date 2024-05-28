public class Repository {

    public static Repository instance() {
        if (instance == null)
            instance = new Repository();
        return instance;
    }

    private Repository() {}

    private static Repository instance = null;


    public void someDatabaseThing() {
        System.out.println("BipBopBipBop... Database task....");
    }


}
