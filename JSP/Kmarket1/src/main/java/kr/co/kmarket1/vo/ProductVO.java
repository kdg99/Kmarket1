package kr.co.kmarket1.vo;

public class ProductVO {
	private int prodNo;
	private int cate1;
	private int cate2;
	private String prodName;
	private String descript;
	private String company;
	private String seller;
	private int price;
	private int discount;
	private int point;
	private int stock;
	private int sold;
	private int delivery;
	private int hit;
	private int score;
	private int review;
	private String thumb1;
	private String thumb2;
	private String thumb3;
	private String detail;
	private String status;
	private String duty;
	private String receipt;
	private String bizType;
	private String origin;
	private String ip;
	private String rdate;
	//추가필드
	private int level;
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setLevel(String level) {
		this.level = Integer.parseInt(level);
	}
	
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public int getCate1() {
		return cate1;
	}
	public void setCate1(int cate1) {
		this.cate1 = cate1;
	}
	
	public void setCate1(String cate1) {
		this.cate1 = Integer.parseInt(cate1);
	}
	
	public int getCate2() {
		return cate2;
	}
	public void setCate2(int cate2) {
		this.cate2 = cate2;
	}
	
	public void setCate2(String cate2) {
		this.cate2 = Integer.parseInt(cate2);
	}
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPrice(String price) {
		this.price = Integer.parseInt(price);
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public void setDiscount(String discount) {
		this.discount = Integer.parseInt(discount);
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void setPoint(String point) {
		this.point = Integer.parseInt(point);
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setStock(String stock) {
		this.stock = Integer.parseInt(stock);
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	public int getDelivery() {
		return delivery;
	}
	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	
	public void setDelivery(String delivery) {
		this.delivery = Integer.parseInt(delivery);
	}
	
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public String getThumb1() {
		return thumb1;
	}
	public void setThumb1(String thumb1) {
		this.thumb1 = thumb1;
	}
	public String getThumb2() {
		return thumb2;
	}
	public void setThumb2(String thumb2) {
		this.thumb2 = thumb2;
	}
	public String getThumb3() {
		return thumb3;
	}
	public void setThumb3(String thumb3) {
		this.thumb3 = thumb3;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	
}
