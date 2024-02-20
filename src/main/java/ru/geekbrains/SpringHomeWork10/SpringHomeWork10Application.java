/*
Домашнее задание

Разработайте тесты для службы аутентификации
AuthService
. Этот сервис имеет методы
login(String username, String password)
,
register(User user)
и
logout(Long userId)
. Служба использует
UserRepository
для управления данными пользователя и
SessionRepository
для управления сессионными данными.

Создайте mock-объекты для
UserRepository
и
SessionRepository
.
Напишите тест, который проверяет, что при успешной регистрации метод
save
репозитория пользователя вызывается.
Напишите тест, который проверяет, что при входе в систему для существующего пользователя создается новая сессия.
Напишите тест, проверяющий корректное завершение сессии при выходе из системы.
Желательно использовать spring security в работе
 */
package ru.geekbrains.SpringHomeWork10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHomeWork10Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringHomeWork10Application.class, args);
    }
}
