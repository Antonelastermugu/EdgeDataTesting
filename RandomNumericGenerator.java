package EdgeData.EdgeDataTesting;


import java.util.Random;

public class RandomNumericGenerator {
	//This method creates numerical value with a defined number of characters to test the limit of a numerical field
		public static String generateBoundedNumericValue(int numberOfCharacters) {
			if (numberOfCharacters <= 0) {
				throw new IllegalArgumentException("Numbers of charachters must be greater than 0");
			}
			Random random = new Random();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < numberOfCharacters; i++) {
				sb.append(random.nextInt(10));
			}
			return sb.toString();
		}

		//This method creates overflow or underflow values on the datatype (int,double, float)
		public static String generateOverflowUnderflow(String type, String MinOrMax) {
			switch (type) {
			case "Integer":

				if (MinOrMax.equals("Min")) {
					// Integer underflow
					int minValue = Integer.MIN_VALUE;
					int underflowValue = minValue - 1;
					return String.valueOf(underflowValue);

				} else {
					// Integer overflow
					int maxValue = Integer.MAX_VALUE;
					int overflowValue = maxValue + 1;
					return String.valueOf(overflowValue);
				}

			case "Double":
				if (MinOrMax.equals("Max")) {
					double maxValue1 = Double.MAX_VALUE;
					double overflowValue1 = maxValue1 + 1;
					return String.valueOf(overflowValue1);
				} else {

					double minValue1 = Double.MIN_VALUE;
					double underflowValue1 = minValue1 - 1;
					return String.valueOf(underflowValue1);
				}

			case "Float":
				if (MinOrMax.equals("Max")) {
					float maxValue2 = Float.MAX_VALUE;
					float overflowValue2 = maxValue2 + 1;
					return String.valueOf(overflowValue2);
				} else {
					float minValue2 = Float.MIN_VALUE;
					float underflowValue2 = minValue2 - 1;
					return String.valueOf(underflowValue2);
				}
			default:
				return "Type of data is not selected";
			}
		}
		
		
}
