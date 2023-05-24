package revisandoif;

public class MenuSuperior {

	public static void main(String[] args) {
		
	//para voce /para empresas / ajuda / busca	
		
   String menu = "pesquisa";
   String menuAjuda = "null";
   
   
   if (menu.equalsIgnoreCase("Para você")) {
	   System.out.println("Abrindo o menu " + menu);
	   
   }else if( menu.equalsIgnoreCase("Para empresas")) {
	   System.out.println("Abrindo o menu " + menu);
	   
   }else if( menu.equalsIgnoreCase("Ajuda")) {
	   System.out.println("Abrindo o menu " + menu);
	   if (menuAjuda.equalsIgnoreCase(menuAjuda)) {
		System.out.println("Acessei o menu " + menuAjuda);
	}
   }else if( menu.equalsIgnoreCase("Busca")) {
	   System.out.println("Abrindo o menu " + menu);
   }else {
	System.out.println("Opção inválida");
}
}
   	
	}


