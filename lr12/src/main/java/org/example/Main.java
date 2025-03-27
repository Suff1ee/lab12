package org.example;
class Main {
    public static void main(String[] args) {
        Tester.printCompany();

        Tester t1 = new Tester();
        Tester t2 = new Tester("Сергей", "Пестрак");
        Tester t3 = new Tester("Ольга", "Вальнова", 2){
          @Override
          public void work() {
              System.out.println("Ольга тестирует ПО проекта.");
          }
        };
        Tester t4 = new Tester("Павел", "Гугол", 15, "А1", 1000.0){
            @Override
            public void work(String project, int hours) {
                System.out.println("Павел тест-ирует ПО проекта: " + project + " в течение " + hours + " часов.");
            }
        };

        t1.work();
        t2.work("Мобилка");
        t3.work("Сайт", 8);
        t4.work("ПО для гос. структур", 30);
    }
}