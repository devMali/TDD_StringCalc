package StrPack;
public class NegativeException {
    public static class NoNegativesAllowed extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public NoNegativesAllowed(String s) {
            super(s);
        }
    }

    public static void throwNegativeException(String negativeNum) {
        if (negativeNum != "") {
            throw new NoNegativesAllowed("Negatives Not Allowed. Numbers are: " + negativeNum);
        }
    }

}