import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeNumberMethodTest {

    @Test
    public void testIsPrime() {
        // Test cases for the isPrime() method

        // Test prime numbers
        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(3));
        assertTrue(PrimeNumberMethod.isPrime(5));
        assertTrue(PrimeNumberMethod.isPrime(7));
        assertTrue(PrimeNumberMethod.isPrime(11));

        // Test non-prime numbers
        assertFalse(PrimeNumberMethod.isPrime(1));
        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(6));
        assertFalse(PrimeNumberMethod.isPrime(8));
        assertFalse(PrimeNumberMethod.isPrime(9));
    }
}

