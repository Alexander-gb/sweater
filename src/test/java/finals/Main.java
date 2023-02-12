// 1.Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2.Создать множество ноутбуков (ArrayList).
// 3.Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у
// пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию

package finals;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите стоимость ноутбука до - ");

            double number = sc.nextDouble();


            ArrayList<Laptop> laptops = new ArrayList<Laptop>();

            Laptop laptop1 = new Laptop("Lenovo", 300, 4000, 15999.99, "Eldorado");

            Laptop laptop2 = new Laptop("Macbook", 300, 8000, 19999.99, "Eldorado");

            Laptop laptop3 = new Laptop("ASUS", 300, 2000, 11999.99, "Eldorado");

            Laptop laptop4 = new Laptop("Samsung", 300, 8000, 18999.99, "Eldorado");

            Laptop laptop5 = new Laptop("LG", 300, 12000, 29999.99, "Eldorado");

            laptops.add(laptop1);
            laptops.add(laptop2);
            laptops.add(laptop3);
            laptops.add(laptop4);
            laptops.add(laptop5);

            for (int i = 0; i < laptops.size() ; i++) {
                Laptop currentLaptop = laptops.get(i);

                if(currentLaptop.getPrice() <= number){
                    System.out.println("Model:" + currentLaptop.getName() + " Price " +currentLaptop.getPrice()+ " Seller "+currentLaptop.getSeller()+ " RAM "+currentLaptop.getRam());
                }
            }




        }
    }
