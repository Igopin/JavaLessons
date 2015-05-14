package lesson150428.reflection;

public class ClassExample {

    public static void main(String[] args) {
        A a = new A();
        
        Class class1 = A.class;
        Class class2 = a.getClass();
        
        inspect(a);
        inspect("hello");
    }

    private static void inspect(final Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
        
        for (Class cl : clazz.getInterfaces()) {
            System.out.println(cl);
        }

        for (Class cl : clazz.getDeclaredClasses()) { // getClass
            System.out.println(cl);
        }
        System.out.println("------------------------------------------------------");
        
        try {
            Object someObj = clazz.newInstance();
            System.out.println("New obj class is " + someObj.getClass().getName());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        System.out.println();
    }
}
