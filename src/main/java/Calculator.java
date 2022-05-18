import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {

  public static void main(String[] args) {
    System.out.print("계산할 수를 입력하세요: ");
    Scanner in = new Scanner(System.in);
    String[] temp = in.nextLine().split(" ");

    int result = Integer.parseInt(temp[0]);
    for (int i=1; i<temp.length; i += 2) {
      String operator = temp[i];
      int second = Integer.parseInt(temp[i+1]);

      if (operator.equals("+")) {
        result = result + second;
      } else if (operator.equals("-")) {
        result = result - second;
      } else if (operator.equals("*")) {
        result = result * second;
      } else if (operator.equals("/")) {
        result = result / second;
      } else {
        System.out.println("사칙연산이 아닙니다.");
        exit(0);
      }
    }
    System.out.println("결과값: " + result);
  }
}
