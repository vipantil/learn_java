
public class IntegerTypes {

	public static void main(String[] args) {
		byte b = -128;
		byte a = 127;
		short c = 128;
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		//byte can store value -128 to 127
		//in JAVA any number without decimal treated as integer
		// integer data types
		// byte = 1 byte of memory ( 8 bits )
		// byte = 2 byte of memory ( 16 bits )
		// byte = 4 byte of memory ( 32 bits )
		// byte = 8 byte of memory ( 64 bits )
		
		int sal = 2500;
		System.out.println("my salary = " + sal);// to combine any data with the string use + sign
		// you will see the output as my salary = 2500
		
		long pop = 9874587125l;
		System.out.println("world population = "  + pop);
		// The literal ( literal means the Value ) 9874587125 of type int is out of range
		// any number end with capital or small L treated as long
		System.out.println(Integer.MAX_VALUE); //Maximum value can integer store 2147483647
		System.out.println(Integer.MIN_VALUE); //Minimum value can integer store -2147483648
		
		
	}

}
