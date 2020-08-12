package com.geekbrains.book.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreApplication {

	// 2. Добавьте форму для фильтра, после фильтрации форма не должна
	// сбрасываться

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
}
