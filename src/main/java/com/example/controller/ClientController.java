package com.example.controller;


import com.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping({"","/"})
    public String getClients(Model model){
        var clients = clientService.findAll(Sort.Direction.DESC, "id");
        model.addAttribute("clients", clients);
        return "clients/index";
    }
}
