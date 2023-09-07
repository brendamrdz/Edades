import java.util.ArrayList;

public class Edades {
    ArrayList<Integer> edadesArrayList = new ArrayList<Integer>();
    

    public static void main(String[] args) throws Exception {
        Edades nuevasEdades = new Edades();
        nuevasEdades.agregarElementos();
       //nuevasEdades.eliminarElementos(1);

    }
    
    public void agregarElementos(){
       edadesArrayList.add(1);
       edadesArrayList.add(2);
       edadesArrayList.add(3);
       edadesArrayList.add(4);
       edadesArrayList.add(5);
       edadesArrayList.add(6);
       edadesArrayList.add(7);
       edadesArrayList.add(8);
       edadesArrayList.add(9);
       edadesArrayList.add(10);
       edadesArrayList.add(11);
       edadesArrayList.add(12);
       edadesArrayList.add(13);
       edadesArrayList.add(14);
       edadesArrayList.add(15);
       mostrarElementos();
       promedioEdades();
    }

    public void mostrarElementos(){
        for(int i=0;i<14; i++){
            System.out.println("posición " + i + ", contiene el valor de edad :  " + edadesArrayList.get(i) + ".");
        }
    }

           
    public void promedioEdades(){
        int sumaEdades = 0;
        int prom = 0;
        for(int i=0;i<15; i++){
            sumaEdades = sumaEdades + edadesArrayList.get(i);
        }
        prom = sumaEdades/15;
        System.out.println("El promedio es:" + prom);
     }
       
    public void eliminarElementos(int eliminarEdad){
       edadesArrayList.remove(eliminarEdad);
        for(int i=0;i<15; i++){
            System.out.print(edadesArrayList.get(i) + ", ");
        }
    }
}

