package org.airafrika.App.Controllers;

import java.io.*;
import java.time.LocalDate;

import org.airafrika.App.Enums.Gender;
import org.airafrika.Dao.AdminDao;
import org.airafrika.Dao.ReservationExtraDao;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.airafrika.App.Entities.Admin;

@WebServlet(name = "helloController", value = "/hello")
public class HelloController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";

        Admin admn = new Admin();
        admn.setFirstName("5daama");
        admn.setLastName("lehna");
        admn.setEmail("ouharrioutman@gmail.com");
        admn.setBirthday(LocalDate.parse("1999-01-01"));
        admn.setGender(Gender.MALE);
        admn.setCnie("AD334799");
        admn.setPassword("jfhjhf");

//        new ReservationExtraDao().getAll().forEach((e) -> {
//            System.out.println("\n");
//            System.out.println(e.toString());
//            System.out.println("\n");
//        });

        new AdminDao().getAll().forEach((e) -> {
            System.out.println("\n");
            System.out.println(e.toString());
            System.out.println("\n");
        });
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}