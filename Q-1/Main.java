import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
	
	public static void main(String[] args) {

		Date dt = new Date();
		SimpleDateFormat frmt = new SimpleDateFormat("dd MMMM yy");
		System.out.println(frmt.format(dt));

	}

}
