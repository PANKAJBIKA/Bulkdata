package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.Entites.Records;
import spring.service.RecordService;

@RestController
@RequestMapping("/api/records")
public class RecordController {
	@Autowired
     RecordService service;

    @PostMapping("/bulk")
    public ResponseEntity<List<Records>> saveAll(@RequestBody List<Records> records) {
        return ResponseEntity.ok(service.saveAll(records));
    }

    @GetMapping("/bulk")
    public ResponseEntity<List<Records>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}

