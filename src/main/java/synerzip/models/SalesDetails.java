package synerzip.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sales_details")
public class SalesDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sales_details_id")
	private Long salesDetailsID;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="product_id")
	private Product product;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="sales_id")	
	private Sales sales;
		
	private Long quantity;

	public Long getSalesDetailsID() {
		return salesDetailsID;
	}

	public void setSalesDetailsID(Long salesDetailsID) {
		this.salesDetailsID = salesDetailsID;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "SalesDetails [salesDetailsID=" + salesDetailsID + ", product=" + product + ", sales=" + sales
				+ ", quantity=" + quantity + "]";
	}	
	
}
