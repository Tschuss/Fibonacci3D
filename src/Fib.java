import org.apache.commons.math3.complex.Complex;

public class Fib {

	static double MINX=-10;
	static double MAXX=100.0;
	static double MINY=-10;
	static double MAXY=100.0;
	static double inc=1;
	
	public static void main(String[] args) {

		Complex y;
		for (double a=MINX;a<=MAXX;a=a+inc) {
			for (double b=MINY;b<=MAXY;b=b+inc) {
				y=binet(new Complex(a,b));
				System.out.println((a+"\t"+b+"\t"+y.getImaginary()).replaceAll(",","\t").replaceAll("\\.",",").replaceAll("\\(","").replaceAll("\\)",""));
				//System.out.print((y.getImaginary()+"\t").replaceAll("\\.",","));

			}
			System.out.println();
		}		
		System.out.println();
	}

	
	
	static Complex binet (Complex n) {
		Complex c1=fi();
		c1=c1.pow(n);
		Complex c2=new Complex(-1);
		c2=c2.divide(fi());
		c2=c2.pow(n);
		c1=c1.subtract(c2);
		return c1.divide(Math.sqrt(5.0));
		
		//return (Math.pow(fi(),n)-(Math.pow(-1/fi(),n)))/Math.sqrt(5.0);
	}
	
	static Complex fi() {
		return new Complex ((1.0+Math.sqrt(5.0))/2.0,0);
	}
	
}
