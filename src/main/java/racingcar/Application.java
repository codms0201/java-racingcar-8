package racingcar;

import racingcar.domain.RacingGame;
import racingcar.utils.DefaultRandomNumberGenerator;
import racingcar.utils.NumberGenerator;
import racingcar.view.InputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
       try {
           List<String> names = InputView.readCarNames();
           int attempts = InputView.readAttempCount();
           NumberGenerator generator = new DefaultRandomNumberGenerator();
           RacingGame game = new RacingGame(names, attempts, generator);
           game.play();
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
           throw e;
       }
    }
}
