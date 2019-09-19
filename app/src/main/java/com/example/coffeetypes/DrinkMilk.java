package com.example.coffeetypes;

public class DrinkMilk {
    private String name;
    private String description;
    private int imageId;

    public static final DrinkMilk[] milkDrinks = {new DrinkMilk("Affogato", "Кофейный десерт, который представляет собой мороженое, залитое порцией эспрессо.", R.drawable.affogato ),
            new DrinkMilk("Bonbon Coffee", "Испанский вариант кофе со сгущенкой.", R.drawable.bonbon_coffee),
            new DrinkMilk("Cappuchino", "Эспрессо со вспененным молоком.", R.drawable.cappuchino),
            new DrinkMilk("Coffee with Milk", "Домашний напиток, который туристам часто приносят вместо Латте.", R.drawable.coffee_with_milk),
            new DrinkMilk("Flat White Coffee", "Двойной эспрессо с подогретым через капучинатор молоком и мелкой пеной на поверхности.", R.drawable.flat_white),
            new DrinkMilk("Frappe Coffee", "Xолодный растворимый кофе с пенкой.", R.drawable.frappe_coffee),
            new DrinkMilk("Latte", "Hапиток из эспрессо со вспененным молоком.", R.drawable.latte_coffee),
            new DrinkMilk("Makkiato", "Шот эспрессо с небольшой дозой вспененного молока. Пенка буквально на мизинец покрывает поверхность кофе.", R.drawable.makiatto_coffee),
            new DrinkMilk("Melange Coffee", "Что-то среднее между латте и капучино.", R.drawable.melange_coffee)

    };

    public DrinkMilk(String name, String description, int imageId){
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
