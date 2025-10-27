package racingcar.view;

import racingcar.domain.Car;
import java.util.List;
import java.util.StringJoiner;

public class OutputView {
    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String name : winners) {
            joiner.add(name);
        }
        System.out.println("최종 우승자 : " + joiner);
    }
}
