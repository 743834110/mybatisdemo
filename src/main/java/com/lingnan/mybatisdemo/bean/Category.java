package com.lingnan.mybatisdemo.bean;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable{

    private int id;
    private String name;

    //
    private List<Book> books;


    public Category() {
    }


    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(int id, String name, List<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}
