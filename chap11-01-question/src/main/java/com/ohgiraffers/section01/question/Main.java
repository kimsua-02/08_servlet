package com.ohgiraffers.section01.question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/main")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        UserPage user = (UserPage) session.getAttribute("user");

        if (user == null) {
            req.setAttribute("username",user.getUsername());
            req.getRequestDispatcher("/main.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}
