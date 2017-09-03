package com.solid.singleresponsability;

public class BookBadExample {
    private String author;
    private Integer pageSize;

    public BookBadExample(String author, Integer pageSize) {
        this.author = author;
        this.pageSize = pageSize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Esse método não deveria estar aqui, pois não pertence ao comportamente da classe.
     */
    public void publish(){

    }
}
