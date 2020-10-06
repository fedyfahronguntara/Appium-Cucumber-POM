package AllPage;


import static org.testng.Assert.assertEquals;

import BaseSetup.BasePOM;
import BaseSetup.Setup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShrineGalleryFunc extends BasePOM {

	MainActions mainfunc=new MainActions();
	
	public ShrineGalleryFunc(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(accessibility = "Shrine\nA fashionable retail app")
	private MobileElement tab;
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]")
	private MobileElement username;
	@AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]")
	private MobileElement password;
	@AndroidFindBy(accessibility = "NEXT")
	private MobileElement next;
	@AndroidFindBy(accessibility = "SHRINE")
	private MobileElement SHRINE_title;
	@AndroidFindBy(accessibility = "Open menu")
	private MobileElement openmenu;
	@AndroidFindBy(accessibility = "ACCESSORIES")
	private MobileElement ACCESSORIES;
	@AndroidFindBy(accessibility = "Vagabond sack\n$120, Add to cart")
	private MobileElement items;
	@AndroidFindBy(accessibility = "Stella sunglasses\n$58, Add to cart")
	private MobileElement items2;
	@AndroidFindBy(accessibility = "Garden strand\n$98, Add to cart")
	private MobileElement items3;
	@AndroidFindBy(accessibility = "Shopping cart, 1 item")
	private MobileElement cart_1_item_button;
	@AndroidFindBy(accessibility = "Shopping cart, 2 items")
	private MobileElement cart_2_item_button;
	@AndroidFindBy(accessibility = "Shopping cart, no items")
	private MobileElement cart_no_item_button;
	@AndroidFindBy(accessibility = "Vagabond sack\nQuantity: 1\nx $120")
	private MobileElement title_item_incart;
	@AndroidFindBy(accessibility = "Stella sunglasses\nQuantity: 1\nx $58")
	private MobileElement title_item_incart2;
	@AndroidFindBy(accessibility = "TOTAL\n$202.68")
	private MobileElement totalel;
	@AndroidFindBy(accessibility = "CLEAR CART")
	private MobileElement clear_button;
	@AndroidFindBy(accessibility = "Close cart\nCART\nNO ITEMS")
	private MobileElement cart_noitem;
	@AndroidFindBy(accessibility = "Close cart\nCART\n2 ITEMS")
	private MobileElement cart_items;
	
	
	
	public void click (int index) {
		//for click tab shrine
		if (index==1) {
		mainfunc.click(tab);
		}
		//for click next on login page
		else if (index==2) {
			mainfunc.click(next);
		}
		// for open menu on shrine page
		else if (index==3) {
			mainfunc.click(openmenu);
		}
		//for click accecories tab
		else if (index==4) {
			mainfunc.click(ACCESSORIES);
		}
		//for click cart button 1 item
		else if (index==5) {
			mainfunc.click(cart_1_item_button);
		}
		//for click cart button 2 item
		else if (index==6) {
			mainfunc.click(cart_2_item_button);
		}
		//for click cart button no item
		else if (index==7) {
			mainfunc.click(cart_no_item_button);
		}
		//for click clear button
		else if (index==8) {
			mainfunc.click(clear_button);
		}
	}
	
	public void input_username_pss(String uname, String pss) {
		mainfunc.input(username, uname);
		mainfunc.input(password, pss);
	}
	
	public void swipe() {
		mainfunc.swipe();
	}
	
	public void vrify() {
		mainfunc.getassert("SHRINE", SHRINE_title);
	}
	
	public void access_page() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		swipe();
		click(1);
		input_username_pss(" fedyfahron@gmail.com", "Test1234");
		click(2);
	}
	
	public void swipe_horizontal() {
		mainfunc.scroll_hori("Garden strand\n$98, Add to cart");
	}
	
	public void add_tocart(int index) {
		if (index==1) {
			mainfunc.click(items);
		}
		else if (index==2) {
			mainfunc.click(items2);
		}
		else if (index==3) {
			mainfunc.click(items3);
		}
	}

	
	public void verify_items_cart(int index) {
		if (index==1){
			mainfunc.getassert("Vagabond sack\nQuantity: 1\nx $120", title_item_incart);
		}
		else if (index==2) {
			mainfunc.getassert("Vagabond sack\nQuantity: 1\nx $120", title_item_incart);
			mainfunc.getassert("Stella sunglasses\nQuantity: 1\nx $58", title_item_incart2);
		}
	}
	
	public void verify_total() {
//		String content_desc1 = title_item_incart.getAttribute("content-desc");	
//        String[] harga = content_desc1.split("\\$");
//        
//		String content_desc2 = title_item_incart2.getAttribute("content-desc");
//        String[] harga2 = content_desc2.split("\\$");
// 
//		double d=Double.parseDouble(harga[1]);
//		double d2=Double.parseDouble(harga2[1]);
//		
//		double tax= d * 0.06;
//		double tax2= d2 * 0.06;
//		double shiping = 7.0;
//		
//		double total = tax + shiping + d +  tax2 + shiping + d2;
//		String s=Double.toString(total);
		String content_desc3 = totalel.getAttribute("content-desc");
        String[] expetedTotal = content_desc3.split("\\$");
        
		
		assertEquals(expetedTotal[1],"202.68" );
				
	}
	
	public void verify_noitemcart() {
		mainfunc.getassert("Close cart\nCART\nNO ITEMS", cart_noitem);
	}
	
	public void verify_itemcart() {
		mainfunc.getassert("Close cart\nCART\n2 ITEMS", cart_items);
	}
	
}
