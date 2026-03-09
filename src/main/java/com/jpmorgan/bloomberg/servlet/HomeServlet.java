package com.jpmorgan.bloomberg.servlet;

import com.jpmorgan.bloomberg.service.IndexService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home", "/"})
public class HomeServlet extends HttpServlet {
    
    // Instantiate the service to fetch data
    private final IndexService indexService = new IndexService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Use the service to get the list of indexes
        request.setAttribute("indexes", indexService.getAllIndexes());
        request.setAttribute("pageTitle", "JPMorgan Bloomberg Indexes Dashboard");

        // Forward to your JSP (Assuming it's in src/main/webapp/index.jsp)
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }
}
