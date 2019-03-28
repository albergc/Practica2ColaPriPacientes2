public class Cola {
    private Nodo cabeza, fin;
    private int numElem;

    Cola() {
        cabeza = null;
        fin = null;
        numElem = 0;
    }

    public void encolar(Paciente v) {
        Nodo nuevo;
        nuevo = new Nodo(v, null);
        if (cabeza != null) {
            fin.setSiguiente(nuevo);
        } else {
            cabeza = nuevo;
        }
        fin = nuevo;
        numElem++;
    }

    public Paciente desencolar() {
        Nodo nodo;
        Paciente resul = null;
        if (cabeza == null) {
            System.out.println("Error, la cola está vacía");
        } else {
            nodo = cabeza;
            cabeza = nodo.getSiguiente();
            resul = nodo.getDato();
            if (cabeza == null)
                fin = null;
            numElem--;
        }
        return resul;
    }

    public boolean colaVacia() {   // Comprueba si la cola está vacía
        return cabeza == null;
    }



    public Paciente primero() {
        Paciente resul = null;
        if (!this.colaVacia()) {
            resul = cabeza.getDato();
        } else {
            System.out.println("Error, la cola está vacía");
        }
        return resul;
    }

    public void verCola() {
        Nodo aux;
        aux = cabeza;
        while (aux != null) {
            aux.getDato().verPaciente();
            aux = aux.getSiguiente();
        }
    }

    public int numElemCola() {       // Devuelve el número de elementos de la cola
        return numElem;
    }
}


