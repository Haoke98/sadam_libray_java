public class MyObject extends Object{
     public static void main(String[] args){

//          test.main(null);
     }
     public static void myLog(String log_message){
          System.out.println(StaticUtils.getCodeInfo(new Throwable())+log_message);
     }
}
