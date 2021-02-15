public class MC {
    public static void main(String[] args) {
        // Выполнение задания 1:
        Primes.findTill(100).forEach(pr -> System.out.print(pr + " "));
        System.out.println();
        // Выполнение задания 2:
        System.out.println(Palindrome.isPalindrome("Live on time, emit no evil.")); // true
        System.out.println(Palindrome.isPalindrome("Roses are red violets are blue.")); // false
    }
}
