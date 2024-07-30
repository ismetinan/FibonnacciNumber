import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    public int fib(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        if (n <= 0) return 0;
        if (n <= 2) return 1;
        int result = fib(n - 1) + fib(n - 2);
        cache.put(n, result);
        return result;
    }
}