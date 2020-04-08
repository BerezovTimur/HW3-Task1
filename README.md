## Приложение "Buy ticket -Get Miles"

### Краткое описание

На основе технического задания было создано приложение "Buy ticket -Get Miles". 
Приложение высчитывает количество начисленных бонусов за покупку билета. Начисление идет по формуле 1 бонус за 20 потраченных рублей.
Переменные используемы в приложении:
- TicketPrice - стоимость билета в рублях;
- BonusMile - количество рублей неоходимых для получения 1 бонуса;
- TotalBonus - итоговая сумма бонусов;
- TotalBonus1 - округленная сумма бонусов до нижнего целого значения.

### Описание использованных тестов

При тестировании приложения использовалось функциональное тестирование методом эквивалетных значений.

Для проверки были взяты следующие данные для TicketPrice: 0, 20, 39.90, 1000, -20.

### Результаты проверки.

При TicketPrice=0 полученный результат TotalBonus1=0.
При TicketPrice=20 полученный результат TotalBonus1=1.
При TicketPrice=39.90 полученный результат TotalBonus1=1.
При TicketPrice=1000 полученный результат TotalBonus1=50.
При TicketPrice=-20 полученный результат TotalBonus1=-1.

Приложение проверку прошло

https://github.com/BerezovTimur/HW3-Task1/issues/1

### Общие рекомендации

- реализовать проверку на отрицательное число в TicketPrice и вывод об этой ошибке.