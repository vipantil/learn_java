
public class RealTypes {

	public static void main(String[] args) {
		float sal = 2500.5f;
		System.out.println("my salary = "+ sal); //cannot convert from double to float
		//in java any number with decimal point treated as double
		//double required 8 bytes of memory but we provide 4 byte of memory that's why the error comes
		//to remove error we can use small or big F after 2500.5
		//or we can use type casting procedure also
		//float sal = (float)2500.50;
		//converting a double to to float
		double data = 2500.5;
		System.out.println("my salary is = " + data);

	}

}
