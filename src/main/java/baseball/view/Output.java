package baseball.view;

import baseball.model.Settings;

public class Output {

    public static void StartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void RequestInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void CompleteMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void HintMessage() {
        if (Settings.strike == 0 && Settings.ball == 0) {
            System.out.println("낫싱");
        } else if (Settings.strike != 0 && Settings.ball != 0) {
            System.out.println(Settings.ball + "볼 " + Settings.strike + "스트라이크");
        } else if (Settings.strike != 0) {
            System.out.println(Settings.strike + "스트라이크");
        } else if (Settings.ball != 0) {
            System.out.println(Settings.ball + "볼");
        }
    }
}
