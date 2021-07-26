package Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.relational.core.sql.TrueCondition;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonBackReference;

import net.bytebuddy.implementation.bind.annotation.AllArguments;



@Entity
@Table(name="Usering")
@Transactional
public class Userdetails {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		private String username;
		private String password;
		private String fullname;
		
		
//		@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval = true)
//		@JoinColumn(name="frgnkey",referencedColumnName = "location_id")
//		
		
		@JsonBackReference
		@ManyToOne(fetch = FetchType.LAZY, optional = false)
		@Fetch(FetchMode. JOIN)
		@LazyToOne(LazyToOneOption.PROXY)
	    @JoinColumn(name="foreignkey", referencedColumnName="location_id")
		
//		@OneToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "foreignkey")
		private LocationReport lctrpt;
		
		public Userdetails() {
	super();
}


		public Userdetails(Integer id, String username, String password, String fullname, LocationReport lctrpt) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.fullname = fullname;
	this.lctrpt = lctrpt;
}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getFullname() {
			return fullname;
		}


		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public LocationReport getLctrpt() {
			return lctrpt;
		}


		public void setLctrpt(LocationReport lctrpt) {
			this.lctrpt = lctrpt;
		}


		@Override
		public String toString() {
			return "Userdetails [id=" + id + ", username=" + username + ", password=" + password + ", fullname="
					+ fullname + ", lctrpt=" + lctrpt + "]";
		}		

		


		
}
