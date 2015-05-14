package lesson150430.annotations;

import java.lang.reflect.Method;

public class UseMeta {

    public static void main(String[] args) {
        Class clazz = Meta.class;
        Method m;
        try {
            m = clazz.getMethod("method1");

            MyAnno an = m.getAnnotation(MyAnno.class);

            System.out.println("Str = "  + an.str());
            System.out.println("Val = " + an.val());
        } catch (NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
