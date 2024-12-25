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

            //for take input
               // Reading input
        int n = in.nextInt(); // Number of problems in the contest
        int k = in.nextInt(); // Number of minutes Limak needs to get to the party
        int timeRemaining=240-k;
        int totalTime=0;
        int i=0;
            while(i<=n && totalTime<=timeRemaining){
                i++;
                totalTime+=(5*i);
            }
            System.out.println((i-1)==0?'0':i-1);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}