package lesson150420.patterns.command;

public class Calculator {

    int total = 0;

    abstract class Command {
        public void execute() {
            realExecute();
            System.out.println(total);
        }
        
        abstract void realExecute();
    }
    
    public class Plus extends Command {
        
        private int _value;

        public Plus(final int value) {
            _value = value;
        } 
        
        @Override
        void realExecute() {
            total += _value;
        }
    }
    
    public class Minus extends Plus {
        public Minus(final int value) {
           super(-value);
        }
    }

    public class Clear extends Command {
        @Override
        void realExecute() {
            total = 0;
        }
    }

    public class Get extends Command {
        @Override
        void realExecute() {
            //total = 0;
        }
    }

    
}
