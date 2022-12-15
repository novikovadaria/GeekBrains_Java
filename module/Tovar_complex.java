package module;

public class Tovar_complex {
    
    private String name;
    private String quality;
    private Integer price;
    
    public Tovar_complex(String name, String quality, Integer price, String country, Integer weight) {
        this.name = name;
        this.quality = quality;
        this.price = price;
        this.country = country;
        this.weight = weight;

    }

    public Tovar_complex(){
    }
 
    public String getName() {
     return name;
    }
 
    public void setName(String name) {
     this.name = name;
    }
 
    public String getQuality() {
     return quality;
    }
 
    public void setQuality(String quality) {
     this.quality = quality;
    }
 
    public void getPrice() {
     return price;
    }
    
    public void setPrice(Integer price) {
     this.price = price;
    }

    public void getCountry() {
     return country;
    }
       
    public void setCountry(Integer country) {
     this.country = country;
    }

    public void getWeight() {
    return weight;
    }
    
    public void setWeight(Integer weight) {
    this.weight = weight;
    }
}
