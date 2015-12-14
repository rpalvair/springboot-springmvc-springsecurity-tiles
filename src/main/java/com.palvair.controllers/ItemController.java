package com.palvair.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PALVAIRR on 14/12/2015.
 */
@RestController
public class ItemController {

    @RequestMapping(value = "/items/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> getAll() {
        final List<Item> list = new ArrayList<Item>() {{
            add(new Item("item1"));
            add(new Item("item2"));
            add(new Item("item3"));
            add(new Item("item3"));
            add(new Item("item2"));
            add(new Item("item2"));
            add(new Item("item2"));
        }};
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }

    public static class Item {

        private String name;

        public Item(String name) {
            this.name = name;
        }

        public Item() {

        }

        public void setName(final String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

    }
}
