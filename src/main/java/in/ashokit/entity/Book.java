package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	private Integer bookid;
	private String bookname;
	private double bookprice;
	
	
}