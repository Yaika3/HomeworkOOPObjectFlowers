public class Flower {
    String flowerName;
    private  String country;
    //нвозможно изменить значени если final, не подставить значение другой переменной, ругается в строке 16.Можно в сетере прописать необходимые условия.
    private double cost;
    // тоже самое с cost.не дает присвоить значение по умолчанию, если присвою сразу,то не даст поменять.
    int lifeSpan;
    // как цифры проверить на пустоту? если не указать ничего в мейне,то все сломается....


    public Flower(String flowerName,String country,double cost,int lifeSpan) {
        this.flowerName = flowerName;
        if ( this.flowerName == null||flowerName.isEmpty())
        { this.flowerName = "Тип цветка не указан";
        }
        this.country=country;
        if (this.country == null||country.isEmpty())
        {this.country=" Россия ";
        }
        this.cost = cost;
        if (this.cost <= 0 ) {
            this.cost = 1;}




        this.lifeSpan = lifeSpan;
        if (this.lifeSpan <= 0 ) {
            this.lifeSpan = 3;}


    }


    public String getCountry() {
        return country;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }


}

