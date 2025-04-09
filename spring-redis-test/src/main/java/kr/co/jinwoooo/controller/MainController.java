package kr.co.jinwoooo.controller;

import kr.co.jinwoooo.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MainController {

    private final MainService mainService;

    @PostMapping("/redis/string")
    public void setValue(String key, String value) {
        mainService.setValue(key, value);
    }

    @GetMapping("/redis/string/{key}")
    public ResponseEntity getValue(@PathVariable String key) {

        String value = mainService.getValue(key);

        return ResponseEntity.ok().body(value);
    }

    @PostMapping("/redis/addToListFromRight")
    public void addToListFromRight(String key, String value) {
        mainService.addToListFromRight(key, value);
    }

    @PostMapping("/redis/addToListFromLeft")
    public void addToListFromLeft(String key, String value) {
        mainService.addToListFromLeft(key, value);
    }

    @GetMapping("/redis/getFromList")
    public void getFromList(String key, int index) {
        mainService.getFromList(key, index);
    }

    @GetMapping("/redis/getRangeFromList")
    public void getRangeFromList(String key, int start, int end) {
        mainService.getRangeFromList(key, start, end);
    }

    @PostMapping("/redis/addToSet")
    public void addToSet(String key, String[] values) {
        mainService.addToSet(key, values);
    }

    @GetMapping("/redis/getFromSet")
    public void getFromSet(String key) {
        mainService.getFromSet(key);
    }

    @PostMapping("/redis/addToHash")
    public void addToHash(String key, String hashKey, String value) {
        mainService.addToHash(key, hashKey, value);
    }

    @GetMapping("/redis/getFromHash")
    public void getFromHash(String key, String hashKey) {
        mainService.getFromHash(key, hashKey);
    }


}
