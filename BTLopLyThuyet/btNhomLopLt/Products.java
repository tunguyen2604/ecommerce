public class Products {
     int Products_id;
     short type;
     String name ;
     int purchasePrice ;
     int quantity;
     int sellPrice ;
     double tax ;

     public int getProducts_id() {
         return Products_id;
     }
     public void setProducts_id(int products_id) {
         Products_id = products_id;
     }
     public String getName() {
         return name;
     }
     public void setName(String name) {
         this.name = name;
     }
     public int getPurchasePrice() {
         return purchasePrice;
     }
     public void setPurchasePrice(int purchasePrice) {
         this.purchasePrice = purchasePrice;
     }
     public int getSellPrice() {
         return sellPrice;
     }
     public void setSellPrice(int sellPrice) {
         this.sellPrice = sellPrice;
     }
     public double getTax() {
         return tax;
     }
     public void setTax(double tax) {
         this.tax = tax;
     }
}



