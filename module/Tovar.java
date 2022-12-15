public class Tovar {
    
    private String name;
    private String quality;
    private Integer price;
    
    public Tovar(String name, String quality, Integer price) {
        this.name = name;
        this.quality = quality;
        this.price = price;
    }

    public Tovar(){
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
 
}