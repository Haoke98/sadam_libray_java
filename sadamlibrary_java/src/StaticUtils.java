public class StaticUtils {
    public static void myLog(String log_message){
        Throwable throwable = new Throwable();
        System.out.println(getCodeInfo(throwable)+":"+log_message);
    }

    public static String getCodeInfo(Throwable throwable){
        return throwable.getStackTrace()[1].toString()+":";
    }
}
