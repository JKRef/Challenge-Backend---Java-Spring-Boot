package ar.com.juanCalanoce.cursos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String panelAdministrativo() {
        return "index";
    }
}
