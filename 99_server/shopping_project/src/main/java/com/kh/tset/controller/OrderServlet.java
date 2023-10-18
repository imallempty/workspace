package com.kh.tset.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/orderProduct.do")
public class OrderServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String name = req.getParameter("name");
		int blackPen = Integer.parseInt(req.getParameter("blackPen"));
		int redPen = Integer.parseInt(req.getParameter("redPen"));
		int bluePen = Integer.parseInt(req.getParameter("bluePen"));
		int white = Integer.parseInt(req.getParameter("white"));

		int total = blackPen * 500 + redPen * 700 + bluePen * 500 + white * 1000;
		req.setAttribute("total", total);

		if (total > 0) {
			req.setAttribute("name", name);
			req.setAttribute("blackPen", blackPen);
			req.setAttribute("redPen", redPen);
			req.setAttribute("bluePen", bluePen);
			req.setAttribute("white", white);
			
            int blackPenPrice = blackPen * 500;
            int redPenPrice = redPen * 700;
            int bluePenPrice = bluePen * 500;
            int whitePrice = white * 1000;

            req.setAttribute("blackPenPrice", blackPenPrice);
            req.setAttribute("redPenPrice", redPenPrice);
            req.setAttribute("bluePenPrice", bluePenPrice);
            req.setAttribute("whitePrice", whitePrice);

			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/resultPage.jsp");
			dispatcher.forward(req, resp);
		} else {
			// total이 0이면 error.do로 리다이렉트
			resp.sendRedirect("error.do");
		}

	}

}
