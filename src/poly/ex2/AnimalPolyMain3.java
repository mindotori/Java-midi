package poly.ex2;

//PolyMain1 리팩토링
public class AnimalPolyMain3 {

    public static void main(String[] args) {

        //배열은 같은 타입의 데이터를 나열할 수 있다 (Animal의 자식들이니 Animal 타입)
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Pig()} ;

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
