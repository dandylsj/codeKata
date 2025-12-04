import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1.x 좌표값 y좌표값 
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        
        
        //2.x 값이 - 면 2,3 사분면 x값이 +면 1,4 사분면
       if (x > 0) {
            if (y > 0) {
                System.out.println(1); //x값이 + , y값이 +
            } else {
                System.out.println(4); //x값이 + , y값이 -
            }
        } else {
            if (y > 0) {
                System.out.println(2); //x값이 - , y값이 +
            } else {
                System.out.println(3); //x값이 - , y값이 -
            }
        }
    }
}