package tp6;
//@author Nicolas

import java.util.*;
public class Directorio {
    private TreeMap<Long,Cliente> dir=new TreeMap<>();
    
    public void agregarCliente(long telefono,Cliente cliente){
        dir.putIfAbsent(telefono, cliente);
    }
    
    public void buscarCliente(long telefono){
        System.out.println("Buscando cliente asociado al numero "+telefono+"...");
        Cliente cliente=dir.get(telefono);
        //System.out.println("El cliente asociado al numero "+telefono+" es "+dir.get(telefono));
        System.out.println("El cliente asociado al numero "+telefono+" es "+cliente.getApellido()+" "+cliente.getNombre());
        System.out.println("_____________________________________________________");
    }
    public void buscarTelefono(String apellido){
    //public Set<Long> buscarTelefono(String apellido){
        System.out.println("Buscando numeros asociados al apellido "+apellido+"...");
        //HashSet<Long>telefonos=new HashSet<>();
        Set<Long>claveTelefonos=dir.keySet();
        Iterator it=claveTelefonos.iterator();
        while(it.hasNext()){
            long telefono = (Long)it.next();
            Cliente cliente=dir.get(telefono);
            if(cliente.getApellido().equals(apellido)){
                //telefonos.add(telefono);
                System.out.println(telefono);
            }
        }
        System.out.println("_____________________________________________________");
        //return telefonos;
    }
    //public List<Cliente> buscarClientes(String ciudad){
    public void buscarClientes(String ciudad){
        System.out.println("Buscando clientes asociados a la ciudad de "+ciudad+"...");
        //ArrayList<Cliente>clientes=new ArrayList<>();
        Set<Long>ciudades=dir.keySet();
        Iterator it=ciudades.iterator();
        while(it.hasNext()){
            long telefono = (Long)it.next();
            Cliente cliente=dir.get(telefono);
            if(cliente.getCiudad().equals(ciudad)){
                //clientes.add(cliente);
                System.out.println(cliente.getApellido()+" "+cliente.getNombre());
            }
        }
        System.out.println("_____________________________________________________");
        //return clientes;
    }
    
    public void borrarCliente(int dni){
        System.out.println("Eliminando al cliente del directorio en base al dni: "+dni);
        Set<Long>clientes=dir.keySet();
        Iterator it=clientes.iterator();
        while(it.hasNext()){
            long telefono = (Long)it.next();
            Cliente cliente=dir.get(telefono);
            if(cliente.getDni()==dni){
                it.remove();
            }
        }
        System.out.println("_____________________________________________________");
    }
}
