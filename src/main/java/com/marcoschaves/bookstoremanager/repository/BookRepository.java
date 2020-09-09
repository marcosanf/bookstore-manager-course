package com.marcoschaves.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcoschaves.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
