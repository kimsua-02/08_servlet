package com.ohgiraffers.section01.noticeboard;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

@WebServlet("/noticeboard")
public class noticeboard extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");

        String content = req.getParameter("content");

        boolean isTitleValid = title.equals(title);

        //boolean isContentValid = Pattern.matches("^[0-9]{10}$",content);

        boolean isContentValid = content != null && content.length() > 10;

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        if (isTitleValid && isContentValid) {
            out.println("<h2> + title + </h2>");
        } else {
            out.println("내용은 10자 이상이어야 합니다.");
        }
        out.close();
    }
}
