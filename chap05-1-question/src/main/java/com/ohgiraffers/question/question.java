package com.ohgiraffers.question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import static java.lang.System.out;

@WebServlet("/question")
public class question extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        String phone = req.getParameter("phone");

        String password = req.getParameter("password");

        String password2 = req.getParameter("password2");

        boolean isNameValid = name != null && name.trim().length() >= 2
                && Pattern.matches("^[가-힣a-zA-Z]*$", name);

        boolean isPhoneValid = Pattern.matches("^[0-9]{11}$",phone);
        boolean isPassword = password.equals(password2);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        if (isNameValid && isPhoneValid && isPassword) {
            out.print("<h1>환영한다 !" + name + " ! </h1>");
        } else {
            out.print("<h1>입력값을 확인하세요.</h1>");
        }
        out.close();
    }
}
