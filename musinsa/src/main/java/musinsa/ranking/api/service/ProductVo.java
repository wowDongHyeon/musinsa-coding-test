package musinsa.ranking.api.service;

public class ProductVo {

	private int pkey;
	private String brandName;
	private String categoryName;
	private String productName;
	private int productPrice;

	public int getPkey() {
		return pkey;
	}
	public void setPkey(int pkey) {
		this.pkey = pkey;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductVo [pkey=" + pkey + ", brandName=" + brandName + ", categoryName=" + categoryName
				+ ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}


}
