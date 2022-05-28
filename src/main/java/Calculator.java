import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {

  static String[] input() {
    System.out.print("계산할 수를 입력하세요: ");
    Scanner in = new Scanner(System.in);
    return in.nextLine().split(" ");
  }
  static int calculate(int first, String operator, int second) {
    int result = 0;
    if (operator.equals("+")) {
      result = first + second;
    } else if (operator.equals("-")) {
      result = first - second;
    } else if (operator.equals("*")) {
      result = first * second;
    } else if (operator.equals("/")) {
      result = first / second;
    } else {
      System.out.println("사칙연산이 아닙니다.");
      exit(0);
    }
    return result;
  }

  static void print(int result) {
    System.out.println("결과값: " + result);
  }

  public static void main(String[] args) {
    String[] temp = input();

    int result = Integer.parseInt(temp[0]);
    for (int i=1; i<temp.length; i += 2) {
      String operator = temp[i];
      int second = Integer.parseInt(temp[i+1]);
      result = calculate(result, operator, second);
    }

    print(result);
  }
}
