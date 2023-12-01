//
//lab04: Designing Interfaces
//Character > [Archer] [Swordsman]
//Accessories > [Bracelet] [Cloaks]
//
//[Character]
//Archer; atk=15 def=7 hp=15 spd=10
//Swordsman; atk=10 def=10 hp=25 spd=7
//attack(object); attack at the target
//equip(Accessories); equip Accessories
//unequip(Accessories); unequip accessories in accessories set
//skill(target,skillset); use skill in skill set
//
//[Accessories]
//Bracelet; atk+10, spd+10
//Cloaks; spd+15
//Upgrade; level up accessory
//Check stat; return every status in array format [level,hp,atk,def,mp,spd,]
//
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}