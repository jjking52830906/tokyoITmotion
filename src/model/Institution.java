package model;
public class Institution {
    private String InsId;
    private String InsName;
    private int price;
    
    public Institution() {
    }
    
    public void Institiution(String insId, String insname, int price) {
        this.InsId = insId;
        this.InsName = insname;
        this.price = price;
    }
    
    public String getInsId() {
        return InsId;
    }
    
    public void setInsId(String insId) {
        InsId = insId;
    }
    
    public String getInsName() {
        return InsName;
    }
    
    public void setInsName(String insname) {
        InsName = insname;
    }
    
    public int getprice() {
        return price;
    }
    
    public void setprice(int price) {
        this.price = price;
    }
} 