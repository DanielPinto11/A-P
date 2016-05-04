package models;

public class SeveralCycles{

	public static final char POINT = ',';
	public static final String DATA_BLANK = "";

	/** Obtener nombre del estudiante con mayor nota */
	public String studentNote(String chain){
		int note = 0;
		String noteNumber = DATA_BLANK;
		String studentName = DATA_BLANK;
		for(int d = 0; d < chain.length(); d++){
			if(Character.isLetter(chain.charAt(d))){
				studentName += chain.charAt(d);
			}else if (text.charAt(i) == POINT) {
				int exam = Integer.parseInt(String.valueOf(chain.charAt(d + 1)));			
				if(exam > studentName){
					noteNumber = studentName;
					studentName = exam;
					studentName = DATA_BLANK;
				}
			}
		}
		return noteNumber;
	}
	
	/** Obtener la suma de unos numeros separados por comas */
	public int getNumbersSeparated(String chain){
		String symbol = DATA_BLANK;
		int add = 0;
		for(int d = 0; d < chain.length(); d++){
			if(Character.isDigit(chain.charAt(d))){
				symbol += chain.charAt(d);
				if(d + 1 == chain.length()){
					add += Integer.parseInt(symbol);
				} 
			}else{
				add += Integer.parseInt(symbol);
				symbol = DATA_BLANK;
			}
		}	
		return add;
	}

	/** Carretera con huecos */

	public static void main(String[] args){
		SeveralCycles dp = new SeveralCycles();
		System.out.println(dp.getNumbersSeparated("1,2,3,6"));
	}
}