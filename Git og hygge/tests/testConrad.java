import conradPakke.*;
import conradPakke.ConradFactory;
import conradPakke.ConradV2;
import conradPakke.IConrad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class testConrad{
	IConrad conrad;
	@BeforeEach
	public void before(){
		conrad = ConradFactory.create();
	}

	@Test
	public void test1(){
		assertEquals(1.5, conrad.getPromille());
	}

}
