import com.instituto.Alumno;

public class Cole {
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Edgar", "Morel");

        System.out.println("El id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre del alumno es: " + alu2.getNombre());
        System.out.println("El apellido del alumno es: " + alu2.getApellido());

        alu1.setId(8);
        alu1.setNombre("Elodye");
        alu1.setApellido("Morel");

        System.out.println("______________________________________");
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno es: " + alu1.getNombre());
        System.out.println("El apellido del alumno es: " + alu1.getApellido());

       //Cambio de valor
        alu1.setId(15);

        System.out.println("______________________________________");
        System.out.println("El id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre del alumno es: " + alu1.getNombre());
        System.out.println("El apellido del alumno es: " + alu1.getApellido());
    }   

}
