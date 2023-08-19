
public class LogLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
		System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));		
	}

	public static String message(String logLine) {
    String mes = logLine.trim();
    int start = mes.indexOf(":") + 1;
    int end = mes.length();
    
    return mes.substring(start,end).trim();
	}
    public static String logLevel(String logLine) {
        String mes = logLine.trim();
        int start = mes.indexOf("[") + 1;
        int end = mes.indexOf("]"); 
		 return mes.substring(start,end).toLowerCase().trim();
    }	
}
