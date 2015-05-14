package lesson150423.patterns.visitor;

public class Aunt implements Relative{

    @Override
    public void accept(final VisitorInstruction visitor) {
        visitor.visit(this);
    }

}
