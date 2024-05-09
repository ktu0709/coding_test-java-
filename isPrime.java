/*
소수 판별 함수
*/

private static boolean isPrime(int n){
		for(int i = 2;i<=(int)Math.sqrt(n);i++){
			if(n % i == 0) return false;
		}
		return true;
	}
