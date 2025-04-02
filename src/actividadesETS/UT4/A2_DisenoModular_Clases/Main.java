package actividadesETS.UT4.A2_DisenoModular_Clases;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Prisma prisma1 = new Prisma("Prisma1", (int) (Math.random()*10+1), (int) (Math.random()*10+1));
        Prisma prisma2 = new Prisma("Prisma2", (int) (Math.random()*10+1), (int) (Math.random()*10+1));
        Prisma prisma3 = new Prisma("Prisma3", (int) (Math.random()*10+1), (int) (Math.random()*10+1));
        ArrayList<Prisma> listaPrisma = new ArrayList<Prisma>();
        listaPrisma.add(prisma1);
        listaPrisma.add(prisma2);
        listaPrisma.add(prisma3);
        printListaPrisma(listaPrisma);
        Collections.sort(listaPrisma);  // Ordenamos por el area total
        print(true, "==============================");
        print(true, "Ordenados de mayor a menor: \n");
        printListaAreas(listaPrisma);
    }

    public static void print(boolean wantln, String message) {
        if (wantln) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }
    }

    public static void printListaPrisma(ArrayList<Prisma> listaPrisma ) {
        print(true, "==============================");
        print(true, " CREACION DE OBJETOS PRISMA: ");
        print(true, "==============================");
        for (Prisma prisma : listaPrisma) {
            print(true, "Creado el objeto " + prisma.getNombre() + " con:\n" +
                    "  - Base: " + prisma.getBaseTriangulo() + "\n" +
                    "  - Altura: " + prisma.getAlturaPrisma() + "\n" +
                    "  - Area total: " + (Math.floor(prisma.areaTotal()*100)/100));
            print(true,"");
        }
    }

    public static void printListaAreas(ArrayList<Prisma> listaPrisma) {
        for (Prisma prisma : listaPrisma) {
            print(true, " - " + prisma.getNombre() + ": Area total = " + (Math.floor(prisma.areaTotal() * 100)/100));
        }
    }
}
