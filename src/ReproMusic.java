pacote  aparelho . reproduzirmusical ;

importar  aparelho . reproduzirmusical . ReproduçãoIntfc ;

 classe abstrata  pública ReproducaoAbst implementa ReproducaoIntfc {   

   String  protegida nome ;

  public  ReproduçãoAbst ( String  nome ) {
    isso . nome = nome ;
  }

  @ Substituir
  public  void  tocar () {
    Sistema . fora . println ( nome + "está tocando" );
  }

  @ Substituir
  public  void  pausa (){
    Sistema . fora . println ( nome + "pausada!" );
  }

  @ Substituir
  public  void  selecionarMúsica () {
    Sistema . fora . println ( nome + "selecionado" );
  }

  public  String  getNome (){
    retornar  nome ;
  }
}
 10 alterações: 10 adições e 0 exclusões10 
orientacao-a-objetos-e-uml/src/aparelho/reprodutormusical/ReproducaoIntfc.java
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
