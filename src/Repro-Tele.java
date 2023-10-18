@@ -0,0 +1,10 @@
pacote  aparelho . reproduzirmusical ;

 interface  pública ReproduçãoIntfc {

  vazio  tocar ();

   pausa nula ();

  void  selecionarMúsica ();
}
 9 alterações: 9 adições e 0 exclusões9 
orientacao-a-objetos-e-uml/src/aparelho/reprodutormusical/ReprodutorMusical.java
@@ -0,0 +1,9 @@
pacote  aparelho . reproduzirmusical ;

public  class  ReprodutorMusical  estende  ReproduçãoAbst {

  public  ReprodutorMusical ( String  nome ) {
    super ( nome );
  }

}
