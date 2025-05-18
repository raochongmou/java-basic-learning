public class CharAtDemo001 {
    public static void main(String[] args) {
        String idCard = "42028119990922502y";

        char endChar = idCard.charAt(idCard.length() - 1);
        if(!((endChar >= '0' && endChar <= '9') || endChar == 'x' || endChar == 'X')) {
            System.out.println("endChar" + endChar);
        }
    }
}
