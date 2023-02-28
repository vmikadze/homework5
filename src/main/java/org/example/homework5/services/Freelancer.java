package org.example.homework5.services;
public class Freelancer {
        public static int calculateRestMonths(int income, int expenses, int threshold) {
            int money = 0; // начальный баланс
            int restMonths = 0; // количество месяцев отдыха
            for (int month = 1; month <= 12; month++) {
                if (money >= threshold) { // решение отдохнуть
                    restMonths++;
                    money = money - expenses; // уменьшаем баланс на обязательные траты
                    money /= 3; // уменьшаем баланс на траты на отдых
                } else { // решение поработать
                    money += income - expenses; // увеличиваем баланс на доход от работы и уменьшаем на траты
                }
            }
            return restMonths;
        }
    }
