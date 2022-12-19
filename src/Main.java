public class Main {
    public static void main(String[] args) {
        Flower [] flowers = new Flower[3];
        Flower роза = new Flower("Роза ","Голандия ",35.59 ,0);
        Flower хризантема = new Flower("Хризантема","",15.00,5);
        Flower пионИзАнглии = new Flower("Пион из Англии","",69.9,1);
        Flower гипсофила = new Flower("Гипсофила","Турция",19.5,10);
        System.out.println("Название "+ роза.getFlowerName()+ " Страна " + роза.getCountry()+" Цена " + роза.getCost() +" срок стояния "+ роза.getLifeSpan());
        System.out.println("Название "+ хризантема.getFlowerName()+ " Страна " + хризантема.getCountry()+" Цена " + хризантема.getCost() +" срок стояния "+ хризантема.getLifeSpan());
        System.out.println("Название "+ пионИзАнглии.getFlowerName()+ " Страна " + пионИзАнглии.getCountry()+" Цена " + пионИзАнглии.getCost() +" срок стояния "+ пионИзАнглии.getLifeSpan());
        System.out.println("Название "+ гипсофила.getFlowerName()+ " Страна " + гипсофила.getCountry()+" Цена " + гипсофила.getCost() +" срок стояния "+ гипсофила.getLifeSpan());


    }
}
