package uriIniciante1531;

public final class FiboAgain {
			
	public static final int fib( final int value ) {
	    if( value == 1  || value == 2 ) {
	    	return 1;
	    } 
		return fib( value - 1) +  fib( value - 2);  
	}
	
	public static void main( String args[] ) {
		System.out.println( "Fibo(1) " +  Math.ceil(FiboAgain.fib(1) % 100));
		System.out.println( "Fibo(2) " +  Math.ceil(FiboAgain.fib(2) % 100));
		System.out.println( "Fibo(3) " +  Math.ceil(FiboAgain.fib(3) % 100));
		System.out.println( "Fibo(4) " +  Math.ceil(FiboAgain.fib(4) % 100));
		System.out.println( "Fibo(5) " +  Math.ceil(FiboAgain.fib(5) % 2));
		System.out.println( "Fibo(6) " + FiboAgain.fib(6) % 100);
		System.out.println( "Fibo(7) " +  Math.ceil(FiboAgain.fib(7) % 100));
		System.out.println( "Fibo(8) " +  Math.ceil(FiboAgain.fib(8) % 100));
		System.out.println( "Fibo(9) " +  Math.round(FiboAgain.fib(9) % 100));
		System.out.println( "Fibo(10) " +  Math.floor(FiboAgain.fib(10) % 100));	
	}

}
