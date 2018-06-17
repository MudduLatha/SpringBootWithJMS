package com.SpringBootMongodb.Example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HotelsData")
public class Hotel {
	@org.springframework.data.annotation.Id
	private String id;
	private String hotelName;
	@Indexed(direction = IndexDirection.ASCENDING)
	private double price;
	private Address address;
	private List<Review> reviews;
	
	 /**
     * id: holds the hotel id of type String
     * hotelName: holds the name of the Hotel of type String
     * price: holds the price of stay per day
     * address: holds the address of hotel of type Address
     * reviews: holds the reviews of hotel of type reviews
     */
	 // default Constructor
    protected Hotel(){
        this.reviews = new ArrayList<>();
    }

    public Hotel(String id, String hotelName, double price, Address address, List<Review> reviews) {
        this.id = id;
        this.hotelName = hotelName;
        this.price = price;
        this.address = address;
        this.reviews = reviews;
    }


    public String getId() {
        return id;
    }
    public String getHotelName() {
        return hotelName;
    }
    public double getPrice() {
        return price;
    }
    public Address getAddress() {
        return address;
    }
    public List<Review> getReviews() {
        return reviews;
	
	
	
    }	

}
