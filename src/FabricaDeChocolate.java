public class FabricaDeChocolate {
    public static void main(String[] args) throws Exception {
          
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();
            caldeira.encher();
            caldeira.drenar();
            caldeira.ferver();
    }
}