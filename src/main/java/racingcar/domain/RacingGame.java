package racingcar.domain;

import racingcar.view.OutputView;
import racingcar.utils.NumberGenerator;

import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final int attempts;
    private final NumberGenerator generator;

    public RacingGame(List<String> names, int attempts, NumberGenerator generator) {
        this.cars = new Cars(names);
        this.attempts = attempts;
        this.generator = generator;
    }

    public List<String> play() {
        for (int i = 0; i < attempts; i++) {
            cars.playRound(generator);
            OutputView.printRoundResult(cars.getCars());
        }
        List<String> winners = cars.findWinners();
        OutputView.printWinners(winners);
        return winners;
    }
}
