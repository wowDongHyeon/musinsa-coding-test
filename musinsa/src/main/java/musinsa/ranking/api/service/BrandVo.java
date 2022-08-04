package musinsa.ranking.api.service;

public class BrandVo {

	private int pkey;
	private String brandName;


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
	@Override
	public String toString() {
		return "BrandVo [pkey=" + pkey + ", brandName=" + brandName + "]";
	}

}
