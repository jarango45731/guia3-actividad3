package perros;

import java.util.ArrayList;
import java.util.HashMap;

public class Perros {
	private ArrayList<Perro> perros = new ArrayList<Perro>();

    public void agregar(Perro perro) {
        perros.add(perro);
    }

    public Perro leer(int indice) {
        return perros.get(indice);
    }
    
    public void imprimirListaPerros() {
        for (int i = 0; i < perros.size(); i++) {
            System.out.println(i + " - " + perros.get(i));
        }
    }
    
    public HashMap<String, ArrayList<Perro>> agruparPorLocalidad() {
    	HashMap<String, ArrayList<Perro>> mapa = new HashMap<String, ArrayList<Perro>>();
    	for(Perro perro : perros) {
    		if (!mapa.containsKey(perro.getLocalidad())) {
    			ArrayList<Perro> lista = new ArrayList<Perro>();
    			lista.add(perro);
    			mapa.put(perro.getLocalidad(), lista);
    		} else {
    			mapa.get(perro.getLocalidad()).add(perro);
    		}
    	}
    	return mapa;
    }
}
