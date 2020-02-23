import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//import java.sql.Date;
import java.util.List;

class TodoComponent {
    private static SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");

    // 現在のTODOリスト
    private static List<TODO> currentTODO = new ArrayList<>();

    public static void add(String name, String strDate) { //4,5,6の操作
        Date date = fmt.parse(strDate, new ParsePosition(0)); //文字列をデート型に変換
        currentTODO.add(new TODO(name, date));
        //              new ConstructorSample(str);
    }

    public static void check(String name) {
        // for 文で回してnameであるTODOをPrintする
        System.out.println(name);
    }

    public void remove(String name){

    }


    public static void print() {
        // 現在のTODOリストを表示する
        for (TODO TODO : currentTODO) {
            System.out.println(TODO.checked);
            System.out.println("#"+TODO.name+"/"+TODO.expireDate);
        }
        System.out.println("------");
    }

    public static void main(String[] args) {
        add("ライブ", "2020/02/22");
        add("くまさん", "2020/02/22");
        add("旅行", "2020/03/14");
    print();
    //-------------------------

        check("ハローくまさん");
    print();
    //-------------------------

        add("kickback", "2020/03/01");
    print();
    //--------------------------------
    }
}

