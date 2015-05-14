package lesson150514.jmock;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class PetServiceTest {
    @Rule public JUnitRuleMockery context = new JUnitRuleMockery();
    
    @Test
    public void test() {
        final Pet pet = context.mock(Pet.class);
        final Sequence petCareSequence = context.sequence("petcare");
        
        context.checking(new Expectations() {
            {
                oneOf(pet).feed(); inSequence(petCareSequence);
                oneOf(pet).sroke(); inSequence(petCareSequence);
                oneOf(pet).wash(); inSequence(petCareSequence);
                oneOf(pet).walk(); inSequence(petCareSequence);
            }
        });

        PetService service = new PetService();
        service.serve(pet);
    }
}
