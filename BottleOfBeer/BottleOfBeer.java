
public class BottleOfBeer {
	
	public static void main(String[] args) {
	
		int beer_num = 99;
		String word = "bottles";
		
		while (beer_num > 0) {
			
			if (beer_num == 1) {
				word = "bottle";
			}
			
			System.out.println(beer_num + " " + word + " on the wall.");

			System.out.println("Take One Beer !");

			beer_num = beer_num - 1;
			
			if (beer_num > 0)
				System.out.println("Pass it around !");
		}
		
		System.out.println("No beer on the wall !");
	}

}
