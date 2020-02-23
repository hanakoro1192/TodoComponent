import java.util.Date;

class TODO{
    boolean checked;
    String name;
    Date expireDate;
    

    // public List<TODO> search(String keywords){ //メソッドとは、いくつかの処理をひとまとめにしたものです。
    //     return list;
    // }
    //public ConstructorSample(String str) 
    // TODO(name, date)
        public TODO(String name, Date expireDate){ //コンストラクタ
            this.name = name;
            this.expireDate = expireDate;
            this.checked = false;
        }

        // public ConstructorSample(String str) throws NullPointerException{
        //     this.str = str;
        //     System.out.println(this.str.length());
        // }



    public void checked(){ //メソッド

    }

    public void remove(){ //メソッド

    }
}
