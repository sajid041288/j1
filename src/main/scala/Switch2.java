public class Switch2 {
    public static void main(String[] args) {
        int day =1;

        String daytype = switch (day) {
            case 1, 2, 3, 4, 5 -> "weekdays";
            case 6, 7 -> "weekend";
            default -> "invalid";
        };
        System.out.println(daytype);
    }
}