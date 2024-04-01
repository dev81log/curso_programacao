import entities.Champion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        Champion champ1 = createChampion(sc);

        System.out.println("Digite os dados do segundo campeão:");
        Champion champ2 = createChampion(sc);

        System.out.print("Quantos turnos você deseja executar? ");
        int turns = sc.nextInt();

        for (int i = 1; i <= turns; i++) {
            System.out.println("Resultado do turno " + i + ":");
            champ2.takeDamage(champ1);
            champ1.takeDamage(champ2);
            System.out.println(champ1.status());
            System.out.println(champ2.status());

            if (champ1.getLife() == 0 || champ2.getLife() == 0) {
                System.out.println("FIM DO COMBATE");
                break;
            }
        }

        sc.close();
    }

    private static Champion createChampion(Scanner sc) {
        System.out.print("Nome: ");
        String name = sc.next();
        System.out.print("Vida inicial: ");
        int life = sc.nextInt();
        System.out.print("Ataque: ");
        int attack = sc.nextInt();
        System.out.print("Armadura: ");
        int armor = sc.nextInt();
        return new Champion(name, life, attack, armor);
    }
}