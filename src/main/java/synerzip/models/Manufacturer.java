package synerzip.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="manufacturer_id")
	private long manufacturerID;
	
	@NotNull
	@Column(name = "name")
	private String name;
		
	public long getManufacturerID() {
		return manufacturerID;
	}
	public void setManufacturerID(long manufacturerID) {
		this.manufacturerID = manufacturerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Manufacturer [manufacturerID=" + manufacturerID + ", name=" + name + "]";
	}
	
}
