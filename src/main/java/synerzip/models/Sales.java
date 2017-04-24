package synerzip.models;
 
import java.sql.Timestamp;

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
@Table(name = "sales")
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sales_id")
	private long salesID;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="vendor_id")
	private Vendor vendor;

	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="shop_id")
	private Shop shop;
	
	private Timestamp date;
	
	@Column(name="sum_total")
	private Double sumTotal;

	public long getSalesID() {
		return salesID;
	}

	public void setSalesID(long salesID) {
		this.salesID = salesID;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Double getSumTotal() {
		return sumTotal;
	}

	public void setSumTotal(Double sumTotal) {
		this.sumTotal = sumTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Sales [salesID=" + salesID + ", vendor=" + vendor + ", customer=" + customer + ", shop=" + shop
				+ ", date=" + date + ", sumTotal=" + sumTotal + "]";
	}

	
}
