public class Report5 {
    public static void main(String[] args) {
        try {
            // 条件1: String型変数 str を宣言し、null を代入
            String str = null;

            // 条件2: str.length() の内容を表示しようとする
            System.out.println(str.length());  // NullPointerException が発生
        } catch (NullPointerException e) {
            // 条件2: NullPointerExceptionが発生したことを標準出力
            System.out.println("NullPointerException が発生しました。");

            // 条件3: 例外インスタンスを用いて、getMessage() を出力
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}