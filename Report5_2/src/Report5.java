public class Report5 {
    public static void main(String[] args) {
        // 条件1: String型変数 str を宣言し、null を代入
        String str = null;

        // 条件2: str.length() の内容を表示しようとする
        System.out.println(str.length());  // ここで NullPointerException が発生
    }
}