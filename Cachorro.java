public class Cachorro extends Mamifero{
    
  private String tamanho;
  private String raça;

public String getTamanho() {
    return tamanho;
}
public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
}
public String getRaça() {
    return raça;
}
public void setRaça(String raça) {
    this.raça = raça;
}
@Override
public String amamentar() {
    // TODO Auto-generated method stub
    return "Sim";

}
@Override
public String emitirsom() {
    // TODO Auto-generated method stub
    return "Cachorro late ";
}
  
}
