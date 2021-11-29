package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BaseballNumsGenerator {
	private static final int ZERO_CHAR = '0';

	private static final String INPUT_VALID_BETWEEN_ONE_AND_NINE_ERROR_MESSAGE = "1에서 9사이의 숫자가 아닙니다.";

	public static BaseballNums generateRandomBaseballNums() {
		Set<Integer> randomBaseballNums = new LinkedHashSet<>();
		while (randomBaseballNums.size() != BaseballNums.BASEBALL_NUMBERS_LENGTH) {
			randomBaseballNums.add(Randoms.pickNumberInRange(
				BaseballNums.MIN_BASEBALL_NUMBER,
				BaseballNums.MAX_BASEBALL_NUMBER));
		}
		return new BaseballNums(new ArrayList<>(randomBaseballNums));
	}

	public static BaseballNums generateInputBaseballNums(String inputNum) {
		List<Integer> inputBaseBallNums = new ArrayList<>();
		for (int i = 0; i < inputNum.length(); i++) {
			isValidateRangeNumOneToNine(inputNum.charAt(i) - ZERO_CHAR);
			inputBaseBallNums.add(inputNum.charAt(i) - ZERO_CHAR);
		}
		return new BaseballNums(inputBaseBallNums);
	}

	private static void isValidateRangeNumOneToNine(int number) {
		if (BaseballNums.MIN_BASEBALL_NUMBER > number || number > BaseballNums.MAX_BASEBALL_NUMBER) {
			throw new IllegalArgumentException(INPUT_VALID_BETWEEN_ONE_AND_NINE_ERROR_MESSAGE);
		}
	}
}