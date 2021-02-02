package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Theme;
import formation.ib.backend.servcies.themeService;

@CrossOrigin
@RequestMapping("themes")
@RestController


public class ThemeController {
	
	
	@Autowired
	private themeService service;

	
	@PostMapping("")
	public Theme save(Theme entity) {
		return service.save(entity);
	}

	@GetMapping("")
	public List<Theme> findAll() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Theme findById(Long id) {
		return service.findById(id);
	}

}
