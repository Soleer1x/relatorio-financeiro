package projeto.Avancado.projeto.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.Avancado.projeto.model.dashboard;
import projeto.Avancado.projeto.repository.dashboardRepository;

import java.util.List;

@Data
@RestController
@RequestMapping("dashboard")
public class dashboardController {

    private final dashboardRepository DashboardRepository;

    @GetMapping
    public List<dashboard> buscarTodos(){
        return DashboardRepository.findAll();
    }

    @GetMapping("{id}")
    public dashboard buscarPorId()

}
