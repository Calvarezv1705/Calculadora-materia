public class Mian {
    public static void main(String[] args) {

        Materia materia = new Materia(0, 0, 0, 0, 0, 0, 0, 0);

        materia.asignarPorcentajes();
        materia.registrarFinales();
        materia.registrarParciales();
        materia.registrarPracticas();
        materia.calcularNotaFinal();
    }
}