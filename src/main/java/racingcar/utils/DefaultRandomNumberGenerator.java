package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class DefaultRandomNumberGenerator implements NumberGenerator {
    @Override
    public int generate() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
