package com.example.gradingregister.controllers.api;

import com.example.gradingregister.data.dto.AdministratorDTO;
import com.example.gradingregister.data.entity.Administrator;
import com.example.gradingregister.service.AdministratorService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AdministratorApiController {
    private final AdministratorService administratorService;
    private final ModelMapper modelMapper;


    @GetMapping(value = "/api/administrator")
    public List<AdministratorDTO> getAdministrators() {
        return administratorService.getAdministrators();
    }

    @RequestMapping("/api/administrator/{id}")
    public AdministratorDTO getAddress(@PathVariable("id") int id) {
        return administratorService.getAdministrator(id);
    }

    
}
