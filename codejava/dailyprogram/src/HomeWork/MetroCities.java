//Program 38: MetroCities
package HomeWork;

public class MetroCities {

	public static void main(String[] args) {

		String[] cities = {"delhi", "chennai", "mumbai"};

		int n = 5;

		for (int i=0;i<cities.length ;i++) {

			String city = cities [i];

			if (city.length() > n) {

				System.out.println(city + " is a metro city"); 
			}

			else {

				System.out.println(city + " is a not metro city");
			}

		}

	}

}
