# Algo-Lab1 Quick Sort

## Task:
        Лабораторна 1
      Вашим завданням є реалізувати  алгоритм сортування.  Вхідними даними є одномірний масив чисел, який записується через кому і можна запустити таким чином:
      python merge_sort.py asc 1,2,56,45,-9,78,11
      java MergeSort.java desc 1,2,56,45,-9,78,11
      asc - ascending
      desc - descending
      Тобто ваш код має вміти сортувати як за зростанням. так і за спаданням
      Результат має виводити:
      * назва алгоритму
      * час роботи
      * кількість операцій порівняння, які були виконані в процесі роботи алгоритму
      * кількість операцій обміну, які були виконані в процесі роботи алгоритму
      * Результати сортування
      MergeSort:
      execution time: 23ms
      Comparisons: 2000
      Swaps: 3000
      -9,1,2,11,45,56,78
      Кожен студентd повинен мати власний код !
      Код слід залити в Github до демонстрації викладачу та додати посилання коментарем в документ з оцінками
      Проект має мати коректно налаштований .gitignore (компіляційні файли, файли налаштування  IDE мать бути відсутні в репозиторії)
      Ваш код має бути покритий тестами, які перевіряють:
      * сортування вхідного масиву
      * сортування за зростанням посортованого масиву  за зростанням
      * сортування за спаданням посортованого масиву  за зростанням
      * сортування за спаданням посортованого масиву  за зростанням
      * сортування за спаданням посортованого масиву  за спаданням

## How to run:
1. Open a command line
2. Download the files to the desired folder using the command: **git clone https://github.com/uragrisk/Algo-Labs.git**
3. With the command cd <*path to downloaded project*> we go to the package src\main\java
4. Enter commands:
    * **javac -sourcepath ua ua\lviv\iot\Transformer.java**
    * **javac -sourcepath ua ua\lviv\iot\Main.java**
    * **java ua.lviv.iot.Main *(sort order) (array listed through a comma without spaces)***

