package controller;

import org.zkoss.zk.ui.GenericRichlet;
import org.zkoss.zk.ui.Page;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class Test2Richlet extends GenericRichlet{
	
	@Override
	public void service(Page page) throws Exception {
		page.setTitle("Richelet Example");
		
		Window w = new Window("Richelet Test-2 Page", "normal", false);
		
		Hbox hbox = new Hbox();
		hbox.setPack("center");
		hbox.setAlign("center");
		
		
		
		Label label = new Label("Hii, Welcome to to Product page of Richlet!!");
		label.setParent(w);
		
		w.setPage(page);	
	}
}
