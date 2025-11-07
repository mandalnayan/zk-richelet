package controller;

import org.zkoss.zk.ui.GenericRichlet;
import org.zkoss.zk.ui.Page;
import org.zkoss.zul.Hbox;
import org.zkoss.zul.Include;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Vbox;
import org.zkoss.zul.Window;

public class TestRichlet extends GenericRichlet {

	@Override
	public void service(Page page) throws Exception {
		page.setTitle("Richelet Example");
		
		Window w = new Window("Richelet Test-1 Page", "normal", false);
		Hbox hbox = new Hbox();
		hbox.setWidth("100%");
		hbox.setHeight("90%");
		hbox.setPack("center");
		hbox.setAlign("center");
		
		Vbox vbox = new Vbox();
		vbox.setPack("center");
		Label title = new Label("Hii, Please complete your login process!!");
		vbox.appendChild(title);
		
		vbox.setParent(hbox);
		Textbox userName = new Textbox();
		Textbox password = new Textbox();
		userName.setParent(hbox);
		password.setParent(hbox);
		
//		Include zul pages
		Include ic = new Include("index.zul");
		ic.setParent(w);
		
//		Include another richlet
		Include ricIc = new Include("zk/product");
		ricIc.setMode("defer");
		ricIc.setParent(w);
		
//		Include another richlet
		Include ricIc2 = new Include("zk/imp-product");
		ricIc2.setMode("defer");
		ricIc2.setParent(w);
		
		w.setPage(page);	
	}

	
}
