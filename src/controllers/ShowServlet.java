package controllers;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BusinessTrip;
import utils.DBUtil;

/**
 * Servlet implementation class ShowServlet
 */
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManager em = DBUtil.createEntityManager();

        // 該当のIDの1件のみをデータベースから取得
        BusinessTrip m = em.find(BusinessTrip.class, Integer.parseInt(request.getParameter("id")));

        em.close();

        // データをリクエストスコープにセットしてshow.jspを呼び出す
        request.setAttribute("trip", m);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/trips/show.jsp");
        rd.forward(request, response);
    }
}
