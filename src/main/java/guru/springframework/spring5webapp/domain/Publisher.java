package guru.springframework.spring5webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String adressLine1;
	private String city;
	private String state;
	private String zip;
	
	@OneToMany
	@JoinColumn(name = "publisher_id")
	private Set<Book> books = new HashSet<>();
	
	public Publisher() {
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(final Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Publisher{" +
				"id=" + id +
				", name='" + name + '\'' +
				", adressLine1='" + adressLine1 + '\'' + 
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip='" + zip + '\'' +
				'}';
	}

	@Override
	public boolean equals(final Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		 Publisher publisher = (Publisher) o;
		 
		return id != null ? id.equals(publisher.id) : publisher.id == null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, adressLine1, city, state, zip);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setAdressLine1(final String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public void setState(final String state) {
		this.state = state;
	}

	public void setZip(final String zip) {
		this.zip = zip;
	}
}