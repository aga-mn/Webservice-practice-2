package testmart;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductCatalog {
	
	//optional annotation - all public methods in a @WebService are web methods
	@WebMethod   
	public List<String> getProductCategories(){
		
		List <String> categories=new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;
	}

}
