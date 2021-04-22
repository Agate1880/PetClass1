package PetTypes;

import static PetTypes.MainPet.age;
import static PetTypes.MainPet.name;

public class PetClass1 {
    public static void main(String[] args){
        PetClass1 myPet = new PetClass1();


        myPet.showMyPet();
    }

    private void showMyPet(){
        System.out.println("Hello i am Agate. ");
        System.out.print(" I have a cat and he is  ");
        System.out.print( 5 );
        System.out.print(" Years Old. ");
        System.out.println("His name is Cat");
        System.out.print(" His weight is  " );
        System.out.print( 2.3f );
        System.out.print(" Kg " );



        MainPet cat = new MainPet();

        name = "Cat";
        cat.gender = "Male";
        cat.legs = 4;
        age= 5;


        System.out.println("I have a " + name + "He is " + age + "old.");

    }
}


