package exception.ex4;

import exception.ex4.exception.SendExceptionV2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainV4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            NetworkServiceV4 networkService = new NetworkServiceV4();

            while (true) {
                writer.write("전송할 문자: ");
                writer.flush();

                String input = reader.readLine();
                if (input.equals("exit")) {
                    break;
                }

                try {
                    networkService.sendMessage(input);
                } catch (Exception e) {
                    exceptionHandler(e);
                }


                writer.write("\n");
                writer.flush();
            }

            writer.write("프로그램을 정상 종료합니다.");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("== 개발자용 디버깅 메시지 ==");
        e.printStackTrace(System.out); // 스택 트레이스 출력
        //e.printStackTrace(); //System.err에 스택 트레이스 출력, 일반적으로 이걸 사용하면 된다.

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV2 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
