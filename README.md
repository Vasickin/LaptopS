# Программа фильтрации ноутбуков по критериям

Программа позволяет пользователю добавлять ноутбуки, фильтровать их по различным критериям и просматривать результаты.

## Структура проекта

Проект состоит из двух файлов:

1. **Laptop.java**: Этот файл содержит определение класса `Laptop`, который представляет собой модель ноутбука.

2. **LaptopStore.java**: Этот файл содержит основной код программы, включая класс `LaptopStore`, который управляет магазином ноутбуков, и метод `main` для запуска программы.

## Использование

2. **Фильтрация ноутбуков**: Программа запрашивает у пользователя критерии фильтрации, такие как объем RAM, операционная система, объем накопителя, цвет и размер дисплея. Затем программа отфильтрует ноутбуки и выведет список брендов, соответствующих критериям.


## Примеры ввода

1. Руководствуясь подсказками, пользователь вводит значения соответствующие параметру бренда, такие как: RAM, операционная система, объём накопителя,цвет и размер экрана.

2. После ввода всех критериев программа отфильтрует ноутбуки и выведет список брендов, удовлетворяющих критериям.

3. В том случаи если не один из критериев не попадает под бренд ноутбука, программа выведит сообщение: `Нет ноутбуков, соответствующих заявленным критериям.`

## Примечание

1. **Добавление ноутбуков**: Можно добавить свои собственные ноутбуки, следуя формату добавления, указанному в методе `main`.