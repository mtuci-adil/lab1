import java.util.ArrayList;

/**
 * Implementation of the modified 'Sieve of Eratosthenes' algorithm.
 *
 * The modification comes from the fact that we have
 * no intention of setting the upper search boundary too large.
 *
 * @author Adil Haidar
 */
public class Primes {
    /**
     * Returns a list of primes in a selected range.
     *
     * @param bound the upper bound of the range where looking for primes.
     * @return {@code ArrayList} of prime numbers between 2 and the bound.
     */
    static ArrayList<Integer> findTill(int bound) {
        var ps = new ArrayList<Integer>(); // найденные простые числа
        int[] dv = new int[bound + 1]; // массив наименьших простых делителей чисел-индексов
        for (int i = 2; i <= bound; i++) {
            // случай, если делителей, кроме 1 и самого себя, у числа i нет (число простое)
            if (dv[i] == 0) {
                dv[i] = i;
                ps.add(i);
            }
            int cm; // составное число
            for (int j = 0; j < ps.size() && ps.get(j) <= dv[i] && (cm = i * ps.get(j)) <= bound; j++)
                dv[cm] = ps.get(j);
        }
        return ps;
    }
}
