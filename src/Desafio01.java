<? versão xml = " 1.0 " codificação = " UTF-8 " ?>
< tipo de módulo  = " JAVA_MODULE " versão = " 4 " > 
  < nome do componente  = " NewModuleRootManager " inherit-compiler-output = " true " > 
    < excluir saída />
    < content  url = " arquivo://$MODULE_DIR$ " >
      < sourceFolder  url = " file://$MODULE_DIR$/src "  isTestSource = " false " />
    </ conteúdo >
    < orderEntry  type = " herdadoJdk " />
    < orderEntry  type = " sourceFolder "  forTests = " false " />
  </ componente >
</ módulo >
 14 alterações: 14 adições e 0 exclusões14 
orientação-a-objetos-e-uml/src/aparelho/Main.java
@@ -0,0 +1,14 @@
pacote  aparelho ;

importar  aparelho . reproduzirmusical . ReprodutorMusical ;

 classe  pública Principal {

  public  static  void  main ( String [] args ) {
    ReprodutorMusical  aparelho = novo  ReprodutorMusical ( "Los Hermanos." );
    aparelho . selecionarMúsica ();
    aparelho . tocar ();
    aparelho . pausa ();
  }

}
 31 alterações: 31 adições e 0 exclusões31 
orientacao-a-objetos-e-uml/src/aparelho/reprodutormusical/ReproducaoAbst.java
@@ -0,0 +1,31 @@
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
