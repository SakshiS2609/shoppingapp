/**
 * 
 */
package shoppingapp.main;

/**
 * @author HP
 *
 */
public class Product {
	private Long id;
	private String name;
	private Integer tier;
 
	public Product(Long id, String name, Integer tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getTier() {
		return tier;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	

}
