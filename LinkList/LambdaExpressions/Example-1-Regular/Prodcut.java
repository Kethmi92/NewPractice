public class Prodcut{

         private string productId;
	 private String prodcutName;
	 private  String productDescription;
	 private int purchasePrice;
	 private int sellingPrice;
	 private int quantity;

        public Product(){

   }

	public Product(String productId, String prodcutName, String productDescription, int purchasePrice, sellingPrice,  int quantity){

		this.productId = productId;
		this.prodcutName = prodcutName;
		this.productDescription = productDescription;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.quantity = quantity;

   }

	public void setproductId(String productId){
		this.productId = productId;
       }

	
}