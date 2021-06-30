import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 큐_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int begin = 0;
        int end = 0;
        int queue[] = new int[n];
        while (n-- > 0){
            String str = br.readLine();
            if (str.startsWith("push")){
                String[] s = str.split(" ");
                int num = Integer.parseInt(s[1]);
                queue[end++] = num;
            }else if (str.equals("pop")){
                if (begin == end){
                    System.out.println("-1");
                }else {
                    System.out.println(queue[begin]);
                    begin+=1;
                }
            }else if (str.equals("size")){
                System.out.println(end-begin);
            }else if (str.equals("front")){
                if (begin==end){
                    System.out.println("-1");
                }else {
                    System.out.println(queue[begin]);
                }
            }else if (str.equals("back")){
                if (begin==end){
                    System.out.println("-1");
                }else {
                    System.out.println(queue[end-1]);
                }
            }else if (str.equals("empty")){
                if (begin ==end){
                    System.out.println("-1");
                }else {
                    System.out.println("0");
                }
            }
        }
    }
}
