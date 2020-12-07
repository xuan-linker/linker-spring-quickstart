package com.xlccc.caching;

public interface BookRepository {

  Book getByIsbn(String isbn);

}