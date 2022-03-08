public class Principal {
   public static void main(String[] args) {
       Papagaio p = new Papagaio();
       Aguia a = new Aguia();

       a.setNome("corinthians");
       System.out.println(a.voar());
       System.out.println(a.nadar());

       p.setNome("Louro");
       System.out.println(p.voar());
       System.out.println(p.nadar());
   } 

}
