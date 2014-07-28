package testmart;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import testmart.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService=new ProductServiceImpl();
	
	//optional annotation - all public methods in a @WebService are web methods
	@WebMethod   
	public List<String> getProductCategories(){
			
		return productService.getProductCategories();
	}
	
	public List<String> getProducts(String category){
		return productService.getProducts(category);
		
	}
	
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
		
	}

}
