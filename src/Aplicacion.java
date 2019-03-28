
public class Aplicacion {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Alberto","frecuentes mareos");
        Paciente p2 = new Paciente("Alberto2","frecuentes mareos2");
        Paciente p3 = new Paciente("Alberto3","frecuentes mareos3");
        Paciente p4 = new Paciente("Alberto4","frecuentes mareos4");
        ColaPrioridades c1= new ColaPrioridades();
        c1.encolar(3,p1);
        c1.encolar(2,p2);
        c1.encolar(2,p3);
        c1.encolar(1,p4);
        c1.verColaPrioridades();
    }

}

