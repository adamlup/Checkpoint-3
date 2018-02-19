
public class Application{
    private View view;

    public Application() {
        view = new View();
    }

    public static void main(String[] args){
        new Controller().Start();
    }

}