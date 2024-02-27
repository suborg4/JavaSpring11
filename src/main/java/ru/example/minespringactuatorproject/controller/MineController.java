// Контроллер, отвечающий за обработку GET запросов
// Импортируем класс MineMetrics и используем аннотацию @Autowired для внедрения зависимости
package ru.example.minespringactuatorproject.controller;

// Импортируем класс MineMetrics для работы с метриками
import ru.example.minespringactuatorproject.MineMetrics; 
// Импортируем необходимые классы и аннотации из Spring Framework
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Класс, отмеченный аннотацией @RestController, который обрабатывает входящие HTTP запросы
@RestController
public class MineController {

  // Поле для хранения экземпляра класса MineMetrics
  private final MineMetrics mineMetrics;

  // Конструктор класса MineController с внедрением зависимости от MineMetrics
  @Autowired
  public MineController(MineMetrics mineMetrics) {
    this.mineMetrics = mineMetrics;
  }

  // Метод, обрабатывающий GET запрос на "/hello people"
  @GetMapping("/hello people")
  public String hello() {
    // Увеличиваем счетчик "Hello" для метрик
    mineMetrics.incrementHelloCounter(); 
    return "Hello World!";
  }
}