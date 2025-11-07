package controller;

import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.Richlet;
import org.zkoss.zk.ui.RichletConfig;
import org.zkoss.zk.ui.metainfo.LanguageDefinition;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

public class RichletImp implements Richlet{

	@Override
	public void init(RichletConfig config) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(Page page) throws Exception {
		Window w = new Window("Product page", "normal", false);	
		w.appendChild(new Label("Hii, Welcome to impleted page of richelet..!"));
		w.setPage(page);
	}

	@Override
	public LanguageDefinition getLanguageDefinition() {
		return LanguageDefinition.lookup("xul/html");
	}

}
