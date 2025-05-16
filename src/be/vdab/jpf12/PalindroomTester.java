package be.vdab.jpf12;

public class PalindroomTester {
    private final StringBuilder text, reverseText;

    public PalindroomTester(String input) {
        text = new StringBuilder(input);
        reverseText = new StringBuilder(input).reverse();
    }

    public String getText() {
        return text.toString();
    }

    public String getReverseText() {
        return reverseText.toString();
    }

//    public boolean isPalindroom() {
//        return text.toString().equals(reverseText.toString());
//    }
    public boolean isPalindroom(boolean hoofdlettergevoelig) {
        if (!hoofdlettergevoelig) {
            return text.toString().equals(reverseText.toString());
        } else {
            var ot = text.toString().toLowerCase();
            var rt = reverseText.toString().toLowerCase();
            return ot.equals(rt);
        }
    }
}
