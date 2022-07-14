// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int R;
		double pi, VOLUME;

		pi = 3.14159;
		R = input.nextInt();

		VOLUME = (4/3.0) * pi * Math.pow(R,3);
		System.out.println("VOLUME = " + df.format(VOLUME));
	}
	
}
