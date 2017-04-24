package synerzip.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "shop")
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shop_id")
	private long shopID;
	
	@NotNull
	private String name;
	
	private String address;

	public long getShopID() {
		return shopID;
	}

	public void setShopID(long shopID) {
		this.shopID = shopID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Shop [shopID=" + shopID + ", name=" + name + ", address=" + address + "]";
	}

}
