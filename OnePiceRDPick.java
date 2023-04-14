import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OnePiceRDPick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\1.28\\one_pice.txt"));
        String[] character = new String[63];
        for (int i = 0; i < 63; i++) {
            character[i] = br.readLine();
        }
        int a = (int) (Math.random()*62)/1;
        StringBuilder sb = new StringBuilder();
        if (a < 27) {
            sb.append("초월 ");
        } else if (a < 38) {
            sb.append("불멸 ");
        } else if (a < 45) {
            sb.append("영원 ");
        } else {
            sb.append("제한 ");
        }
        sb.append(character[a]);
        System.out.println(sb);
    }
}
