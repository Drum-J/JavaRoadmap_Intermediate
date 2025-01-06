package enumeration.test.http;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HttpStatusMain {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            writer.write("HTTP CODE: ");
            writer.flush();
            int httpCodeInput = Integer.parseInt(reader.readLine());

            HttpStatus status = HttpStatus.findByCode(httpCodeInput);
            if (status == null) {
                writer.write("정의되지 않은 코드");
            } else {
                writer.write(status.getCode() + " " + status.getMessage() + "\n");
                writer.write("isSuccess = " + status.isSuccess());
            }

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
