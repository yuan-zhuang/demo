package demo;

import org.junit.Test;

public class MyException {

    public static void main(String[] args){
        int num = show(2,1);
        System.out.println(num);
        try {
            test1("b");
        } catch (ExceptionTest exceptionTest) {
            exceptionTest.printStackTrace();
        }
    }

    public static int show(int a,int b){
        if(b==0){
            throw new ArithmeticException("除数不能为0!");
        }
        return a/b;
    }

    @Test
    public void display() throws NullPointerException{
        String str = null;
        if(str.equals("admin")){
            System.out.println("相等");
        }
    }

    @Test
    public static void test(){
        String str = null;
        try {
            if(str.equals("admin")){
                System.out.println("相等");
            }
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }finally{
            System.out.println("始终执行的代码");
        }
    }

    public static void test1(String s) throws ExceptionTest{
        String str = "a";
        if(str.equals(s)){
            throw new ExceptionTest("相等");
        }else{
            throw new ExceptionTest("不想等");
        }
    }
}
