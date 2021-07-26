package Model;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="Report")
public class LocationReport {
	
	@Id
	private Integer location_id;
	private String locationname;
	private String temperature;
	private String windspeed;
	private String currentcondition;
	private String feels;
	
	
//	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true,mappedBy = "lctrpt")
//	private Userdetails userdetails;
	
	@JsonManagedReference
	@OneToMany(mappedBy="lctrpt",cascade=CascadeType.ALL)
	@Fetch(FetchMode. JOIN)	
	@LazyToOne(LazyToOneOption.PROXY)
	List<Userdetails> userdata=new ArrayList<>();
	
//	@JsonIgnore
//	@OneToOne(mappedBy = "lctrpt", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//	
//	private Userdetails userdata;
	
	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "")
//    private Userdetails userdata;
	
//	@OneToOne
//	
	

//	public Userdetails getUserdata() {
//		return userdata;
//	}
//
//	public void setUserdata(Userdetails userdata) {
//		this.userdata = userdata;
//	}

	public LocationReport() {
		super();
	}

	public LocationReport(Integer location_id, String locationname, String temperature, String windspeed,
			String currentcondition, String feels, String today) {
		super();
		this.location_id = location_id;
		this.locationname = locationname;
		this.temperature = temperature;
		this.windspeed = windspeed;
		this.currentcondition = currentcondition;
		this.feels = feels;
	}

	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public String getLocationname() {
		return locationname;
	}
	public void setLocationname(String locationname) {
		this.locationname = locationname;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	public String getWindspeed() {
		return windspeed;
	}
	public void setWindspeed(String windspeed) {
		this.windspeed = windspeed;
	}
	public String getCurrentcondition() {
		return currentcondition;
	}
	public void setCurrentcondition(String currentcondition) {
		this.currentcondition = currentcondition;
	}
	public String getFeels() {
		return feels;
	}
	public void setFeels(String feels) {
		this.feels = feels;
	}
	@Override
	public String toString() {
		return "LocationReport [location_id=" + location_id + ", locationname=" + locationname + ", temperature="
				+ temperature + ", windspeed=" + windspeed + ", currentcondition=" + currentcondition + ", feels="
				+ feels + "]";
	}
	
	
	
	
}
