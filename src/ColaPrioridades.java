public class ColaPrioridades {
    private NodoPrioridad inicio;

    public ColaPrioridades() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * Inserta el paciente en la cola que le corresponde según su prioridad.
     * Si no hay ningún paciente con la misma prioridad, crea una cola nueva en la que mete al paciente.
     */
    public void encolar(int prioridad, Paciente paciente) {
        NodoPrioridad aux = inicio;
        NodoPrioridad aux2 = null;
        if (inicio == null) {
            Cola cola = new Cola();
            cola.encolar(paciente);
            NodoPrioridad nuevo = new NodoPrioridad(prioridad, cola, null);
            inicio=nuevo;
        } else {
            while (aux!=null&&prioridad>=aux.getClave()) {
                if (prioridad == aux.getClave()) {
                    aux.getDato().encolar(paciente);
                    return;
                }
                if(aux.getSiguiente()==null){ aux2 = aux;}
                else{aux = aux.getSiguiente();}
            }
            Cola cola= new Cola();
            cola.encolar(paciente);

            if(aux==null){
                NodoPrioridad nuevo = new NodoPrioridad(prioridad, cola, null);
                aux2.setSiguiente(nuevo);
            }
            else{
                NodoPrioridad nuevo = new NodoPrioridad(prioridad, cola, aux.getSiguiente());
                aux.setSiguiente(nuevo);
            }

        }
    }

    /**
     * Busca la clave en la lista. Si la encuentra devuelve el alumno asociado a dicha clave,
     * y si no la encuentra devuelve NULL.
     */
    public Paciente desencolar() {
        // TODO desencolar
        return null;  // Línea puesta para evitar error. Quitarla al implementar el método
    }

    /**
     * Visualizar todos los pacientes del hospital, ordenados por prioridad
     */
    public void verColaPrioridades() {
        NodoPrioridad aux = inicio;
        while(aux!=null){
            aux.getDato().verCola();
            aux= aux.getSiguiente();
        }


    }
}


