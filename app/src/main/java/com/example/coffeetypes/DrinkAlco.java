package com.example.coffeetypes;

public class DrinkAlco {
    private String name;
    private String description;
    private int imageId;

    public static final DrinkAlco[] alkoDrinks = {new DrinkAlco("Irish Coffee", "Горячий коктейль на основе ирландского виски и эспрессо", R.drawable.irish_coffee),
            new DrinkAlco("Amaretto Coffee", "Горячий коктейль на основе ликера Амаретто, миндальных орехов, сливок и эспрессо", R.drawable.amaretto_coffee),
            new DrinkAlco("Beylis Coffee", "Горячий коктейль на основе ликера Бейлиз, шоколадной крошки, взбитых сливок и эспрессо", R.drawable.beylees_coffee),
            new DrinkAlco("Brazilyero Coffee", "Горячий коктейль на основе крепкого кофе, Кашасы, Шоколадного ликера, Сахарного сиропа и Сливок высокой жирности", R.drawable.brazilyero_coffee),
            new DrinkAlco("Brullo Coffee", "Горячий коктейль на основе крепкого кофе, Бренди, Сахара, Цедры лимона, Цедры апельсина, Гвоздики, Палочки ванили ", R.drawable.brullo_coffee),
            new DrinkAlco("Corretto Coffee", "Эспрессо с добавлением различного рода ликеров.", R.drawable.corretto_coffee),
            new DrinkAlco("Farissey Coffee", "Горячий коктейль на основе Крепкого кофе, Коричневого рома, Сахара и Сливок высокой жирности", R.drawable.farissey_coffee),
            new DrinkAlco("Hot Port Flip Coffee", "Горячий коктейль на основе Крепкого кофе, Кашасы, Шоколадного ликера, Сахарного сиропа, Сливок высокой жирности ", R.drawable.hot_flip)

    };

    public DrinkAlco(String name, String description, int imageId){
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
