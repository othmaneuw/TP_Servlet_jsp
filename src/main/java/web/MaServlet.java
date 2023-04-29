package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProduitRpoImp;
import entities.Produit;

public class MaServlet extends HttpServlet {
	
	ProduitRpoImp rpi = new ProduitRpoImp();
	
	
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.getRequestDispatcher("vue.jsp").forward(req, resp);
		//resp.sendRedirect("vue.jsp?name="+req.getParameter("name"));
		List<Produit> maListe = rpi.listerProduit();
		req.setAttribute("listeP", maListe);
		req.getRequestDispatcher("vue.jsp").forward(req, resp);
		
		}
}
