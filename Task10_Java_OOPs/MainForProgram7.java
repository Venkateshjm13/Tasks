package task10_programs;

public class MainForProgram7 {

	public static void main(String[] args) {
		Tea1[] teas = new Tea1[4];
		
		teas[0]=new Tea1();
		teas[1]=new BlackTea();
		teas[2]=new GreenTea();
		teas[3]=new HerbalTea();
		
		//Loop through using for each loop
		for(Tea1 tea:teas)
		{
			tea.prepareTea();
		}
	}
}
