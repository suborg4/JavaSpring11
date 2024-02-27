// Класс приложения для запуска Spring Boot
// Импортируем необходимые классы и аннотации из Spring Framework
package ru.example.minespringactuatorproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Аннотация @SpringBootApplication, указывающая на основной класс Spring Boot приложения
@SpringBootApplication
public class MineSpringActuatorProjectApplication {

  // Основной метод, который запускает Spring Boot приложение
  public static void main(String args) {
    // Запуск приложения с указанием основного класса и аргументов командной строки
    SpringApplication.run(MineSpringActuatorProjectApplication.class, args);
  }

}