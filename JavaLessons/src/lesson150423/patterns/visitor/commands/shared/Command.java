package lesson150423.patterns.visitor.commands.shared;

public abstract class Command {

    public static class Login extends Command {

        @Override
        public void accept(Processor processor) {
            processor.process(this);
        }
        
    }

    public static class Message extends Command {

        @Override
        public void accept(Processor processor) {
            processor.process(this);
        }
        
    }

    public static class Exit extends Command {
        @Override
        public void accept(Processor processor) {
            processor.process(this);
        }
        
    }
    
    public abstract void accept(final Processor processor);

//    public void accept(final Processor processor) {
//        processor.process();
//    }
}
