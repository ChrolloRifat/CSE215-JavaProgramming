
public class LogLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
		
	}

	public static String message(String logLine) {
    String mes = logLine.trim();
    int start = mes.indexOf(":") + 2;
    int end = mes.length();
    System.out.println(end);
    return mes.substring(start,end);
	}
}
