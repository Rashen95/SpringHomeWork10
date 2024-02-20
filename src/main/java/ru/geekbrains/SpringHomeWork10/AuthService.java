/*
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

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final SessionRepository sessionRepository;

    public Optional<User> login(String userName, String password) {
        Optional<User> user = userRepository.findByUserName(userName);
        Optional<Session> session;
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            session = sessionRepository.findByUser(user.get());
        }

        return null;
    }
}
