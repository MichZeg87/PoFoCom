public class Notebook {
   int weight;
   int price;
   int year;

   public Notebook(int weight, int price, int year) {
      this.weight = weight;
      this.price = price;
      this.year = year;
   }

   public void checkPrice() {
      if (this.price < 600) {
         System.out.println("this notebook is very cheap.");
      } else if (this.price >= 600 && this.price <= 1000) {
         System.out.println("the price is good.");
      } else {
         System.out.println("This notebook is expensive.");
      }
   }

   public void checkWeight() {
      if (this.weight <= 600) { // tu chciałbym użyć znaku "g" ale nie mogę(jak dodac wartość string do int?)
         System.out.println("this device is lightweight");
      } else if (this.weight >= 601 && this.weight <= 1200) {
         System.out.println("the device is not too heavy");
      } else {
         System.out.println("the device is very heavy.");
      }
   }

   public void checkYear() {
      if (this.year > 2018 && this.price <= 1200) {
         System.out.println("this is a good offer.");
      } else if (this.price < 1600 && this.year > 2020) {
         System.out.println("This is not the best offer.");
      } else {
         System.out.println("this is the best offer.");
      }
   }
}
