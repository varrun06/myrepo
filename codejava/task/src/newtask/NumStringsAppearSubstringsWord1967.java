package newtask;

public class NumStringsAppearSubstringsWord1967 {

    public static void main(String[] args) {

        String[] s1 = {"a", "abc", "bc", "d"};

        String word = "abc";
        char[] check = word.toCharArray();

        int ans = 0;

        for (int i = 0; i < s1.length; i++) {
            char[] arr = s1[i].toCharArray();
            int count = 0;

            for (int j = 0; j < check.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == check[j]) {
                        count++;
                      
                    }
                }
            }

            if (count > 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
