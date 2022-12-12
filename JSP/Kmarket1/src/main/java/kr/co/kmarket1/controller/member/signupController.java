package kr.co.kmarket1.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;

import kr.co.kmarket1.service.OtherService;
import kr.co.kmarket1.vo.TermsVO;

@WebServlet("/member/signup.do")
public class signupController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	OtherService otherService = OtherService.INSTANCE;
	
	@Override
	public void init() throws ServletException {}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = req.getParameter("type");
		TermsVO terms = otherService.selectTerms(type);
		req.setAttribute("terms", terms);
		req.setAttribute("type", type);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/member/signup.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int type = Integer.parseInt(req.getParameter("type"));
		boolean provLocation = Boolean.parseBoolean(req.getParameter("provLocation"));
		String url = null;
		if(type == 1 ) { url = "register.do"; }
		else if(type == 2 ) { url = "registerSeller.do"; }
		
		//JSON 출력
		JsonObject json = new JsonObject();
		json.addProperty("url", url);
		PrintWriter writer = resp.getWriter();
		writer.print(json.toString());
	}
	
}