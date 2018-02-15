import conradPakke.Conrad;
import conradPakke.ConradFactory;
import conradPakke.ConradV2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class testConrad{
	Conrad conrad;
	@BeforeEach
	public void before(){
		conrad = ConradFactory.create();
	}

	@Test
	public void test1(){
		assert(conrad.isDrinksBeer());
		assertEquals(1.5, conrad.getPromille());
	}

	@Test
	public void test2(){
		conrad = new ConradV2();
	}
}
