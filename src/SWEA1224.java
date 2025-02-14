//import java.util.Scanner;
//import java.util.Stack;
//
//// 계산기3
//public class SWEA1224 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<Character> stack = new Stack<>();
//        StringBuilder sb = new StringBuilder();
//
//        for (int t = 0; t < 1; t++) {
//            int n = Integer.parseInt(sc.nextLine());
//            char[] input = sc.nextLine().toCharArray();
//
//
//            // 후위연산자 변환
//            for (int i = 0; i < input.length; i++) {
//
//                if (input[i] >= '0' && input[i] <= '9') {
//                    sb.append(input[i]);
//                } else if (input[i] == '(') {
//                    stack.push(input[i]);
//                } else if (input[i] == ')') {
//                    while (stack.peek() == '(') {
//                        sb.append(stack.pop());
//                    }
//                } else if (input[i] == '*') {
//                    stack.push(input[i]);
//                } else if (input[i] == '+') {
//                    if (stack.peek() == '*') {
//                        sb.append(stack.pop());
//                    }
//                    stack.push(input[i]);
//                }
//
//            }
//
//            // 후위연산자 계산
//            for (int i = 0; i < sb.length(); i++) {
//                if (sb.charAt(i) == '+') {
//                    int b = stack.pop();
//                    int a = stack.pop();
//                    stack.push((char) (a + b)));
//                } else if (sb.charAt(i) == '*') {
//                    int b = stack.pop();
//                    int a = stack.pop();
//                    stack.push((char) (a * b));
//                } else {
//                    stack.push(sb.charAt(i));
//                }
//            }
//
//
//
//            // 출력
//            System.out.printf("#%d %d\n", t + 1, sb);
//            sb.setLength(0);
//        }
//
//
//    }
//}
