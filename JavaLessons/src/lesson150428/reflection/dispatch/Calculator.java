package lesson150428.reflection.dispatch;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    
    public void process( final Command command ) {
        switch (command.getID()) {
        case Command.NONE:
            break;
        case Command.PLUS:
            doPlus();
            break;
        case Command.GET:
            doGet();
            break;
        case Command.CLEAR:
            doClear();
            break;
        case Command.MINUS:
            doMinus();
            break;
        }
    }

    public void execute(final Command command) {
//        if (command instanceof Command.Plus) {
//            doPlus();
//        }

//        if (command.getClass() == Command.Plus.class) {
//            doPlus();
//        }

        Class<?> clazz = command.getClass();
        String commandProcessorMethodName = "do" + clazz.getSimpleName();
        
        for (Method method : this.getClass().getDeclaredMethods()) {
            if (method.getName().equals(commandProcessorMethodName)) {
                try {
                    method.invoke(this);
                } catch (IllegalAccessException | IllegalArgumentException
                        | InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    private void doMinus() {
        // TODO Auto-generated method stub
        
    }

    private void doClear() {
        // TODO Auto-generated method stub
        
    }

    private void doGet() {
        // TODO Auto-generated method stub
        
    }

    private void doPlus() {
        System.out.println("PLUS BITCH!");
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.execute(new Command.Plus());
    }

}
