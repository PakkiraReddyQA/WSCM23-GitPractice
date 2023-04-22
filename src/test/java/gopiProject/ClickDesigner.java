package gopiProject;

import org.testng.annotations.Test;

public class ClickDesigner extends Base_Class{
	@Test
	public void clickDesignerTest()
	{
		BackPackElements bp=new BackPackElements(driver);
		bp.designerClick();
	}

}
