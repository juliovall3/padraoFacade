
public class Espaco extends Central{

    private static Espaco espaco = new Espaco();

    private Espaco(){};
    public static Espaco getInstancia(){
        return espaco;
    }
}

