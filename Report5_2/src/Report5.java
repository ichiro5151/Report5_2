public class Report5 {
    public static void main(String[] args) {
        // 条件1: String型の変数strに文字列"壱百満"を代入
        String str = "壱百満";

        // 条件2: Integer.parseInt(String s)を用いてint型変数valueに代入
        try {
            int value = Integer.parseInt(str); // ここで例外が発生する
            System.out.println("変換結果: " + value);
        } catch (NumberFormatException e) {
            // 例外が発生した場合の処理
            System.out.println("NumberFormatException が発生しました。");
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}
