package lesson150423.patterns.visitor;

public class NewYear implements VisitorInstruction {

    @Override
    public void visit(GrandMa person) {
        System.out.println("Happy New Year, GrandMa!");
    }

    @Override
    public void visit(GrandPa person) {
        System.out.println("Happy New Year, GrandPa!");
    }

    @Override
    public void visit(Uncle person) {
        System.out.println("Happy New Year, Uncle!");
    }

    @Override
    public void visit(Aunt person) {
        System.out.println("Happy New Year, Aunt!");
    }

}
