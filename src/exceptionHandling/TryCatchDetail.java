package exceptionHandling;

public class TryCatchDetail {
    public static void main(String[] args) {
        try{
            String str="小猪";
            int a = Integer.parseInt(str);
            System.out.println("数字："+a);
        }catch(NumberFormatException e){
            System.out.println("异常信息："+e.getMessage());
        }finally {
            System.out.println("代码会被执行");
        }
        System.out.println("程序继续");
    }


}
