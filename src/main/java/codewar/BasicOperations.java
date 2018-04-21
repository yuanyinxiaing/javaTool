package codewar;

/**
 * Created by yinxia.yyx on 18/4/21.
 */
public class BasicOperations
{
    public static Integer basicMath(String op, int v1, int v2)
    {

        switch (op){
            case "+":return v1+v2;
            case "-":return v1-v2;
            case "*":return v1*v2;
            case "/":return v1/v2;
        }
        return 0;
    }
}