package com.example.coffeetypes;

public class DrinkSimple {
    private String name;
    private  String description;
    private int imageId;

    public static final DrinkSimple[] simpleDrinks= { new DrinkSimple("Americano", "Эспрессо обычный или двойной, в который после приготовления добавили горячей воды",R.drawable.americano),
        new DrinkSimple("Crema Coffee", "Для заваривания применяют более грубый помол, чем в эспрессо, который проливают бОльшим объемом воды.", R.drawable.crema_coffee),
        new DrinkSimple("Cuba Coffee", "Готовят с использованием тростникового сахара.", R.drawable.cuba_coffee),
        new DrinkSimple("Doppio Coffee", "Готовится как двойная порция эспрессо, две закладки кофе и два объема воды.", R.drawable.doppio),
            new DrinkSimple("Espresso", "Напиток приготовленный с помощью рожковой эспрессо-машины. ", R.drawable.espresso),
            new DrinkSimple("Lungo", "Похож на Американо по пропорции воды к кофе. Однако, этот объем воды используется при заваривании (пропускается через кофе), в противоположность Американо, где вода заливается в готовый эспрессо. ", R.drawable.restretto_coffee),
            new DrinkSimple("Restretto", "Эспрессо заваренный из того же количества кофе и за то же время экстракции, но с использованием вдвое меньшего количества воды.. ", R.drawable.espresso),
            new DrinkSimple("Romano", "Эспрессо подается с ломтиком лимона. Лимон используют чтобы смазать край чашечки. ", R.drawable.romano_coffee),
            new DrinkSimple("Zorro Coffee", "Двойной эспрессо или допио, в которые добавлена горячая вода в соотношении 1:1. ", R.drawable.zorro_coffee),
    };

    public DrinkSimple(String name, String description, int imageId){
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImageId(){
        return imageId;
    }
    public String toString(){
        return this.name;
    }
}
