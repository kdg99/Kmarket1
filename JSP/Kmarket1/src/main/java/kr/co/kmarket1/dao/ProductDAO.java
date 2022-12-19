package kr.co.kmarket1.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.kmarket1.db.DBHelper;
import kr.co.kmarket1.db.Sql;
import kr.co.kmarket1.vo.ProductVO;

public class ProductDAO extends DBHelper{
	Logger logger = LoggerFactory.getLogger(this.getClass());
	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	
	// insertProduct
	public void insertProduct(ProductVO product) {
		try {
			logger.debug("insertProduct Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.INSERT_PRODUCT);
			psmt.setInt(1, product.getCate1());
			psmt.setInt(2, product.getCate2());
			psmt.setString(3, product.getProdName());
			psmt.setString(4, product.getDescript());
			psmt.setString(5, product.getCompany());
			psmt.setString(6, product.getSeller());
			psmt.setInt(7, product.getPrice());
			psmt.setInt(8, product.getDiscount());
			psmt.setInt(9, product.getPoint());
			psmt.setInt(10, product.getStock());
			psmt.setInt(11, product.getDelivery());
			psmt.setString(12, product.getIp());
			psmt.setString(13, product.getStatus());
			psmt.setString(14, product.getDuty());
			psmt.setString(15, product.getReceipt());
			psmt.setString(16, product.getBizType());
			psmt.setString(17, product.getOrigin());
			psmt.setString(18, product.getThumb1());
			psmt.setString(19, product.getThumb2());
			psmt.setString(20, product.getThumb3());
			psmt.setString(21, product.getDetail());
			
			psmt.executeUpdate();
			close();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
	// selectProducts
	public List<ProductVO> selectProducts() {
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectProducts Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
												
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;	
	}
	// selectProduct
		public ProductVO selectProduct(String prodNo) {
			ProductVO product = null;
			try {
				logger.debug("selectProduct Start...");
				conn = getConnection();
				psmt = conn.prepareStatement(Sql.SELECT_PRODUCT);
				psmt.setString(1, prodNo);
				rs = psmt.executeQuery();
				if(rs.next()) {
					product = new ProductVO();
					product.setProdNo(rs.getInt(1));
					product.setCate1(rs.getInt(2));
					product.setCate2(rs.getInt(3));
					product.setProdName(rs.getString(4));
					product.setDescript(rs.getString(5));
					product.setCompany(rs.getString(6));
					product.setSeller(rs.getString(7));
					product.setPrice(rs.getInt(8));
					product.setDiscount(rs.getInt(9));
					product.setPoint(rs.getInt(10));
					product.setStock(rs.getInt(11));
					product.setSold(rs.getInt(12));
					product.setDelivery(rs.getInt(13));
					product.setHit(rs.getInt(14));
					product.setScore(rs.getInt(15));
					product.setReview(rs.getInt(16));
					product.setThumb1(rs.getString(17));
					product.setThumb2(rs.getString(18));
					product.setThumb3(rs.getString(19));
					product.setDetail(rs.getString(20));
					product.setStatus(rs.getString(21));
					product.setDuty(rs.getString(22));
					product.setReceipt(rs.getString(23));
					product.setBizType(rs.getString(24));
					product.setOrigin(rs.getString(25));
					product.setIp(rs.getString(26));
					product.setRdate(rs.getString(27));
													
				}
				close();
			}catch (Exception e) {
				logger.error(e.getMessage());
			}
			return product;	
		}
	//selectProductsByCate
	public List<ProductVO> selectProductsByCate(String cate1, String cate2) {
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectProductsByCate Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS_BY_CATE);
			psmt.setString(1, cate1);
			psmt.setString(2, cate2);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
				
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;	
	}
	
	//selectBestProducts
	public List<ProductVO> selectBestProducts(int amount){
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectBestProducts Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS_BY_SOLD);
			psmt.setInt(1, amount);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
				
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;
	}
	//selectHitProducts
	public List<ProductVO> selectHitProducts(int amount){
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectHitProducts Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS_BY_HIT);
			psmt.setInt(1, amount);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
				
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;
	}
	//selectScoreProducts
	public List<ProductVO> selectScoreProducts(int amount){
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectScoreProducts Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS_BY_SCORE);
			psmt.setInt(1, amount);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
				
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;
	}
	//selectDiscountProducts
	public List<ProductVO> selectDiscountProducts(int amount){
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectDiscountProducts Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS_BY_DISCOUNT);
			psmt.setInt(1, amount);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
				
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;
	}
	//selectLatestProducts
	public List<ProductVO> selectLatestProducts(int amount){
		List<ProductVO> products = new ArrayList<>();
		try {
			logger.debug("selectLatestProducts Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.SELECT_PRODUCTS_BY_LATEST);
			psmt.setInt(1, amount);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO product = new ProductVO();
				product.setProdNo(rs.getInt(1));
				product.setCate1(rs.getInt(2));
				product.setCate2(rs.getInt(3));
				product.setProdName(rs.getString(4));
				product.setDescript(rs.getString(5));
				product.setCompany(rs.getString(6));
				product.setSeller(rs.getString(7));
				product.setPrice(rs.getInt(8));
				product.setDiscount(rs.getInt(9));
				product.setPoint(rs.getInt(10));
				product.setStock(rs.getInt(11));
				product.setSold(rs.getInt(12));
				product.setDelivery(rs.getInt(13));
				product.setHit(rs.getInt(14));
				product.setScore(rs.getInt(15));
				product.setReview(rs.getInt(16));
				product.setThumb1(rs.getString(17));
				product.setThumb2(rs.getString(18));
				product.setThumb3(rs.getString(19));
				product.setDetail(rs.getString(20));
				product.setStatus(rs.getString(21));
				product.setDuty(rs.getString(22));
				product.setReceipt(rs.getString(23));
				product.setBizType(rs.getString(24));
				product.setOrigin(rs.getString(25));
				product.setIp(rs.getString(26));
				product.setRdate(rs.getString(27));
				
				products.add(product);
			}
			close();
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		return products;
	}
		
	
	//today's products count
	public int countTodayProducts() {
		int result = 0;
		try {
			logger.debug("countTodayProducts Start...");
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Sql.COUNT_TODAY_PRODUCTS);
			if(rs.next()) {
				result = rs.getInt(1);
			}
			close();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return result;
	}
	
	//update hit
	public void updateHit(String pronNo) {
		try {
			logger.debug("updateHit Start...");
			conn = getConnection();
			psmt = conn.prepareStatement(Sql.UPDATE_HIT);
			psmt.setString(1, pronNo);
			psmt.executeUpdate();
			close();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
}
		

	
	
		