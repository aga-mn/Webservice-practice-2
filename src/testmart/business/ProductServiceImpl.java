package testmart.business;

import java.util.ArrayList;
import java.util.List;

import testmart.model.Product;

public class ProductServiceImpl {

	List<String> bookList=new ArrayList<>();
	List<String> movieList=new ArrayList<>();
	List<String> musicList=new ArrayList<>();
	
	public ProductServiceImpl(){
		bookList.add("Bezcenny");
		bookList.add("Uwikłanie");
		bookList.add("Ziarno Prawdy");
		movieList.add("Wilk z Wall Street");
		movieList.add("Infiltracja");
		movieList.add("Titanic");
		musicList.add("Music 1");
		musicList.add("Music 2");
		musicList.add("Music 3");
	}
	
	public List<String>getProductCategories(){
	
		List <String> categories=new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;

	}
	
	public List<String> getProducts(String category){
		
		switch(category.toLowerCase())
		{
		case "books":
			return bookList;
		case "movies":
			return movieList;
		case "music":
			return musicList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product)
	{
		switch(category.toLowerCase()){
		case "books":
			bookList.add(product); 
			break;
		case "movies":
			movieList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		default:
			return false;
		
		}
		return true;
		
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList=new ArrayList<>();
		productList.add(new Product("Java Book", "1234", 9999.99));
		productList.add(new Product("Another Java Book", "ABC", 12.50));
		
		return productList;
	}
	
	
	
}
