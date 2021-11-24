public class Bateria extends Central{

    private static Bateria bateria = new Bateria();

    private Bateria(){};

    public static Bateria getInstancia(){
        return bateria;
    }

}
