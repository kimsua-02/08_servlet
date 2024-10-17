package com.ohgiraffers.section01.question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Base64;

@WebServlet("/login")
public class LoginPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();
        String storedUsername = (String) session.getAttribute("username");
        String storedPassword = (String) session.getAttribute("password");

        if (storedUsername != null && storedUsername.equals(username) &&
            storedPassword != null && storedPassword.equals(Base64.getEncoder().encodeToString(password.getBytes()))) {
            resp.sendRedirect("main");
        } else {
            resp.sendRedirect("login.jsp?error=Invalid username or password");
        }
    }
}
