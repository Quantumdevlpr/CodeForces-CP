//1997 Even positions


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Day6 {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(FastReader sc) {
        int n = sc.nextInt();
        String s = sc.next();
        List<Long> l_blocks = new ArrayList<>(); 
        List<Long> r_blocks = new ArrayList<>(); 
        for (int i = 0; i < n / 2; i++) {
            long block_index = i + 1;
            char even_char = s.charAt(2 * i + 1);

            if (even_char == '(') {
                l_blocks.add(block_index);
            } else {
                r_blocks.add(block_index);
            }
        }
        long num_double_open = l_blocks.size();
        long num_simple_pairs = r_blocks.size() - num_double_open;
        long cost = num_simple_pairs;
        long l_sum = 0;
        for (long val : l_blocks) {
            l_sum += val;
        }

        long r_sum = 0;
        for (int i = 0; i < num_double_open; i++) {
            r_sum += r_blocks.get(i);
        }
        if (num_double_open > 0) {
            cost += 4 * (r_sum - l_sum);
        }

        System.out.println(cost);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
