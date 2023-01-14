package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

import service.EmployerService;
import service.GenreService;
import service.NiveauService;
import service.SpecialiteService;

public class InscriptionEmployerController extends HttpServlet{
    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        GenreService gs = new GenreService();
        NiveauService ns = new NiveauService();
        SpecialiteService ss = new SpecialiteService();
        req.setAttribute("listeGenre",gs.getAll());
        req.setAttribute("listeNiveau",ns.getAll());
        req.setAttribute("listeSpecialite",ss.getAll());
        try {
            RequestDispatcher dispat = req.getRequestDispatcher("inscriptionEmploye.jsp");
            dispat.forward(req,res);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
