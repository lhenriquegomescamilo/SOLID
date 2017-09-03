package com.solid.singleresponsability;

public class BookGoodExample {
    public String author;
    public Integer pageSize;

    public BookGoodExample(String author, Integer pageSize) {
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
}

class Publisher {
    private BookGoodExample bookGoodExample;

    Publisher(BookGoodExample bookGoodExample) {
        this.bookGoodExample = bookGoodExample;
    }

    public void publish() {

    }

}
