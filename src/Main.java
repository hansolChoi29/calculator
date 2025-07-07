import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력해 주세요.");
        int first_number = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력해 주세요.");
        int second_number = scanner.nextInt();

//Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙 연산 기호를 입력하세요.");
        char giho = sc.nextLine().charAt(0);
        double result = 0;
        boolean error = false;

        switch (giho) {
            case '+':
                result = first_number + second_number;
                break;
            case '-':
                result = first_number - second_number;
                break;
            case '/':
                if(second_number==0){
                    System.out.println("나눗셈 연산에서 부모에 0이 입력될 수 없습니다.");
                    error=true;
                }else{
                    result=(double) first_number/second_number;
                }
                break;
            default:
                System.out.println("지원하지 않는 연산 기호입니다.");
                error =true;
        }

        //입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력합니다.
        System.out.println("결과"+result);

        //반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정합니다.


    }
}