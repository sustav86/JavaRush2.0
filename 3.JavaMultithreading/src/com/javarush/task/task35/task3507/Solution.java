package task35.task3507;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ukr-sustavov on 10.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        Set<Animal> result = new HashSet<>();
        File[] fileArray = null;
        try {
            fileArray = new File(pathToAnimals).listFiles();
        } catch (Exception e) {

        }

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        String filePath;
        boolean isConstructor = false;

        for (int i = 0; i < fileArray.length; i++) {
            if (fileArray[i].isDirectory()) {
                continue;
            }
            isConstructor = false;
            Class aClass = null;

            filePath = (Solution.class.getPackage().getName() + "/data/" + fileArray[i].getName()).replaceAll("/", ".").replaceAll(".class", "");

            try {
                aClass = classLoader.loadClass(filePath);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            if (!Animal.class.isAssignableFrom(aClass)) {
                continue;
            }
            for (Constructor<?> constructor : aClass.getConstructors()) {
                if (constructor.getParameterCount() == 0) {
                    isConstructor = true;
                }
            }
            if (isConstructor) {
                Animal animal = null;
                try {
                    animal = (Animal) aClass.newInstance();
                } catch (Exception e) {

                }

                result.add(animal);
            }


        }

        return result;
    }

}