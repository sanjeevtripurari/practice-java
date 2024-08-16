public class primenumber{
	public static void main(String[] args){
		boolean isPrime=true;

		for (int i=0; i<100;i++){
			if (i==2){
				isPrime=true;
				System.out.println(i+" is primenumer");
				continue;
			}else if (i<2 || i%2==0){
				isPrime=false;
				System.out.println(i+" is not primenumer");
				continue;
			} 

			isPrime=true;

			for (int j=3; i>2 && j<i; j+=2){
				if (i%j==0){
					System.out.println(i+" is not primenumer");
					isPrime=false;
					break;
				}
			}
			if (isPrime){

				System.out.println(i+" is primenumer");
				continue;
			}
		}

	}
}
