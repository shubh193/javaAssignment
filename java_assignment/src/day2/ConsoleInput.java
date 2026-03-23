package day2;

public class ConsoleInput {
	
	public static int getInt() {
		return Integer.parseInt(getString());
	}
	
	public static  Float getFLoat() {
		return Float.parseFloat(getString());
	}
	
	public static String getString() {
		
		try {
			byte [] input = new byte[100];
			
			int len = System.in.read(input);
			
			byte [] finalOutput = new byte[len - 1];
			
			System.arraycopy(input, 0, finalOutput, 0, len - 1);
			
			String objectString = new String(finalOutput);
			
			return objectString;
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}