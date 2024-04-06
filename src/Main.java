import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long first_num;
        long second_num;
        String a;
        Scanner scanner = new Scanner(System.in);
        boolean b = false;
        while (!b){
            try{
                System.out.println("첫번째 숫자를 입력해주세요.");
                first_num = scanner.nextLong();

                System.out.println("두번째 숫자를 입력해주세요.");
                second_num = scanner.nextLong();

                System.out.println("연산자를 입력해주세요.");
                a = scanner.next();
                switch (a){
                    case "+":
                        System.out.println(first_num + second_num);
                        b = true;
                        break;

                    case "-":
                        System.out.println(first_num - second_num);
                        b = true;
                        break;

                    case "*":
                        System.out.println(first_num * second_num);
                        b = true;
                        break;

                    case "/":
                        if (second_num == 0) {
                            System.out.println("0으로 나눌 수 없습니다.\n");
                    }
                    else{

                        System.out.println(first_num / second_num);
                        b = true;
                    }
                        break;

                    default:
                        System.out.println("올바른 문자를 입력해주세요.");
                }

            } catch (Exception e) {
                System.out.println("올바른 문자를 입력해주세요\n");
                scanner.nextLine();

            }
        }

    }
}