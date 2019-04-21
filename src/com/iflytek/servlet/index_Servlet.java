package com.iflytek.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet/index_Servlet")
public class index_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public index_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/XFindex.jsp");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /**
         * 1、设置编码
         * 2、获取页面的参数
         * 3、参数校验
         *
         * 4、请求javabean model层处理业务
         * 5、model和数据库交互
         * 6、获取数据库交互的结果
         *
         * 7、选择合适的view 页面进行跳转
         */
        request.setCharacterEncoding("UTF-8");

        String useid = request.getParameter("useid");
        String pw = request.getParameter("pw");
        System.err.println(useid + ";" + pw);
        String myUser = "admin";
        String myPwd = "admin";
        if (useid.equals(myUser) && pw.equals(myPwd)) {
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }else{
            request.setAttribute("error", "用户账号或密码错误，请重新登录<br>");
            request.getRequestDispatcher("/XFindex.jsp").forward(request, response);
        }
    }
}
/*


    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.err.println(userName+";"+password);
        String myUser = "Dong";
        String myPwd = "5432100";
        if(userName.equals(myUser)&&password.equals(myPwd)) {
            response.sendRedirect(request.getContextPath()+"success.jsp?userName="+userName);
        }else {
            request.setAttribute("message", "账密错误，请重新登录<br>");
            request.getRequestDispatcher("/web/Login.jsp").forward(request, response);
        }

    }

*/
/*
        String useid = request.getParameter("useid");
        String psw = request.getParameter("psw");

        if ("admin".equals(useid) && "admin".equals(psw)) {
            response.sendRedirect("succerss.jsp");
        } else {
            request.setAttribute("error", "用户名密码错误");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
    }*//*


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
*/

