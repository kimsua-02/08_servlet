package com.ohgiraffers.section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

//        resp.sendRedirect("redirect");

        /*
        * cookie 를 사용하는 벙법은 간단하며, 다음과 같다.
        * 1. 쿠키를 생성한다.
        * 2. 생성한 쿠키의 만료 시간을 설정한디.
        * 3. 응답 헤더에 쿠키를 담는다.
        * 4. 응답을 보낸다.
        *
        * 하지만 쿠키는 일부 제약사항이 있다.
        * 1. 한 번 설정한 쿠키의 이름은 변경할 수 없다.
        * 2. 쿠키의 이름에는 공백문자와 일부 특수문자 ( [] () , = " / @ ? : ; ) 를 사용할 수 없다.
        * */


        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        // 시간을 설정하면 설정한 시간 동안 살아있다. 브라우저가 꺼져도 남아있는다. 미설정시 브라우저가 꺼지면 쿠키가 날아간다.
        firstNameCookie.setMaxAge(60 * 60 * 24);
        lastNameCookie.setMaxAge(60 * 60 * 24);

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);


        // Cookie 를 담아주고 나서 redirect 를 작성한다.
        resp.sendRedirect("redirect");

    }
}
