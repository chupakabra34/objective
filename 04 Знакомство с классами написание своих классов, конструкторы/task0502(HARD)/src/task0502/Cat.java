package task0502;

/* 
Реализовать метод fight
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.


Requirements:
1. Класс Cat должен содержать конструктор без параметров.
2. Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
3. В классе Cat должен быть метод fight.
4. В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
5. Метод должен возвращать одно и то же значение, если мы деремся с одним и тем же котом.
6. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int x = 0;
        int y = 0;

        if (this.age > anotherCat.age) {
            x++;
        } else if (this.age < anotherCat.age) {
            y++;
        } else {
            x++;
            y++;
        }

        if (this.weight > anotherCat.weight) {
            x++;
        } else if (this.weight < anotherCat.weight) {
            y++;
        } else {
            x++;
            y++;
        }

        if (this.strength > anotherCat.strength) {
            x++;
        } else if (this.strength < anotherCat.strength) {
            y++;
        } else {
            x++;
            y++;
        }

        if (x == y) {
            return false;
        } else if (x > y) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
