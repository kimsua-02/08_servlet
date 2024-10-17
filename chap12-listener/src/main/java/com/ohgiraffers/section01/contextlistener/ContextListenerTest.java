package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {

    /*
    * 리스터는 특정 이벤트 행위가 동작할 때 컴테이너에 의해 호출되는 메소드를 인터페이스로 정의 해두었다.
    * 이를 상속받아 구현한 매소드가 특정 이벤트 발생에 대해 필요한 로직을 작성하는데,
    * 크게 3가지 범주로 이벤트를 분류한다.
    *
    * 1. Context(톰캣 컨터이너 자체에 리스너 연결)
    *   1-1 : ServletContextListener : 웹 어플리케이션의 사작 및 종료에 대힌 이벤트 리스너
    *   1-2 : ServletContextAttributeListener : ServletContext 에 속성을 추가, 제거, 수정하는 것에 대한
    *         이밴트 리스너
    * */

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // context 가 생성될 대 변화르 감지하는 Listener 인스턴스가 함께 생성된다.
        // 최최 생성 시 생성자 호출 이후 동작 메소드
        System.out.println("context listener 인스턴스 생성");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //
        System.out.println("context Destroyed!");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("context Attribute added !");
        // context 의 attribute 가 추가될 때 동작한다.
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("context attribute removed!!");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("context attribute replaced!!");
    }

}
