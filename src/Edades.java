import java.util.ArrayList;

public class Edades {
    ArrayList<Integer> edadesArrayList = new ArrayList<Integer>();
    

    public static void main(String[] args) throws Exception {
        Edades nuevasEdades = new Edades();
        nuevasEdades.agregarElementos();
       

    }
    
    public void agregarElementos(){
       edadesArrayList.add(1);
       edadesArrayList.add(2);
       edadesArrayList.add(3);
       edadesArrayList.add(4);
       edadesArrayList.add(5);
       edadesArrayList.add(6);
       edadesArrayList.add(30);
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
       eliminarElementos(30);
        ordenarElementos()
       
    }

    public void mostrarElementos(){
        for(int i=0;i<edadesArrayList.size(); i++){
            System.out.println("posición " + i + ", contiene el valor de edad :  " + edadesArrayList.get(i) + ".");
        }
    }

           
    public void promedioEdades(){
    	
        int sumaEdades = 0;
        int prom = 0;
        for(int i=0;i<edadesArrayList.size(); i++){
            sumaEdades = sumaEdades + edadesArrayList.get(i);
        }
        prom = sumaEdades/edadesArrayList.size();
        System.out.println("El promedio es:" + prom);
     }
       
    public void eliminarElementos(int eliminarEdad){
       //edadesArrayList.remove(eliminarEdad);
       int ed = edadesArrayList.get(7);
       System.out.println(ed);
       
       int et = edadesArrayList.indexOf(eliminarEdad);
       System.out.println(et);
       
       edadesArrayList.remove(et);
        for(int i=0;i<edadesArrayList.size(); i++){
            System.out.print(edadesArrayList.get(i) + ", ");
        }
    }
     public void ordenarElementos(){

        for (int i = 0; i < edadesArrayList.size(); i++) {
        for (int j = 0; j < edadesArrayList.size()-i-1; j++) {
            if(edadesArrayList.get(j) > edadesArrayList.get(j+1)){
                int tmp = edadesArrayList.get(j+1);
                edadesArrayList.set(j+1,edadesArrayList.get(j));
                edadesArrayList.set(j,tmp);
            }
            
        } 
    }
    for(int x = 0; x < edadesArrayList.size(); x++){
        System.out.println(edadesArrayList.get(x));
    }
    }
}

