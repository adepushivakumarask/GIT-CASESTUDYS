package casestudy;

public class StringCompression {

	public static void main(String[] args) {
		String input = "aaabbccccddd";
        String compressed = compress(input);
        System.out.println("Compressed string: " + compressed);
    }

    static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) != str.charAt(i - 1)) {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            } else {
                count++;
            }
        }

        return compressed.toString();

	}

}
