public class Encryption {
	public String solve(String text) {
		int length = text.length();
		int row = (int) Math.floor(Math.sqrt(length));
		int column = (int) Math.ceil(Math.sqrt(length));

		if (row * column < length)
			row = column;

		return printWords(text, length, column);
	}

	private String printWords(String text, int length, int column) {
		String result = "";

		for (int col = 0; col < column; col++) {
			for (int index = col; index < length; index += column) {
				result += String.valueOf(text.charAt(index));
			}
			result += " ";
		}
		return result;
	}

}
