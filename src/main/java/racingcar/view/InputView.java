package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    public static List<String> readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        return parseCarNames(input);
    }

    public static int readAttempCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        return parseAttemptCount(input);
    }

    public static List<String> parseCarNames(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("자동차 이름을 입력해야 합니다.");
        }
        List<String> names = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
        for (String name : names) {
            if (name.isEmpty() || name.length() > 5) {
                throw new IllegalArgumentException("이름은 1자 이상 5자 이하만 가능합니다.");
            }
        }
        return names;
    }

    public static int parseAttemptCount(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("시도 횟수를 입력해야 합니다.");
        }
        try {
            int count = Integer.parseInt(input.trim());
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}
