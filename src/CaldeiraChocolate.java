public class CaldeiraChocolate {

    protected boolean vazia;
    protected boolean fervida;
    protected  static CaldeiraChocolate instancia;

    private CaldeiraChocolate() {
        this.vazia = true; 
        this.fervida = false;
    }

    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher() {
        if (vazia) {
            vazia = false;  
            fervida = false; 
            System.out.println("Caldeira cheia.");
        } else {
            System.out.println("A caldeira já está cheia.");
        }
    }

    public void drenar() {
        if (!vazia) {
            vazia = true; 
            fervida = false; 
            System.out.println("Caldeira drenada.");
        } else {
            System.out.println("A caldeira já está vazia.");
        }
    }

    public void ferver() {
        if (!vazia) {
            fervida = true; 
            System.out.println("O conteudo está fervendo.");
        } else {
            System.out.println("A caldeira está vazia. Não é possível ferver o conteudo.");
        }
    }
}