package com.jpmorgan.bloomberg.servlet;

import com.jpmorgan.bloomberg.service.IndexService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/market")
public class IndexServlet extends HttpServlet {
    private final IndexService indexService = new IndexService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setAttribute("indexes", indexService.getAllIndexes());
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }
}
