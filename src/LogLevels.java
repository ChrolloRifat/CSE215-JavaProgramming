
public class LogLevels {

	public static void main(String[] args) {
		
		System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
		System.out.println(LogLevels.logLevel("[INFO]: Operation Completed"));
		System.out.println(LogLevels.reformat("[WARNING]: Heading to the bush"));		
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
