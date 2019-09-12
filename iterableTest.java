package Collections;

public class iterableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImpIterable ii = new ImpIterable();
		
		for(String html: ii)
		System.out.println(html.length());
	}

}
