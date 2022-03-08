public class Principal {
   public static void main(String[] args) {
       Papagaio p = new Papagaio();
       Cachorro c = new Cachorro();
       Gato g = new Gato();
       
       System.out.println("================================");
       System.out.println("                                 ");

       System.out.println("______________________________");
       System.out.println("Dados do Cachorro");
     

       c.setNome("Tom");
       c.setRaça("PitBull");
       c.setTamanho("Grande Porte");
       System.out.println("Nome:"+c.getNome());
       System.out.println("Raça:"+c.getRaça());
       System.out.println("Tamanho:"+c.getTamanho());
       System.out.println("Amamenta?:"+c.amamentar());
       System.out.println("Som?:"+c.emitirsom());

       System.out.println("______________________________");
       
       System.out.println("Dados do Papagaio");
       


       p.setNome("Louro");
       System.out.println("Nome:"+p.getNome());
       System.out.println("Voa?:"+p.voar());
       System.out.println("Som?:"+p.emitirsom());

       System.out.println("______________________________");
       
       System.out.println("Dados do Gato");
       
    
       
       g.setNome("Robertinho");
       g.setRaça("rajado");
       System.out.println("Nome:"+g.getNome());
       System.out.println("Raça:"+g.getRaça());
       System.out.println("Amamenta?:"+g.amamentar());
       System.out.println("Som?:"+g.emitirsom());
       System.out.println("                              ");
       System.out.println("================================");
   } 

}
