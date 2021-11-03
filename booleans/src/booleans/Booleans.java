package booleans;

public class Booleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 23;
		int z = 10;
		
		// . , == .= ,= !=
		boolean compare = x  > y || z < y;   // if either condition is true
		boolean compare2 = !(z < y && y > z) || (z + 2 < 5 || x + 7 > y);
		
		
		System.out.println(compare);
		System.out.println(compare2);

	}

}
