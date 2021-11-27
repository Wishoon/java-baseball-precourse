package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class BaseballNumsGenerator {
    public static BaseballNums generateRandomBaseballNums() {
        Set<Integer> randomBaseballNums = new HashSet<>();
        while (randomBaseballNums.size() != BaseballNums.BASEBALL_NUMBERS_LENGTH) {
            randomBaseballNums.add(Randoms.pickNumberInRange(
                    BaseballNums.MIN_BASEBALL_NUMBER,
                    BaseballNums.MAX_BASEBALL_NUMBER));
        }
        return new BaseballNums(new ArrayList<>(randomBaseballNums));
    }
}