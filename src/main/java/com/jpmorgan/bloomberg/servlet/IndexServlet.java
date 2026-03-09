package com.jpmorgan.bloomberg.servlet;

import com.jpmorgan.bloomberg.model.BloombergIndex;
import com.jpmorgan.bloomberg.model.IndexData;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String indexCode = request.getParameter("code");

        if (indexCode != null && !indexCode.isEmpty()) {
            BloombergIndex index = IndexData.getIndex(indexCode);
            request.setAttribute("index", index);
            request.getRequestDispatcher("/index-detail.jsp").forward(request, response);
        } else {
            Map<String, BloombergIndex> allIndexes = IndexData.getAllIndexes();
            request.setAttribute("indexes", allIndexes);
            request.getRequestDispatcher("/index-list.jsp").forward(request, response);
        }
    }
}