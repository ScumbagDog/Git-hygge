package conradPakke;

public class ConradFactory{
	public static IConrad create(){
		return new ConradV2();
	}
}
