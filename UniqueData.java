package EdgeData.EdgeDataTesting;

public class UniqueData {
		//This method creates values like empty, null, " "
	public static String generateNullEmptyValues(String type) {
		if (type.equals("Empty")) {
			String emptyString = "";
			return emptyString;
		} else if (type.equals("Null")) {
			String nullString = null;
			return nullString;
		} else {
			String SpaceString = " ";
			return SpaceString;
		}

	}
}
