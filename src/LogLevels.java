
public class LogLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
		System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
		System.out.println(LogLevels.reformat("[ERROR]: Operation Completed"));		
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
	public static String reformat(String logLine) {
        String s1 = LogLevels.message(logLine);
        String s2 = LogLevels.logLevel(logLine);
        return s1 + " (" + s2 + ")";
       
    }
}
