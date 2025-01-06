package enumeration.test.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static enumeration.test.ex1.AuthGrade.*;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            writer.write("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
            writer.flush();

            String input = reader.readLine();

            AuthGrade grade = valueOf(input.toUpperCase());
            String menu = printMenu(grade);
            writer.write(menu);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String printMenu(AuthGrade grade) {
        StringBuilder sb = new StringBuilder();
        sb.append("당신의 등급은 ").append(grade.getDescription()).append("입니다.\n");
        sb.append("==메뉴 목록==\n");
        sb.append("- 메인 화면");
        if (grade.getLevel() > 1) { //LOGIN
            sb.append("\n- 이메일 관리 화면");
        }
        if (grade.getLevel() > 2) { //ADMIN
            sb.append("\n- 관리자 화면");
        }

        return sb.toString();
    }
}
