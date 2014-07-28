package testmart;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;

import testmart.business.ProductServiceImpl;
import testmart.model.Product;

@WebService(endpointInterface="testmart.ProductCatalogInterface", name="TestMartCatalog", portName="TestMartCatalogPoint", serviceName="TestMartCatalogService", 
targetNamespace="http://www.testmart.com")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService=new ProductServiceImpl();
	
	/* (non-Javadoc)
	 * @see testmart.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	
	public List<String> getProductCategories(){
			
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see testmart.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	
	public List<String> getProducts(String category){
		return productService.getProducts(category);
		
	}
	
	/* (non-Javadoc)
	 * @see testmart.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
		
	}
	
	/* (non-Javadoc)
	 * @see testmart.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
		
	}

}
