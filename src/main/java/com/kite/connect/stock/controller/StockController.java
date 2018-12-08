package com.kite.connect.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by saurabhagrawal on 08/12/18.
 */
@RestController
public class StockController {
    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public ResponseEntity<?> test() {
        return new ResponseEntity<String>("running", HttpStatus.OK);
    }

}
