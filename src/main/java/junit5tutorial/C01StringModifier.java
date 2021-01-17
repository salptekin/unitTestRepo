package junit5tutorial;

public class C01StringModifier {
	
	//AABC==>BC, ABC==>BC, BCD==>BCD, BCAA==>BCAA, AA==>"", A==>"", B==>B
	public String deleteAIfItIsinFirstTwoPositions(String str) {
		
		if(str.length()<=2) {
			return str.replaceAll("A", "");
		}
		
		String firstTwoChars = str.substring(0,2);
		String afterFirstTwoChars = str.substring(2);
		
		return firstTwoChars.replaceAll("A", "") + afterFirstTwoChars;
		
	}

}
