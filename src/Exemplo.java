public class Exemplo {
    public int numero;
    public boolean face;

    public Exemplo(int numero) {

        this.numero = numero;
        this.face = false;
    }
    public void verificarCaraOuCoroa (){
        if (this.numero == 2){
            this.face = true;
            System.out.println("Coroa");
        }
        else {
            this.face = false;
            System.out.println("Cara");
        }
    }

    public static void main(String[] args) {
        Exemplo ex = new Exemplo(2);
        ex.verificarCaraOuCoroa();
    }

}
