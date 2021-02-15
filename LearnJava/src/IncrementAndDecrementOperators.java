
public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// increment operators are ++ ( use to increase the value of variable by one )
		//decrement operators are -- ( use to decrease the value of variable by one )
		int n = 10;
		System.out.println(n++); // when ++ given after variable called post increment, first it will be dispaly the value 
		//10 after that it will show 11
		System.out.println(++n);// this is called pre-increment, the answer will be 12
		// because n++ , n=10 then ++ means add 1 it becomes 11 ,
		//when n already 11 then ++n means n = 11 + 1 

	}

}
