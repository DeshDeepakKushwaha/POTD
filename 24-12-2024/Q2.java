import java.io.*;
import java.util.*;

public class Q2 {
 
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        char nextChar() {
            return next().charAt(0);
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out=new FastWriter();

            //write your code here
            

            //for take input\
            int n=in.nextInt();
            //for string
            String s=in.next();

            

            Set<Character> uniqueLetters = new HashSet<>();
            for (char c : s.toCharArray()) {
                uniqueLetters.add(Character.toLowerCase(c)); // Convert to lowercase
            }

            // Check if pangram3
            if (uniqueLetters.size() == 26) {
                out.println("YES");
            } else {
                out.println("NO");
            }


            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}