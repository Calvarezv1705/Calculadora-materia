import java.util.Scanner;

public class Materia {

    private int id_estudiante;
    private int id_curso;
    private float nota_parciales;
    private float nota_practicas;
    private float nota_finales;
    private int porcentaje_parciales;
    private int porcentaje_practicas;
    private int porcentaje_finales;

    public Materia(int id_estudiante, int id_curso, float nota_parciales, float nota_practicas, float nota_finales,
            int porcentaje_parciales, int porcentaje_practicas, int porcentaje_finales) {
        this.id_estudiante = id_estudiante;
        this.id_curso = id_curso;
        this.nota_parciales = nota_parciales;
        this.nota_practicas = nota_practicas;
        this.nota_finales = nota_finales;
        this.porcentaje_parciales = porcentaje_parciales;
        this.porcentaje_practicas = porcentaje_practicas;
        this.porcentaje_finales = porcentaje_finales;

    }

    public boolean asignarPorcentajes() {
        Scanner teclado = new Scanner(System.in);
        boolean resultado = true;

        System.out.println("ingrese el porcentaje total de los parciales");
        porcentaje_parciales = teclado.nextInt();

        System.out.println("ingrese el porcentaje total de las practicas");
        porcentaje_practicas = teclado.nextInt();

        System.out.println("ingrese el porcentaje del final");
        porcentaje_finales = teclado.nextInt();

        while (porcentaje_finales + porcentaje_parciales + porcentaje_practicas != 100) {

            if (porcentaje_finales + porcentaje_parciales + porcentaje_practicas != 100) {
                System.out.println("la suma de los porcentajes tiene que dar 100");
                resultado = false;

                System.out.println("ingrese el porcentaje total de los parciales");
                porcentaje_parciales = teclado.nextInt();

                System.out.println("ingrese el porcentaje total de las practicas");
                porcentaje_practicas = teclado.nextInt();

                System.out.println("ingrese el porcentaje del final");
                porcentaje_finales = teclado.nextInt();

                Materia materia = new Materia(id_estudiante, id_curso, nota_parciales, nota_practicas, nota_finales,
                        porcentaje_parciales, porcentaje_practicas, porcentaje_finales);

            }
        }
        return resultado;
    }

    public boolean registrarParciales() {
        Scanner teclado = new Scanner(System.in);

        boolean resultado = false;

        System.out.println("ingresa la nota total de los parciales");
        nota_parciales = teclado.nextFloat();

        if (nota_parciales != 0) {
            Materia materia = new Materia(id_estudiante, id_curso, nota_parciales, nota_practicas, nota_finales,
                    porcentaje_parciales, porcentaje_practicas, porcentaje_finales);

            resultado = true;
        }

        return resultado;
    }

    public boolean registrarPracticas() {
        Scanner teclado = new Scanner(System.in);

        boolean resultado = false;

        System.out.println("ingresa la nota total de las practicas");
        nota_practicas = teclado.nextFloat();

        if (nota_practicas != 0) {
            Materia materia = new Materia(id_estudiante, id_curso, nota_parciales, nota_practicas, nota_finales,
                    porcentaje_parciales, porcentaje_practicas, porcentaje_finales);

            resultado = true;
        }

        return resultado;
    }

    public boolean registrarFinales() {
        Scanner teclado = new Scanner(System.in);

        boolean resultado = false;

        System.out.println("ingresa la nota del final");
        nota_finales = teclado.nextFloat();

        if (nota_finales != 0) {
            Materia materia = new Materia(id_estudiante, id_curso, nota_parciales, nota_practicas, nota_finales,
                    porcentaje_parciales, porcentaje_practicas, porcentaje_finales);

            resultado = true;
        }
        return resultado;
    }

    public void calcularNotaFinal() {
        if (porcentaje_finales == 0 || porcentaje_parciales == 0 || porcentaje_practicas == 0) {
            System.out.println("-1");
        } else {
            float nota = ((nota_parciales * porcentaje_parciales) + (nota_practicas * porcentaje_practicas) +
                    (nota_finales * porcentaje_finales)) / 100;

            System.out.println(nota);
        }
    }
}
