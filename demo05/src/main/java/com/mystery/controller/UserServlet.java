package com.mystery.controller;

import com.mystery.service.IUserService;
import com.mystery.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class UserServlet extends HttpServlet {

    IUserService iUserService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String username = iUserService.getUserName(1);

        request.setAttribute("username",username);

        //转发
        request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request,response);
    }
}
