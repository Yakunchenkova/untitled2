Негативный тест 1 

Предусловие:
1. Открыть браузер
2. Перейти по ссылке https://practice-automation.com/form-fields/
Шаги:
1. Заполнить поле Namе Olga 
2. Заполинть поле Password 12345
3. Из списка What is your favorite drink? выбрать Wine и Water
4. Из списка What is your favorite color? выбрать Blue
5. В поле Do you like automation? выбрать Yes
6. Поле Email заполнить строкой name@example.com
7. В поле Message написать количество favorite color, описанных в пункте What is your favorite color?
8. Нажать на кнопку Submit
Ожидаемый результат: должно появится сообщение, что пароль должен содеражть строчные и заглавные буквы, спецсимволы, цифры и быть не меньше 8 знаков.   !

Негативный тест 2 
Предусловие:
1. Открыть браузер
2. Перейти по ссылке https://practice-automation.com/form-fields/
Шаги:
1. Заполнить поле Namе Olga
2. Заполнить поле Password 12345
3. Из списка What is your favorite drink? выбрать Wine и Water
4. Из списка What is your favorite color? выбрать Blue
5. В поле Do you like automation? выбрать Yes
6. Поле Email заполнить olga
7. В поле Message написать количество favorite color, описанных в пункте What is your favorite color?
8. Нажать на кнопку Submit

Ожидаемый результат: появится сообщение, что e-mail заполнен некорректно!

Позитивный тест 1 

Предусловие:
1. Открыть браузер
2. Перейти по ссылке https://practice-automation.com/form-fields/
Шаги:
1. Заполнить поле Name Olga
2. Заполнить поле Password 12345
3. Из списка What is your favorite drink? выбрать Wine и Water
4. Из списка What is your favorite color? выбрать Blue
5. В поле Do you like automation? выбрать Yes
6. Поле Email заполнить строкой name@example.com

7. В поле Message написать количество favorite color, описанных в пункте What is your favorite color?
8. Нажать на кнопку Submit
Ожидаемый результат: появился алерт с текстом Message received!
Позитивный тест 2

Предусловие:
1. Открыть браузер
2. Перейти по ссылке https://practice-automation.com/form-fields/
Шаги:
1.  Из списка What is your favorite drink? выбрать Wine и Water
2. Из списка What is your favorite color? выбрать Blue
3. В поле Do you like automation? выбрать Yes
4. Поле Email заполнить строкой name@example.com
5. В поле Message написать количество favorite color, описанных в пункте What is your favorite color?
6. Нажать на кнопку Submit
Ожидаемый результат: курсор переместиться в поле Name!
