//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 2
        System.out.println("Task 2");

        var number4 = 4;
        dog = dog + number4;
        cat = cat + number4;
        paper = paper + number4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 3
        System.out.println("Task 3");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Task 4
        System.out.println("Task 4");

        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend + 2 = " + friend);
        friend /= 7;
        System.out.println("friend / 7 = " + friend);

        //Task 5
        System.out.println("Task 5");

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog * 10 = " + frog);
        frog /= 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog += number4;
        System.out.println("frog + number4 = " + frog);

        //Task 6
        System.out.println("Task 6");

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса двух бойцов - " + totalWeight + " кг.");
        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница веса бойцов - " + differenceWeight);


        //Task 7
        System.out.println("Task 7");

        differenceWeight = secondBoxer % firstBoxer;
        System.out.println("Разница веса бойцов - " + differenceWeight);

        //Task 8
        System.out.println("Task 8");

        var generalOpeningHours = 640;
        var workingHours = 8;
        var employee = generalOpeningHours / workingHours;
        System.out.println("Всего работников в компании — " + employee + " человек");

        employee += 94;
        generalOpeningHours = employee * workingHours;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + generalOpeningHours + " часов работы может быть поделено между сотрудниками");
    }
}