package exception.ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            NetworkServiceV2_2 networkService = new NetworkServiceV2_2();

            while (true) {
                writer.write("전송할 문자: ");
                writer.flush();

                String input = reader.readLine();
                if (input.equals("exit")) {
                    break;
                }

                networkService.sendMessage(input);
                writer.write("\n");
                writer.flush();
            }

            writer.write("프로그램을 정상 종료합니다.");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
