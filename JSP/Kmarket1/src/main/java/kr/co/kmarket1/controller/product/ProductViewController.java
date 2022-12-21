package kr.co.kmarket1.controller.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.kmarket1.service.ProductService;
import kr.co.kmarket1.vo.NavCateVO;
import kr.co.kmarket1.vo.ProductVO;
import kr.co.kmarket1.vo.ReviewVO;

@WebServlet("/product/productView.do")
public class ProductViewController extends HttpServlet{
	ProductService serviceProduct = ProductService.INSTANCE;

	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String prodNo	= req.getParameter("prodNo");
		String cate1	= req.getParameter("cate1");
		String cate2	= req.getParameter("cate2");
		String pg = req.getParameter("pg");
		NavCateVO navCate = serviceProduct.selectNavCate(cate1, cate2);
		
		ProductVO product = serviceProduct.selectProduct(prodNo);
		req.setAttribute("product", product);
		req.setAttribute("cate1", cate1);
		req.setAttribute("cate2", cate2);
		req.setAttribute("prodNo", prodNo);
		req.setAttribute("navCate", navCate);

		//페이징
		int total = serviceProduct.countReviewTotal(prodNo); // 게시글 개수
		int currentPage = serviceProduct.getCurrentPage(pg); // 현재 페이지 번호	
		int lastPageNum = serviceProduct.getLastPageNumReview(total); // 마지막 페이지 번호
		int[] result = serviceProduct.getPageGroupNum(currentPage, lastPageNum); // 페이지 그룹 start, end 번호
		int pageStartNum = serviceProduct.getPageStartNum(total, currentPage); // 페이지 시작번호
		int start = serviceProduct.getStartNum(currentPage); // 시작 인덱스
		
		List<ReviewVO> reviews = null;
		reviews = serviceProduct.selectReviews(prodNo, start);
				
		req.setAttribute("reviews", reviews);
		req.setAttribute("lastPageNum", lastPageNum);		
		req.setAttribute("currentPage", currentPage);		
		req.setAttribute("pageGroupStart", result[0]);
		req.setAttribute("pageGroupEnd", result[1]);
		req.setAttribute("pageStartNum", pageStartNum+1);
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/product/view.jsp");
		dispatcher.forward(req,	 resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
	}
}
