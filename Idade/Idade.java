// Guilherme A. Pinto, idade, OBI-2019

public class Idade {
    
    public static int idade(int M, int A, int B) {
			int C = M-A-B;
			
			int res = A;
			if ( res < C ) res = C;
			if ( res < B ) res = B;
			
			return res;
		}
		
}
