
// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

package LaptopStore;

import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public void filterLaptops(Map<String, Object> filters) {
        List<String> matchingBrands = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean passFilter = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                switch (key) {
                    case "ram":
                        if (laptop.getRam() < (int) value) {
                            passFilter = false;
                        }
                        break;
                    case "storageCapacity":
                        if (laptop.getStorageCapacity() < (int) value) {
                            passFilter = false;
                        }
                        break;
                    case "operatingSystem":
                        if (!laptop.getOperatingSystem().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equalsIgnoreCase((String) value)) {
                            passFilter = false;
                        }
                        break;
                    case "displaySize":
                        if (laptop.getDisplaySize() < (int) value) {
                            passFilter = false;
                        }
                        break;

                    default:
                        System.out.println("Invalid filter criteria: " + key);
                }
            }

            if (passFilter) {
                matchingBrands.add(laptop.getBrand());
            }
        }

        if (!matchingBrands.isEmpty()) {
            System.out.println("Предложенные бренды ноутбуков, отвечающих критериям: " + matchingBrands);
        } else {
            System.out.println("Нет ноутбуков, соответствующих заявленным критериям.");
        }
    }

    public Map<String, Object> getFiltersFromUser() {
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Выберите критерии фильтрации:");

        System.out.print("Введите объем пвмяти RAM (8Mb, 16Mb, 32Mb): ");
        int ram = scanner.nextInt();
        filters.put("ram", ram);

        scanner.nextLine(); // Очистка буфера после ввода int для корректного считывания строк

        System.out.print("Введите операционную систему (Windows, Linux, FreeOS): ");
        String operatingSystem = scanner.nextLine();
        filters.put("operatingSystem", operatingSystem);

        System.out.print("Введите объем накопителя (256Gb, 512Gb, 1024Gb): ");
        int storageCapacity = scanner.nextInt();
        filters.put("storageCapacity", storageCapacity);

        scanner.nextLine(); // Очистка буфера после ввода int для корректного считывания строк

        System.out.print("Введите цвет: ");
        String color = scanner.nextLine();
        filters.put("color", color);

        System.out.print("Введите размер диагонали дисплея (13`, 15`, 17`): ");
        int displaySize = scanner.nextInt();
        filters.put("displaySize", displaySize);

        scanner.nextLine(); // Очистка буфера после ввода int для корректного
        // считывания строк

        return filters;
    }

}
