package manzil.controller;

import manzil.model.Vibe;
import manzil.repository.VibeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vibes")
@CrossOrigin(origins = "*")
public class VibeController {
    private final VibeRepository repository;

    public VibeController(VibeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Vibe> getAllVibes() {
        return repository.findAll();
    }
}