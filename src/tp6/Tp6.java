package tp6;
//@author Nicolas
public class Tp6 {
    public static void main(String[] args) {
        
        Cliente c1=new Cliente("Nicolas","Castro",123456,"San Luis","San Luis");
        Cliente c2=new Cliente("Alberto","Alvarez",234567,"Mendoza","San Martin");
        Cliente c3=new Cliente("Armado","Paredes",345678,"San Juan","San Juan");
        Cliente c4=new Cliente("Juan","Perez",456789,"San Luis","San Luis");
        
        Directorio d=new Directorio();
        d.agregarCliente(111, c1);
        d.agregarCliente(211, c1);
        d.agregarCliente(122, c2);
        d.agregarCliente(133, c3);
        d.agregarCliente(144, c4);
        
        d.buscarCliente(111);
        
        d.buscarTelefono("Castro");
                
        d.buscarClientes("San Luis");
        
        d.borrarCliente(123456);
        
        d.buscarTelefono("Castro");
        
    }
}
