// Класс с метриками для приложения
// Импортируем необходимые классы и аннотации
package ru.example.minespringactuatorproject;

// Импортируем классы для работы с метриками из Micrometer
import io.micrometer.core.instrument.Counter; 
import io.micrometer.core.instrument.MeterRegistry; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 

// Компонент Spring Framework, отвечающий за управление метриками
@Component
public class MineMetrics {

  // Поле для хранения счетчика "Hello"
  private final Counter helloCounter;

  // Конструктор класса MineMetrics с регистрацией счетчика в MeterRegistry
  @Autowired
  public MineMetrics(MeterRegistry meterRegistry) {
    this.helloCounter = meterRegistry.counter("mineapp.hello.requests");
  }

  // Метод для увеличения счетчика "Hello"
  public void incrementHelloCounter() {
    helloCounter.increment();
  }
}
