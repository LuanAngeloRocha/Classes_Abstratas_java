public class Gato extends Mamifero {
    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    @Override
    public String amamentar() {
        // TODO Auto-generated method stub
        return "Sim Amamenta";
    }
    @Override
    public String emitirsom() {
        // TODO Auto-generated method stub
        return "miau";
    }
}
