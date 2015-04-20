package lesson150420.patterns.command;

public class Example {
    
    abstract static class Command {
        protected Calculator _service;
        
        public Command(final Calculator service) {
            _service = service;
        }
        
        public abstract void execute();
    }

    static class Do2Command extends Command {

        public Do2Command(final Calculator service) {
            super(service);
        }

        @Override
        public void execute() {
            //_service.do2();
        } 
        
    }
    
    public static void main(String[] args) {
        Calculator service = new Calculator();

        System.out.println("Start!");

//        service.doSomething();
//        service.do2();
//        service.do3();
        
        System.out.println("End!");
    }
}
