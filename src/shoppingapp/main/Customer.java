/**
 * 
 */
package shoppingapp.main;

/**
 * @author HP
 *
 */
public class Customer {
	  private Long cId;
	  private String name;
	  private String category;
	  private Double price;
	public Long getcId() {
		return cId;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public Double getPrice() {
		return price;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	  
	  

}
