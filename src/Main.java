public class Main {
    public static void main(String[] args) {
        //Урок с Ильёй Сазоновым.
        //Цикл do-while
        int userWantsToСontinue = 1;
        int level = 1;
        do {
            System.out.println("Завершен уровень " + level);
            System.out.println("Хотите продолжить?");
            level++;
        }
        while (userWantsToСontinue == 1 && level < 5);
        System.out.println("====================================================================================");
        //Цикл do-while
        int userWantsToСontinueX = 1;
        // Переменная, обозначающая, что юзер хочет продолжить игру
        // 1 — хочет продолжить, 0 — не хочет продолжать играть
        int levelX = 1;
        // Переменная со значением номера уровня
        do {
            System.out.println("Завершен уровень " + levelX);
            // Выводим текст с номером уровня игры
            System.out.println("Хотите продолжить?");
            // Спрашиваем, хочет ли пользователь продолжить игру
            levelX++;
            // К переменной level прибавляем 1, это следующий уровень
        }
        while (userWantsToСontinueX == 1 && levelX < 5);
        // Записываем условие: если пользователь хочет продолжить
        // и номер уровня меньше или равен 5
        System.out.println("=======================================================================================");
        //С условным оператором придется написать большое количество одинаковых проверок:
        int isQueueEmpty = 1;
        if (isQueueEmpty == 1) {
            System.out.println("Пожалуйста подождите!Сейчас Вас пригласят в кабинет!");
        }
        if (isQueueEmpty == 1) {
            System.out.println("Пожалуйста подождите!Сейчас Вас пригласят в кабинет!");
        }
        if (isQueueEmpty == 1) {
            System.out.println("Пожалуйста подождите!Сейчас Вас пригласят в кабинет!");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Задача про очередь решается с помощью цикла while так:
        int isQueueEmptyX = 1;
        while (isQueueEmptyX == 1) {
            System.out.println("Пожалуйста подождите!Сейчас Вас пригласят в кабинет!");
            //System.out.println("Нажмите кнопку вызова сотрудника!");
            break;
        }
        System.out.println("==========================================================================================");
        //Как записать блок условия для цикла while
        //Указать true явно: while (true). См. пример в разделе «Оператор break».
        //Передать переменную: while (isQueueEmpty).
        //Указать логическое выражение, результатом которого будет true/false:
        int yourSalary = 0;
        while (yourSalary < 1_000_000) {
            System.out.println("Надо усердно работать!");
            break;
        }
        System.out.println("===================================================================================");
        int trueX = 1;
        while (trueX == 1) {
            System.out.println("Пожалуйста,подождите!");
            break;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int isQueueEmptyZOV = 1;
        if (isQueueEmptyZOV == 1) {
            System.out.println("Вы следующий, проходите!");
        }
        System.out.println("=======================================================================================");
        //Доработаем наш пример с электронной очередью с учетом того, что нам надоест ждать.
        int isQueueEmptyDog = 1;
        int dontWantToWait = 0;
        while (isQueueEmptyDog == 0) {
            System.out.println("Пожалуйста,подождите!");
            break;
        }
        while (isQueueEmptyDog == 1) { // Пока очередь перед нами не пуста
            if (dontWantToWait == 0) { // Если ждать надоело
                System.out.println("Вы уже уходите.Всего доброго!Мы надеемся увидеть Вас в будущем!");
                break; // Прерываем ожидание и уходим
            }
            System.out.println("Пожалуйста,подождите!");
            break;
        }
        System.out.println("==================================================================================");
        // Цикл do-while
        //По принципу работы цикл do-while похож на while. Отличие в том, что while может выполниться 0 раз
        // (если условие изначально равняется false), а цикл do-while выполнится минимум 1 раз.
        //Цикл while сначала проверяет условие в скобках и затем выполняет блок.
        // do-while сначала запускает блок, а потом проверяет условие.
        //Опишем работу цикла do-while простым языком:
        //ВЫПОЛНЯЙ { этот блок } ПОКА (условие соблюдается)
        int quantity = 0;
        do {
            quantity = quantity + 1;
            System.out.println("Количество:" + quantity);
        } while (quantity < 10);
        System.out.println("==================================================================================");
        int i = 5;
        while (i < 9) {
            System.out.println(i);
            i++;
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int ix = 5;
        do {
            System.out.println(ix);
            ix++;
        } while (ix < 9);
        System.out.println("==================================================================================");
        //Решаем задачи с помощью цикла do-while
        //Рассмотрим пример, для решения которого пригодится цикл do-while.
        //Представим, что мы разрабатываем игру. Если пользователь завершает первый уровень, программа у него
        // спрашивает, хочет ли он продолжить. Если ответ «да», то запускается следующий уровень. И так до
        // пятого уровня.
        //Запишем алгоритм с помощью цикла do-while.
        //Объявим переменную с информацией о том, что пользователь хочет продолжить игру. Для удобства вместо
        // логической переменной используем переменную int, значение которой 1 — это true:
        //int userWantsToСontinue = 1;
        //И объявим переменную с начальным уровнем:
        //int level = 1;
        //Запишем, что нужно сделать до проверки условия:
        //do {
            //System.out.println("Завершен уровень " + level);
            // Выводим текст с номером уровня игры
            //System.out.println("Хотите продолжить?");
            // Спрашиваем, хочет ли пользователь продолжить игру
            //level++;
            // К переменной level прибавляем 1, это следующий уровень

        //Теперь нужно указать условие — если пользователь хочет продолжить игру и если номер уровня меньше
        //или равен 5:
        //while (userWantsToСontinue == 1 && level < 5);
        //Полностью код будет выглядеть так:

        int userWantsToСontinueC = 1;
        int levelC = 1;
        do {
            System.out.println("Завершен уровень " + levelC);
            System.out.println("Хотите продолжить?");
            levelC++;
        } while (userWantsToСontinueC == 1 && levelC < 5);
        //Как мы видим, даже если пользователь не захочет дальше играть, мы как минимум 1 раз запустим игру.
        System.out.println("======================================================================================");
        //Оператор continue.(Грязный пример,для понимания темы!)
        //Бывают ситуации, когда нам нужно принудительно пропустить выполнение шага цикла в зависимости от
        // условий.
        //Например, наше ожидание в очереди скрасит поход по делам. В поликлинике мы можем, пока ждем очередь
        // к одному врачу, посетить другого врача. В МФЦ выпить кофе из кофейного аппарата.
        //Представим, что наличие такого рода «развлечений» во время ожидания описано в виде boolean переменной
        // needToDoSomethingElse.
        //Код будет выглядеть следующим образом:
        int isQueueEmptyNow = 1;
        int needToDoSomethingElse = 0;
        while (isQueueEmptyNow == 1) {
            System.out.println("Ждём приглашения в кабинет!");
            if (needToDoSomethingElse == 1) {
                System.out.println("Можно выпить чашечку кофе!");
                break;
            }
            break;
        }
        System.out.println("===================================================================================");
        //Оператор continue.
        //Ниже приведён очень хороший пример использования оператора "continue" в цикле for:
        // Объявляем переменную dayNumber, она равна номеру дня в месяце
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            // Каждый день проверяем, является ли он третьим (выходным)
            if (dayNumber % 3 == 0) {
                // Выводим сообщение
                System.out.println("Сегодня " + dayNumber + "-е " + "число.Сегодня отдыхаем!");
                // Ждем следующий день
                continue;
            }
            System.out.println("Сегодня " + dayNumber + "-е " + "число.Сегодня рабочий день!");
            // Если день не выходной, выводим сообщение
        }
        System.out.println("==================================================================================");
        //Использование оператора "continue;" в цикле while:
        int day = 0;
        while (day < 31) {
            day++;
            if (day % 3 == 0) {
                System.out.println("Сегодня " + day + "-е " + "число.Сегодня отдыхаем!");
                continue;
            }
            System.out.println("Сегодня " + day + "-е " + "число.Сегодня рабочий день!");
        }
        System.out.println("======================================================================================");
        // for или while?
        //Циклы for и while занимаются одним и тем же и «под капотом» превращаются в одни и те же инструкции.
        // Вопрос выбора между for и while — вопрос удобства.
        //Если переменная со счетчиком в цикле нужна и она меняется строго в конце итерации, удобнее for.
        //Если переменная со счетчиком цикла не нужна или она может измениться в любой момент, то разработчики
        // предпочитают while.





































        System.out.println("Hello Russia!Hello China!Hello World!");
    }
}






       

       

       

       








       




