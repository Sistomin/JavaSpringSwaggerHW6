package ru.istomin.JavaSpringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. Подключить OpenAPI 3 и swagger к проекту с библиоткой
 * 2. Описать все контроллеры, эндпоинты и возвращаемые тела с помощью аннотаций OpenAPI 3
 * 3. В качестве результата, необходимо прислать скриншот(ы) страницы swagger (с ручками)
 *
 * Доп. задание (сдавать не нужно):
 * придумать какие-то доменные сервисы (по типу библиотеки и заметок) и попытаться спроектировать его API.
 */

@SpringBootApplication
public class JavaSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringDataApplication.class, args);
	}

}
