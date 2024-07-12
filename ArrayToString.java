public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {
                "Hello ",
                "Guyes....! ",
                "How ",
                "are ",
                "you." };
        StringBuilder sb = new StringBuilder();
        for (String arr2 : arr) {
            sb.append(arr2).append(" ");

        }
        System.out.println(sb);

    }
}
