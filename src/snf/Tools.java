package snf;

public class Tools {
	public static final String MSG_01 = "N�o � possivel incluir. N�mero m�ximo j� foi atingido";

	public static void msg(String msg) {
		System.out.print(msg);
	}

	public static void errormsg(Exception e, boolean fim ) {
    	msg(">> Mensagem de ERRO!!\n" + e);
    	if (fim) {
        	msg("\n\n***  Programa ser� finalizado!");
        	System.exit(0);
    	}
	}

	public static String repeatStr(String s, int n) {
		String ret = "";
		for (int k=0 ; k<n ; k++){
			ret+=s;
		}
		return ret;
	}






}
