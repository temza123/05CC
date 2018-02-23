/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public boolean isPrime(long number){
		double max = math.sqrt(number)+1;
		if (number == 2)
			return true;
		if (number %2 ==0)
			return false;
		for (long i=3;i<max;i+=2){
			if (number%i ==0){
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
		if(args.length<1||args.length>1){
		System.out.println("Please input a number as the program argrument");
		System.exit(0);
		}
	App appObj = new App();
	long input = Long.parseLong(args[0]);
	
	System.out.println(appObj.isPrime(input));
	}
}
