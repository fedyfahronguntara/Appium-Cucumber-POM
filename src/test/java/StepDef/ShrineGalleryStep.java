package StepDef;

import AllPage.ShrineGalleryFunc;
import BaseSetup.Setup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShrineGalleryStep extends Setup{
	
	ShrineGalleryFunc main = new ShrineGalleryFunc(driver);
	
	
	//////Verify page /////
	@Given("open app and swipe to left on slider")
	public void open_app_and_swipe_to_left_on_slider() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		main.swipe();
		main.click(1);
	}


	@When("click shrane tab on slider and login using username {string} password {string}")
	public void click_shrane_tab_on_slider_and_login_using_username_password(String string, String string2) {
		
		main.input_username_pss(string, string2);
		main.click(2);
	}

	@Then("Shrine Gallery Page is displayed")
	public void shrine_Gallery_Page_is_displayed() {
		main.vrify();
	}
	
	
	//Add Item////
	@Given("has success access Shrine Gallery Page")
	public void has_success_access_Shrine_Gallery_Page() {
		main.access_page();
	}

	@When("select item")
	public void select_item() {
		main.add_tocart(1);
	}

	@Then("the item will be add to cart")
	public void the_item_will_be_add_to_cart() {
		main.click(5);
		main.verify_items_cart(1);
	}
	
	
	//check total////
	@Given("has success access cart page")
	public void has_success_access_cart_page() {
		main.access_page();
		main.add_tocart(1);
		main.add_tocart(2);
		main.click(6);
		
	}

	@When("some item on shopping cart")
	public void some_item_on_shopping_cart() {
		main.verify_items_cart(2);
	}

	@Then("the total price is correct")
	public void the_total_price_is_correct() {
		main.verify_total();
		
	}
	
	//clear cart
	@Given("has success select two item and access cart page")
	public void has_success_select_two__item_and_access_cart_page() {
		main.access_page();
		main.add_tocart(1);
		main.swipe();
		main.add_tocart(3);
		main.click(6);
		
	}
	@Given("two items on shopping cart")
	public void two_items_on_shopping_cart() {
		main.verify_itemcart();
	}

	@When("click clear button")
	public void click_clear_button() {
		main.click(8);
	}

	@Then("all item in cart removed")
	public void all_aitem_in_cart_removed() {
		main.click(7);
		main.verify_noitemcart();
	}
	
	
}
