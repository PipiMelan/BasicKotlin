public class JavaTest {
    public String getName() {
        return null;
        //return "jack";
    }

    public static void main(String[] args) {
//        KotlinClass kc = new KotlinClass("jack");
//        kc.show();

        // Anonymous object 匿名对象
        //loadData(new HttpReqImpl());

//        loadData(new HttpReq() {
//            @Override
//            public void onSuccess() {
//                System.out.println("Loaded Successfully");
//            }
//        });
//
//    }
        // The use of lambda
    loadData(() -> System.out.println("Loaded Successfully"));

}
    public static void loadData (HttpReq req){
        req.onSuccess();
    }

    interface HttpReq{
        void onSuccess();
    }

//    static class HttpReqImpl implements HttpReq{
//        @Override
//        public void onSuccess() {
//            System.out.println("Loaded Successfully");
//        }
//    }
}

class Test{
    private String name;
    Test(String name){
        this.name = name;
    }

}