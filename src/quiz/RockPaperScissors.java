package quiz;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //사용자 입력 받기
        Random random = new Random(); //난수 생성기
        boolean playAgain = true; //게임 반복 여부

        while (playAgain) { //게임을 계속 할지말지 결정하는 반복문
        	int gameCount = 0; //반복실행문장 //게임횟수
        	int userWins = 0; //사용자의 승리 횟수
            int computerWins = 0; //컴퓨터의 승리 횟수

        while (gameCount < 5) { //5번 게임 반복 
            int userChoice = -1;//사용자 입력 받기

               
        while (true) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요: ");
            if (scanner.hasNextInt()) {
            	  userChoice = scanner.nextInt();
            if (userChoice >= 1 && userChoice <= 3) {
                  break; //올바른 입력이면 반복문 탈출
              }
           } else {
                scanner.next(); //잘못된 입력(문자 등) 방지
           }
        System.out.println("잘못된 입력입니다. 1~3 중 하나를 입력하세요.");
           }

           //컴퓨터 난수 생성
           //3이면 0에서 2까지, +1을해서 3이 될 수 있다
           int computerChoice = random.nextInt(3) + 1;

           //가위바위보 결과 판결
        System.out.println("사용자: " + convertChoice(userChoice) 
                + " | 컴퓨터: " + convertChoice(computerChoice));

                if (userChoice == computerChoice) {
                    System.out.println("결과: 비겼습니다!");
                } else if ((userChoice == 1 && computerChoice == 3) || 
                           (userChoice == 2 && computerChoice == 1) || 
                           (userChoice == 3 && computerChoice == 2)) {
                    System.out.println("🎉 사용자가 이겼습니다!");
                    userWins++;
                } else {
                    System.out.println("😞 컴퓨터가 이겼습니다.");
                    computerWins++;
                }

                gameCount++; // 게임 횟수 증가
                System.out.println("현재 스코어: 사용자 " + userWins + "승 - 컴퓨터 " + computerWins + "승\n");
            }

            // 🌟 4. 5번의 게임이 끝난 후 결과 출력
            System.out.println("📢 최종 결과: 사용자 " + userWins + "승 - 컴퓨터 " + computerWins + "승");
            if (userWins > computerWins) {
                System.out.println("🎉 축하합니다! 최종 승리!");
            } else if (userWins < computerWins) {
                System.out.println("😞 아쉽네요! 컴퓨터가 이겼습니다.");
            } else {
                System.out.println("🤝 무승부입니다.");
            }

            // 🌟 5. 재시작 여부 물어보기
            while (true) {
                System.out.print("게임을 다시 하시겠습니까? (1: 재시작, 0: 종료): ");
                if (scanner.hasNextInt()) {
                    int restartChoice = scanner.nextInt();
                    if (restartChoice == 1) {
                        System.out.println("🔄 게임을 다시 시작합니다!\n");
                        break;
                    } else if (restartChoice == 0) {
                        System.out.println("🎮 게임을 종료합니다. 감사합니다!");
                        playAgain = false;
                        break;
                    }
                } else {
                    scanner.next(); // 잘못된 입력(문자 등) 방지
                }
                System.out.println("잘못된 입력입니다. 0 또는 1을 입력하세요.");
            }
        }

        scanner.close(); // 스캐너 종료
    }

    // ✨ 선택한 숫자를 "가위", "바위", "보"로 변환하는 메서드
    public static String convertChoice(int choice) {
        return switch (choice) {
            case 1 -> "가위 ✌️";
            case 2 -> "바위 ✊";
            case 3 -> "보 🖐";
            default -> "알 수 없음";
        };
    }
}